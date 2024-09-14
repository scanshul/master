package AbstractFactory;

public class SubjectiveAbstractFactory extends LibraryAbstractFactory {

	@Override
	public Library createLibrary() {
		return new SubjectiveBooks();
	}

}
