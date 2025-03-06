class LoopVariableScope 
{ 
 public static void main(String[] args)
 {                                       //int x
 for (int i = 0; i < 5; i++)
 { 
 int x = i * 2;                            //x=i*2
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 


/* Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

The compilation error occurs because the variable x is declared within the scope of the for loop. This means x only exists inside the loop and is not accessible outside of it. When the code tries to print x outside the loop, the compiler cannot find it, resulting in an error.
To fix this, x should be declared outside the loop if it needs to be accessed later.

*/ 