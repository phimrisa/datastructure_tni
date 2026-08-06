
public class QueueArrayBased {
	
	// Attributes in Queue Array-Based.
	private int[] queue;
	private final int MAX_SIZE = 50;
	private int size;
	
	// Create an empty queue with default capacity.
	public QueueArrayBased() {
		
		queue = new int[MAX_SIZE];
		size = 0;  // No element in queue.
		
	}
	
	// Create an empty queue with a specific capacity.
	public QueueArrayBased(int capacity) {
		
		queue = new int[capacity];
		size = 0;  // No element in queue.
		
	}
	
	public boolean isEmpty() {

		/*
		 * FUNCTION isEmpty():
		 *	IF size of queue is empty THEN
		 *		RETURN true
		 *	ELSE THEN
		 *		RETURN false
		 *	END IF
		 * END FUNCTION
		 *
		 */
		
		return size == 0;
		
	}
	
	public boolean isFull() {

		/*
		 * FUNCTION isFull():
		 *	IF size of queue is full THEN
		 *		RETURN true
		 *	ELSE THEN
		 *		RETURN false
		 *	END IF
		 * END FUNCTION
		 *
		 */
		
		return size == queue.length-1;
		
	}
	
	public boolean enqueue(int new_element) {

		/* FUNCTION enqueue(new_element):
   		 *	IF QUEUE IS NOT FULL THEN
      	 *		ADD new_element INTO QUEUE
      	 *		INCREAMENT size BY 1
      	 *		RETURN true
   		 *	ELSE THEN
      	 *		RETURN false
   		 *	END IF
		 * END FUNCTION
		 */

		if (!isFull()) {
			queue[size++] = new_element;
			return true;
		}
		return false;
		
	}
	
	public int peek() {

		/* FUNCTION peek():
   		 *	IF QUEUE IS NOT EMPTY THEN
      	 *		 RETURN element FROM THE FRONT OF QUEUE
   		 *	ELSE THEN
      	 *		RETURN -1
   		 *	END IF
		 * END FUNCTION
		 */
		
		return !isEmpty() ? queue[0] : -1;
		
	}

	public int dequeue() {

		/*
		* FUNCTION dequeue():
   		*	IF QUEUE IS NOT EMPTY THEN
      	*		SET temp AS element FROM THE FRONT OF QUEUE
      	*		LOOP QUEUE STARTS AT INDEX 1 THEN
        *			SET queue[previous index] AS element in the current index 
      	*		END LOOP
      	*		DECREMENT size BY 1
      	*		RETURN temp
   		*	ELSE THEN
      	*		RETURN -1
   		*	END IF
	   	* END FUNCTION
		*/
		
		if (!isEmpty()) {
			int temp = queue[0];
			
			for (int i=1; i<queue.length; i++) {
				queue[i-1] = queue[i];
			}
			size--;
			return temp;
		}
		return -1;
		
	}
	
}