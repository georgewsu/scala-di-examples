package scaladiexamples.macwire

import com.softwaremill.macwire.Macwire
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl
import scaladiexamples.LocationService

trait ConfigurationModule extends Macwire {
  lazy val geocoder: Geocoder = wire[GeocoderImpl]
  lazy val locationService: LocationService = wire[LocationServiceImpl]
}
