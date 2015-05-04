package com.develhack;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkNonnull {

	@Test
	public void checkNonnull_ValueIsNonnull_DoesNothing() throws Exception {

		Conditions.checkNonnull(null, new Object());
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nameWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonnull_ValueIsNull_ThrowsException(String name, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonnull(name, null);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	static class DataProviders {

		@DataProvider
		static Object[][] nameWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",      "foo must be non-null." },
					{  null, "variable must be non-null." },
					{    "", "variable must be non-null." },
			};
		}// @formatter:on
	}
}
