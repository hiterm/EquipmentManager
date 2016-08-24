package ateam.util;

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

}
