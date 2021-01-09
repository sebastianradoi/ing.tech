package utils;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;


@Component
public class BcryptHasing {
	
	public  String getEncodedPass(String pass) {
		return BCrypt.hashpw(pass, BCrypt.gensalt(12));
		
	}
	public  boolean passwordMatching (String originalPassword, String encodedPassword) {
		return BCrypt.checkpw(originalPassword, encodedPassword);
	}

}
