package com.relatech.training;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();
	
	@Test
	public void testGreeter() {
		assertThat(greeter.sayHello(), containsString("Hello World!"));
	}
	
	@Test
	public void testGreeter2() {
		assertThat(greeter.sayHello(), startsWith("Hello"));
	}
}
