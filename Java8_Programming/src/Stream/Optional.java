package Stream;

public class Optional {
	public static void main(String[] args) {
		String str = "Hello Developer";
		java.util.Optional<String> op = java.util.Optional.ofNullable(str);
		System.out.println(op.isPresent());
		String nullStr = null;
		java.util.Optional<String> op1 = java.util.Optional.ofNullable(nullStr); //Its safe
		System.out.println(op1.orElse("String is null"));
		java.util.Optional<String> op2= java.util.Optional.of(nullStr); // Will give error
		System.out.println(op2);
	}
}
