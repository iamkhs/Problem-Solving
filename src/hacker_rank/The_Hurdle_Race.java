package hacker_rank;

import java.util.ArrayList;
import java.util.List;

public class The_Hurdle_Race {
    public static void main(String[] args){

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(6);
        myArray.add(3);
        myArray.add(5);
        myArray.add(2);

        System.out.println(hurdleRace(4,myArray));
    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here

        int max = 0;
        int result = 0;

        for (int i : height){
            if (i > max){
                max  = i;
                result = max - k;
            }

            if (k > max){
                result  = 0;
            }
        }
        return result;
    }
}
