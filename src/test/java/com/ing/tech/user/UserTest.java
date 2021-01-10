package com.ing.tech.user;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ing.tech.data.User;
import com.ing.tech.data.UserService;
import com.ing.tech.demo.DemoApplication;

import utils.BcryptHasing;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoApplication.class)
public class UserTest {

	@Autowired
	BcryptHasing hashing;
	@Autowired
	UserService userService;

	@Test
	public void testHashingAlg() {

		String password = "testpass";
		String encryptedPass = hashing.getEncodedPass(password);
		assertNotEquals(password, encryptedPass);

	}

	@Test
	public void checkPasswords() {
		String password = "testpass";
		String encryptedPass = hashing.getEncodedPass(password);
		boolean passwordsMatch = hashing.passwordMatching(password, encryptedPass);
		assertTrue(passwordsMatch);
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test(expected = RuntimeException.class)
	public void checkUserFound() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("User does not exist");
		Optional<User> userFound = userService.findByUsername("testforusername");
	}
}
