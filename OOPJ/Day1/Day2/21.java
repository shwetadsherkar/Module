import java.util.Scanner;

class increment
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        int incnumber = -~num;

        System.out.println("The incremented number is: " + incnumber);

    }
}
