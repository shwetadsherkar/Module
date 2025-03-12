class wrapper
 {
    public static void main(String[] args)
	{
        
        Integer intValue = 42; 
        Double doubleValue = intValue.doubleValue();  // Convert Integer to Double

        System.out.println("Integer to Double Conversion:");
        System.out.println("Original Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        
        Double anotherDoubleValue = 42.99; 
        Integer anotherIntValue = anotherDoubleValue.intValue();  // Convert Double to Integer

        System.out.println("\nDouble to Integer Conversion:");
        System.out.println("Original Double value: " + anotherDoubleValue);
        System.out.println("Converted to Integer: " + anotherIntValue);
    }
}
