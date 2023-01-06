package leet_code;
// https://leetcode.com/problems/maximum-ice-cream-bars/description/
import java.util.Arrays;
public class MaximumIceCreamsBar {
    public static void main(String[] args) {
        int[] costs = {1, 6, 3, 1, 2, 5};
        int coins = 20;
        System.out.println(maxIceCream(costs, coins));
    }

    private static int maxIceCream(int[] costs, int coins) {
        // Initialize a counter for the number of ice cream bars
        int count = 0;
        // Sort the costs array in ascending order
        Arrays.sort(costs);
        // Loop through the costs array
        for (int cost : costs) {
            // If the cost of the current ice cream bar is less than or equal to the remaining coins,
            // buy the ice cream bar and increment the count variable
            if (cost <= coins) {
                coins -= cost; // decrement the remaining coins by the cost of the ice cream bar
                count++; // increment the count of ice cream bars
            } else {
                // If the cost of the current ice cream bar is more than the remaining coins, we can't buy any more ice cream bars
                break; // exit the loop
            }
        }
        // Return the number of ice cream bars
        return count;
    }
}
