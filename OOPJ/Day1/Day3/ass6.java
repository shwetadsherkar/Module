class Q06
 {
    public static void main(String[] args)
	{
        int[] array = {1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 6};

        int x = 0; 

        for (int i = 1; i < array.length; i++) 
		{
            if (array[i] != array[x]) 
			{
                x++;
                array[x] = array[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
		
        for (int i = 0; i < x; i++) 
		{
            System.out.print(array[i] + " ");
        }
    }
}
