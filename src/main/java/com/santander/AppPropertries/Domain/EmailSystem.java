package com.santander.AppPropertries.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSystem {

    @Value("${name:noreply}")
    private String name;

    @Autowired
    private Email email;

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public String getEmailString() {
        return email.getEmail();
    }
}


