package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(char c : s.toCharArray())
            hm.put(c, hm.getOrDefault(c, 0)+1);

        pq.addAll(hm.entrySet());

        StringBuilder ans = new StringBuilder("");
        while(!pq.isEmpty()){
            int freq = pq.peek().getValue();
            char c = pq.poll().getKey();
            for(int i=0; i<freq; i++)
                ans.append(c);
        }
        return ans.toString();
    }
}
