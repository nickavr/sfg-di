package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService") //naming the bean as we want
@Profile("ES")
public class I18nSpanishServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola - spanish";
    }
}
