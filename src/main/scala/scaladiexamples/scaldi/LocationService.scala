package scaladiexamples.scaldi

import scaldi.Injector
import scaldi.Injectable
import scaladiexamples.Geocoder

class LocationService()(implicit injector: Injector) extends Injectable {

  val geocoder = inject [Geocoder]

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
