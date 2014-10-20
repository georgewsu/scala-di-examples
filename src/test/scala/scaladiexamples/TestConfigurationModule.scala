package scaladiexamples

import scaldi.Module

class TestConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderMock
}
