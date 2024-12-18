package Singleton;

public class MySingletoneEager {
	
	private static MySingletoneEager eagerInstance = new MySingletoneEager();
	
	public static MySingletoneEager getEagerObject() {
		return eagerInstance;
		
	}
	
	private Object readResolve() {
		return eagerInstance;
	}
}
