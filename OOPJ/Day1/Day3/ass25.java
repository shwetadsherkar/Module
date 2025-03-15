import java.util.Scanner;

class Q25
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix (N x N):");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

    
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++)
		{
            for (int j = 0; j < n; j++)
			{
                matrix[i][j] = sc.nextInt();
            }
        }

        int pSum = 0;
        int sSum = 0;

        for (int i = 0; i < n; i++)
		{
            pSum += matrix[i][i]; 
            sSum += matrix[i][n - 1 - i]; 
        }
        System.out.println("Sum of the primary diagonal: " + pSum);
        System.out.println("Sum of the secondary diagonal: " + sSum);

        int totalSum = pSum + sSum;

        if (n % 2 != 0) 
		{
            totalSum -= matrix[n / 2][n / 2];
        }

        System.out.println("Total sum of both diagonals: " + totalSum);
    }
}
