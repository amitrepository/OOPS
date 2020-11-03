package String;

public class ReverseString {
	
	/*
	 * input: Java output: avaJ
	 */

	public static void main(String[] args) {
		String rev="";
		String str="Java";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
