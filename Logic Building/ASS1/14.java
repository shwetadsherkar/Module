class fibo
{
public static void main(String args[])
{
   int i,count=10,n1=0,n2=1,n3;
   System.out.print(n1+" "+n2);
   for(i=0;i<count;i++)
   {
     n3=n1+n2;
     System.out.print(" "+n3);
     n1=n2;
     n2=n3;
   }
}
}


/*output:

C:\Users\Lenovo\Desktop\JAVA>java fibo
0 1 1 2 3 5 8 13 21 34 55 89

*/