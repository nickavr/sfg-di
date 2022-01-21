package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingPropertyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach //simulating DI with constructor injection
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingPropertyServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}