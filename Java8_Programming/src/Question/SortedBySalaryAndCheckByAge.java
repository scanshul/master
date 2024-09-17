package Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedBySalaryAndCheckByAge {
	public static void main(String[] args) {
		
		//List<Employee> : where employee age>25 and sorting based on salary ascending order
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
		
		System.out.println("----------------");
		//Find Top 3 Male Employees by salary having age Between 30 and 40 in Each Department
		
		List<EmployeeDetails> genderList = Arrays.asList(
	            new EmployeeDetails("John", 35, 90000, "Male", "IT"),
	            new EmployeeDetails("Alice", 28, 85000, "Female", "IT"),
	            new EmployeeDetails("Bob", 32, 87000, "Male", "HR"),
	            new EmployeeDetails("Eve", 45, 95000, "Female", "HR"),
	            new EmployeeDetails("Charlie", 36, 120000, "Male", "IT"),
	            new EmployeeDetails("David", 39, 110000, "Male", "HR"),
	            new EmployeeDetails("Mike", 33, 92000, "Male", "IT"),
	            new EmployeeDetails("Paul", 40, 99000, "Male", "Finance"),
	            new EmployeeDetails("Kevin", 31, 100000, "Male", "Finance"));
		Map<String, List<EmployeeDetails>> finalList = genderList.stream()
				.filter(emp0 -> emp0.getGender().equals("Male"))
				.filter(emp1 -> emp1.getAge() >= 30 && emp1.getAge() <= 40)
				.collect(Collectors.groupingBy(EmployeeDetails::getDept,
						Collectors.collectingAndThen(Collectors.toList(),
								list1 -> list1.stream()
										.sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed())
										.limit(3).collect(Collectors.toList()))));
		
		finalList.forEach((dep,empList)->{
			System.out.println("Department : " + dep);
			empList.forEach(System.out::println);
		});
		
	
	}
	
	

}
