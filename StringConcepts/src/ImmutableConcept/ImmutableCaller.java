package ImmutableConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class ImmutableCaller {
	
	private final int paymentId;
	private final String name;
	private final List<String> ls;
	//Address class is immutable
	private final Address add;
	private final List<String> ls2;
	
	private final Education edu;
	
	private ImmutableCaller(int paymentId, String name,List<String> ls, Address add,Education edu,List<String> ls2) {
		this.paymentId = paymentId;
		this.name = name;
		this.ls =Collections.unmodifiableList(List.copyOf(ls));
		this.add = add;
		this.edu = new Education(edu); // Create a defensive copy
		this.ls2 = ls2;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getLs() {
		return ls;
	}
	
	public Address getAdd() {
		return add;
	}
	
	public Education getEdu() {
		return new Education(edu); // Return a defensive copy
	}
	
	

	public List<String> getLs2() {
		return ls2;
	}

	@Override
	public String toString() {
		return "ImmutableCaller [paymentId=" + paymentId + ", name=" + name + ", ls=" + ls + ", add=" + add + ", ls2="
				+ ls2 + ", edu=" + edu + "]";
	}

	public static void main(String[] args) {
		int i =10;
		String s = "Raman";
		List<String> ls = new ArrayList<>();
		ls.add("Pune");
		List<String> ls2 = new ArrayList<>();
		ls2.add("MH");
		
		Address address =new Address("New York", "NY", "USA");
		
		Education edu = new Education("B.Tech", "2014");
		ImmutableCaller imu = new ImmutableCaller(i, s,ls,address,edu,ls2);
		System.out.println(imu.getPaymentId());
		System.out.println(imu.getName());
		System.out.println(imu.getLs());
		System.out.println(imu.getAdd());
		System.out.println(imu.getEdu());
		System.out.println(imu.getLs2());
		//ls2 = new ArrayList<>();
		i = 85;
		s= "John";
		ls.add("Mumbai");
		ls2.add("MP");
		address = new Address("Los Angeles", "CA", "USA");
		edu = new Education("B.Teclllh", "2018");
		System.out.println(imu.getPaymentId());
		System.out.println(imu.getName());
		System.out.println(imu.getLs());
		System.out.println(imu.getAdd());
		System.out.println(imu.getEdu());
		System.out.println(imu.getLs2());
		
		
		
	}

}
