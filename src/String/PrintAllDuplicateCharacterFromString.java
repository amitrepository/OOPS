package String;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateCharacterFromString {
	
	/*
	 * input: Java output: a=2
	 */

	public static void main(String[] args) {
		String str="Java app";
		char[] charArray=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char c:charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			
			}
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+ " : "+ entry.getValue());
				
			}
			
		}

	}

}
