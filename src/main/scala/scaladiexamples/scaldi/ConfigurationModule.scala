package scaladiexamples.scaldi

import scaldi.Module
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl

class ConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderImpl
}
