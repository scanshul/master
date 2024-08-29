package AbstractFactory;

public class SubjectiveBooks implements Library {

	@Override
	public int bookId() {
		return 2;
	}

	@Override
	public String bookName() {
		return "Physics";
	}

}
