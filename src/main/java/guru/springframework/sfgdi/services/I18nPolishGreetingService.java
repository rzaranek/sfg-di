package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by robertZ on 2023-07-25.
 */
@Profile("PL")
@Service("i18nService")
public class I18nPolishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Witaj świecie - PL";
    }
}
