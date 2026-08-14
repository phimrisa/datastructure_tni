import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
	
	public static Queue<Integer> queue = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		originalQueue();
		
		while (true) {
			
			System.out.print("Press 1 to rotate queue: ");
			int num = input.nextInt();
			
			if (num == 1) {
			
				rotateQueue();
				System.out.println("Queue =>" + queue);
				System.out.println();
			
			} else {
				
				System.out.println("Exit");
				break;
				
			}
			
		}
		
	}
	
	public static void rotateQueue() {
		
		// Retrieve the top element.
		System.out.println("Calling queue: " + queue.peek());
		
		// poll() : This method retrieves and removes the head (first element) of the list.
		queue.add(queue.poll());
		
	}
	
	public static void originalQueue() {
		
		// Add 101-107 to queue.
		for (int i = 101; i <= 107; i++) {
			
			queue.add(i);
			
		}
		
		System.out.println("Queue => " + queue);
		System.out.println();
		
	}

}