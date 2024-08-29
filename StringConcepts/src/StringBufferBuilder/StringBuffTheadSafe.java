package StringBufferBuilder;

public class StringBuffTheadSafe {
	
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer();
		ThreadSafeTask tt1 = new ThreadSafeTask(bf);
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt1);
		Thread t3 = new Thread(tt1);
		t1.setName("Aman");
		t2.setName("Koshal");
		t3.setName("Rohan");
		t1.start();
		t2.start();
		t3.start();	
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}}

class ThreadSafeTask implements Runnable{
	private StringBuffer stringBuffer;
	
	public ThreadSafeTask(StringBuffer stringBuffer) {
		this.stringBuffer = stringBuffer;
		
	}

	@Override
	public void run() {
		for(int i = 1 ; i<=2 ; i++) {
			stringBuffer.append(Thread.currentThread().getName()).append(":").append(i).append(" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(stringBuffer.toString());
		}
	}
}
