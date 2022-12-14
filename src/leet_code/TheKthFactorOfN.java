package leet_code;
// https://leetcode.com/problems/the-kth-factor-of-n/description/
import java.util.ArrayList;
import java.util.List;

public class TheKthFactorOfN {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        System.out.println(kthFactor(n,k));
    }

    private static int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                factors.add(i);
            }
        }

        /*
        we can use another for loop but for more optimized we are using binary Search algorithm
        for (int i = 0; i< factors.size(); i++){
            if (i+1 == k){
                return factors.get(i);
            }
        }
*/
        return binarySearch(factors, k);
    }

    private static int binarySearch(List<Integer> list, int target){
        int start = 0;
        int end = list.size()-1;

        while(start<= end){
            int mid = start+ (end - start) / 2;

            if (mid == target-1){
                return list.get(mid);
            }
            else if(mid > target-1){
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }
}
