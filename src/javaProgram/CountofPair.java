package javaProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofPair {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("pune", "mumbai", "nashik", "pune", "mumbai", "pune");
		String str = "national";
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		long l = map.values().stream().max(Comparator.comparingLong(Long::longValue)).get();
		// print highest count with key,value
		map.forEach((k, v) -> {
			//if (v == l)
				//System.out.println(k + "" + v);

		});

		// print key, value
		map.forEach((k, v) -> {
			if (v > 1) {
				//System.out.println(k + " " + v);
			}
		});
		
		// remove duplicate itself
		List<String> list2 = Arrays.asList(str.split(""));
		Map<String, Long> map2 = list2.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map2.values().removeIf(x -> x > 1);
		map2.keySet().forEach(System.out::print);
		

	}

}
