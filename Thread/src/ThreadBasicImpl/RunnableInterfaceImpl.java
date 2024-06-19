package ThreadBasicImpl;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable Example : " + Thread.currentThread().getName());
	}
	
}
public class RunnableInterfaceImpl {
	public static void main(String[] args) {
		//Create New Runnable instance
		MyRunnable runn = new MyRunnable();
		
		// Now Runnable don't have start method we need Thread class object to start thread
		
		Thread th= new Thread(runn);
		th.start();
	}

}
