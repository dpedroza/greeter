package greeter

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.inject.Inject

@Controller("/greet")
class GreeterController @Inject constructor(
    private val greetingService: GreetingService
) {

    @Get("/{name}")
    fun greet(name: String): Greeting {
        return greetingService.greet(name)
    }
}