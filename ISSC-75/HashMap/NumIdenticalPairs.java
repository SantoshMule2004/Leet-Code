import java.util.HashMap;
import java.util.Map;

public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int num : nums)
            hMap.put(num, hMap.getOrDefault(num, 0)+1);

        int cnt = 0;
        for(int key : hMap.keySet()) {
            int curr = hMap.get(key);
            if(curr > 1)
                cnt += (curr * (curr - 1)) / 2;
        }
        return cnt;
    }
}
