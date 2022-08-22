package exercise1;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList fruitsList = new ArrayList();
		
		fruitsList.add("Mango");
		fruitsList.add("Orange");
		fruitsList.add("Banana");
		fruitsList.add("Apple");
		fruitsList.add("Grapes");
		fruitsList.add("Watermelon");
		fruitsList.add("Pomegrante");
		fruitsList.add("Pineapple");
		fruitsList.add("Papaya");
		fruitsList.add("Strawberry");

		System.out.println(fruitsList);
		fruitsList.remove("Strawberry");
		System.out.println(fruitsList.size());
		System.out.println(fruitsList.contains("Carrot"));
        System.out.println(fruitsList.isEmpty());
        fruitsList.add(3, "Avacado");
        System.out.println(fruitsList);
        System.out.println(fruitsList.get(6));
        System.out.println(fruitsList.indexOf("Apple"));
        System.out.println(fruitsList.subList(2, 6));
        fruitsList.set(4, "Mango");
        System.out.println(fruitsList);
        System.out.println(fruitsList.lastIndexOf("Mango"));
        fruitsList.clear();
        System.out.println(fruitsList);
	}

}
