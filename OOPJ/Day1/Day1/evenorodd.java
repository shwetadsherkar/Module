class EvenOddChecker 
{
    public static void main(String[] args)
	{
        if (args.length != 1)
		{
            System.out.println("Please provide one number as a command-line argument.");
            return;
        }
            int number = Integer.parseInt(args[0]);

            if (number % 2 == 0) 
			{
                System.out.println(number + " is an even number.");
            } else 
			{
                System.out.println(number + " is an odd number.");
            }
        
    }
}
