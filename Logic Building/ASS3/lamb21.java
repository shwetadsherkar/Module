class nostar 
{
    public static void main(String[] args) 
    {
        int n = 5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 2*i-1; j+=2)
            {
                if (j > 1) 
                {
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*output:
C:\Users\Lenovo\Desktop\JAVA>java nostar
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9



*/