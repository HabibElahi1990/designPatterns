package creational.factoryMethod;

import creational.factoryMethod.impl.GregorianCalendar;
import creational.factoryMethod.impl.JalaliCalendar;

import java.util.Date;

/**
 * Created by h.elahi on 11/5/2018.
 */
//is class for use jalali or gregorian time by only getDate method of Calendar class
public class Calendar {

    public static final Integer CALENDAR_TYPE_JALALI = 1;
    public static final Integer CALENDAR_TYPE_GREGORIAN = 2;

    public static String getDate(Integer calendarType, Date date) {
        switch (calendarType) {
            case 1:
                //convert Gregorian to jalali
                return new JalaliCalendar().getDate(date);
            case 2:
                // return format date Gregorian
                return new GregorianCalendar().getDate(date);
            default:
                return "date_is_error";
        }
    }
}
