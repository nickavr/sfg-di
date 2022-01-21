package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingPropertyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        //simulating DI with property injection
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingPropertyServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}