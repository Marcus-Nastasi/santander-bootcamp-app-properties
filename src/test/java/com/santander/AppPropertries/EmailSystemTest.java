package com.santander.AppPropertries;

import com.santander.AppPropertries.Domain.EmailSystem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmailSystemTest {

    @Autowired
    private EmailSystem emailSystem;

    @Test
    void testingEmailReturn() {
        assertEquals("root@pan.com", emailSystem.getEmailString());
    }

    @Test
    void testingProviderReturn() {
        assertEquals("Google", emailSystem.getEmail().getProvider());
    }
}


