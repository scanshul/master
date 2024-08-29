package ScenarioBased;

public class AlternateCapital {

	
	public static void main(String[] args) {
		String str = "This is my bucket";
		String[] arrStr = str.split(" ");
		
		for(int i = 0 ; i<arrStr.length;i++) {
			if(i%2 == 0) {//remainder
				arrStr[i] = arrStr[i].toUpperCase();
			}
		}
		System.out.println(String.join(" ", arrStr));
	}
}
