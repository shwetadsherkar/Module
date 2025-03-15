import java.util.Scanner;

class Q12
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int evenCount = 0, oddCount = 0, multipleOf3Count = 0;

        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) 
		{
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers)
		{
            if (num % 2 == 0)
			{
                evenCount++;
            } 
			else 
			{
                oddCount++;
            }

            if (num % 3 == 0) 
			{
                multipleOf3Count++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);
    }
}
