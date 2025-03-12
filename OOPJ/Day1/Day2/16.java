import java.util.Scanner;

class numCheck
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        
        System.out.println("The number is: " + result);
        
    }
}
