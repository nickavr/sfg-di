package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) { //as the class has @Controller, all its dependencies are wired by spring -> DI with constructor doesn't need @Autowired annotation
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
