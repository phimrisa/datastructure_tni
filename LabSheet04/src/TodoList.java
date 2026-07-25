
public class TodoList {

	public static void main(String[] args) {

		DoublyLinkedList todoList = new DoublyLinkedList();
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println("To-do List = " + todoList.traversal());

		todoList.insert(0, "Submit Report");
		System.out.println("To-do List = " + todoList.traversal());
		
		todoList.insert(1, "Buy Food");
		System.out.println("To-do List = " + todoList.traversal());
		
		todoList.insert("Go to Gym");
		System.out.println("To-do List = " + todoList.traversal());
		
		// No.4.1
		todoList.remove();
		
		// No.4.2
		todoList.remove(3);
		
		// No.4.3
		todoList.remove(0);
		System.out.println("To-do List = " + todoList.traversal());
		
		// No.5.2
		System.out.print("\nBackward Traversal = " + todoList.backwardTraversal());
		
	}

}
