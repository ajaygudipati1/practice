package exercise1;

import java.util.ArrayList;

public class FoodlistDemo {

	public static void main(String[] args) {
		ArrayList foodlist = new ArrayList();
		foodlist.add("Dosa");
		foodlist.add("Idly");
		foodlist.add("Upma");
		foodlist.add("Maggie");
		foodlist.add("Pizza");
		foodlist.add("Poori");
		System.out.println(foodlist);
		System.out.println(foodlist.size());
		System.out.println(foodlist.contains("Pizza"));
		foodlist.add(4, "Icecream");
		System.out.println(foodlist);
		foodlist.remove(2);
		System.out.println(foodlist);
		foodlist.forEach(System.out::println);
	}
}
