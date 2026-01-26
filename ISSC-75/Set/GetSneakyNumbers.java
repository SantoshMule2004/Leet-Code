import java.util.HashSet;
import java.util.Set;

public class GetSneakyNumbers {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> ht = new HashSet<>();

        int[] ans = new int[2];
        int i = 0;

        for(int num : nums)
            if(!ht.add(num))
                ans[i++] = num;

        return ans;
    }
}
