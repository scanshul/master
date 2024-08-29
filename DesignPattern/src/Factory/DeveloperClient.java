package Factory;

public class DeveloperClient {
	public static void main(String[] args) {
		Employee emp = new WebDeveloper(); // Tightly coupled
		Employee factory = 
		EmployeeFactory.getEmployee("Web");
		factory.salary();
	}

}
