package exercise1;

public class MultiThreadingRunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("running....");
		Thread.currentThread().setName("Child Thread");
		System.out.println("inside run method   Thread name : "+ Thread.currentThread().getName());
		
	}

}
