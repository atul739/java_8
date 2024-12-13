package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClsDemo {

	public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(2,5,7,11,7,2,1,3,4,8,9);
	list.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::print);
	
	for(Integer a:list) {
		
	}
	}

}
