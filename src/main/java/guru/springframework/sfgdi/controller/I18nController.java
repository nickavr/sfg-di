package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController( @Qualifier("i18nService") GreetingService greetingService) { //here we have 2 beans with the same qualifier but spring IoC will choose which one to wire based on the current spring profile from application.properties
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
