package ThreadBasicImpl;

class MySleepExample implements Runnable{

	@Override
	public void run() {

		for(int i =0 ; i<=5 ;i++) {
			System.out.println("Thread : "  + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}
	}
	
}

public class SleepDemo {
	public static void main(String[] args) {
		MySleepExample slp = new MySleepExample();
		Thread thr = new Thread(slp);
		thr.start();
	}

}
