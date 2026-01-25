import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> hSet = new HashSet<>();

        for(char c : jewels.toCharArray())
            hSet.add(c);

        int cnt = 0;
        for(char c : stones.toCharArray()) {
            if(hSet.contains(c))
                cnt++;
        }
        return cnt;
    }
}