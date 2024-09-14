package ThreadBasicImpl;


/*In Java, the volatile keyword is used to indicate that a variable's value will be modified by different threads. 
 * Declaring a variable as volatile ensures that changes made to the variable by one thread are immediately visible to 
 * other threads, providing a lightweight synchronization mechanism.
*/
class MyVolatileThread extends Thread {
	private static volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

	}

	public void shutdown() {
		System.out.println("Shutdown");
		this.running = false;
	}
}

public class VolatileExample {

	public static void main(String[] args) throws InterruptedException {
		MyVolatileThread vt1 = new MyVolatileThread();
		vt1.start();
		Thread.sleep(500);
		vt1.shutdown();

	}

}
