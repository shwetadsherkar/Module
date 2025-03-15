 class Q01
{
    public static void main(String[] args)
	{
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        int smallest = array[0];
        int largest = array[0];

        for (int num : array)
			{
            if (num < smallest) 
			{
                smallest = num;
            } 
			else if (num > largest)
			{
                largest = num;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
