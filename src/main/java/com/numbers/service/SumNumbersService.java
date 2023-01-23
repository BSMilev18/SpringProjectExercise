package com.numbers.service;

import com.numbers.configuration.SumNumbersConfiguration;
import com.numbers.controller.NumbersController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/sum-numbers")
public class SumNumbersService extends SumNumbersConfiguration {

    public SumNumbersService(int number) {
        super(number);
    }

    public int sumNumbers(int n, int sum){
        for(int i = n; i <= 1; i--)
        {
            if(n % 3 == 0){
                sum = sum + n;
                while(n != 1){
                    n--;
                }
            }
        }
        return sum;
    }
}
