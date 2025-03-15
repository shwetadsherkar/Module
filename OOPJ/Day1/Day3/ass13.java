import java.util.Scanner;

class Q13
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 20;
        int[][] marks = new int[numberOfStudents][3]; 
        int countAbove75 = 0, countBelow40 = 0;

        System.out.println("Enter the marks for 20 students in Physics, Chemistry, and Maths:");
        for (int i = 0; i < numberOfStudents; i++)
		{
            System.out.println("Student " + (i + 1) + ":");
            marks[i][0] = scanner.nextInt(); // Physics
            marks[i][1] = scanner.nextInt(); // Chemistry
            marks[i][2] = scanner.nextInt(); // Maths
        }
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 3.0);

            if (percentage >= 75) 
			{
                countAbove75++;
            }
            if (percentage <= 40) 
			{
                countBelow40++;
            }
        }
        System.out.println("Number of students securing 75% and above in aggregate: " + countAbove75);
        System.out.println("Number of students securing 40% and below in aggregate: " + countBelow40);
		
    }
}
