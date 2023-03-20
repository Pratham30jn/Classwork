package Constructor;

public class OverLoading {
	
	public static void main(String[] args) {
		
		User user1=new User("Pratham", 10);
		user1.emailId="prathamjain7789@gmail.com";
		User user2=new User("sam", 100);
		user2.emailId="prathamjn7789@gmail.com";
		User user3=new User("Pratham", 10);
		user3.emailId="prathamjain7789@gmail.com";
		System.out.println(User.count);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
	}

}
