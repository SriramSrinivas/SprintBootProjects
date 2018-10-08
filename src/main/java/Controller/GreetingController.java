package Controller;

import com.example.demo.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

private static final String message="Hello,";


@RequestMapping(value = "/greeting/{name}", method = GET)
    public Greeting greeting(@RequestParam(value="name",defaultValue = "test") String name)
{
    return new Greeting(1, String.format(name,message));

}

@RequestMapping("/greetings/{name}")
public Greeting greetings(@PathVariable String name)
    {
        return new Greeting(1, String.format(name,message));

    }


}
