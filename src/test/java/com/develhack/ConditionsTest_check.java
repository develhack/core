package com.develhack;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_check {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "values")
	public void check_CheckResultIsTrue_ReturnsTheValue(Object value) throws Exception {
		assertSame(Conditions.check("foo", value, true, null), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "argumentsWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void check_CheckResultIsFalse_ThrowsException(String name, Object value, String requirement,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.check(name, value, false, requirement);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	static class DataProviders {

		@DataProvider
		static Object[][] values() {// @formatter:off
			return new Object[][] {
					{ null },
					{ new Object() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] argumentsWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",  0, "must be greater than zero",      "foo must be greater than zero, but it is 0." },
					{ "foo", -1,  "must be positive integer",      "foo must be positive integer, but it is -1." },
					{  null, -1,  "must be positive integer", "variable must be positive integer, but it is -1." },
					{    "", -1,  "must be positive integer", "variable must be positive integer, but it is -1." },
					{ "foo", -1,                       null,                      "assertion failed. foo is -1." },
					{ "foo", -1,                         "",                      "assertion failed. foo is -1." },
					{  null, -1,                       null,                 "assertion failed. variable is -1." },
					{    "", -1,                         "",                 "assertion failed. variable is -1." },
			};
		}// @formatter:on
	}
}
