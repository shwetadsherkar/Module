class fibo
 {
    public static void main(String[] args) 
    {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);   // printing 0 and 1

        while (true)
        {
            n3 = n1 + n2;         //1+1  1+2  2+3   3+5  5+8  8+13
            if (n3 > 21) 
            break;
            System.out.print(" " + n3);  // 1 2 3 5 8 13  21
            n1 = n2;       //1  1  2  3   5  8
            n2 = n3;       //1  2  3  5   8  13
        }
    }
}

/* output:
0 1 1 2 3 5 8 13 21
*/