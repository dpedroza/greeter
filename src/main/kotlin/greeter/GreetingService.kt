package greeter

import javax.inject.Singleton

@Singleton
class GreetingService {

    fun greet(name: String): Greeting {
        return Greeting("Hello $name")
    }
}