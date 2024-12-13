package javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommanElementaFromTwoString {

	public static void main(String[] args) {
		String str = "atl";
		String str2 = "atulPatil";

		//comman char
		str.chars().distinct().mapToObj(c->String.valueOf((char)c)).filter(str2::contains).forEach(System.out::print);
		
		List<String>list=Arrays.asList(str.split(""));
		List<String>list2=Arrays.asList(str2.split(""));
		
		list.stream().filter(list2::contains).collect(Collectors.toList()).forEach(System.out::print);
		
	}

}
