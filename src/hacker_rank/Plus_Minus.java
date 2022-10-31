package hacker_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus_Minus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int size = arr.size();
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int i = 0; i<size; i++){
            if (arr.get(i) > 0){
                positive++;
                //System.out.println(arr.get(i));
            } else if (arr.get(i) < 0) {
                negative++;
                //System.out.println(arr.get(i));
            }
            else {
                zeros++;
                //System.out.println(arr.get(i));
            }
        }

        double p = positive / (double)size;
        System.out.println(p);
        double n = negative / (double) size;
        System.out.println(n);
        double z = zeros / (double) size;
        System.out.println(z);

    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arraylist size : ");
        int size = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i<size; i++){
            int add = input.nextInt();
            a.add(add);
        }

       // -4 3 -9 0 4 1
        plusMinus(a);

    }

}
