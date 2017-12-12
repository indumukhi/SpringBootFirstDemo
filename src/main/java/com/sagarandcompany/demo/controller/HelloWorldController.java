package com.sagarandcompany.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class HelloWorldController {
    @Value("${employee.insert.success}")
    private String successMsg;

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    @ResponseBody
    public String printEmployee(@RequestParam(value = "name", required = false) String name) {
        return "hello" + successMsg;
    }
}
