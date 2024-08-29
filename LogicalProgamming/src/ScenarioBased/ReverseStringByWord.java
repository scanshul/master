package ScenarioBased;

public class ReverseStringByWord {
	public static void main(String[] args) {
		String str = "This is the Java Language";
		
		String[] arr = str.split(" ");
		String outputStr = "";
		
		for(int i =arr.length-1 ;i>= 0;i--) {
			outputStr = outputStr + arr[i] + " ";
		}
		System.out.println(outputStr);
	}

}
