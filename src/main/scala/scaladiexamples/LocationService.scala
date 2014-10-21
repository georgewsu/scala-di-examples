package scaladiexamples

trait LocationService {

  def getCoordinates(location: String): Option[(Double, Double)]

}
