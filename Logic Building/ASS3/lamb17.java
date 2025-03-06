class shape
 {
    public static void main(String args[])
    {
        int i, j,n=5;
        
        for (i = 1; i <= 5; i++) 
       {
            for (j = 1; j <i; j++) 
            {
                System.out.print(" ");
            }

            
            for (j = i; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* output:
C:\Users\Lenovo\Desktop\JAVA>java shape
* * * * *
 * * * *
  * * *
   * *
    *
   
*/
    
  
   