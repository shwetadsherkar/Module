class greater
{
	public static void main(String args[])
{
        int n1 = 12, n2 = 45, n3 = 22;
        int largest;

        if (n1 >= n2 && n1 >= n3)
        {
            largest = n1;
        } 
        else if (n2 >= n1 && n2 >= n3)
        {
            largest = n2;
        }
        else 
        {
            largest = n3;
        }

        System.out.println("The largest number is " + largest);
    }
}

/*output:

C:\Users\Lenovo\Desktop\JAVA>java greater
The largest number is 45
*/