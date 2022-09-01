package exercise1;

public class MultiThreadingDemo extends Thread {

	public void run() {
		System.out.println("running......");
		System.out.println("inside run method   Thread name : "+ Thread.currentThread().getName());
	}
}
