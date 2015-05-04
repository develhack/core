package com.develhack;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkValidNumber {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validDoubleTypeNumber")
	public void checkValidNumber_DoubleTypeValueIsValidNumber_ReturnsTheValue(double value) throws Exception {

		assertEquals(Conditions.checkValidNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumber_DoubleTypeValueIsInvalidNumber_ThrowsException(String name, double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validFloatTypeNumber")
	public void checkValidNumber_FloatTypeValueIsValidNumber_ReturnsTheValue(float value) throws Exception {

		assertEquals(Conditions.checkValidNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumber_FloatTypeValueIsInvalidNumber_ThrowsException(String name, float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validDoubleTypeNumber")
	public void checkValidNumber_WrappedDoubleTypeValueIsValidNumber_ReturnsTheValue(Double value) throws Exception {

		assertEquals(Conditions.checkValidNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumber_WrappedDoubleTypeValueIsInvalidNumber_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validFloatTypeNumber")
	public void checkValidNumber_WrappedFloatTypeValueIsValidNumber_ReturnsTheValue(Float value) throws Exception {

		assertEquals(Conditions.checkValidNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumber_WrappedFloatTypeValueIsInvalidNumber_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validDoubleTypeNumber")
	public void checkValidNumberIfNonnull_WrappedDoubleTypeValueIsValidNumber_ReturnsTheValue(Double value) throws Exception {

		assertEquals(Conditions.checkValidNumberIfNonnull(null, value), value);
	}

	@Test
	public void checkValidNumberIfNonnull_WrappedDoubleTypeValueIsNull_ReturnsNull() throws Exception {

		assertNull(Conditions.checkValidNumberIfNonnull(null, (Double) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumberIfNonnull_WrappedDoubleTypeValueIsInvalidNumber_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumberIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "validFloatTypeNumber")
	public void checkValidNumberIfNonnull_WrappedFloatTypeValueIsValidNumber_ReturnsTheValue(Float value) throws Exception {

		assertEquals(Conditions.checkValidNumberIfNonnull(null, value), value);
	}

	@Test
	public void checkValidNumberIfNonnull_WrappedFloatTypeValueIsNull_ReturnsNull() throws Exception {

		assertNull(Conditions.checkValidNumberIfNonnull(null, (Float) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "invalidFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkValidNumberIfNonnull_WrappedFloatTypeValueIsInvalidNumber_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkValidNumberIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	static class DataProviders {

		@DataProvider
		static Object[][] validDoubleTypeNumber() {// @formatter:off
			return new Object[][] {
					{ Double.MIN_VALUE },
					{ Double.MAX_VALUE },
					{ Double.NEGATIVE_INFINITY },
					{ Double.POSITIVE_INFINITY },
					{ 0D },
					{ 1D },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] validFloatTypeNumber() {// @formatter:off
			return new Object[][] {
					{ Float.MIN_VALUE },
					{ Float.MAX_VALUE },
					{ Float.NEGATIVE_INFINITY },
					{ Float.POSITIVE_INFINITY },
					{ 0F },
					{ 1F },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] invalidDoubleTypeNumberWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NaN,      "foo must be valid number." },
					{  null, Double.NaN, "variable must be valid number." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] invalidFloatTypeNumberWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NaN,      "foo must be valid number." },
					{  null, Float.NaN, "variable must be valid number." },
			};
		}// @formatter:on
	}
}
