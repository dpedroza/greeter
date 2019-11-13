package greeter

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@Client("/greet")
interface GreetingClient {

    @Get("{name}")
    fun greet(name: String): Single<Greeting>
}