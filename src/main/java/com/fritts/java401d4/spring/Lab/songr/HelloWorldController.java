package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/capitalize/{word}")
    public String getCapitalWord(@PathVariable String word){
        return word.toUpperCase();
    }

    @GetMapping("/reverse?sentence={sentence}")
    public String getReverseSentence(@PathVariable String sentence){
        StringBuilder sb = new StringBuilder();
        sb.append(sentence);
        sb = sb.reverse();
        return sb.toString();
    }
}
