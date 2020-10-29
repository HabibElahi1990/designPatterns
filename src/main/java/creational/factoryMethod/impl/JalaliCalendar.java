package creational.factoryMethod.impl;

import creational.factoryMethod.CalendarService;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by h.elahi on 11/5/2018.
 */
public class JalaliCalendar implements CalendarService {
    @Override
    public String getDate(Date date) {
        return gregorianToJalali(date);
    }

    private String gregorianToJalali(Date date) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int gy1 = c.get(Calendar.YEAR);
        int gm1 = c.get(Calendar.MONTH);
        ++gm1;
        int gd1 = c.get(Calendar.DATE);

        int[] gDaysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] jDaysInMonth = new int[]{31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};
        int gy = gy1 - 1600;
        int gm = gm1 - 1;
        int gd = gd1 - 1;
        int gDayNo = 365 * gy + doubleToInt((double) ((gy + 3) / 4)) - doubleToInt((double) ((gy + 99) / 100)) + doubleToInt((double) ((gy + 399) / 400));

        int i;
        for (i = 0; i < gm; ++i) {
            gDayNo += gDaysInMonth[i];
        }

        if (gm > 1 && (gy % 4 == 0 && gy % 100 != 0 || gy % 400 == 0)) {
            ++gDayNo;
        }

        gDayNo += gd;
        int jDayNo = gDayNo - 79;
        int j_np = doubleToInt((double) (jDayNo / 12053));
        jDayNo %= 12053;
        int jy = 979 + 33 * j_np + 4 * doubleToInt((double) (jDayNo / 1461));
        jDayNo %= 1461;
        if (jDayNo >= 366) {
            jy += doubleToInt((double) ((jDayNo - 1) / 365));
            jDayNo = (jDayNo - 1) % 365;
        }

        for (i = 0; i < 11 && jDayNo >= jDaysInMonth[i]; ++i) {
            jDayNo -= jDaysInMonth[i];
        }

        int jm = i + 1;
        String month = String.valueOf(jm);
        if (month.length() < 2) {
            month = "0" + month;
        }

        String day = String.valueOf(jDayNo + 1);
        if (day.length() < 2) {
            day = "0" + day;
        }

        return jy + "/" + month + "/" + day;
    }

    private int doubleToInt(double f) {
        Double fint = new Double(f);
        return fint.intValue();
    }
}
