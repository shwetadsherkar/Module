class Q17
{
    public static void main(String[] args)
	{
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProduct(nums);
    }

    public static void findMaxProduct(int[] nums) 
	{
        if (nums.length < 2) 
		{
            System.out.println("Array must have at least two elements.");
            return;
        }

        int maxProduct = Integer.MIN_VALUE;
        int max1 = 0, max2 = 0;

        for (int i = 0; i < nums.length - 1; i++)
		{
            for (int j = i + 1; j < nums.length; j++) 
			{
                int product = nums[i] * nums[j];
                if (product > maxProduct)
				{
                    maxProduct = product;
                    max1 = nums[i];
                    max2 = nums[j];
                }
            }
        }

        System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + maxProduct);
    }
}
