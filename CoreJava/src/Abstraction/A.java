package Abstraction;

public interface A {
	
	public int m1();
	
	public default void m2() {
		System.out.println("m2 of A");
		
	}

}
