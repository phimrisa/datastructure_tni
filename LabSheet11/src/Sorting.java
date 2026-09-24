import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {

	private int[] array;

	// Example 1
	public Sorting(int[] array) {

		this.array = array;

	} // End of Sorting()

	// Example 1
	public void printSortedData() {

		for (int arr : array) {

			System.out.print(arr + " ");

		}

	} // End of printSortedData()

	// Example 2
	public void bubbleSort() {

		// LOOP THROUGH ALL ELEMENTS IN array, STARTING AT INDEX 0 THEN
		for (int i = 0; i < array.length; i++) {

			// SET is_swapped TO FALSE
			boolean is_swapped = false;

			// LOOP THROUGH THE UNSORTED ELEMENTS, FROM INDEX 0 TO THE LAST UNSORTED
			// POSITION THEN
			for (int j = 0; j < array.length - i - 1; j++) {

				// 5 - 0 - 1 = 4
				// 5 - 1 - 1 = 3
				// 5 - 2 - 1 = 2
				// 5 - 3 - 1 = 1
				// 5 - 4 - 1 = 0

				// IF THE ELEMENT AT current_position IS GREATER THAN THE ELEMENT AT THE
				// NEXTPOSITION THEN

				/*
				 * if (array[j] < array[j + 1]) --> sorting from greater to less. if (array[j] >
				 * array[j + 1]) --> sorting from less to greater.
				 */

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					// SET is_swapped TO TRUE
					is_swapped = true;

				}

			} // End of inner loop.

			if (!is_swapped) {

				break;

			}

		} // End of outer loop.

	} // End of bubbleSort()

	// No.2
	public void selectionSort() {

		// LOOP THROUGH ALL ELEMENTS IN array, STARTING AT INDEX 0 THEN
		for (int i = 0; i < array.length; i++) {

			int minimum_index = i;

			for (int j = i; j < array.length; j++) {

				// FIND THE MINIMUM
				if (array[j] < array[minimum_index]) {

					minimum_index = j;

				}

			} // End of inner loop.

			// SWAP TH ELEMENT AT current_position WITH THE ELEMENT AT minimum_index
			int temp = array[i];
			array[i] = array[minimum_index];
			array[minimum_index] = temp;

		} // End of outer loop.

	} // End of

	// No.3
	public void insertionSort() {

		for (int i = 1; i < array.length; i++) {

			int key = array[i];
			int walker_index = i - 1;

			while (walker_index >= 0 && array[walker_index] > key) {

				array[walker_index + 1] = array[walker_index];
				walker_index--;

			} // End of inner loop.

			array[walker_index + 1] = key;

		} // End of outer loop.

	} // End of insertionSort()

	// No.5
	public void quicksort() {
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(array.length - 1);
		stack.push(0);
		
		while (!stack.isEmpty()) {
			
			int low = stack.pop();
			int high = stack.pop();
			
			 if (high - low < 1) {
				 
				 continue;
				 
			 }
			 
			 int j = partition(low, high);
			 stack.push(high);
			 stack.push(j + 1);
			 stack.push(j);
			 stack.push(low);
			
		}

	} // End of quicksort()

	// No.5
	private int partition(int low, int high) {

		// SET pivot TO THE ELEMENT AT low
		int pivot = array[low];

		// SET i TO low AND SET j TO high
		int i = low, j = high;

		// LOOP FOREVER THEN
		while (true) {

			// MOVE i TO THE RIGHT WHILE THE ELEMENT AT i IS LESS THAN pivot
			while (array[i] < pivot) {

				i++;

			}

			// MOVE j TO THE LEFT WHILE THE ELEMENT AT j IS GREATER THAN pivot
			while (array[j] > pivot) {

				j--;

			}
			
			// IF i IS GREATER THAN OR EQUALS TO j THEN STOP THE LOOP
			if (i >= j) {
				
				break;
				
			}
			
			// SWAP THE ELEMENT AT i WITH THE ELEMENT AT j
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			// MOVE i ONE STEP TO THE RIGHT
			i++;
			
			// MOVE j ONE STEP TO THE LEFT
			j--;

		} // End of while()

		// RETURN j
		return j;
		
	} // End of partition()

} // End of Sorting.