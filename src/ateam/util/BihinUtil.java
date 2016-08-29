package ateam.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ateam.model.Bihin;

public class BihinUtil {
    public static String getStatusStr(int status) {
        String statusName = null;
        switch (status) {
        case 1:
            statusName = "利用可能";
            break;
        case 2:
            statusName = "貸出中";
            break;
        case 3:
            statusName = "返却済み";
            break;
        case 4:
            statusName = "貸出申請中";
            break;
        default:
            statusName = "???";
            break;
        }
        return statusName;
    }

    public static String getReturnDayStr(Date date) {
        final String DATE_PATTERN = "yyyy-MM-dd";
        if (date != null) {
            return (new SimpleDateFormat(DATE_PATTERN)).format(date);
        } else {
            return "---";
        }
    }

    // bihin.returnDayがnullでなく、返却期限を過ぎているときtrue
    public static boolean isOverdue(Bihin bihin) {
        Date today = new Date(System.currentTimeMillis());
        Date returnDay = bihin.getReturnDay();

        if (returnDay == null) {
            return false;
        }

        Calendar todayCal = Calendar.getInstance();
        todayCal.setTime(today);
        Calendar returnDayCal = Calendar.getInstance();
        returnDayCal.setTime(returnDay);

        todayCal.set(Calendar.MILLISECOND, 0);
        todayCal.set(Calendar.SECOND, 0);
        todayCal.set(Calendar.MINUTE, 0);
        todayCal.set(Calendar.HOUR_OF_DAY, 0);
        returnDayCal.set(Calendar.MILLISECOND, 0);
        returnDayCal.set(Calendar.SECOND, 0);
        returnDayCal.set(Calendar.MINUTE, 0);
        returnDayCal.set(Calendar.HOUR_OF_DAY, 0);
        return todayCal.getTime().compareTo(returnDayCal.getTime()) > 0;
    }

}
