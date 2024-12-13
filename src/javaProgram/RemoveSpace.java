package javaProgram;
import java.util.Arrays;

public class RemoveSpace {

	public static void main(String[] args) {

		String str = "Test the Product";
		char[] c = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i <= c.length; i++) {
			if (c[i] != ' ') {
				stringBuffer.append(c[i]);
			}
		}
		System.out.print(stringBuffer.toString());
		
	}

}
