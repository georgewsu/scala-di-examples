package scaladiexamples.guice

import javax.inject.Inject
import scaladiexamples.Geocoder
import scaladiexamples.LocationService

class LocationServiceImpl @Inject() (geocoder: Geocoder) extends LocationService {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
