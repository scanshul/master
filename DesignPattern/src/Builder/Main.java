package Builder;

public class Main {
	public static void main(String[] args) {
		User user = new User.userBuilder().setUserId("12").setUserName("Java").build();
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
	}

}
