package com.santander.AppPropertries;

import com.santander.AppPropertries.Domain.Email;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmailTest {

    @Autowired
    private Email email;

    @Test
    void testingEmailDefaultMethods() {
        assertEquals("root@pan.com", email.getEmail());
        assertEquals("Google", email.getProvider());
    }
}


