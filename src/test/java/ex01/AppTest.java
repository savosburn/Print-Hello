/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_name_and_greeting() {
        App myApp = new App();
        String name = "Savannah";

        String expectedOutput = "Hello, Savannah, nice to meet you!";

        String actualOutput = myApp.generateOutputString(name);

        assertEquals(expectedOutput, actualOutput);

    }
}