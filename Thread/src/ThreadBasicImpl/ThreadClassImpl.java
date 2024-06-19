package ThreadBasicImpl;


class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread Running : " + Thread.currentThread().getName());
	}
}

public class ThreadClassImpl  {
	public static void main(String[] args) {
		
		//New Thread Created
		MyThread thr = new MyThread();
		
		//Thread Started
		thr.start();
		//thr.run();
		
	}
}
