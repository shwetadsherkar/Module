class MisplacedForLoopBody
 { 
 public static void main(String[] args)
 { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 

/* output:
0
1
2
3
4
Done -prints outside the loop.
*/