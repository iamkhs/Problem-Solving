import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double d = 4.5;
        int a = Double.valueOf(d).intValue();
        System.out.println("double = "+d);
        System.out.println("int = "+a);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int sum = 0;


        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                sum = sum+i;
            }
        }
        System.out.println("Divisor of "+n +" = "+sum);
    }
}