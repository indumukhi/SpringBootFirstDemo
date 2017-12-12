package com.sagarandcompany.demo.controller;

import com.sun.xml.internal.ws.encoding.ContentType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;


@RestController

public class EmployeeController {

   // @PropertySource("C:\Users\admin\Desktop\My First App\demo\demo\src\main\resources:employee.properties")
    @Value("${employeename.result}")
     private String msg;


    @RequestMapping(value = "/employeename",method = RequestMethod.GET,params = {"name=indu"})

    public String employeeName(@RequestParam("name") String i)
    {


        return "hello" + i + msg;
    }
}
