package com.example.hellospring.Service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class DayCalculator {

    public String whatDay(){

        //Inspired by Mo
        //Finds the current date from the system clock
        LocalDate currentDate = LocalDate.now();
        //from currentDate it finds the day of the week and compares it to given day of Friday
        if (currentDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return "Yep, it is " + currentDate.getDayOfWeek() + "!!!";
        } else if (currentDate.getDayOfWeek() == DayOfWeek.FRIDAY.minus(1)){
            return "Almost, it's " + currentDate.getDayOfWeek();
        } else if (currentDate.getDayOfWeek() == DayOfWeek.FRIDAY.plus(1)){
            return "Aw, you just missed it. It's " + currentDate.getDayOfWeek();
        } else {
            return "Nope, it's " + currentDate.getDayOfWeek();
        }
    }
}
