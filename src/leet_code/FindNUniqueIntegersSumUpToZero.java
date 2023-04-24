package leet_code;
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n % 2 == 0){
            for(int i =0; i<ans.length-1; i+=2){
                ans[i+1] = i+1;
                ans[i] = (i+1)*-1;
            }
        }else{
            for(int i = 1; i<ans.length; i+=2){
                ans[i+1] = i+1;
                ans[i] = (i+1)*-1;
            }
        }
        return ans;
    }
}
