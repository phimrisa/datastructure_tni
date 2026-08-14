
class Node {
	
	public int  data;
	public Node next;
	
	public Node(int value) {
		
		this.data = value;
		this.next = null;
		
	}
	
}

public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
		
		head = null;
		tail = null;
		
	}
	
	public String displayList() {
		
		boolean first = true;
		String  display = "[";
		
		for (Node current = head; current != null; current = current.next) {
			
			display += (!first ? ", " : "") + current.data;
			first = false;
			
		}
		
		display += "]";
		return display;
		
	}
	
	public void clear() {
		
		head = null;
		tail = null;
		
	}
	
	// No.2
	// Check if the list is empty or not.
	public boolean isEmpty() {
        
		return head == null;
		
	}
	
	// Insert node at the end of the list.
	public void append(int value) {
		
		Node new_node = new Node(value);
		
		if (isEmpty()) {
			
			head = new_node;
			tail = new_node;
			
		} else {
			
			tail.next = new_node;
			tail = new_node;
			
		}

	}
	
	// Return the node's value from the require position. 
	public Object get(int position) {
		
		Node current_node = head;
		int current_position = 0;
		
		while(current_node != null && current_position < position) {
			
			current_node = current_node.next;
			current_position++;
			
		}
		
		// If there is no value return null.
		if (current_node != null) {
			
			return current_node.data;
			
		}
		return null;
		
	}
	
	// Update node's value from require position.
	public void set(int position, int value) {
		
		Node current_node = head;
		int current_position = 0;
		
		while(current_node != null && current_position < position) {
			
			current_node = current_node.next;
			current_position++;
			
		}
		
		// If the value has been changed.
		if (current_node != null) {
			
			current_node.data = value;
			System.out.println("Update data success!!");
			
		} else { // If the value hasn't been changed.
			
			System.out.println("Update data fail...");
			
		}

	}
	
	// Find the certain value in the list.
	public boolean contains(int value) {
		
		Node current_node = head;
		
		// If there is a value return true, if not return false.
		while(current_node != null) {
			
			if(value == current_node.data) {
				
				return true;
				
			}
			
			current_node = current_node.next;
			
		}
		return false;

	}
	
	// Connect current list and otherlist with each other.
	public void addAll(SinglyLinkedList otherlist) {
		
		// If both lists is not empty, then the value will be from the both of them.
		if(!isEmpty() && !otherlist.isEmpty()) {
			
			tail.next = otherlist.head;
			tail = otherlist.tail;
			
		}
		
		//
		if(isEmpty()) {
			
			head = otherlist.head;
			tail = otherlist.tail;
			
		}
		
	}
	
}
