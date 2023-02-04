package hacker_rank;
// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        try {
            date = inputFormat.parse(s);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
