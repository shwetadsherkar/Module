import java.util.Scanner;

class Q22
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++)
		{
            for (int j = 0; j < cols; j++)
			{
                matrix[i][j] = scanner.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++)
		{
            for (int j = 0; j < cols; j++)
			{
                if (matrix[i][j] > largest)
				{
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element in the matrix is: " + largest);
    }
}
