package greeter

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class GreeterControllerTest {

    @Inject
    lateinit var client: GreetingClient

    @Test
    fun shouldGreetProperly() {
        val response = client.greet("Graeme").blockingGet().text
        val expected = "Hello Graeme"
        assertEquals(expected, response)
    }
}