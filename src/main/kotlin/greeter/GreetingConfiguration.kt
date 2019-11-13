package greeter

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("greeting")
class GreetingConfiguration {
     lateinit var prefix: String
}