package scaladiexamples

import scalaj.http.Http

class GeocoderMock extends Geocoder {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    location match {
      case "San Francisco" => Some((37.7749295, -122.4194155))
      case _ => None
    }
  }

}
