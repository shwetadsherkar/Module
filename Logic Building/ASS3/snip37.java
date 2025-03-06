class UninitializedWhileLoop 
{ 
 public static void main(String[] args) 
{ 
 int count; 
 while (count < 10) 
{ 
 System.out.println(count); 
 count++; 
 } 
 } 
} 

/* Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly?
 error: variable count might not have been initialized
 while (count < 10)
int count=1 */