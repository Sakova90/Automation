package lesson6;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class MyHomeTaskLesson6 {
 public static Date DateToBeChanged = new Date();
    public static void main (String[] args){
        Date startDate = new Date();
        printmessage("Start time: " + startDate.toString());
        sleeping (DateToBeChanged);
        working (DateToBeChanged);
        relaxing (DateToBeChanged);
        printmessage("End time: " + DateToBeChanged.toString());
        long hours = ((DateToBeChanged.getTime()-startDate.getTime())/3600000);
        printmessage("Time interval: " + hours + " hours");

    }



    public static void addHoursToJavaUtilDate(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateToBeChanged);
        calendar.add(Calendar.HOUR_OF_DAY,i);
        DateToBeChanged= calendar.getTime();
    }

    public static void working (Date addDate1) {
        printmessage("i'm working for 5 hours");
             addHoursToJavaUtilDate(5);

    }
    public static void sleeping (Date addDate2) {
        printmessage("i'm sleeping for 8 hours");
        addHoursToJavaUtilDate(8);

    }

    public static void relaxing (Date addDate3) {
        printmessage("i'm relaxing for 2 hours");
        addHoursToJavaUtilDate(2);

    }


    public static void printmessage (String text) {
        System.out.println(text);
    }

}
