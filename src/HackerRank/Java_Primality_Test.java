package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        String number = input.nextLine();

        BigInteger bigInteger = new BigInteger(number);

        if (bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
