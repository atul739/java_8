package javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		map.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		
		// Java 8, Convert all Map keys to a List
		/* List<String> result3 = map.keySet().stream().collect(Collectors.toList()); */

		// Java 8, Convert all Map values to a List
		/* List<String> result4 = map.values().stream().collect(Collectors.toList()); */

	}

}
