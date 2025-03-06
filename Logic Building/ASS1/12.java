class revnum
 {
    public static void main(String[] args)
 {
       
        int n = 12345;
        int rev= 0;

        while (n != 0) 
       {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n=n/10;
        }

        System.out.println("The reverse of 12345 is "+rev);
}
}


/*output:

C:\Users\Lenovo\Desktop\JAVA>java revnum
The reverse of 12345 is 54321

*/