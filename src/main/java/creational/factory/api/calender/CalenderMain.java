package creational.factory.api.calender;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderMain {


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //Calendar calendar1 = Calendar.getInstance(TimeZone.getDefault());

        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


    }
}
