import java.util.*;

class Q10
 {
    public static void main(String[] args) 
	{
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        
        Set<Integer> set = new HashSet<>();
        for (int num : array1)
		{
            set.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : array2)
		{
            if (set.contains(num))
			{
                intersection.add(num);
            }
        }

       
        Set<Integer> union = new HashSet<>();
        for (int num : array1)
		{
            union.add(num);
        }
        for (int num : array2) 
		{
            union.add(num);
        }

        System.out.println("Intersection: " + intersection);
        System.out.println("Union: " + union);
    }
}
