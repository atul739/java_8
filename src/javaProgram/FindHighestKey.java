package javaProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHighestKey {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"a");
		map.put(2, "b");
		map.put(3,"a");
		map.put(4, "a");
		map.put(5,"c");
		map.put(6, "b");
		
		Stream<Entry<String,List<Integer>>>st=map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
		.entrySet().stream();
		
		

		
	
		
		
		
		
		
		
		

	}

}
