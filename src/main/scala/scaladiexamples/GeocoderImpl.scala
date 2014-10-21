package scaladiexamples

import scalaj.http.Http

class GeocoderImpl extends Geocoder {

  def getCoordinates(location: String): Option[(Double, Double)] = {
    val xml = Http("http://maps.google.com/maps/api/geocode/xml").param("address", location).asXml
    val result = (xml \ "status").headOption flatMap { statusNode =>
      if (statusNode.text == "OK") {
        (xml \\ "location").headOption map { locationNode =>
          val lat = (locationNode \ "lat").text
          val lng = (locationNode \ "lng").text
          (lat.toDouble, lng.toDouble)
        }
      }
      else {
        None
      }
    }
    Thread.sleep(1000)
    result
  }

}
