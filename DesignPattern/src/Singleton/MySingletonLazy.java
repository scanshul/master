package Singleton;

public class MySingletonLazy {
	
	private static MySingletonLazy instance;
	
	//Constructor should be private so no one create object
	private MySingletonLazy() {
	}
	
	//A method required that will return object of the class
	//Lazy Initilazation
	public static MySingletonLazy getObject() {
		if (instance== null) 
			instance = new MySingletonLazy();
		return instance;
	}
	
}
