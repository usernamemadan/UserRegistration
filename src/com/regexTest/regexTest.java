package com.regexTest;

import org.junit.Assert;
import org.junit.Test;

import com.regex.UserRegistration;

public class regexTest {
	
	@Test
	public void testValidateEmailAdrressShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean output = userRegistration.validateFirstName("Madan");
		Assert.assertTrue(output);
	}
	
}
