package scaladiexamples.macwire

import scaladiexamples.Geocoder

class LocationService(geocoder: Geocoder) {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
