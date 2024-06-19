package CSOD;

class Parent {
	String s= "ABC";
	
	public Parent(String x) {
		s=x;
		
	}
}

class Child extends Parent{
	public Child(String x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	String s= "XYZ";
	String h = "";
	/*
	 * public Child(String y,String h) { s=y;
	 * 
	 * }
	 */
	
	
}
public class ConstructorScenario {

}
