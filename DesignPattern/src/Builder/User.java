package Builder;

public class User {
	
	private String userId;
	private String userName;
	
	private User(userBuilder builder) {
		this.userId = builder.userId;
		this.userName =builder.userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}
	
	//Inner class used to create Object
	static class userBuilder {
		
		private String userId;
		private String userName;
		
		public userBuilder() {
			
		}
		
		//Method chaining
		public userBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public userBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public User build(){
			User user = new User(this);
			return user;
		}
			
		
	}

}
