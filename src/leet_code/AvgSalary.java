package leet_code;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class AvgSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
//        Arrays.sort(salary); We can use java library inbuilt sorting method,
//        but we are now using selection sort algorithm
        for (int i = 0; i< salary.length-1; i++){
            int min = i;
            for (int j = i+1; j<salary.length; j++){
                if (salary[j] < salary[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = salary[i];
                salary[i] = salary[min];
                salary[min] = temp;
            }
        }
        double sum = 0;
        int count = 0;
        for (int i = 1; i<salary.length-1; i++){
            sum+=salary[i];
            count++;
        }
        return sum / count;
    }
}
