package ThreadLock;

class ObjLock implements Runnable{
	
	@Override
	public void run() {
		lockingNonStaticMethod();
	}
	
	public void lockingNonStaticMethod() {
		System.out.println(Thread.currentThread().getName() + ": get the lock");
		synchronized (this) {
			System.out.println("Inside Synchronized Block :   " + Thread.currentThread().getName());
		}
	}
}

public class ObjectLevelLock {
	public static void main(String[] args) {
		ObjLock oth1 = new ObjLock();
		ObjLock oth2 = new ObjLock();
		Thread th1 = new Thread(oth1);
		Thread th2 = new Thread(oth2);
		
		th1.setName("Manoj");
		th2.setName("Kumar");
	    th1.start();
		th2.start();
	}

}
