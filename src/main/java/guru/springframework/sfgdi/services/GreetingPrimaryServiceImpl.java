package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary //when in doubt (multiple beans of the same type), spring will wire this bean, if the Qualifier annotation is not present
@Service
public class GreetingPrimaryServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from primary bean";
    }
}
