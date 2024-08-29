package Factory;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("This is webDeveloper");
		return 40000;
	}

}
