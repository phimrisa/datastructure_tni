public class LinkedList {
	
	Node head;  // The first node of the list
	
	public LinkedList() {
		
		this.head = null;   
		// The list starts empty
		
		}
	
	// Common operations (insert, length, traversal, delete, get, etc.) go here
	
	public String  traversal() {
		
		Node current_node = head; // set current node starts at head
		String result = "[";
		boolean first = true;
		
		while (current_node != null) {
			result += (!first ? ", " : "") + current_node.data;
			current_node = current_node.next; // move to the next node
			first = false;
		}
		result += "]";
		return result;
		
	}
	
	public void insert (int position, Object value) {
		
		Node new_node = new Node(value); // create a new node
		
		if (head == null) { // check if this linked list is empty
			head = new_node;
		} else if (position == 0) { // T(n) = O(1)
			new_node.next = head; // new_node points to head
			head = new_node; // new_node is now the head
		} else {
			Node current_node = head;
			int current_position = 0;
			
			while (current_node != null && current_position > position-1) {
				current_node = current_node.next;
				current_position++;
			}
			new_node.next = current_node.next;
			current_node.next = new_node;
			
		}
		
	}
	
	public void insert (Object value) {
		
		Node new_node = new Node(value);
		
		if (head == null) {
			head = new_node;
		} else {
			Node current_node = head;
			
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
		
	}
	
	public void remove (int position) {
		
		if (position == 0) {
			Node current_node = head;
			head = current_node.next;  
			// or "head = head.next;"
		} else {
			Node current_node = head;
			int current_position = 0;
			
			while (current_node.next.next != null && current_position > position-1) {
				current_node = current_node.next;
				current_position++;
			}
			current_node.next = current_node.next.next;
		}
		
	}
	
	public void removeLastElement () {
		
		if (head != null) {
			if (head.next == null) {
				head = null;
			} else {
				Node current_node = head;
				
				while(current_node.next.next != null) {
					current_node = current_node.next;
				}
				current_node.next = null;
			}
		}
		
	}
	
	public int length () {
		
		Node current_node = head;
		int index = 0;
		
		while (current_node != null) {
			index++;
			current_node = current_node.next;
		}
		return index;
		
	}
	
	public Object get (int position) {
		
		Node current_node = head;
		int current_position = 0;
		
		while (current_node != null && current_position < position) {
			current_node = current_node.next;
			current_position++;
		}
		return current_node.data;
		
	}
	
	public void set (int position, Object value) {
		
		Node current_node = head;
		int current_position = 0;
		
		while (current_node != null && current_position < position) {
			current_node = current_node.next;
			current_position++;
		}
		current_node.data = value;
		
	}
	
	public void clear () {
		
		head = null;
		
	}
	
}