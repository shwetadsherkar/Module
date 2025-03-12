import java.util.Scanner;

class minfour
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        
        System.out.print("Enter the fourth number: ");
        int d = sc.nextInt();
        
        
        int min = (a < b) ? 
                    ((a < c) ? 
                        ((a < d) ? a : d) 
                        : ((c < d) ? c : d)) 
                    : 
                    ((b < c) ? 
                        ((b < d) ? b : d) 
                        : ((c < d) ? c : d));
        
        System.out.println("The minimum of the four numbers is: "+ min);
	}
}