package exercise1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet carList = new HashSet();
		carList.add("Audi");
		carList.add("BMW");
		carList.add("Ferrari");
		carList.add("Datsun");
		carList.add("BMW");
		System.out.println(carList);
	}

}
