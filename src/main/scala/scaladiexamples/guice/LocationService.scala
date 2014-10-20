package scaladiexamples.guice

import javax.inject.Inject
import scaladiexamples.Geocoder

class LocationService @Inject() (geocoder: Geocoder) {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
