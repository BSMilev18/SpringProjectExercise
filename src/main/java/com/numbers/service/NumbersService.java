package com.numbers.service;

import com.numbers.controller.NumbersController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/numbers")
public class NumbersService extends NumbersController {

    public NumbersService(int number) {
        super(number);
    }

    public int checkNumbers(int n){
        if(n % 3 == 0){
            while(n != 1){
                n--;
            }
        }
        return n;
    }
}
