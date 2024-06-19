package Singleton;

/*A Singleton class in Java is a design pattern that ensures a class has only one instance and provides a global point of access to it.
This is useful when exactly one object is needed to coordinate actions across the system.*/

public class SingletonBasic {
	private static SingletonBasic instance;
	
	private SingletonBasic() {
		System.out.println("Con");
	}
	
	public static SingletonBasic getInstance() {
		if (instance==null) {
			instance = new SingletonBasic();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonBasic obj = new SingletonBasic();
		}

}
