package ThreadBasicImpl;

class SharedResource {
	private int count = 0;
	private boolean available = false;

	public synchronized void produce() {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		count++;
		System.out.println("Produced : " + count);
		available = true;
		notify();

	}

	public synchronized void consume() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Consumed : " + count);
		available = false;
		notify();

	}
}

class Produce extends Thread {
	private SharedResource sharedResource;

	Produce(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			sharedResource.produce();
		}
	}
}

class Consumer extends Thread {
	private SharedResource sharedResource;

	public Consumer(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			sharedResource.consume();

		}
	}
}

public class WaitNotifyExample {
	
	public static void main(String[] args) {
		SharedResource shr = new SharedResource();
		Produce prd = new Produce(shr);
		Consumer con = new Consumer(shr);
		prd.start();
		con.start();
	}

}
