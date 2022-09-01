package exercise1;

public class MultiThreadRunnableMain {

	public static void main(String[] args) {
		Thread multiThread = new Thread(new MultiThreadingRunnableDemo());
		System.out.println("inside main method   Thread Name : "+ Thread.currentThread().getName());
		Thread.currentThread().setPriority(5);
		System.out.println("inside main method   Thread priority : "+ Thread.currentThread().getPriority());
		multiThread.start();

	}

}
