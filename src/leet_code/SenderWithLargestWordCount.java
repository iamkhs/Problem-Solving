package leet_code;
// https://leetcode.com/problems/sender-with-largest-word-count/description/

import java.util.*;
public class SenderWithLargestWordCount {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i <messages.length; i++){
            if (map.containsKey(senders[i])){
                map.put(senders[i], map.get(senders[i])+messages[i].split(" ").length);
            }
            else map.put(senders[i], messages[i].split(" ").length);
        }

        Queue<String> q = new PriorityQueue<>((a, b) -> {
            // Use a priority queue to sort the senders based on their word counts in descending order
            if (map.get(a).equals(map.get(b))) { // If the word counts are equal for two senders
                // Sort them lexicographically in descending order
                return b.compareTo(a);
            }
            // Sort senders based on their word counts in descending order
            return map.get(b) - map.get(a);
        });

        q.addAll(map.keySet());

        return q.poll();
    }
}
