package exercise1;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList vegetablelist = new LinkedList();
		vegetablelist.add("Cabage");
		vegetablelist.add("Carrot");
		vegetablelist.add("Beans");
		vegetablelist.add("Broccoli");
		vegetablelist.add("Cauliflower");
		System.out.println(vegetablelist);
		vegetablelist.addFirst("Potato");
		System.out.println(vegetablelist);
		vegetablelist.addLast("Tomato");
		System.out.println(vegetablelist);
		System.out.println(vegetablelist.getFirst());
		System.out.println(vegetablelist.getLast());
		vegetablelist.removeFirst();
		System.out.println(vegetablelist);
		vegetablelist.removeLast();
		System.out.println(vegetablelist);
	}

}
