import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 { 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

		// Adding all of array elements to arraylist.
		for (int i=0; i<initial_numbers.length; i++) {
			numbers.add(initial_numbers[i]);
		}
				
		// Enter an element at the end.
		System.out.print("Enter a number: ");
		int nums = scanner.nextInt();
		numbers.add(nums);
		
		// Enter an element at index 9.
		System.out.print("\nEnter a number: ");
		nums = scanner.nextInt();
		numbers.add(9, nums);
		
		// Delete the element at index 8.
		numbers.remove(8);
		
		// Update index 7's element to the date of the class.
		numbers.set(7, 9);
		
		// Display result.
		System.out.println("\nAll elements = " + numbers);
		
	}

}
