import java.util.Scanner;

class demo
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
		
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
		
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();

       
        boolean result = (a && b) || (b && c) || (a && c);

      
        System.out.println("At least two are true: " + result);
    }
}
