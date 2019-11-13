package greeter

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GreetingService {

    @Inject
    lateinit var configuration: GreetingConfiguration

    fun greet(name: String): Greeting {
        return Greeting("${configuration.prefix} $name")
    }
}