package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplictes {
	
	/*
	 * Input: str = "geeksforgeeks" Output: geksfor
 
	 * Input: str = "characters" Output: chartes
	 */

	public static void main(String[] args) {
		
		String s="JavaApplication";
		char [] charArray=s.toCharArray();
		Set<Character> charSet=new LinkedHashSet<>();
		
		for (char c: charArray) {
			charSet.add(c);
		}
		
		StringBuilder sb=new StringBuilder();
		for(Character character:charSet) {
			sb.append(character);
		}
		
		System.out.println(sb.toString());

	}

}
