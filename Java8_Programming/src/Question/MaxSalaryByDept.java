package Question;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalaryByDept {
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		List<EmployeeDetails> lst = obj.getEmployeeList();
		
		// Deptwise Max Salary

		Map<String, Optional<EmployeeDetails>> empMap =
		lst.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
				Collectors.maxBy(Comparator.comparingDouble(EmployeeDetails::getSalary))));
		
		empMap.forEach((dept,name)-> System.out.print("Department :" + dept + " , name : " +name.get() ));
	}

}
