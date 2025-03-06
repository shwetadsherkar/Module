class pattern2
{
    public static void main(String[] args) 
    {
       for (int i = 1; i <= 5; i++)
        { 
            System.out.print(i);
            for (int j = 1; j <i; j++)
               System.out.print("*"+i);
               System.out.println();
         }
      
        for (int i = 5; i >= 1; i--)
        {
           System.out.print(i);
            for (int j = 1; j <i; j++)
               System.out.print("*"+i);
               System.out.println();
        }
    }
}


/* output:
C:\Users\Lenovo\Desktop\JAVA>java pattern2
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1



*/