package scaladiexamples.scaldi

import scaldi.Module
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderMock

class TestConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderMock
}
