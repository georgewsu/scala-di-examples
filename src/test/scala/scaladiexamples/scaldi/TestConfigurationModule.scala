package scaladiexamples.scaldi

import scaldi.Module
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderMock
import scaladiexamples.LocationService

class TestConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderMock
  bind [LocationService] to new LocationServiceImpl
}
