package org.spockframework.spring3

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = AutowireConfiguration)
class AutowireTest extends Specification {

  @Autowired
  AutowireBean autowireBean

  def "bean should be autowired"() {
    expect:
    autowireBean != null
  }

}
