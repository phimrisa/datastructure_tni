
public class StackTest {

	public static void main(String[] args) {
		
		// StackArrayBased stacks = new StackArrayBased();
		StackLinkedList stacks = new StackLinkedList();
		
		// Add elements
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		
		System.out.println(stacks.peek()); // Output --> 12
		System.out.println(stacks.pop()); // Output --> 12
		System.out.println(stacks.peek()); // Output --> 11

	}

}
