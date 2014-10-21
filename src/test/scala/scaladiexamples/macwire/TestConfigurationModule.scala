package scaladiexamples.macwire

import scaladiexamples.Geocoder
import scaladiexamples.GeocoderMock

trait TestConfigurationModule extends ConfigurationModule {
  override lazy val geocoder: Geocoder = new GeocoderMock
}
