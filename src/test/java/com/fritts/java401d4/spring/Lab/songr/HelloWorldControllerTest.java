package com.fritts.java401d4.spring.Lab.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testGetCapitalWord(){
        HelloWorldController classUnderTest = new HelloWorldController();
        String expectedOutput = "HELLO";
        assertEquals("should return capital word", expectedOutput, classUnderTest.getCapitalWord("hello"));
    }

}