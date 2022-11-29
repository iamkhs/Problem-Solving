package leet_code;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArrWithXElement {
    public static void main(String[] args) {
        int[] nums = {3, 5};
        System.out.println(specialArray(nums));
    }

    private static int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start <= end){
            int mid = start + (end - start) /2;
            int count = 0;
            for (int i : nums){
                if (i >= mid){
                    count++;
                }
            }
            if (count > mid){
                start = mid +1;
            }
            else if(count < mid){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
