package scaladiexamples.macwire

import scaladiexamples.Geocoder
import scaladiexamples.LocationService

class LocationServiceImpl(geocoder: Geocoder) extends LocationService {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
