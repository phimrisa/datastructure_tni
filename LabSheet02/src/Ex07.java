import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		
		// Creating an array list variable.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println("Length = " + nums.size());
		
		// Add the elements.
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		
		System.out.println("Length = " + nums.size());
		System.out.println("All elements = " + nums);
		
		int index_update = 2;
		int element_update = 20;
		
		// Change the element.
		nums.set(index_update, element_update);
		System.out.println("All elements = " + nums);
		
		int index_delete = 2;
		
		// Delete the element.
		nums.remove(index_delete);
		System.out.println("All elements = " + nums);
		
		// Delete specific element.
		int element_delete = 15;
		nums.remove(Integer.valueOf(element_delete)); // For integer only.
		System.out.println("All elements = " + nums);
		
		// Clear all elements.
		nums.clear();
		System.out.println("All elements = " + nums);
	}

}
