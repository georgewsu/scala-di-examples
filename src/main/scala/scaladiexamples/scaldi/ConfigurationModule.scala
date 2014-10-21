package scaladiexamples.scaldi

import scaldi.Module
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl
import scaladiexamples.LocationService

class ConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderImpl
  bind [LocationService] to new LocationServiceImpl
}
