package javaProgram;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		int a = 12345;
		String s=Integer.toString(a);
		String[] arr =s.split("");
		List<String> list = Arrays.asList(arr);
		
		long count=list.stream().count();
		String max=list.stream().max(Comparator.comparing(String::valueOf)).get();
		String min=list.stream().min(Comparator.comparing(String::valueOf)).get();
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(count);
		
		

	}

}
