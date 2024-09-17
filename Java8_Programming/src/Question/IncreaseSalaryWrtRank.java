package Question;

import java.util.Arrays;
import java.util.List;

class empRatting {
	
	private String name;
	private double salary;
	private int rank;
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "empRatting [name=" + name + ", salary=" + salary + ", rank=" + rank + "]";
	}
	public empRatting(String name, double salary, int rank) {
		super();
		this.name = name;
		this.salary = salary;
		this.rank = rank;
	}
	
}

public class IncreaseSalaryWrtRank {
	
	// // Increase salary by 10% for employees with rating > 4
	public static void main(String[] args) {
		List<empRatting> employees = Arrays.asList(
                new empRatting("Alice", 50000, 5),
                new empRatting("Bob", 55000, 3),
                new empRatting("Charlie", 70000, 4),
                new empRatting("David", 75000, 5),
                new empRatting("Eve", 60000, 2));
		
		employees.stream().filter(emp -> emp.getRank() > 4).forEach(emp-> emp.setSalary(emp.getSalary() * 1.10));
		
		employees.forEach(System.out::println);
	}

}
