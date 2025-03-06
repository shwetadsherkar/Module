class patt
 {
    public static void main(String[] args)
   {
        int n = 5;
        for (int i = n; i >= 1; i--)
        {
            for (int j = n; j >= i; j--) 
            {
                System.out.print(j);
                if (j > i)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


/*output:
C:\Users\Lenovo\Desktop\JAVA>java patt
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1


*/