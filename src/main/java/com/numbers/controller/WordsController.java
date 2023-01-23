package com.numbers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WordsController {
    @Autowired
    private int n;
    private String word;
    public WordsController(int n, String word)
    {
        super();
        this.n = n;
        this.word = word;
    }
}
