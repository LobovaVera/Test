package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.sum;
import static org.assertj.core.api.Assertions.assertThat;

public class Sem2 {
    public static void main(String[] args) {
        //happyNY();
        //happyNY2();
        expectedValue();

    }

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String currentDateTime = dateFormat.format(calendar.getTime());
        System.out.println(currentDateTime);
        assert currentDateTime.compareTo("2024/01/01") >= 0 : "Еще не 2024 год :(";

        // -1 less than right
        // - 0 equals
        // 1 more than right

        System.out.println("Happy NY");
    }
    // compare date format
    public static void happyNY2() {
        String departDate = "2025/01/01";
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date;
        try {
            date = format.parse(departDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        //Date currentDate = new Date();
        int year =  calendar.getWeekYear();
        System.out.println(year);
//        int month = currentDate.getMonth();
//        int day = currentDate.getDay();


        //System.out.println(currentDate);
        assert year >= 2024  : "Еще не 2024 год :(";

        // -1 less than right
        // - 0 equals
        // 1 more than right

        System.out.println("Happy NY");
    }
    public static void expectedValue(){
        assertThat(sum(3, 3)).isEqualTo(5);
    }
}
