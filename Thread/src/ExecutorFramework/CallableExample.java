package ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newFixedThreadPool(3);
		System.out.println("Starting");
		
		Future<Integer> sum = e.submit(new Sum(10));
		Future<Double> sq = e.submit(new SqaureRoot(16));
		Future<Integer> fac = e.submit(new Factorial(5));
		
		System.out.println(sum.get());
		System.out.println(sq.get());
		System.out.println(fac.get());
		
		e.shutdown();
		System.out.println("End Process Now");
		
	}

}

class Sum implements Callable<Integer> {

	int stop;

	Sum(int v) {
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;

		for (int i = 0; i < stop; i++) {
			sum += i;
		}
		return sum;
	}

}


class SqaureRoot implements Callable<Double> {

	double num;

	SqaureRoot(double v) {
		num = v;
	}

	@Override
	public Double call() throws Exception {
	
		return Math.sqrt(num);
	}

}


class Factorial implements Callable<Integer> {

	int stop;

	Factorial(Integer v) {
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		int fact = 1;
		
		for(int i = 2; i<= stop;i++) {
			fact*=i;
			
		}
	
		return fact;
	}

}
