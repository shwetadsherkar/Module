class count
 {
    public static void main(String[] args) 
    {
        int n = 123456;
        int c = 0;
        while (n!= 0)
        {
            n=n/10;
            c++;
        }
        System.out.println("The number 123456 has" + c + " digits.");
    }
}


/*output:
C:\Users\Lenovo\Desktop\JAVA>java count
The number 123456 has 6 digits.
*/