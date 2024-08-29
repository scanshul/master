package CSOD;

class A {
	String message = "This is Parent";
	String s = "Developer";
	Integer i = 10;
	
	public String getTest() {
		return message;
	}
}

class B extends A{
	String message = "This is Child";
	Integer i = 20;
	public String getTest() {
		return message;
	}
	
}

public class InheritanceScenario {
	
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.message); 
		System.out.println(obj.getTest());
		
		A p1 = new A();
		System.out.println(p1.message);
		System.out.println(p1.getTest());
		
		B c1 = new B();
		System.out.println(c1.message);
		System.out.println(c1.getTest());
		
		/*
		 * Yes, in Java, field hiding is resolved by the reference type, not by the
		 * object type. This means that if a field is accessed through a reference, the
		 * field of the reference type is used, even if the actual object is an instance
		 * of a subclass that also declares a field with the same name. This is
		 * different from method overriding, where the method of the actual object type
		 * is called.
		 */
	
	}
	
	

}
