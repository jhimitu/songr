package com.jhia.lab11.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTests {
    @Test
    public void testHelloWorld() {
        Controller controller = new Controller();

        assertEquals("Hello, world!", controller.getHelloWorld());
    }

    @Test
    public void testCapitalizedString() {
        Controller controller = new Controller();

        assertEquals("HELLO", controller.getCapitalizedString("hello"));
    }
}
