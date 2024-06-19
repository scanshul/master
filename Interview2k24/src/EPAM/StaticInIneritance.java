package EPAM;

class P {
	static void demo() {
		System.out.println("Parent Demos");
	}
	
	 void m1() {
		System.out.println("Parent m1");
	}
}

/* //Static method in parent then child must have same static method otherwise give compilation error
 * class C extends P { void demo() { System.out.println("Child Demo"); } }
 */

/*//Static method in child then parent must have same static method otherwise give compilation error
 * class C extends P { static void demo() { System.out.println("Child Demo"); }
 * }
 */

//If both are static then Parent method call 
class C extends P {
	static void demo() {
		System.out.println("Child Demo");
	}
	 void m1() {
			System.out.println("Child m1");
		}
	
}

public class StaticInIneritance {
	public static void main(String[] args) {
		P obj = new C();
		P.demo();
		C.demo();
		obj.demo();
		obj.m1();
	}
	
}	
