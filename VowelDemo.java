package exercise1;

import java.util.Scanner;
public class VowelDemo {

	static String isVowel(char X) {
		if(X=='a' || X=='e' || X=='i' || X=='o' || X=='u') {
			return "true";
		}
		else {
			return "false";
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(isVowel('a'));
		System.out.println("Enter your name:");
		String name = input.next();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' ||name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total no of vowels in string are: " + count);
	}
}
