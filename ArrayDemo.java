package exercise1;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] name = new String[10];
        name[5] ="hyderabad";
        name[2] = "tokyo";
        name[1] = "newyork";
        for(String s : name) {
        if("tokyo".equals(s)) {
        	System.out.println("yes");
        	
        }

	}

}
}