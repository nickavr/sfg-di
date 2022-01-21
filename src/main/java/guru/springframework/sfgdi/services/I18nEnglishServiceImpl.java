package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService") //naming the bean as we want, same as spanish version
@Profile("EN") //setting a profile for spring to use in different scenarios; this is set in application.properties
public class I18nEnglishServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello in english";
    }
}
