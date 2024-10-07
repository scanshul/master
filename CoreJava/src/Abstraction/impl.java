package Abstraction;

public class impl implements A,B {

	@Override
	public int m1() {
		System.out.println("Impl of method m1()");
		return 0;
	}
	
	@Override
	public void m2() {
		B.super.m2();
	}

	public static void main(String[] args) {
		impl obj = new impl();
		obj.m1();
		obj.m2();
	}

}
