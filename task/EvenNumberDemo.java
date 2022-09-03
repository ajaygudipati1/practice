package exercise1.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(23);
		list.add(14);
		list.add(25);
		list.add(8);
		list.add(16);
		list.add(18);

		List<Integer> evennumberlist = list.stream().filter(a -> a%2==0).collect(Collectors.toList());
		System.out.println("Evennumbers : "+evennumberlist);

		List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sortedlist : "+sortedlist);

	}
}
