package Queue;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hMap = new HashMap<>();
        for(char c : s.toCharArray())
            hMap.put(c, hMap.getOrDefault(c, 0)+1);

        int sLen = s.length();
        for(int i=0; i<sLen; i++)
            if(hMap.get(s.charAt(i)) == 1)
                return i;

        return -1;
    }

    // int[] charFreq = new int[26];
    //     for(char c : s.toCharArray())
    //         charFreq[c - 'a']++;

    //     int sLen = s.length();
    //     for(int i=0; i<sLen; i++)
    //         if(charFreq[s.charAt(i) - 'a'] == 1)
    //             return i;

    //     return -1;
}
