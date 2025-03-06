class prime
{
 public static void main(String args[])
 {
   int n=17,i,flag=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            flag++;
        }
    }
    if(flag==2)
        System.out.println("The number "+n+" is prime");
    else
        System.out.println("The number "+n+" is  not prime");     
 }
}


/*output:

C:\Users\Lenovo\Desktop\JAVA>java prime
The number 17 is prime

*/