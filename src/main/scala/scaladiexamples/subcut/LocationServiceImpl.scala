package scaladiexamples.subcut

import com.escalatesoft.subcut.inject.BindingModule
import com.escalatesoft.subcut.inject.Injectable
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl
import scaladiexamples.LocationService

class LocationServiceImpl()(implicit val bindingModule: BindingModule) extends LocationService with Injectable {

  val geocoder = injectOptional [Geocoder] getOrElse { new GeocoderImpl }

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
