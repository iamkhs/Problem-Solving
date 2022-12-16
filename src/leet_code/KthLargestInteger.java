package leet_code;
// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/description/
import java.math.BigInteger;
import java.util.Arrays;

public class KthLargestInteger {
    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        int k = 4;
        System.out.println(kthLargestNumber(nums,k));
    }

    // This is not optimized solution !!
    private static String kthLargestNumber(String[] nums, int k) {
        BigInteger[] bi = new BigInteger[nums.length];
        for (int i = 0; i<nums.length; i++){
            bi[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(bi);
        return bi[bi.length-k].toString();
    }
}
