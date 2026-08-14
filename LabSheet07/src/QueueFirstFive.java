import java.util.ArrayDeque;
import java.util.Queue;

public class QueueFirstFive {

	public static void main(String[] args) {
		
		Queue<Integer> n_queue = new ArrayDeque<Integer>();
		
		// Add 101-110 to n_queue.
		for (int i = 101; i <= 110; i++) {
			
			n_queue.add(i);
			
		}
		
		System.out.println("Queue => " + n_queue);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(n_queue.peek());
			n_queue.add(n_queue.poll());
			// n_queue's output => [106, 107, 108, 109, 110, 101, 102, 103, 104, 105]
			
		}
				
		for (int i = 0; i < 5; i++) {
			
			n_queue.peek();
			n_queue.add(n_queue.poll());
			
		}
		
		System.out.println("Queue => " + n_queue);
		
	}
	
}
