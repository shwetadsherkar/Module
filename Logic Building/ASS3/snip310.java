 class IncorrectWhileLoopControl
 { 
 public static void main(String[] args)
 { 
 int num = 10; 
 while (num = 10) 
 { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
/* Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?

loop does not execute indefinitely bcz of num-- condition false*/