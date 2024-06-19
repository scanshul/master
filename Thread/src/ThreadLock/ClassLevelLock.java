package ThreadLock;

class calLock implements Runnable {

	@Override
	public void run() {
	lockingStaticMethod();
		
	}

	public static synchronized void lockingStaticMethod() {
		System.out.println(Thread.currentThread().getName() + ": get the lock");
		synchronized (calLock.class) {
			System.out.println("Inside Synchronized Block :   " + Thread.currentThread().getName());
		}
	}
	
}

public class ClassLevelLock {
	public static void main(String[] args) {
		calLock cl1 = new calLock();
		calLock cl2 = new calLock();
		
		Thread th1 = new Thread(cl1);
		Thread th2 = new Thread(cl2);
		th1.setName("Java");
		th2.setName("Python");
		th1.start();
		th2.start();
	}

}
