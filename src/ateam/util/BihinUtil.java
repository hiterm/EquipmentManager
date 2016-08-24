package ateam.util;

public class BihinUtil {
    static String getStatusStr(int status){
        String statusName;
        if(status == 1){
            statusName = "利用可能";
            return statusName;
        }else{
            statusName = "貸出中";
            return statusName;
        }
    }

}
