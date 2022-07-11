package com.example.checkdate;

public class DateUtils {

    private static final int MIN_YEAR = 1000;
    private static final int MAX_YEAR = 9999;

    private static boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static boolean checkDateValidationOK(String dayStr, String monthStr, String yearStr) {

        try{
            int d = Integer.parseInt(dayStr);
            int m = Integer.parseInt(monthStr);
            int y = Integer.parseInt(yearStr);

            if (y > MAX_YEAR || y < MIN_YEAR) {
                return false;
            }
            if (m < 1 || m > 12) {
                return false;
            }
            if (d < 1 || d > 31) {
                return false;
            }

            if (m == 2) {
                if (isLeap(y)) {
                    return (d <= 29);
                } else {
                    return (d <= 28);
                }
            }

            if (m == 4 || m == 6
                    || m == 9 || m == 11) {
                return (d <= 30);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }


}
