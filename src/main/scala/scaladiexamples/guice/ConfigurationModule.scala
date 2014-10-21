package scaladiexamples.guice

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl
import scaladiexamples.LocationService

class ConfigurationModule extends AbstractModule with ScalaModule {
  def configure {
    bind[Geocoder].to[GeocoderImpl]
    bind[LocationService].to[LocationServiceImpl]
  }
}
