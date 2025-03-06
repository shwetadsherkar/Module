class largedigit
 {
    public static void main(String[] args)
    {
        int number = 4825;
        int lDigit = 0;

        while (number > 0) 
        {
            int digit = number % 10;
            if (digit > lDigit) 
            {
                lDigit = digit;
            }
            number=number/ 10;
        }

        System.out.println("The largest digit is: " + lDigit);
    }
}


/*output:
C:\Users\Lenovo\Desktop\JAVA>java largedigit
The largest digit is: 8
*/