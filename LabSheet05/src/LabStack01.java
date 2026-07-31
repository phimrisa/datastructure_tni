import java.util.Scanner; 
import java.util.Stack; 
 
public class LabStack01 { 
	
   public static void main(String[] args) { 
	   
      String tc1 = "SUM([A1+B1]*{C1-D1})"; 
      String tc2 = "IF((a>0, [b*2)], c)"; 
      String tc3 = "Hello ((world)"; 
      String tc4 = "Malee (2613510002)"; 
 
      System.out.println("Testcase 1 = " + (isBalance(tc1) ? "Balance" : "Not Balance")); 
      System.out.println("Testcase 2 = " + (isBalance(tc2) ? "Balance" : "Not Balance")); 
      System.out.println("Testcase 3 = " + (isBalance(tc3) ? "Balance" : "Not Balance")); 
      System.out.println("Testcase 4 = " + (isBalance(tc4) ? "Balance" : "Not Balance")); 
      
   } 
 
   public static boolean isBalance(String message) { 
	   
      // write your code here to check the balance and correctness of the parentheses 
	   
	   Stack<Character> stacks = new Stack<Character>();
	   
	   boolean isBalance = true;
	   
	   for (int i=0; i<message.length(); i++) {
	    	  
	         char letter = message.charAt(i);  
	         
	         if (letter == '(' || letter == '[' || letter == '{') {  
	        	 
	            stacks.push(letter); 
	            
	            if (stacks.isEmpty()) {
	            	
	               isBalance = false;
	               
	            } 
	            
	            char top = stacks.pop();
	            
	            if ((top == '(' && letter != ')') || (top == '[' && letter != ']') || (top == '{' && letter != '}')) {
	            	
	            	isBalance = false;
	            	break;
	            	
	            }
	            
	         }
	         
	      }
	   
	   if (!stacks.isEmpty()) {
		   
	         isBalance = false;
	         
	      }
	      
	   return isBalance;
	   
   } 
   
}