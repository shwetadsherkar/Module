import java.util.Arrays;
class Q07
 {
    public static void rotateArray(int[] arr, int k)
	{
        int n = arr.length;
       
        k = k % n;
        if (k > 0)
		{ 
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        }
    }

    private static void reverse(int[] arr, int start, int end) 
	{
        while (start < end) 
		{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
	{
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int steps = 3;

        rotateArray(array, steps);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}
