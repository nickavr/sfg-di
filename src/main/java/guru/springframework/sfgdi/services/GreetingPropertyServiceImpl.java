package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingPropertyServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - property";
    }
}
