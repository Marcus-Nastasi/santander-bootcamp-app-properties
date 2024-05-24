package com.santander.AppPropertries;

import com.santander.AppPropertries.Domain.EmailSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private EmailSystem emailSystem;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(emailSystem.getName());
        System.out.println(emailSystem.getEmail());
    }
}


