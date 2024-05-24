package com.santander.AppPropertries.Domain;

import org.springframework.beans.factory.annotation.Value;

public class EmailSystem {

    @Value("${name:No-Reply}")
    private String name;
    @Value("${email:noreply@gmail.com}")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


