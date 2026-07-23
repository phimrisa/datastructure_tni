
public class TodoList {

	public static void main(String[] args) {

		DoublyLinkedList todoList = new DoublyLinkedList();
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.traversal());

		todoList.insert(0, "Submit Report");
		System.out.println(todoList.traversal());
		
		todoList.insert(1, "Buy Food");
		System.out.println(todoList.traversal());
		
		todoList.insert("Go to Gym");
		System.out.println(todoList.traversal());
		
		todoList.remove();
		System.out.println(todoList.traversal());
		

		System.out.println(todoList.backwardTraversal());
	}

}
