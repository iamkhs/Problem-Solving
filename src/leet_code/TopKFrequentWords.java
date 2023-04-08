package leet_code;
// https://leetcode.com/problems/top-k-frequent-words/description/
import java.util.*;
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        Queue<String> q = new PriorityQueue<>((a, b)->{ // Create a PriorityQueue to store the words sorted by frequency
            if(map.get(a).equals(map.get(b))){ // If two words have the same frequency
                return a.compareTo(b); // Sort them lexicographically (alphabetically)
            }
            return map.get(b) - map.get(a); // Otherwise, sort them by frequency in descending order
        });

        q.addAll(map.keySet()); // Add all the keys (words) from the HashMap to the PriorityQueue
        List<String> list = new ArrayList<>(); // Create a list to store the top k frequent words
        for(int i = 0; i<k; i++){ // Iterate k times to get the top k frequent words
            list.add(q.poll()); // Poll the PriorityQueue to get the word with the highest frequency and add it to the list
        }
        return list;
    }
}
