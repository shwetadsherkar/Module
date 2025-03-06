class rev
 {
    public static void main(String[] args)
 {
        int no = 1234;
        int rev = 0;
        int digit;

        while (no != 0) 
        {
            digit = no % 10;                       
            rev = rev * 10 + digit;          
            no=no/10;                        
        }

        System.out.println("Reversed Number: " + rev);
    }
}


/* output:
1234 % 10=4        123 % 10=3     12 % 10=2      1        
0*10+4=4           0*10+3=3       0*10+2=2
1234/10=123        123/10=12       12/10=1
Reversed Number: 4321

*/