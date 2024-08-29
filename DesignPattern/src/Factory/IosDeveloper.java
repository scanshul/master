package Factory;

public class IosDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("This is IOS Developer");
		return 35000;
	}

}
