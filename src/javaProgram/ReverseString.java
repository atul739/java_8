package javaProgram;

public class ReverseString {

	public static void reverse(String s) {

		System.out.print(s.charAt(s.length() - 1));
		reverse(s.substring(0, s.length() - 1));
	}

	public static void main(String[] args) {

		String s = "atul";
		
		ReverseString.reverse(s);
		
		String string = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			string = string + s.charAt(i);
		}

		System.out.println(string);

	}

}
