package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextGeneratorTest {

    @Test
    void getText() {
        assertTrue(TextGenerator.getText().matches("\\d. Hello World!!!"));
    }
}