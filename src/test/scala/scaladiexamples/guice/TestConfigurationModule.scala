package scaladiexamples.guice

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderMock

class TestConfigurationModule extends AbstractModule with ScalaModule {
  def configure {
    bind[Geocoder].to[GeocoderMock]
  }
}
