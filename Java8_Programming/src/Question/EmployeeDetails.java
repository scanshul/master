package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDetails {
	
	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	public EmployeeDetails() {
		super();
	}
	public EmployeeDetails(int id, String name, String dept, double salary,int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age =age;
	}
	
	public EmployeeDetails(int id, String name, String dept, double salary,int age,String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age =age;
		this.gender =gender;
	}
	
	
	
	
	
	public EmployeeDetails(String name, int age, double salary, String gender, String dept) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age =age;
		this.gender =gender;
	}
	public List<EmployeeDetails> getEmployeeList(){
		List<EmployeeDetails> empList = new ArrayList<>();
		EmployeeDetails emp1 = new EmployeeDetails(1, "Rohan", "IT", 4500,23);
		EmployeeDetails emp2 = new EmployeeDetails(2, "Komal", "HR", 3300,45);
		EmployeeDetails emp3 = new EmployeeDetails(3, "Rajesh", "IT", 2800,31);
		EmployeeDetails emp4 = new EmployeeDetails(4, "Nitin", "Sales", 6300,25);
		EmployeeDetails emp5 = new EmployeeDetails(5, "Mukund", "IT", 1800,21);
		EmployeeDetails emp6 = new EmployeeDetails(6, "Likhit", "Sales", 6900,23);
		EmployeeDetails emp7 = new EmployeeDetails(7, "Jay", "Sales", 9000,28);
		empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		return empList;
	}
}
