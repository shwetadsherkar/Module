import java.util.Scanner;

class Q24
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix (N x N):");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++)
		{
            for (int j = 0; j < n; j++)
			{
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) 
		{
            for (int j = i; j < n; j++)
			{
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n / 2; j++)
			{
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        System.out.println("The matrix rotated by 90 degrees clockwise is:");
        for (int i = 0; i < n; i++)
		{
            for (int j = 0; j < n; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
