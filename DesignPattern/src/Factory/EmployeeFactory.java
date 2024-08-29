package Factory;



public class EmployeeFactory {
	
	public static Employee getEmployee(String empType) {
		if (empType.equals("IOS")) {
			return new IosDeveloper();
		}
		
		else if (empType.equals("Web")) {
			return new WebDeveloper();
			
		}
		else {
			return null;
		}
		
	}

}
