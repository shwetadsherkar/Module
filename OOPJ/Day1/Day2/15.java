import java.util.Scanner;

class swapbits
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        
        int evenMask = 0xAAAAAAAA;   // Binary: 101010... for even bits
        int oddMask = 0x55555555;    // Binary: 010101... for odd bits
        
       
        int swapped = ((x & evenMask) >> 1) | ((x & oddMask) << 1);
        
        System.out.println("Number after swapping odd and even bits: " + swapped);
        
       
    }
}

/*Input: 23 (binary: 00010111)

Odd bits: 00000010 → Shift left: 00000100

Even bits: 00010101 → Shift right: 00001010

Result: 00001110 (decimal: 14)*/