package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		   HashSet<String> hs = new HashSet<String>();
	        hs.add("monkey");
	        hs.add("zebra");
	        hs.add("tiger");
	        hs.add("elephant");
	        hs.add("crocodile");
	        hs.add("lion");
	        
	        System.out.println("Original HashSet: " + hs);        
	        System.out.println("Size of HashSet: " + hs.size());
	        
	        System.out.println("Removing zebra from HashSet: " + hs.remove("zebra"));
	        if(hs.remove("monkey")) {
	        	System.out.println("monkey removed from the Set");
	        } else {
	        	System.out.println("Monkey is not present in the Set");
	        }
	       
	        System.out.println("Checking if elephant is present: " + hs.contains("elephant"));
	        System.out.println("Updated HashSet: " + hs);
	    }
	}