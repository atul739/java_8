package javaProgram;
public class ReverseTwoStringAtSamePostion {

	public static void main(String[] args) {
		String str = "Test the Product";
		String arr[] = str.split(" ");
		
		for (int i = 0; i <= arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
