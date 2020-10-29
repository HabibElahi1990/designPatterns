package creational.factoryMethod.impl;

import creational.factoryMethod.CalendarService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by h.elahi on 11/5/2018.
 */
public class GregorianCalendar implements CalendarService {
    @Override
    public String getDate(Date date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
         return simpleDateFormat.format(date);
    }
}
