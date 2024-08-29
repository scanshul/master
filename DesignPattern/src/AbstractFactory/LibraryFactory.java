package AbstractFactory;

public class LibraryFactory {
	
	public static Library getLibrary(LibraryAbstractFactory factory) {
		return factory.createLibrary();
		
	}

}
