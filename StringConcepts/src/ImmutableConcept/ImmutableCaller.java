package ImmutableConcept;

import java.util.ArrayList;
import java.util.List;


public final class ImmutableCaller {
	
	private final int paymentId;
	private final String name;
	private final List<String> ls;
	
	private ImmutableCaller(int paymentId, String name,List<String> ls) {
		this.paymentId = paymentId;
		this.name = name;
		this.ls =ls;
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

	public static void main(String[] args) {
		int i =10;
		String s = "Raman";
		List<String> ls = new ArrayList<>();
		ls.add("Pune");
		ImmutableCaller imu = new ImmutableCaller(i, s,ls);
		System.out.println(imu.getPaymentId());
		System.out.println(imu.getName());
		System.out.println(imu.getLs());
		i = 85;
		s= "John";
		ls.add("Mumbai");
		System.out.println(imu.getPaymentId());
		System.out.println(imu.getName());
		System.out.println(imu.getLs());
		
	}

}
