package ThreadBasicImpl;

public class DaemonThreadDemo extends Thread {
	
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Daemon Thread");
		}
	
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main Thread"); 
		// If we comment it then we can't set any thread as daemon because main thread don't have any task and as per rule daemon thread will work in background of main thread 
		DaemonThreadDemo dth1 = new DaemonThreadDemo();
		dth1.setDaemon(true);
		dth1.start();
		//dth1.setDaemon(true); //Give runtime exception (Exception in thread "main" java.lang.IllegalThreadStateException) we cann't make thread as Daemon after thread started 
		
	}

}
