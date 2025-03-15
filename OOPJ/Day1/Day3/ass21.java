import java.util.Scanner;

class Q21
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
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) 
		{
            int rowSum = 0;
            for (int j = 0; j < cols; j++) 
			{
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) 
		{
            int colSum = 0;
            for (int i = 0; i < rows; i++) 
			{
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}
