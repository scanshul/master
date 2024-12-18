package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorBasic {
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		//ExecutorService exCh = Executors.newCachedThreadPool();
		
		for(int i =1 ; i<=10;i++) {
			ex.execute(new Task(i));
		}
		
	}

}

class Task implements Runnable{
	
	private int taskid;
	
	public Task(int taskid) {
		this.taskid = taskid;
	}

	@Override
	public void run() {
		System.out.println("Task Id : " + taskid + "  Running Thread : "  + Thread.currentThread().getName());
		
	}
	
}
