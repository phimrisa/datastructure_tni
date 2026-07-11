
public class Ex04 {

	public static void main(String[] args) {
		
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial array:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		// Copy data from nums --> new_nums start from index 1.
		for (int i=0; i<new_nums.length; i++) { // Loop the smaller size array.
			new_nums[i] = nums.getNums()[i+1]; // Start from index 1 of nums.
		}
		
		// Display result.
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted the first element:");
		
	}

}
