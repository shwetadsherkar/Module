import java.util.Scanner;

class Q18
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

       
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++)
		{
            for (int j = 0; j < n; j++) 
			{
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix elements row-wise:");
        for (int i = 0; i < m; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
