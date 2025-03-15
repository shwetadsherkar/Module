import java.util.Scanner;
import java.util.ArrayList;

class Q14
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++)
		{
            arr[i] = scanner.nextInt();
        }

        for (int num : arr) 
		{
            if (num % 2 == 0) 
			{
                even.add(num);
            } 
			else 
			{
                odd.add(num);
            }
        }
        System.out.println("Even numbers:");
        for (int num : even) 
		{
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for (int num : odd)
		{
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
