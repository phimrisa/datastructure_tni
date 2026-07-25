import java.util.LinkedList;

public class BrowserHistory {

	public static void main(String[] args) {
		
		// Create LinkedList object.
		LinkedList<String> history = new LinkedList<String>();
		
		// No.1
		history.add("google.com");
		
		// No.2
		history.add("youtube.com");
		
		// No.3
		history.add("github.com");
		
		// No.4 
		System.out.println(history);
		
		// No.5
		history.remove(history.size() - 1);
		
		// No.6
		System.out.println(history);
		
		// No.7
		history.add("shopee.com");
		
		// No.8
		history.add("wikipedia.org");
		
		// No.9
		history.add("claude.ai");
		
		// No.10
		System.out.println(history);
		
		// No.11
		history.remove("youtube.com");
		
		// No.12
		System.out.println(history);
		
		// No.13
		System.out.println("current page = " + history.getLast());
		
		// No.14
		System.out.println("Visited youtube.com = " + history.contains("youtube.com"));
		
		// No.15
		System.out.println("Go back to previous page = " + history.get((history.size() - 1) - 1) );

		// No.16
		System.out.println("Go back to previous page again = " + history.get((history.size() - 1) - 2));
		
		// No.17
		history.clear();
		
		// No.18
		System.out.print(history);

	}

}
