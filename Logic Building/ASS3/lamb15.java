class shape
 {
    public static void main(String args[])
    {
        int i, j,n=5;
        
        for (i = 0; i < n; i++) 
       {
            for (j = n - i; j > 1; j--) 
            {
                System.out.print(" ");
            }

            
            for (j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* output:
C:\Users\Lenovo\Desktop\JAVA>java shape
    *
   * *
  * * *
 * * * *
* * * * *

*/
    
  
   