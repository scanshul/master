package ThreadBasicImpl;

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
