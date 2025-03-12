import java.util.Scanner;

class sum
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

       
        int sum = 0;
        int temp = Math.abs(number); 

        while (temp>0) 
		{
            sum = sum + temp % 10; // Get the last digit
            temp=temp/10;       // Remove the last digit
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
