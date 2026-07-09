
public class Ex06 {

	public static void main(String[] args) {
		
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial array:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		int index_delete = 2; // Delete index 2's element.
		
		// Copy data of the first-half (0 - before index 2.)
		for (int i=0; i<index_delete; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		// Copy data for end-half (after index 2 - last element.)
		for (int i=index_delete+1; i<nums.getNums().length; i++) {
			new_nums[i-1] = nums.getNums()[i];
		}
		
		// Display update array.
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted data index 2:");

	}

}
