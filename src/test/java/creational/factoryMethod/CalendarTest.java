package creational.factoryMethod;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 11/5/2018.
 */
public class CalendarTest {
    @Test
    public void getDate() throws Exception {
        String jalaliDate=Calendar.getDate(Calendar.CALENDAR_TYPE_JALALI,new Date());
        System.out.println(jalaliDate);

        String gregorianDate=Calendar.getDate(Calendar.CALENDAR_TYPE_GREGORIAN,new Date());
        System.out.println(gregorianDate);
    }

}