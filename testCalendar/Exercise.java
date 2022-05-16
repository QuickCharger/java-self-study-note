package testCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise {
    public static String getMonday(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }

    public static int getTwoDay(String j1, String j2) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyy-MM-dd");
        int day = 0;
        try {
            Date d = fmt.parse(j1);
            Date d2 = fmt.parse(j2);
            day = (int)(d.getTime() - d2.getTime() / (24 * 3600 * 1000));
        } catch (Exception e) {
            return 0;
        }
        return day;
    }

    public static Date strToDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch( Exception e) {
            // do nothing
        }
        return date;
    }

    public static String DateToStr(Date d) {
        SimpleDateFormat fmt= new SimpleDateFormat("yyyy-MM-dd");
        return fmt.format(d);
    }

    public static String getWeek(String sdate, String num) {
        // 再转换为时间
        Date dd = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(dd);
        int weekNo = Integer.parseInt(num);
        switch (weekNo) {
            case 1:
                c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);    //返回星期一所在的日期
                break;
            case 2:
                c.set(Calendar.DAY_OF_WEEK,Calendar.TUESDAY);    //返回星期二所在的日期
                break;
            case 3:
                c.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);    //返回星期三所在的日期
                break;
            case 4:
                c.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);    //返回星期四所在的日期
                break;
            case 5:
                c.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);    //返回星期五所在的日期
                break;
            case 6:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);    //返回星期六所在的曰期
                break;
            case 7:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);    //返回星期曰所在的日期
                break;
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }
}
