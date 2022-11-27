package leet_code;
// https://leetcode.com/problems/arranging-coins/
public class ArrangeCoin {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }

    // Binary Search approach
    private static int arrangeCoins(int n) {
        long start = 0;
        long end = n;

        while(start <= end){
            long pivot = start + (end - start)/ 2;
            long coinsUsed = pivot * (pivot + 1) / 2;

            if (coinsUsed == n){
                return (int)pivot;
            }
            if (n < coinsUsed){
                end  = pivot - 1;
            }
            else{
                start = pivot + 1;
            }
        }
        return (int) end;
    }
}
