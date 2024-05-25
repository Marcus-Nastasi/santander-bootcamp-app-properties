package com.santander.AppPropertries.Beans;

import com.santander.AppPropertries.Domain.Email;
import com.santander.AppPropertries.Domain.EmailSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansFactory {

    @Bean
    public EmailSystem emailSystem() {
        return new EmailSystem();
    }

    @Bean
    public Email email() {
        return new Email();
    }
}


