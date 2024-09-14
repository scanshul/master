package ThreadBasicImpl;

/*A race condition in Java (or in any multithreaded programming environment) occurs when two or more threads can access shared data 
 * and try to change it simultaneously. Because the thread scheduling algorithm can swap between threads at any time,
 *  you can't predict the order in which the threads will attempt to access the shared data. As a result, 
 *  the final outcome of the data can depend on the timing of the threads, leading to unpredictable behavior and bugs.
*/
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
