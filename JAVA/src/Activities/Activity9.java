package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
 
    	ArrayList<String> listNew = new ArrayList<String>();
    
        listNew.add("green");
        listNew.add("yellow");
        listNew.add("purple");
        //Adding object at specific index
        listNew.add(3, "black");
        listNew.add(1, "white");
        
        System.out.println("Print All the Objects:");
        for(String s:listNew){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + listNew.get(2));
        System.out.println("Is Orange is in list: " + listNew.contains("Chicku"));
        System.out.println("Size of ArrayList: " + listNew.size());
        
        listNew.remove("red");
        
        System.out.println("New Size of ArrayList: " + listNew.size());
    }
}