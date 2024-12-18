package ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	public static void main(String[] args) {
		ScheduledExecutorService e = Executors.newScheduledThreadPool(3);
		e.scheduleAtFixedRate(new ScheduledTask(9) , 3, 1, TimeUnit.SECONDS);
	}

}

class ScheduledTask implements Runnable{
	
	private int taskid;
	
	public ScheduledTask(int taskid) {
		this.taskid = taskid;
	}

	@Override
	public void run() {
		System.out.println("Task Id : " + taskid + "  Running Thread : "  + Thread.currentThread().getName());
		
	}
	
}
