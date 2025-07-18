package com.cognizant.spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class DisplayDate {
    private SimpleDateFormat dateFormat;

    public void setDateFormat(SimpleDateFormat dateFormat){
        this.dateFormat = dateFormat;
    }
    public void display() {
        String dateStr = "31/12/2018";
        try {
            Date parsedDate = dateFormat.parse(dateStr);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
