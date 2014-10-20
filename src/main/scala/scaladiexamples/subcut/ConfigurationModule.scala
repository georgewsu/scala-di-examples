package scaladiexamples.subcut

import com.escalatesoft.subcut.inject.NewBindingModule

import scaladiexamples.Geocoder
import scaladiexamples.GeocoderImpl

object ConfigurationModule extends NewBindingModule (module => {
  import module._
  bind [Geocoder] toSingle new GeocoderImpl
})
