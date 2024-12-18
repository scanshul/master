package ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitMethod {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		Runnable task = ()-> {
			try {
				System.out.println("Waiting..");
				Thread.sleep(3000);
				System.out.println("Waiting over now");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};
		
	Future<?> fu =	ex.submit(task);
//	System.out.println(fu.get());
	System.out.println("Task Compalted");
	}

}
