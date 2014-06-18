package org.jarmoni.maven_config_test;

public class SomeClass {

	public SomeClass() {

	}

	public String doSomething(final int i) {

		// just for test formatting...
		int k = 10;
		try {
			k = 5;
		}
		catch (final Exception ex) {
			k = 9;
		}
		finally {
			k = 7;
		}

		if (i == 0) {
			return "0" + k;
		}
		else if (i == 1) {
			return "1" + k;
		}
		else {
			return "2" + k;
		}

	}

	public static void main(final String[] args) {
		// CHECKSTYLE:OFF
		System.out.println("Starting....");
		// CHECKSTYLE:ON
		new SomeClass();
	}

}
