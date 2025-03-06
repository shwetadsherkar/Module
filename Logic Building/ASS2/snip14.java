public class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} 



/* error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
snip14.java:3: error: incompatible types: String cannot be converted to double
 double num = "Hello";
*/