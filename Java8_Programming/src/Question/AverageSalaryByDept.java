package Question;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDept {

	// Find the average salary of each department using stream APIs
	public static void main(String[] args) {

		EmployeeDetails obj = new EmployeeDetails();
		List<EmployeeDetails> lst = obj.getEmployeeList();

		Map<String, Double> map = lst.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
				Collectors.averagingDouble(EmployeeDetails::getSalary)));
		map.forEach((dept,sal) -> {
			System.out.println("Department : " + dept + ", Sal : " +sal);
		} );

	}

}
