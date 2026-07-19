
public class TrainLinkedList {

	public static void main(String[] args) {
	
		LinkedList greeline = new LinkedList();
		
		// 1. Add Mo-chit to linked list.
		greeline.insert("Mo-chit");
		
		// 2. Add Ari to linked list.
		greeline.insert("Ari");
		
        // 3. Add Sanam-Pao to linked list.
        greeline.insert("Sanam-Pao");
        
        // 4. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());
        
        // 5. Add Rachakru between Ari and Sanam-Pao.
        greeline.insert(2,"Rachakru");
        
        // 6. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());
        
        // 7. Show the number of stations.
        System.out.println("Total Station : " + greeline.length());
        
        // 8. Show the first station's name.
        System.out.println("First Station : " + greeline.get(0));
        
        // 9. Set Mo-chit to Mo-chit (Central Ladprao).
        greeline.set(0, "Mo-chit (Central Ladprao)");
        
        // 10. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());
       
        // 11. Remove Rachakru station.
        greeline.remove(2);
        
        // 12. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());
       
        // 13. Remove the last station.
        greeline.removeLastElement();
       
        // 14. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());
        
        // 15. Clear all green line station.
        greeline.clear();
        
        // 16. Show the number of stations.
        System.out.println("Total Station : " + greeline.length());
       
        // 17. Show all stations.
        System.out.println("All Station   : " + greeline.traversal());

	}

}
