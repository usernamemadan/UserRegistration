package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.UserRegistration;

public class userRegistrationTest {
	
	@Test
	public void testValidateFirstNameShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean output = userRegistration.validateFirstName("Madan");
		Assert.assertTrue(output);
	}
	
	@Test
	public void testValidateLastNameShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean output = userRegistration.validateLastName("Hello");
		Assert.assertTrue(output);
	}
	
	@Test
	public void testValidateEmailShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean output = userRegistration.validateEmail("abc.100@gmail.com.au");
		Assert.assertTrue(output);
	}
	
	
}
