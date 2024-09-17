package Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	private String name;
	private double salary;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	public Emp(String name,  int age,double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
}

public class SortedByMultipleFields {
	public static void main(String[] args) {
		List<Emp> employees = Arrays.asList(
                new Emp("Alice", 30, 50000),
                new Emp("Bob", 25, 55000),
                new Emp("Charlie", 25, 50000),
                new Emp("David", 30, 75000),
                new Emp("Eve", 25, 60000));

		List<Emp> ls =
				employees.stream().sorted(
				Comparator.comparingInt(Emp::getAge).thenComparingDouble(Emp::getSalary).thenComparing(Emp ::getName))
				.collect(Collectors.toList());
		ls.forEach(System.out ::println);
	}

}
