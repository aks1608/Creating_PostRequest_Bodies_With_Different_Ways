package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void greetReturnsHelloMessage() {
        assertEquals(App.greet("World"), "Hello, World!");
    }
}
