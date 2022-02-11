package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 2/20/21.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    @Profile("EN")
    I18nEnglishGreetingService i18nService() { return new I18nEnglishGreetingService(); }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() { return new I18NSpanishService(); }
}
