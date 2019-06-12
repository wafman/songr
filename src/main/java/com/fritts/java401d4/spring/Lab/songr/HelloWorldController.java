package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/capitalize/{word}")
    public String getCapitalWord(@PathVariable String word){
        return word.toUpperCase();
    }

    @GetMapping("/reverse")
    public String getReverseSentence(@RequestParam(required = false) String sentence){
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length -1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    @GetMapping("/reverseER")
    public String getCoolReverseSentence(@RequestParam(required = false) String sentence){
        StringBuilder sb = new StringBuilder();
        sb.append(sentence);
        sb = sb.reverse();
        return sb.toString();
    }
}
