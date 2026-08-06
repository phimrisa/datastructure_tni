
public class QueueLinkedList {

	// Pointer of the front and rear node.
	private Node front;
	private Node rear;
	
	// Create an empty queue.
	public QueueLinkedList() {
		
		front = null;
		rear  = null;
		
	}
	
	public boolean isEmpty() {
		
		/*
		FUNCTION isEmpty():
   			IF size of queue is empty THEN
      			RETURN true
   			ELSE THEN
      			RETURN false
   			END IF
		END FUNCTION
		*/
		
		return front == null;
		
	}
	
	public void enqueue(int value) {
		
		Node new_node = new Node(value);
		
		if (isEmpty()) {
			front = new_node;
			rear = new_node;
		} else {
			rear.next = new_node;
			rear = new_node;
		}

	}
	
	
	public int peek() {
		
		return !isEmpty() ? front.data : -1;
        
	}
	
	public int dequeue() {
		
		if (!isEmpty()) {
			Node temp_node = front;
			int temp_data = temp_node.data;
			
			front = front.next;
			
			temp_node = null; // Delete the temp node to get more free space.
			
			return temp_data;
		}
		return -1;
		
	}
	
}

