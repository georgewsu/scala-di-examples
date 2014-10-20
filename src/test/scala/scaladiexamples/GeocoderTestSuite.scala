package scaladiexamples

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class GeocoderTestSuite extends FunSuite with ShouldMatchers {

  lazy val geocoder = new GeocoderImpl
  
  test("Geocoder returns None for non-existent location") {
    geocoder.getCoordinates("nonexistent") should be(None)
  }

  test("Geocoder returns coordinates for San Francisco") {
    geocoder.getCoordinates("San Francisco") should be(Some((37.7749295, -122.4194155)))
  }

}
