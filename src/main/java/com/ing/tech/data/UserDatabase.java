package com.ing.tech.data;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UserDatabase {

	public static Supplier<User> u1 = ()->{
		User user = new User("Mike","Hannigan",23,"mike123","mike123", "USER");
		return user;
	};
	public static Supplier<User> u2 = User::new;
	public static List<User> getAllUsers () {
		User user1 = new User("Mike","Hannigan",23,"mike123","mike123", "USER");
		User user2 = new User("Hugh","Grant",44,"hugh123","hugh123", "USER");
		User user3 = new User("Will","Smith",38,"will123","will123", "USER");
		List<User> users = Arrays.asList(user1, user2, user3);
		return users;
			
	}
}
