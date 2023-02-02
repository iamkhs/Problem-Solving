package leet_code;
// https://leetcode.com/problems/add-binary/description/
import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
    private static String addBinary(String binary1, String binary2) {
        BigInteger a = new BigInteger(binary1,2);
        BigInteger b = new BigInteger(binary2,2);
        BigInteger result = a.add(b);
        return result.toString(2);
    }
}
