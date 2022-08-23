package exercise1;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet numberlist = new TreeSet();
		numberlist.add(201);
		numberlist.add(203);
		numberlist.add(202);
		numberlist.add(207);
		numberlist.add(205);
		numberlist.add(202);
		numberlist.add(208);
		System.out.println(numberlist);
		System.out.println(numberlist.first());
		System.out.println(numberlist.last());
		System.out.println(numberlist.headSet(203));
		System.out.println(numberlist.tailSet(201));
		System.out.println(numberlist.subSet(201, 205));
		System.out.println(numberlist.size());
		

	}

}
