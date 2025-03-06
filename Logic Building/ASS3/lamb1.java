class sum
 {
    public static void main(String[] args) 
   {
        int sum = 0;
        int n = 50; 

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}


/* output:
The sum of the first 50 natural numbers is: 1275
*/