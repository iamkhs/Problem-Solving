package leet_code;
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
import java.util.Arrays;

public class MaximumNumberWordsFoundInSentences {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};

        System.out.println(mostWordsFound(arr));

    }

    private static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            String[] str = {sentence};
            int newM = count(str);
            max = Math.max(max, newM);
        }
        return max;
    }

    private static int count(String[] arr){
        String joined = String.join(" ", arr);
        String[] split = joined.split(" ");
        return split.length;
    }

    // Less code using lambda and stream api
    private static int mostWordsFound2(String[] sentences){
        return Arrays.stream(sentences)
                .mapToInt(sentence -> sentence.split(" ").length)
                .max()
                .orElse(0);
    }
}
