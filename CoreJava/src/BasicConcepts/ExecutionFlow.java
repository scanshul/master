package BasicConcepts;

public class ExecutionFlow {
	
	int i;
	
	public ExecutionFlow() {
	System.out.println("Default Constructor");
	}
	
	static {
		System.out.println("Static Block 1");
	}
	
	{
		System.out.println("Instance block 1");
	}
	
	public ExecutionFlow(int i) {
		System.out.println("Paremeterize Constructor");
	}
	
	{
		System.out.println("Instance block 2");	
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	public static void main(String[] args) {
		
		new ExecutionFlow();
		new ExecutionFlow(10);
		new ExecutionFlow(0);
		
	}

}
