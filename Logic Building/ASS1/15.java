class fact
{
   public static void main(String args[])
   {
     int no=5,fact=1,i;
   
    for(i=1;i<=no;i++)
    {
        fact=fact*i;
    }
    System.out.println("factorial of 5 is " + fact);
   }
}


/*output:

C:\Users\Lenovo\Desktop\JAVA>java fact
factorial of 5 is 120

*/