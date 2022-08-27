package exercise1;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> number = (a) -> System.out.println(a+20);
		number.accept(10);
		
		Consumer<String> length = (a) -> System.out.println(a.length());
		Consumer<String> name = (a) -> System.out.println(a);
		name.andThen(length).accept("ajaykumar");
	}
}
