package exercise1;

import java.util.HashMap;

public class SuperHero {

	public static void main(String[] args) {
		HashMap<String,Integer> superherolist = new HashMap<String,Integer>();
		superherolist.put("Ironman",1);
		superherolist.put("Captain America",2);
		superherolist.put("Hulk",3);
		superherolist.put("Thor",4);
		superherolist.put("Black Widow",5);
		superherolist.put("Black Panther",6);
		superherolist.put("Doctor Strange",7);		
		System.out.println(superherolist);
		System.out.println(superherolist.size());
		System.out.println(superherolist.isEmpty());
	}
}
