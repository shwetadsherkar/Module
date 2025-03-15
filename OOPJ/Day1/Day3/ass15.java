import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Q15
 {
    public static void main(String[] args)
	{
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};
        
        System.out.println("Sub-arrays with 0 sum : ");
        findZeroSumSubarrays(nums1);
        findZeroSumSubarrays(nums2);
        findZeroSumSubarrays(nums3);
    }
    
    public static void findZeroSumSubarrays(int[] nums)
	{
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>()); 

        for (int i = 0; i < nums.length; i++) 
		{
            sum += nums[i];

            if (map.containsKey(sum))
			{
                for (int start : map.get(sum))
				{
                    printSubarray(nums, start + 1, i);
                }
            }

            if (!map.containsKey(sum)) 
			{
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }
    }

    private static void printSubarray(int[] nums, int start, int end) 
	{
        System.out.print("[");
        for (int i = start; i <= end; i++) 
		{
            System.out.print(nums[i]);
            if (i < end)
			{
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
