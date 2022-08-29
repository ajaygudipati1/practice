package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("ajaykumar");
		nameList.add("vishal");
		nameList.add("aisha");
		nameList.add("sameera");

		List<String> outputList = nameList.stream().filter(a -> a.length()>7).map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println(outputList);
	}

}
