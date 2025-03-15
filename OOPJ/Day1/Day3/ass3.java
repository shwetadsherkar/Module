class Q03
{
	public static void main(String[] args)
	{
		int arr[] = {2,5,33,4,11,57,20};
		
		if(arr.length<2)
		{ 
			System.out.println("Only 1 element");
			return;	
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;	
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			} 
			else if(arr[i]>second)
			{
				second = arr[i];
			}
		}	
		System.out.println("First largest: " + first +  ", Second largest: " + second);		
		
	}
}