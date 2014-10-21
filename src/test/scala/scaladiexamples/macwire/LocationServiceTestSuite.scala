package scaladiexamples.macwire

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import scaladiexamples.LocationService

class LocationServiceTestSuite extends FunSuite with ShouldMatchers {

  test("Location service returns None for non-existent location") {
    val module = new ConfigurationModule{}
    val locationService = module.locationService
    locationService.getCoordinates("nonexistent") should be(None)
  }

  test("Location service returns coordinates for San Francisco") {
    val module = new ConfigurationModule{}
    val locationService = module.locationService
    locationService.getCoordinates("San Francisco") should be(Some((37.7749295, -122.4194155)))
  }

  test("Location service returns coordinates for other locations") {
    val module = new ConfigurationModule{}
    val locationService = module.locationService
    locationService.getCoordinates("Chicago") should be(Some((41.8781136,-87.6297982)))
    locationService.getCoordinates("Los Angeles") should be(Some((34.0522342,-118.2436849)))
    locationService.getCoordinates("New York") should be(Some((40.7127837,-74.0059413)))
  }

  test("Mock location service with test configuration returns coordinates for San Francisco") {
    val module = new TestConfigurationModule{}
    val locationService = module.locationService
    locationService.getCoordinates("San Francisco") should be(Some((37.7749295, -122.4194155)))
  }

  test("Mock location service with test configuration returns fake coordinates for other locations") {
    val module = new TestConfigurationModule{}
    val locationService = module.locationService
    locationService.getCoordinates("Chicago") should be(None)
    locationService.getCoordinates("Los Angeles") should be(None)
    locationService.getCoordinates("New York") should be(None)
  }

}
