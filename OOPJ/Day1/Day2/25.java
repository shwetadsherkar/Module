import java.util.Scanner;

class revint 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num != 0)
		{
            rev = rev * 10 + num % 10; 
            num /= 10; 
        }

        System.out.println("Reversed number: " + rev);

    }
}
