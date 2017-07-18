package org.spockframework.spring3

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import spock.lang.Specification

@Configuration
@ComponentScan("org.spockframework.spring3")
class AutowireConfiguration extends Specification {

}
