package ScenarioBased;

public class SmallestRangeDivisible {
	
	public static long findLCM (long a , long b) {
		return (a*b) / findGCD(a,b);
		
	}

	public static long findGCD(long a, long b) {
	while(b!=0) {
		long temp =b;
		b = a%b;
		a =temp;
		
	}
		return a;
	}
	
	public static void main(String[] args) {
		int range =20;
		long smallestNumber =1;
		
		for(int i=1; i<= range;i++) {
			smallestNumber = findLCM(smallestNumber, i);
		}
		System.out.println(smallestNumber);
	}

}
