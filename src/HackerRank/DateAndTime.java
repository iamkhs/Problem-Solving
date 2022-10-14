package HackerRank;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args){

        getDay("08","05","2015");

    }

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Integer.parseInt(month) -1);
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        cal.set(Calendar.YEAR, Integer.parseInt(year));

        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;
    }
}
