
public class TrainLinkedList {

	public static void main(String[] args) {
	
		LinkedList greenline = new LinkedList();
		
		// 1. Add Mo-chit to linked list.
		greenline.insert("Mo-chit");
		
		// 2. Add Ari to linked list.
		greenline.insert("Ari");
		
        // 3. Add Sanam-Pao to linked list.
        greenline.insert("Sanam-Pao");
        
        // 4. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());
        
        // 5. Add Rachakru between Ari and Sanam-Pao.
        greenline.insert(2,"Rachakru");
        
        // 6. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());
        
        // 7. Show the number of stations.
        System.out.println("Total Station : " + greenline.length());
        
        // 8. Show the first station's name.
        System.out.println("First Station : " + greenline.get(0));
        
        // 9. Set Mo-chit to Mo-chit (Central Ladprao).
        greenline.set(0, "Mo-chit (Central Ladprao)");
        
        // 10. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());
       
        // 11. Remove Rachakru station.
        greenline.remove(2);
        
        // 12. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());
       
        // 13. Remove the last station.
        greenline.removeLastElement();
       
        // 14. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());
        
        // 15. Clear all green line station.
        greenline.clear();
        
        // 16. Show the number of stations.
        System.out.println("Total Station : " + greenline.length());
       
        // 17. Show all stations.
        System.out.println("All Station   : " + greenline.traversal());

	}

}
