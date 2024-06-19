package Singleton;

class A implements Runnable{

	@Override
	public void run() {
		SynchronizedSingleton obj1 = SynchronizedSingleton.getSyncObject();
		
	}
	
}

class B implements Runnable {

	@Override
	public void run() {
		SynchronizedSingleton obj2 = SynchronizedSingleton.getSyncObject();
	}
	
}

public class SyncThreadRunner {
	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		System.out.println(th1.hashCode());
		System.out.println(th2.hashCode());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
