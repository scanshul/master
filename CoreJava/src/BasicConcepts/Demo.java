package BasicConcepts;

class A {
	int i = 0;
	int j = 0;
	
//	public A()
//	{
//		System.out.println("Default");
//	}
	/*
	 * public A(int i, int j) { super(); this.i = i; this.j = j; }
	 */

}

class B extends A {
	/*
	 * int i = 0; int j = 0;
	 */

	/*
	 * public B(int i, int j) { super(i, j); }
	 */

	public void test() {
		System.out.println("Child method:  " + i);
	}

}

public class Demo {
	public static void main(String[] args) {
		
		B obj = new B();
		A obj1 = new A();

	}

}
