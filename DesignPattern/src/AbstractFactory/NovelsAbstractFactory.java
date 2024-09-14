package AbstractFactory;

public class NovelsAbstractFactory extends LibraryAbstractFactory {

	@Override
	public Library createLibrary() {
		
		return new Novels();
	}

}
