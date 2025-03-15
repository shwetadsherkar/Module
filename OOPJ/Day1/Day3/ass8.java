import java.util.Arrays;

class Q08
 {
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

       
        for (int i = m - 1, j = 0; i >= 0 && j < n; i--, j++)
			{
            if (arr1[i] > arr2[j]) {
                // Swap the elements
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }

        Arrays.sort(arr2);

        
        System.out.println("Merged Array: ");
        for (int i = 0; i < m; i++) 
		{
            System.out.print(arr1[i] + " ");
        }
        for (int j = 0; j < n; j++) 
		{
            System.out.print(arr2[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}; // First sorted array
        int[] arr2 = {2, 4, 6, 8}; // Second sorted array

        System.out.println("Before merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        mergeArrays(arr1, arr2);
    }
}
