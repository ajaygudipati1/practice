package exercise1;

import java.util.HashSet;

public class AnimallistDemo {

	public static void main(String[] args) {
		HashSet animallist = new HashSet();
		animallist.add("Lion");
		animallist.add("Tiger");
		animallist.add("Bear");
		animallist.add("Fox");
		System.out.println(animallist);
		System.out.println(animallist.contains("Monkey"));
		animallist.forEach(System.out::println);
	}
}
