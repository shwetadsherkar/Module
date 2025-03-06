class swap
  {
	public static void main(String args[])
        {
         int a=10, b=20;
        
         System.out.println("Before swapping:");
         System.out.println("1 st number="+a);
         System.out.println("2 nd number="+b);
         
         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println("\nAfter swapping:");
         System.out.println("1 st number="+a);
         System.out.println("2 nd number="+b);
	}
  }


/*output:

C:\Users\Lenovo\Desktop\JAVA>java swap
Before swapping:
1 st number=10
2 nd number=20

After swapping:
1 st number=20
2 nd number=10
*/