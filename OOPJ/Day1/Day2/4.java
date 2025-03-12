class div
 {
    public static void main(String[] args)
	{
        int number = 18; 
        
        if (isDivisibleByThree(number))
		{
            System.out.println(number + " is divisible by 3.");
        } 
		else
		{
            System.out.println(number + " is not divisible by 3.");
        }
    }

    
    public static boolean isDivisibleByThree(int n)
	{
        n = Math.abs(n); 
        while (n > 3)
		{
            int sum = 0;
            while (n > 0) 
			{
                sum += n & 1; 
                n = n >> 1;   
            }
            n = sum; 
        }
        return (n == 3);
    }
}
