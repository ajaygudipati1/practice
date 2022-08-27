package exercise1;

import java.util.function.BiConsumer;

public class BiconsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> number = (a,b) -> System.out.println(a+b);
		number.accept(10, 20);

		BiConsumer<String,Integer> information = (a,b) -> System.out.println(a+" "+b);
		information.accept("Arjun", 25);

		BiConsumer<String,String> name = (a,b) -> System.out.println(a+b);
		BiConsumer<String,String> uppercase = (a,b) -> System.out.println(a.toUpperCase()+b.toUpperCase());
		name.andThen(uppercase).accept("ajay", "kumar");
	}
}
