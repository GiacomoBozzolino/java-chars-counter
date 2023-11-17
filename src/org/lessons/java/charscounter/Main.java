package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		  Scanner in= new Scanner(System.in);
		
		  System.out.print("Inserisci una parola: ");
	      String word = in.nextLine();
	      
	      Map<Character, Integer> charFreq = new HashMap<>();
	      
	      for (Character c : word.toLowerCase().toCharArray()) {
	    	  
	    	  if (charFreq.containsKey(c)) {
	    		  charFreq.put(c, charFreq.get(c) + 1);
	    		  
	    	  }else {
	    		  charFreq.put(c, 1);
	    	  }
	    	  
	    	  in.close();
	  		
		}System.out.println(charFreq);
	      
	      for (Character key : charFreq.keySet()) {
				
				int value2 = charFreq.get(key);
				System.out.println(key + " --> " + value2);
			}
	}

}
