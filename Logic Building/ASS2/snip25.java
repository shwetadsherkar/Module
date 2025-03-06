public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 


/* error: class Switch is public, should be declared in a file named Switch.java
public class Switch {
       ^
snip25.java:4: error: patterns in switch statements are a preview feature and are disabled by default.
 switch(score) {
       ^
  (use --enable-preview to enable patterns in switch statements)
snip25.java:5: error: constant label of type int is not compatible with switch selector type double
 case 100:
      ^
snip25.java:8: error: constant label of type int is not compatible with switch selector type double
 case 85:*/