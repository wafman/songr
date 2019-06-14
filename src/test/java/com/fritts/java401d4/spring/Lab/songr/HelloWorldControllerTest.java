package com.fritts.java401d4.spring.Lab.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    HelloWorldController helloWorldController;

    @Autowired
    MockMvc mockMvc;

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

    @Test
    public void contextLoads(){}

    @Test
    public void testControllerIsAutowired(){
        assertNotNull(helloWorldController);
    }

    @Test
    public void testRequestToHelloGivesHello() throws Exception{
        mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Hello World!")));
    }

    @Test
    public void testRequestToCapitalizeWord() throws Exception{
        mockMvc.perform(get("/capitalize/world")).andExpect(content().string(containsString("WORLD")));
    }

    @Test
    public void testRequestToReverse() throws Exception{
        mockMvc.perform(get("/reverse?sentence=Hello World")).andExpect(content().string(containsString("World Hello ")));
    }


}