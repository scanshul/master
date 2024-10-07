package Abstraction;

public interface B {
	public int m1();
	
	public default void m2() {
		System.out.println("m2 of B");
		
	}

}
