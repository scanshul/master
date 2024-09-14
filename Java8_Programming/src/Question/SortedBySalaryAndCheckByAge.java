package Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedBySalaryAndCheckByAge {
	public static void main(String[] args) {
		
		//List<Employee> : where employee age>35 and sorting based on salary ascending order
		System.out.println("Input List-----");
		EmployeeDetails emp = new EmployeeDetails();
		List<EmployeeDetails> list = emp.getEmployeeList();
		List<EmployeeDetails> sortedList = list.stream().filter(e -> e.getAge() > 25)
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
	sortedList.forEach(System.out::println);
	System.out.println("--Input Map ---");
		
		//Input is in Map Form
		
		Map<Integer, EmployeeDetails> map = new HashMap<>();
		map.put(1, new EmployeeDetails(1, "Rohan", "IT", 4500,23));
		map.put(2, new EmployeeDetails(1, "Komal", "HR", 3300,45));
		map.put(3, new EmployeeDetails(3, "Rajesh", "IT", 2800,31));
		map.put(4, new EmployeeDetails(4, "Nitin", "Sales", 6300,25));
		map.put(5, new EmployeeDetails(5, "Mukund", "IT", 1800,21));
		map.put(6, new EmployeeDetails(6, "Likhit", "Sales", 6900,23));
		map.put(7, new EmployeeDetails(7, "Jay", "Sales", 9000,28));
		
		List<EmployeeDetails> mapList = 
		map.entrySet().stream().filter(entry -> entry.getValue().getAge() > 25).map(Map.Entry::getValue).sorted(
				(e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
		mapList.forEach(System.out::println);
	
	}

}
