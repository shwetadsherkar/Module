public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 


/*error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
snip15.java:5: error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;*/