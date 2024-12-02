package Question;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		//Average sal by Dep
		
		List<EmployeeDetails> lst = EmployeeDetails.getEmployeeList();
		
		Map<String, Double> map = 
		lst.stream().collect(Collectors.groupingBy(EmployeeDetails :: getDept ,
				Collectors.averagingDouble(EmployeeDetails :: getSalary)));
		
		map.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v);
			
		});
}}
