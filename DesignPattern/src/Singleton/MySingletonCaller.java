package Singleton;

public class MySingletonCaller {
	public static void main(String[] args) {
		
		//Lazy Way
		MySingletonLazy obj1 = MySingletonLazy.getObject();
		MySingletonLazy obj2 = MySingletonLazy.getObject();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.hashCode() == obj2.hashCode());
		
	//Eager Way
		System.out.println(MySingletoneEager.getEagerObject().hashCode());
		System.out.println(MySingletoneEager.getEagerObject().hashCode());
		
	}
	

}
