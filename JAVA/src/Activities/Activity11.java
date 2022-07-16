package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		 HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	        hash_map.put(1, "black");
	        hash_map.put(2, "white");
	        hash_map.put(3, "gold");
	        hash_map.put(4, "silver");
	        hash_map.put(5, "red");

	        System.out.println("The Original map: " + hash_map);
	        
	        hash_map.remove(4);
	        System.out.println("After removing silver: " + hash_map);
	        
	  
	        if(hash_map.containsValue("purple")) {
	            System.out.println("Purple exists in the Map");
	        } else {
	            System.out.println("Purple does not exist in the Map");
	        }
	        
	        System.out.println("Number of pairs in the Map is: " + hash_map.size());
	    }
	}