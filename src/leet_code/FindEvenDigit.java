package leet_code;

public class FindEvenDigit {
    public static void main(String[] args){

        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int i : nums){
            if (even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i){
        int check = digit(i);
        return check % 2 == 0;
    }

    // more optimized
    static int digit(int num){
        if (num == 0){
            return 1;
        }
        return (int)Math.log10(num)+1;
    }
}
