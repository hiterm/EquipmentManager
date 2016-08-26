package ateam.util;

public class StringUtil {
    public static String convertHiraganaToKatakana (String str) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
          char code = str.charAt(i);
          if ((code >= 0x3041) && (code <= 0x3093)) {
            buf.append((char) (code + 0x60));
          } else {
            buf.append(code);
          }
        }
        return buf.toString();
    }
}
