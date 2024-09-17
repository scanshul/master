package Question;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthMaxSalary {
	public static void main(String[] args) {
		int n =4;
		
		EmployeeDetails obj = new EmployeeDetails();
		List<EmployeeDetails> lst = obj.getEmployeeList();
		
		Optional op =
		lst.stream().sorted(Comparator.comparingDouble(EmployeeDetails ::getSalary).reversed()).skip(n-1).findFirst();
		System.out.println(op.get());
	}

}
