package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingSetterServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - setter";
    }
}
