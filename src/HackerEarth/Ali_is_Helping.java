package HackerEarth;

import java.util.Scanner;

public class Ali_is_Helping {
    public static void main(String [] args){

        String[] vowels = {"A","E","I","O","U","Y"};
        String s = "Y";

        String number = "12X345-67";
        int c = number.indexOf('3');
        System.out.println(c);


        for (int i =0; i< vowels.length; i++){
            if (vowels[i].equals(s)){
                System.out.println("Equals");
            }
        }
    }
}
