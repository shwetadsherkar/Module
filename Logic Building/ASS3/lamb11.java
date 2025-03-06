class demo
 {
    public static void main(String[] args)
   {
        int i = 5;
        int result = ++i - i--;
        
        System.out.println("Initial value of i: 5");
        System.out.println("Value after pre-increment (++i): " + (i + 1));
        System.out.println("Value after post-decrement (i--): " + i);
        System.out.println("Result of the expression (++i - i--): " + result);
        System.out.println("Final value of i: " + i);
    }
}

/*output:
C:\Users\Lenovo\Desktop\JAVA>java demo
Initial value of i: 5
Value after pre-increment (++i): 6
Value after post-decrement (i--): 5
Result of the expression (++i - i--): 0
Final value of i: 5



++i increments i from 5 to 6 and uses 6 in the expression.
i-- uses the current value of i (which is 6) in the expression and then decrements it to 5.
So, the result of the expression ++i - i-- is 6 - 6, which equals 0. The final value of i after the expression is 5.
*/