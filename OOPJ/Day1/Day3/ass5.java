class Q05
{
    public static void main(String[] args) 
	{
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        int sum = 0;

        for (int num : array) 
		{
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}
