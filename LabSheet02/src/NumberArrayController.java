
public class NumberArrayController {

	private int[] nums;
	
	public NumberArrayController() {
		this.nums = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void display(String message) {
		System.out.println(message);
		
		/*
		 * for-each: for (data : arrays) {
		 *		-- Data
		 * }
		*/
		
		boolean first_element = true;
		
		for (int num : nums) {
			/*
			 * if (first_element == false) {
			 * 		System.out.print(", " );
			 * }
			*/
			
			// Use the conditional operator --> Condition ? true result : false result
			
			// System.out.print((first_element == false ? ", " : "") + num); *Not recommended!
			
			System.out.print((!first_element ? ", " : "") + num); 
			first_element = false;
		}
	}
	
}
