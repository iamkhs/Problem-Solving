package leet_code;
// https://leetcode.com/problems/find-the-array-concatenation-value/description/
public class FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = nums.length-1;
        long ans = 0;
        while(i <= j){
            if (i==j){
                ans+=nums[i];
                break;
            }
            sb.append(nums[i]).append(nums[j]);
            ans+= Long.parseLong(sb.toString());
            sb.delete(0,sb.length());
            i++;
            j--;
        }
        return ans;
    }
}
