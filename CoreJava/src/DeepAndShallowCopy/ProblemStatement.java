package DeepAndShallowCopy;

public class ProblemStatement {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st1 = new Student();
		st1.rollNo = 10;
		System.out.println(st1);
		
		Student st2 = st1; //Reference copy
		System.out.println(st2);
		
		//If we want to change value in st2
		st2.rollNo = 20;
		
		//It will impact to both st1 and st2 because we used reference copy
		System.out.println(st1);
		System.out.println(st2);
		System.out.println();
		
		// If we want both object will work independently then will go with Object Copy
		
		//Shallow Copy Test
		StudentShallow shw1 = new StudentShallow();
		shw1.rollNo = 45;
		System.out.println("Shallow Copy output for first object : " + shw1);
		
		StudentShallow shw2 = (StudentShallow) shw1.clone();
		System.out.println("Shallow Copy output for second object: " + shw2);
		
		System.out.println("****Value change of Object 2*****");
		shw2.rollNo = 43;
		System.out.println("Shallow Copy output for first object : " + shw1);
		System.out.println("Shallow Copy output for second object: " + shw2);
		
		
		System.out.println("*****Address Copy*******");
		
		StudentDeepCopy sdp1 = new StudentDeepCopy();
		sdp1.rollNo = 25;
		AddressDeepCopy dp = new AddressDeepCopy();
		dp.addressId = 90;
		sdp1.address = dp;
		System.out.println("****First Object******** : " + sdp1);
		
		StudentDeepCopy sdp2 = (StudentDeepCopy) sdp1.clone();
		sdp2.rollNo = 30;
		sdp2.address.addressId = 2;
		System.out.println(sdp1);
		System.out.println(sdp2);
		
		
		
		
		
	}

}
