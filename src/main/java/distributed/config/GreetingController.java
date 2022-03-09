package distributed.config;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/greeting")
public class GreetingController {

    private GreetingHelper greetingHelper;

    GreetingController( GreetingHelper gh ) {
        greetingHelper = gh;
    }

    @Get(value = "/{name}", produces = MediaType.TEXT_PLAIN)
    public String greet(String name) {
        return greetingHelper.createGreeting(name);
    }
}
