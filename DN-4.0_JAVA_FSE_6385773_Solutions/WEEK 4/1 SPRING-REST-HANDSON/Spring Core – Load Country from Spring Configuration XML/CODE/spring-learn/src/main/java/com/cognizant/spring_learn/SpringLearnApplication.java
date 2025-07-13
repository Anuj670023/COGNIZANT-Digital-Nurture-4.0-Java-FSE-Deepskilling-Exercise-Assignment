package com.cognizant.spring_learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringLearnApplication {
    public static void main(String[] args) {
        displayCountry();
        displayDate();
    }

    public static void displayCountry() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        System.out.println("Country : " + country);
        context.close();
    }

    public static void displayDate() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        try {
            Date date = format.parse("31/12/2018");
            System.out.println("Formatted Date: " + date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        context.close();
    }
}