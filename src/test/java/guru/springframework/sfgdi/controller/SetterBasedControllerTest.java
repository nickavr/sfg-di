package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingPropertyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() { //simulating DI with setter injection
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingPropertyServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}