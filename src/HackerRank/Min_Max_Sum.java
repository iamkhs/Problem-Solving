package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Min_Max_Sum {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<5; i++){
            int a = input.nextInt();
            arrayList.add(a);
        }

//        7 69 2 221 8974
        //expected output = 9271


        miniMaxSum(arrayList);

    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

//        int min = arr.get(0);
//        int max = arr.get(0);
//        long maxSum = 0;
//        long minSum = 0;
//        int maxIndex = -1; // index;
//        int minIndex = -1;
//
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) > max) {
//                max = arr.get(i);
//            }
//
//
//            if (arr.get(i) == max) {
//                maxIndex = i;
//            }
//
//            if (arr.get(i) < min) {
//                min = arr.get(i);
//            }
//
//            if (arr.get(i) == min) {
//                minIndex = i;
//            }
//        }
//
////        System.out.println("Maximum = "+max);
////        System.out.println("Minimum = "+min);
////        System.out.println("Maximum index = "+maxIndex);
////        System.out.println("Minimum index = "+minIndex);
//
//        for (int i = 0; i<maxIndex; i++){
//            maxSum+=arr.get(i);
//        }
//
//        for (int i = 0; i<arr.size(); i++){
//            //min index = 1
//            if (arr.get(i) != min){
//                minSum+=arr.get(i);
//                //System.out.print(arr.get(i)+" ");
//            }
//        }
//
//        System.out.print(maxSum+" "+minSum);

        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;
//        for (int n : arr) {
//            totalSum += n;
//            if ( n < min ) min = n;
//            if ( n > max ) max = n;
//        }

        for (int i = 0; i< arr.size(); i++){
            totalSum +=arr.get(i); // sum of all the elements.
            if (arr.get(i) > max){
                max = arr.get(i);
            }
            if (arr.get(i)<min){
                min = arr.get(i);
            }
        }

        System.out.println("Sum of all the elements = "+totalSum);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        //System.out.println((totalSum - max) +" "+(totalSum - min));

        System.out.println("without max number = "+(totalSum - max));
        System.out.println("without min number = "+(totalSum - min));

//        for (int i = 0; i<arr.size(); i++){
//            totalSum+=arr.get(i);
////            if (arr.get(i) <min){
////                min = arr.get(i);
////            }
////            if (arr.get(i)> max){
////                max = arr.get(i);
////            }
//        }
        //System.out.println(totalSum);
        //System.out.println((totalSum-max) + " " + (totalSum-min));

    }
}
