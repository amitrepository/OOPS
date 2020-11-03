package String;

public class ReversewordInString {
	
	/*
	 * input: str="Feel The Power"; output: "Power The Feel"
	 */

	public static void main(String[] args) {
		
		String str="Feel The Power";
		String revStr="";
		
		String[] strArray = str.split(" ");
		for(int i=strArray.length-1;i>=0;i--) {
			revStr=revStr +" "+ strArray[i];
		}
		System.out.println(revStr);

	}

}
