import java.util.Scanner;

 class check 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        System.out.println(number + " is within the range 20 to 50: " + (number >= 20 && number <= 50));
    }
}
