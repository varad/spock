package org.spockframework.spring3

import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = AutowireConfiguration)
class FieldsTest extends Specification {

  def myField = "field"
  final myFinalField = "final field"
  static myStaticField = "static field"

  def "i expect non empty values"() {
    expect:
    myField != null && myFinalField != null && myStaticField != null
  }

}
