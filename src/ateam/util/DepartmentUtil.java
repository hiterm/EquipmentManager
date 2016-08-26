package ateam.util;

public class DepartmentUtil {
    public static String getDeptName(String deptID) {
        String deptName = null;
        switch (deptID) {
        case "D001":
            deptName = "新自動化グループ";
            break;
        case "D002":
            deptName = "ITサービスマネジメント部";
            break;
        case "D003":
            deptName = "プロダクト開発部";
            break;
        case "D004":
            deptName = "品質保証室";
            break;
        case "D005":
            deptName = "インターンAチーム";
            break;
        default:
            deptName = "???";
            break;
        }
        return deptName;
    }
}
