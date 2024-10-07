package InheritanceLogicalQuestions;

class A {
	
	int i =10;
	
}

class B extends A {
	
	int i =20;
}

public class TestP1 {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.i); //Work on Refernce
		
		B b = new B();
		System.out.println(b.i);
		
		A a2 = new A();
		System.out.println(a2.i);
		
	}

}
