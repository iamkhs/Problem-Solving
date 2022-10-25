package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Min_Max_Sum {
    public static void main(String [] args){

        // Demo main method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<5; i++){
            int a = input.nextInt();
            arrayList.add(a);
        }

        miniMaxSum(arrayList);
    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;

        for (int i = 0; i<arr.size(); i++){
            totalSum+=arr.get(i);
            if (arr.get(i) <min){
                min = arr.get(i);
            }
            if (arr.get(i)> max){
                max = arr.get(i);
            }
        }

        System.out.println((totalSum-max) + " " + (totalSum-min));

    }
}
