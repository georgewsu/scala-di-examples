package scaladiexamples.macwire

import com.softwaremill.macwire.Macwire
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl

trait ConfigurationModule extends Macwire {
  lazy val geocoder: Geocoder = wire[GeocoderImpl]
}
