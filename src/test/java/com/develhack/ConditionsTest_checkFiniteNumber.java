package com.develhack;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkFiniteNumber {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteDoubleTypeNumber")
	public void checkFiniteNumber_DoubleTypeValueIsFiniteNumber_ReturnsTheValue(double value) throws Exception {

		assertEquals(Conditions.checkFiniteNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumber_DoubleTypeValueIsInfiniteNumber_ThrowsException(String name, double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteFloatTypeNumber")
	public void checkFiniteNumber_FloatTypeValueIsFiniteNumber_ReturnsTheValue(float value) throws Exception {

		assertEquals(Conditions.checkFiniteNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumber_FloatTypeValueIsInfiniteNumber_ThrowsException(String name, float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteDoubleTypeNumber")
	public void checkFiniteNumber_WrappedDoubleTypeValueIsFiniteNumber_ReturnsTheValue(Double value) throws Exception {

		assertSame(Conditions.checkFiniteNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumber_WrappedDoubleTypeValueIsInfiniteNumber_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteFloatTypeNumber")
	public void checkFiniteNumber_WrappedFloatTypeValueIsFiniteNumber_ReturnsTheValue(Float value) throws Exception {

		assertSame(Conditions.checkFiniteNumber(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumber_WrappedFloatTypeValueIsInfiniteNumber_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumber(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteDoubleTypeNumber")
	public void checkFiniteNumberIfNonnull_WrappedDoubleTypeValueIsFiniteNumber_ReturnsTheValue(Double value) throws Exception {

		assertSame(Conditions.checkFiniteNumberIfNonnull(null, value), value);
	}

	@Test
	public void checkFiniteNumberIfNonnull_WrappedDoubleTypeValueIsNull_ReturnsNull() throws Exception {

		assertNull(Conditions.checkFiniteNumberIfNonnull(null, (Double) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteDoubleTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumberIfNonnull_WrappedDoubleTypeValueIsInfiniteNumber_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumberIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "finiteFloatTypeNumber")
	public void checkFiniteNumberIfNonnull_WrappedFloatTypeValueIsFiniteNumber_ReturnsTheValue(Float value) throws Exception {

		assertEquals(Conditions.checkFiniteNumberIfNonnull(null, value), value);
	}

	@Test
	public void checkFiniteNumberIfNonnull_WrappedFloatTypeValueIsNull_ReturnsNull() throws Exception {

		assertNull(Conditions.checkFiniteNumberIfNonnull(null, (Float) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "infiniteFloatTypeNumberWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkFiniteNumberIfNonnull_WrappedFloatTypeValueIsInfiniteNumber_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkFiniteNumberIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	static class DataProviders {

		@DataProvider
		static Object[][] finiteDoubleTypeNumber() {// @formatter:off
			return new Object[][] {
					{ Double.MIN_VALUE },
					{ Double.MAX_VALUE },
					{ 0D },
					{ 1D },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] finiteFloatTypeNumber() {// @formatter:off
			return new Object[][] {
					{ Float.MIN_VALUE },
					{ Float.MAX_VALUE },
					{ 0F },
					{ 1F },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] infiniteDoubleTypeNumberWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY,      "foo must be finite number." },
					{  null, Double.NEGATIVE_INFINITY, "variable must be finite number." },
					{ "foo", Double.POSITIVE_INFINITY,      "foo must be finite number." },
					{  null, Double.POSITIVE_INFINITY, "variable must be finite number." },
					{ "foo", Double.NaN,                     "foo must be valid number." },
					{  null, Double.NaN,                "variable must be valid number." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] infiniteFloatTypeNumberWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY,      "foo must be finite number." },
					{  null, Float.NEGATIVE_INFINITY, "variable must be finite number." },
					{ "foo", Float.POSITIVE_INFINITY,      "foo must be finite number." },
					{  null, Float.POSITIVE_INFINITY, "variable must be finite number." },
					{ "foo", Float.NaN,                     "foo must be valid number." },
					{  null, Float.NaN,                "variable must be valid number." },
			};
		}// @formatter:on
	}
}
