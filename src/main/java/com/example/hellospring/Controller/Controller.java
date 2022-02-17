package com.example.hellospring.Controller;

import com.example.hellospring.Service.DayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    DayCalculator dayCalculator = new DayCalculator();


    /**Exercise 1.1**/
    @GetMapping("/")
    public String hello(){
        String helloMessage = "Hello, and welcome to Spring 😁 If you type '/echo?input=' and a message next, you'll see it on the screen";
        return helloMessage;
    }

    /**Exercise 1.2**/
    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return "This is your message: " + "" + input;
    }

    /**Exercise 1.3**/
    @GetMapping("/isItFriday")
    public String isItFriday(){
        dayCalculator.whatDay();
        return dayCalculator.whatDay();
    }

}
