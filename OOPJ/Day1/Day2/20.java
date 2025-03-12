import java.util.Scanner;

class abval 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        
        int absoluteValue = (number >= 0) ? number : -number;
        
        System.out.println("The absolute value of " + number + " is: " + absoluteValue);
        
        
    }
}
