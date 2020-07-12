
package com.diplom.work;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class ViewDate {

    Calendar calendar = new GregorianCalendar();
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int year = calendar.get(Calendar.YEAR);

}
