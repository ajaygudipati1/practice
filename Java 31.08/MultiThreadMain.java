package exercise1;

public class MultiThreadMain {

	public static void main(String[] args) {

		MultiThreadingDemo demo = new MultiThreadingDemo();
		System.out.println("inside main method  Thread name : "+ Thread.currentThread().getName());
		demo.start();

	}
}
