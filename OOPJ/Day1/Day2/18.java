import java.util.Scanner;

class passfail
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the student's percentage: ");
        int percentage = sc.nextInt();
        
       
        String result = (percentage >= 40) ? "Pass" : "Fail";
        
        System.out.println("The student has: " + result);
       
    }
}
