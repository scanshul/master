package ThreadBasicImpl;

class MyYield extends Thread {
	
	@Override
	public void run() {
		for(int i = 0 ; i<= 5;i++) {
			System.out.println("Yield run : "  + Thread.currentThread().getName());
			Thread.yield();// Suggests that the thread scheduler consider giving other threads a chance to run
		}
		
	}
}
public class YieldDemo {
	public static void main(String[] args) {
		MyYield yl1 = new MyYield();
		MyYield yl2 = new MyYield();
		yl1.start();
		yl2.start();
	}
	
	

}
