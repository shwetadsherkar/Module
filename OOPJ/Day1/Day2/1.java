 class swapno
 {
    public static void main(String[] args)
	{
        int a = 5, b = 7; 
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // XOR-based swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
