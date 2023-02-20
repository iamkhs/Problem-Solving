package leet_code;
// https://leetcode.com/problems/k-th-symbol-in-grammar/description/
public class KthGrammar {
    // Using bitCount
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k - 1) % 2;
    }

    // Using Recursion
    public int kthGrammar2(int n, int k) {
         if(n == 1 || k == 1){
             return 0;
         }

         int mid = (int)(Math.pow(2, n-1)) / 2;
         if(k <= mid){
             return kthGrammar2(n-1, k);
         }
         else{
             int bit = kthGrammar2(n - 1, k - mid);
             return bit == 0 ? 1 : 0;
         }
    }
}
