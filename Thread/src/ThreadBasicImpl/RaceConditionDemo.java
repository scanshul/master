package ThreadBasicImpl;

public class RaceConditionDemo implements Runnable {
	private int count;

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(500);
				count++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		RaceConditionDemo rc1 = new RaceConditionDemo();
		Thread th1 = new Thread(rc1);
		th1.start();
		
		Thread th2 = new Thread(rc1);
		th2.start();
		
		th1.join();
		th2.join();
		//Always got different result that will impact to data : this is race Condition
		System.out.println("Count : " + rc1.getCount());
	}

}
