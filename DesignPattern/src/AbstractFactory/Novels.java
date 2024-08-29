package AbstractFactory;

public class Novels implements Library {

	@Override
	public int bookId() {
	return 4;
	}

	@Override
	public String bookName() {
		return "Motivational Books";
	}

}
