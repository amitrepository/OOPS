package String;

import java.util.HashMap;
import java.util.Map;

/*
 * Sweet Bitter
output:

B 1 r 1 S 1 t 3 e 3 w 1 i 1
*/

public class CountCharacters {

	public static void main(String[] args) {
		
		String input="Sweet Bitter ";
		
		HashMap<Character,Integer> charCountMap= new HashMap<>();
		
		char[] charArray=input.replaceAll("\\s+", "").toCharArray();
		//System.out.println(charArray);
		
		for(char c: charArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
				
			}else {
				charCountMap.put(c,1);
			}
		}
		
		for(Map.Entry entry :charCountMap.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}

	}

}
