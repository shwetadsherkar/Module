class Factorial
 {
    public static void main(String[] args)
   {
        int number = 10; 
        long factorial = 1; 

        for (int i = 1; i <= number; i++)
        {
            factorial *= i; // Multiply factorial by the current number
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

/*output:
The factorial of 10 is 3628800
*/