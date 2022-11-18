package leet_code;
// https://leetcode.com/problems/convert-the-temperature/
import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }

    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin,fahrenheit};

        // or we can return in one line,
        //return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
