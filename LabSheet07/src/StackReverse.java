import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

	public static void main(String[] args) {
		
		String original = "Hello World";
		System.out.println("Original => " + original);
		System.out.println("Reverse => " + reverseCharacter(original));
		
	}

	public static String reverseCharacter(String original) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i = 0; i < original.length(); i++) {
			
			// Push each character (from index 0 to 10) into the stack.
			stack.push(original.charAt(i));
					
		}
		
		String reversed = "";
		
		for (int i = 0; i < original.length(); i++) {
			
			// Pop a character from the stack, then add it to "reversed" each time it got popped.
			reversed += stack.pop();
			
		}
		
		return reversed;
		
	}
	
}
