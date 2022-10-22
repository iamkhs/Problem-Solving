package HackerRank;
import java.util.List;
import java.util.Scanner;

public class BirthdayCandles {
    private static final Scanner input = new Scanner(System.in);

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count  = 0;
        int max = 0;

        for (int i = 0; i<candles.size(); i++){
            if (candles.get(i) > max){
                max = candles.get(i);
                count = 0;
            }
            if(max == candles.get(i)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
