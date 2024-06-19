package Singleton;

public class SynchronizedSingleton {
	
	private static SynchronizedSingleton syncInstance;
	
	private SynchronizedSingleton() {
		
	}
	
	public static SynchronizedSingleton getSyncObject() {
		if(syncInstance == null) {
			synchronized (SynchronizedSingleton.class) {
				if (syncInstance == null) {
					syncInstance = new SynchronizedSingleton();
					
				}
				
			}
			
		}
		return syncInstance;
		
	}

}
