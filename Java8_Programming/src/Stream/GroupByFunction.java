package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class Employee {
	private String name;
	private String gender;
	private int age;
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
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
public class GroupByFunction {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Raj", "Male",45));
		empList.add(new Employee("Pushpa", "Female",26));
		empList.add(new Employee("Lavi", "Male",29));
		empList.add(new Employee("Raj", "Male",36));
		empList.add(new Employee("Likhit", "Male",45));
		Map<String, List<Employee>> genderGroup = empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender()));
		System.out.println(genderGroup);
		//To Collect Unique employee name
		Map<String, Set<Employee>> setEmp = empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.toSet()));
		System.out.println(setEmp);
		Map<String, Map<Integer, List<Employee>>> obj = empList.stream().collect(
				Collectors.groupingBy(Employee :: getGender , Collectors.groupingBy(Employee::getAge)));
		
		System.out.println(obj);
		Map<Integer, Long> o =
		empList.stream().collect(Collectors.groupingBy(Employee :: getAge, Collectors.counting()));
		System.out.println(o);
	}
}
