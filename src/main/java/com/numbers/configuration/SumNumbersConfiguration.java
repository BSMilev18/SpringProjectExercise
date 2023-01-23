package com.numbers.configuration;

import com.example.numbers.NumbersApplication;
import com.numbers.controller.NumbersController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SumNumbersConfiguration extends NumbersController {

    public SumNumbersConfiguration(int number) {
        super(number);
    }
    @Bean
    public Integer getBean() {
        return getBean();
    }
}
