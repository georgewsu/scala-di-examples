package scaladiexamples.scaldi

import scaldi.Injector
import scaldi.Injectable
import scaladiexamples.Geocoder
import scaladiexamples.LocationService

class LocationServiceImpl()(implicit injector: Injector) extends LocationService with Injectable {

  val geocoder = inject [Geocoder]

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
