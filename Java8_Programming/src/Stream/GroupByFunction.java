package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class Employee {
	private String name;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + "]";
	}
}
public class GroupByFunction {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Raj", "Male"));
		empList.add(new Employee("Pushpa", "Female"));
		empList.add(new Employee("Lavi", "Male"));
		empList.add(new Employee("Raj", "Male"));
		Map<String, List<Employee>> genderGroup = empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender()));
		System.out.println(genderGroup);
		//To Collect Unique employee name
		Map<String, Set<Employee>> setEmp = empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.toSet()));
		System.out.println(setEmp);
	}
}
