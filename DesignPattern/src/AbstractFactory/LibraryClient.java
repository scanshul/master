package AbstractFactory;

public class LibraryClient {
	public static void main(String[] args) {
		Library lb =
		LibraryFactory.getLibrary(new SubjectiveAbstractFactory());
		lb.bookId();
		lb.bookName();	
		System.out.println(lb.bookId());
		
	}

}
