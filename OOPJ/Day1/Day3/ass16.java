import java.util.Arrays;

class Q16
{
    public static void main(String[] args)
	{
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        mergeArrays(A, B);

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void mergeArrays(int[] A, int[] B)
	{
        int p = A.length;
        int q = B.length;
        int[] temp = new int[p + q];

        System.arraycopy(A, 0, temp, 0, p);
        System.arraycopy(B, 0, temp, p, q);
        Arrays.sort(temp);

        System.arraycopy(temp, 0, A, 0, p);

        System.arraycopy(temp, p, B, 0, q);
    }
}
