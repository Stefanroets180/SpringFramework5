package com.stefan.addspringproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"AF","default"})
@Service("i18nService")
public class I18nAfrikaansService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Wêreld - AF";
    }
}
