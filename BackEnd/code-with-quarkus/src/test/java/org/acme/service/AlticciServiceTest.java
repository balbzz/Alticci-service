package org.acme.service;


import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class AlticciServiceTest {

    @Inject
    AlticciService alticciService;

    @Test
    void calculateAlticciAlternitive() {

        long result = alticciService.calculateAlticciAlternitive(5);
        assertEquals(2, result);
    }
}