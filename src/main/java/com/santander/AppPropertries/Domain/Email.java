package com.santander.AppPropertries.Domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "email")
public class Email {

    private String email;
    private String provider;

    public Email() {}

    @Override
    public String toString() {
        return("Email{" + "email='" + email + '\'' + ", provider='" + provider + '\'' + '}');
    }

    public String getEmail() {
        return email;
    }

    public String getProvider() {
        return provider;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}


