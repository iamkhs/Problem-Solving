package hacker_rank;
// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        // find the length of the longest common prefix between s and t
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }

        // calculate the minimum number of operations required to convert s to t
        int minOps = s.length() + t.length() - 2 * i;

        // check if the number of operations required is greater than k
        if (minOps > k) {
            return "No";
        }
        // check if the parity of the difference between k and minOps is even
        else if ((minOps % 2 == k % 2)) {
            return "Yes";
        }
        // check if k is greater than the sum of the lengths of s and t
        // in this case, we can delete all the characters in s and append all the characters in t
        else if (s.length() + t.length() - k < 0) {
            return "Yes";
        }
        // otherwise, we cannot convert s to t using k operations
        else {
            return "No";
        }
    }
}
