package org.jarmoni.maven_config_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeClassTest {

	public SomeClass sc = new SomeClass();

	@Test
	public void testDoSomething0() throws Exception {
		assertEquals("07", this.sc.doSomething(0));
	}

	@Test
	public void testDoSomething1() throws Exception {
		assertEquals("17", this.sc.doSomething(1));
	}

	@Test
	public void testDoSomething2() throws Exception {
		assertEquals("27", this.sc.doSomething(2));
	}

}
