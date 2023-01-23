package com.numbers.controller;

import com.numbers.model.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumbersController {
    @Autowired
    private int number;
    public NumbersController(int number)
    {
        super();
        this.number = number;
    }
}
