class multiple
 {
    public static void main(String[] args)
   {
        System.out.println("Multiples of 7 between 1 and 100 are:");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 7 == 0) 
            {
                System.out.println(i);
            }
        }
    }
}

/* output:
Multiples of 7 between 1 and 100 are:
7
14
21
28
35
42
49
56
63
70
77
84
91
98
*/