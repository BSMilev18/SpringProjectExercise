package com.numbers.service;

import com.numbers.controller.NumbersController;
import com.numbers.controller.WordsController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/numbers")
public class WordsService extends WordsController {

    public WordsService(int n, String word) {
        super(n, word);
    }

    public String outputWords(int n, String word){
        for(int i = 0; i <= n - 1; i++){
            return word + " ";
        }
        return word;
    }
}
