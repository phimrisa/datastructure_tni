
public class Ex03 {

	public static void main(String[] args) {
		
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial array:");

		int[] new_nums = new int[nums.getNums().length+1];
		
		// Copy all elements from nums to new_nums.
		for (int i=0; i<nums.getNums().length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_nums); // Reset the previous elements.
		nums.display("\n\nAfter copy elements:");
		
		nums.getNums()[nums.getNums().length-1] = 15; // The last element from new_nums.
		nums.display("\n\nAfter added the last element:");
	}

}
