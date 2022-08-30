package exercise1;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {

		IntStream.range(1, 51)
		.forEach(System.out::print);

		System.out.println();

		IntStream.range(1, 51).skip(10)
		.forEach(x -> System.out.print(x));

		System.out.println();

		System.out.print(IntStream.range(10,100).sum());

	}
}
