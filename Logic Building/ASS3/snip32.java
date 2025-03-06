class IncorrectWhileCondition
 { 
 public static void main(String[] args)
 { 
 int count = 5; 
 while (count = 0)
 { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 


/* error: class IncorrectWhileCondition is public, should be declared in a file named IncorrectWhileCondition.java
public class IncorrectWhileCondition {
       ^
snip32.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
*/