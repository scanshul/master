package InheritanceLogicalQuestions;

class A1 {
	
	{
		System.out.println("Class A");
	}
}


class B1 extends A1 {
	{
		System.out.println("Class B");
	}
	
}

class C1 extends B1{
	
	{
		
		System.out.println("Class C");
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		C1 obj1 = new C1();
		B1 obj2 = new B1();
	}

}
