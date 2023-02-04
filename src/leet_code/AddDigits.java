package leet_code;
// https://leetcode.com/problems/add-digits/description/
public class AddDigits {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }

    // Recursion Method
    private static int addDigits(int n) {
        if (n < 10){
            return n;
        }
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        // recursive call
        return addDigits(sum);
    }
}
