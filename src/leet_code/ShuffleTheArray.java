package leet_code;
// https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;

        var ans = shuffle2(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    // Brute Force
    public static int[] shuffle(int[] nums, int n) {
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];
        int[] ans = new int[nums.length];
        int k = 0;

        for (int i = 0; i<n; i++){
            firstHalf[k++] = nums[i];
        }
        k = 0;

        for (int i = n; i<nums.length; i++){
            secondHalf[k++] = nums[i];
        }

        int i = 0;
        int j = 0;
        k = 0;
        while(i<firstHalf.length && j< secondHalf.length){
            ans[k] = firstHalf[i++];
            ans[k+1] = secondHalf[j++];
            k+=2;
        }
        return ans;
    }

    // Little Optimized
    public static int[] shuffle2(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i = 0;
        int j = 0;
        int k = n;

        while(j < n){
            ans[i] = nums[j++];
            ans[i+1] = nums[k++];
            i+=2;
        }
        return ans;
    }
}
