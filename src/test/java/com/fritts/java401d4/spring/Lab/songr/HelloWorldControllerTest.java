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

    @Test
    public void testReverse(){
        HelloWorldController classUnderTest = new HelloWorldController();
        String expectedOutput = "coming is Winter ";
        assertEquals("should reverse the string entered", expectedOutput,
                classUnderTest.getReverseSentence("Winter is coming"));
    }

}