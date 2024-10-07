package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Product{
	private int pId;
	private String pName;
	
	public Product(int pId, String pName) {
		this.pId =pId;
		this.pName =pName;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return pId == other.pId;
	}
	
	
	
	
}

public class MapHashCodeEquals {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Java");
		Product p2 = new Product(1, "Java");
		
		HashMap<Product, String> map = new HashMap<>();
		map.put(p1, "Java");
		map.put(p2, "Java");
		
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		HashSet<Product> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		
		set.forEach(System.out::print);
		
	}
	

}
