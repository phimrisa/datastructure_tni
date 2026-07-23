import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {

		// Create LinkedList object.
		LinkedList<String> cart = new LinkedList<String>();
		
		// 1
		cart.add("Wireless Mouse");
		
		// 2
		cart.add("Mechanical Keyboard");
		
		// 3
		cart.add("USB-C Hub");
		
		// 4
		System.out.println(cart);
		
		// 5
		cart.add(1, "Mouse Pad");
		
		// 6
		System.out.println(cart);
		
		// 7
		cart.remove(cart.size() - 1);
		
		// 8
		System.out.println(cart);
		
		// 9
		cart.remove("Mouse Pad");
		// or "cart.remove(1);" if you know the exact index.
		
		// 10
		System.out.println(cart);
		
		// 11
		cart.add("Monitor");
		
		// 12
		System.out.println(cart);
		
		// 13
		cart.set(2,  "Phone Holder");
		
		// 14
		System.out.println(cart);
		
		// 15
		System.out.println(cart.getLast());
	}

}
