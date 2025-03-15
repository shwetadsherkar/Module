import java.util.Scanner;

class Q9 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] array = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements of the array (1 to " + n + "):");
        for (int i = 0; i < n - 1; i++)
		{
            array[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : array)
		{
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

    }
}
