package exercise1.task;

import java.util.TreeMap;

public class LanguageDemo {

	public static void main(String[] args) {

		String[] language = {"marati", "hindi", "english", "telugu", "hindi", "japanese", "telugu"};
		int count =0;
		TreeMap map = new TreeMap();
		for(int i=0; i<language.length; i++) {
			for(int j=0; j<language.length; j++)
				if(language[i]==language[j]) {
					count++;
				}
			map.put(language[i], count);
			count = 0;
		}
		System.out.println(map);
	}
}
