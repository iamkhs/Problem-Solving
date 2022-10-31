package hacker_rank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {
    public static void main(String []args){

        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter n number : ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i<n; i++){
            //System.out.print("Enter name : ");
            String name = input.nextLine().toLowerCase();

            //System.out.print("Enter phone : ");
            int phone = input.nextInt();
            phoneBook.put(name,phone);
            input.nextLine();
        }

        while(input.hasNext()){
            String s = input.nextLine();
            if (phoneBook.get(s) != null){
                System.out.println(s+"="+phoneBook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
