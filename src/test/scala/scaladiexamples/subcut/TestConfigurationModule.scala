package scaladiexamples.subcut

import com.escalatesoft.subcut.inject.NewBindingModule
import scaladiexamples.Geocoder
import scaladiexamples.GeocoderMock

object TestConfigurationModule extends NewBindingModule (module => {
  import module._
  bind [Geocoder] toSingle new GeocoderMock
})
