package BasicConcepts;

//Usecase how many object will create 

class Parent {
	
	/*
	 * public Parent() { System.out.println("Parent Constructor"); }
	 */
	public void m1() {
		System.out.println("Pr method");
	}
	
	public void n1() {
		System.out.println("2 Pr method");
	}
	
}

class Child extends Parent {
	
	/*
	 * public Child(){ System.out.println("Child Con"); }
	 */
	
	public void m1() {
		System.out.println("Ch method");
	}
	public void o1() {
		System.out.println("o1 method");
	}
}

public class InheritanceEg1 {
	public static void main(String[] args) {
		Child chObj = new Child();
		//System.out.println(chObj.hashCode());
		chObj.m1();
		chObj.n1();
		chObj.o1();
		System.out.println("---------------");
		
		Parent pr = new Parent();
		pr.m1();
		pr.n1();
		System.out.println("---------------");
		
		
		//Child ch1 = new Parent();
		
		Parent pr2 = new Child();
		pr2.m1();
		pr2.n1();
		//pr2.o1(); //Not able to call
	
		
		
	}
	
	/*
	 * Even though only one Child object is explicitly created in the main method,
	 * the process of creating this Child object also involves creating the Parent
	 * part of the Child object. However, both parts belong to the same Child
	 * object; they are not separate objects in memory.
	 * 
	 * Thus, only one object is created in Java, which is an instance of the Child
	 * class. This object internally contains the properties of both Parent and
	 * Child, but it is still a single object instance.
	 */
}
