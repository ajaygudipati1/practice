package exercise1;

public class StringSample {

	public static void main(String[] args) {
		String name ="ajay";
		int count = 0;
		for(int i=0; i<=name.length(); i++) {
			for(int j=0; j<=name.length(); j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}
				System.out.println(name.charAt(i)+" : "+count);
			}
		}
	}
}
