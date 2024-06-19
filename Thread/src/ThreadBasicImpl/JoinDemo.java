package ThreadBasicImpl;

class ThreadJoin extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Thread Join run method : " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}

public class JoinDemo {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.start();

		try {
			//tj1.join(); // tj2 and tj3 will wait for tj1 to finish
			tj1.join(); // For 1000 millisecond tj1 thread will hold and at that time next thread will execute 
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		tj2.start();

		try {
			tj2.join(); // tj3 will wait for tj2 to finish
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		tj3.start();

		try {
			tj3.join(); // main thread will wait for tj3 to finish
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("All threads have finished executing.");
	}

}
