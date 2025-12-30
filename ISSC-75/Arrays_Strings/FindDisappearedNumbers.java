import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int i=0; i<nums.length; i++)
            arr[nums[i]] = nums[i];

        for(int i=1; i<=nums.length; i++)
            if(arr[i] != i)
                ans.add(i);

        return ans;
    }
}
