package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkPositive {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypePositiveValue")
	public void checkPositive_DoubleTypeValueIsPositive_ReturnsTheValue(String name, double value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_DoubleTypeValueIsNotPositive_ThrowsException(String name, double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypePositiveValue")
	public void checkPositive_FloatTypeValueIsPositive_ReturnsTheValue(String name, float value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_FloatTypeValueIsNotPositive_ThrowsException(String name, float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypePositiveValue")
	public void checkPositive_LongTypeValueIsPositive_ReturnsTheValue(String name, long value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_LongTypeValueIsNotPositive_ThrowsException(String name, long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypePositiveValue")
	public void checkPositive_IntTypeValueIsPositive_ReturnsTheValue(String name, int value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_IntTypeValueIsNotPositive_ThrowsException(String name, int value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypePositiveValue")
	public void checkPositive_ShortTypeValueIsPositive_ReturnsTheValue(String name, short value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_ShortTypeValueIsNotPositive_ThrowsException(String name, short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypePositiveValue")
	public void checkPositive_ByteTypeValueIsPositive_ReturnsTheValue(String name, byte value) throws Exception {

		assertEquals(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_ByteTypeValueIsNotPositive_ThrowsException(String name, byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypePositiveValue")
	public void checkPositive_WrappedDoubleTypeValueIsPositive_ReturnsTheValue(String name, Double value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedDoubleTypeValueIsNotPositive_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedDoubleTypeValueIsNull_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypePositiveValue")
	public void checkPositive_WrappedFloatTypeValueIsPositive_ReturnsTheValue(String name, Float value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedFloatTypeValueIsNotPositive_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedFloatTypeValueIsNull_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypePositiveValue")
	public void checkPositive_WrappedLongTypeValueIsPositive_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedLongTypeValueIsNotPositive_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedLongTypeValueIsNull_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypePositiveValue")
	public void checkPositive_WrappedIntTypeValueIsPositive_ReturnsTheValue(String name, Integer value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedIntTypeValueIsNotPositive_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedIntTypeValueIsNull_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypePositiveValue")
	public void checkPositive_WrappedShortTypeValueIsPositive_ReturnsTheValue(String name, Short value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedShortTypeValueIsNotPositive_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedShortTypeValueIsNull_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypePositiveValue")
	public void checkPositive_WrappedByteTypeValueIsPositive_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedByteTypeValueIsNotPositive_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_WrappedByteTypeValueIsNull_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypePositiveValue")
	public void checkPositive_BigIntegerTypeValueIsPositive_ReturnsTheValue(String name, BigInteger value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_BigIntegerTypeValueIsNotPositive_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_BigIntegerTypeValueIsNull_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypePositiveValue")
	public void checkPositive_BigDecimalTypeValueIsPositive_ReturnsTheValue(String name, BigDecimal value) throws Exception {

		assertSame(Conditions.checkPositive(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_BigDecimalTypeValueIsNotPositive_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_BigDecimalTypeValueIsNull_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypePositiveValue")
	public void checkPositive_ComparableTypeValueIsPositive_ReturnsTheValue(String name, Comparable value) throws Exception {

		assertSame(Conditions.checkPositive(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_ComparableTypeValueIsNotPositive_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositive_ComparableTypeValueIsNull_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositive(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedDoubleTypeValueIsPositive_ReturnsTheValue(String name, Double value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedDoubleTypeValueIsNotPositive_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedDoubleTypeValueIsNull_ReturnsNull(String name, Double value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedFloatTypeValueIsPositive_ReturnsTheValue(String name, Float value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedFloatTypeValueIsNotPositive_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedFloatTypeValueIsNull_ReturnsNull(String name, Float value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedLongTypeValueIsPositive_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedLongTypeValueIsNotPositive_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedLongTypeValueIsNull_ReturnsNull(String name, Long value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedIntTypeValueIsPositive_ReturnsTheValue(String name, Integer value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedIntTypeValueIsNotPositive_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedIntTypeValueIsNull_ReturnsNull(String name, Integer value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedShortTypeValueIsPositive_ReturnsTheValue(String name, Short value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedShortTypeValueIsNotPositive_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedShortTypeValueIsNull_ReturnsNull(String name, Short value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypePositiveValue")
	public void checkPositiveIfNonnull_WrappedByteTypeValueIsPositive_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_WrappedByteTypeValueIsNotPositive_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_WrappedByteTypeValueIsNull_ReturnsNull(String name, Byte value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypePositiveValue")
	public void checkPositiveIfNonnull_BigIntegerTypeValueIsPositive_ReturnsTheValue(String name, BigInteger value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_BigIntegerTypeValueIsNotPositive_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_BigIntegerTypeValueIsNull_ReturnsNull(String name, BigInteger value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypePositiveValue")
	public void checkPositiveIfNonnull_BigDecimalTypeValueIsPositive_ReturnsTheValue(String name, BigDecimal value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_BigDecimalTypeValueIsNotPositive_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_BigDecimalTypeValueIsNull_ReturnsNull(String name, BigDecimal value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypePositiveValue")
	public void checkPositiveIfNonnull_ComparableTypeValueIsPositive_ReturnsTheValue(String name, Comparable value)
			throws Exception {

		assertSame(Conditions.checkPositiveIfNonnull(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonpositiveValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkPositiveIfNonnull_ComparableTypeValueIsNotPositive_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkPositiveIfNonnull(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "zero must be non-null\\.")
	public void checkPositiveIfNonnull_ComparableTypeThresholdIsNull_ThrowsException() throws Exception {

		Conditions.checkPositiveIfNonnull("foo", BigDecimal.ONE, null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkPositiveIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, Comparable value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkPositiveIfNonnull(name, value, 0));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                       0D },
					{  null,                       0D },
					{ "foo",                      -0D },
					{  null,                      -0D },
					{ "foo",                     0.1D },
					{  null,                     0.1D },
					{ "foo",         Double.MIN_VALUE },
					{  null,         Double.MIN_VALUE },
					{ "foo",         Double.MAX_VALUE },
					{  null,         Double.MAX_VALUE },
					{ "foo", Double.POSITIVE_INFINITY },
					{  null, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Double.NaN,            "foo must be positive number, but it is NaN." },
					{  null,               Double.NaN,       "variable must be positive number, but it is NaN." },
					{ "foo",                    -0.1D,           "foo must be positive number, but it is -0.1." },
					{  null,                    -0.1D,      "variable must be positive number, but it is -0.1." },
					{ "foo", Double.NEGATIVE_INFINITY,      "foo must be positive number, but it is -Infinity." },
					{  null, Double.NEGATIVE_INFINITY, "variable must be positive number, but it is -Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                     -0F },
					{  null,                     -0F },
					{ "foo",                      0F },
					{  null,                      0F },
					{ "foo",                    0.1F },
					{  null,                    0.1F },
					{ "foo",         Float.MIN_VALUE },
					{  null,         Float.MIN_VALUE },
					{ "foo",         Float.MAX_VALUE },
					{  null,         Float.MAX_VALUE },
					{ "foo", Float.POSITIVE_INFINITY },
					{  null, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Float.NaN,            "foo must be positive number, but it is NaN." },
					{  null,               Float.NaN,       "variable must be positive number, but it is NaN." },
					{ "foo",                   -0.1F,           "foo must be positive number, but it is -0.1." },
					{  null,                   -0.1F,      "variable must be positive number, but it is -0.1." },
					{ "foo", Float.NEGATIVE_INFINITY,      "foo must be positive number, but it is -Infinity." },
					{  null, Float.NEGATIVE_INFINITY, "variable must be positive number, but it is -Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",            -0L },
					{  null,            -0L },
					{ "foo",             0L },
					{  null,             0L },
					{ "foo",             1L },
					{  null,             1L },
					{ "foo", Long.MAX_VALUE },
					{  null, Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",            -1L,                        "foo must be positive number, but it is -1." },
					{  null,            -1L,                   "variable must be positive number, but it is -1." },
					{ "foo", Long.MIN_VALUE,      "foo must be positive number, but it is -9223372036854775808." },
					{  null, Long.MIN_VALUE, "variable must be positive number, but it is -9223372036854775808." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                -0 },
					{  null,                -0 },
					{ "foo",                 0 },
					{  null,                 0 },
					{ "foo",                 1 },
					{  null,                 1 },
					{ "foo", Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",                -1,               "foo must be positive number, but it is -1." },
					{  null,                -1,          "variable must be positive number, but it is -1." },
					{ "foo", Integer.MIN_VALUE,      "foo must be positive number, but it is -2147483648." },
					{  null, Integer.MIN_VALUE, "variable must be positive number, but it is -2147483648." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (short) -0 },
					{  null,      (short) -0 },
					{ "foo",       (short) 0 },
					{  null,       (short) 0 },
					{ "foo",       (short) 1 },
					{  null,       (short) 1 },
					{ "foo", Short.MAX_VALUE },
					{  null, Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",      (short) -1,          "foo must be positive number, but it is -1." },
					{  null,      (short) -1,     "variable must be positive number, but it is -1." },
					{ "foo", Short.MIN_VALUE,      "foo must be positive number, but it is -32768." },
					{  null, Short.MIN_VALUE, "variable must be positive number, but it is -32768." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (byte) -0 },
					{  null,      (byte) -0 },
					{ "foo",       (byte) 0 },
					{  null,       (byte) 0 },
					{ "foo",       (byte) 1 },
					{  null,       (byte) 1 },
					{ "foo", Byte.MAX_VALUE },
					{  null, Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",      (byte) -1,        "foo must be positive number, but it is -1." },
					{  null,      (byte) -1,   "variable must be positive number, but it is -1." },
					{ "foo", Byte.MIN_VALUE,      "foo must be positive number, but it is -128." },
					{  null, Byte.MIN_VALUE, "variable must be positive number, but it is -128." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ZERO.negate() },
					{  null, BigInteger.ZERO.negate() },
					{ "foo",          BigInteger.ZERO },
					{  null,          BigInteger.ZERO },
					{ "foo",           BigInteger.ONE },
					{  null,           BigInteger.ONE },
					{ "foo",           BigInteger.TEN },
					{  null,           BigInteger.TEN },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ONE.negate(),       "foo must be positive number, but it is -1." },
					{  null, BigInteger.ONE.negate(),  "variable must be positive number, but it is -1." },
					{ "foo", BigInteger.TEN.negate(),      "foo must be positive number, but it is -10." },
					{  null, BigInteger.TEN.negate(), "variable must be positive number, but it is -10." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypePositiveValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ZERO.negate() },
					{  null, BigDecimal.ZERO.negate() },
					{ "foo",          BigDecimal.ZERO },
					{  null,          BigDecimal.ZERO },
					{ "foo",           BigDecimal.ONE },
					{  null,           BigDecimal.ONE },
					{ "foo",           BigDecimal.TEN },
					{  null,           BigDecimal.TEN },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypeNonpositiveValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ONE.negate(),       "foo must be positive number, but it is -1." },
					{  null, BigDecimal.ONE.negate(),  "variable must be positive number, but it is -1." },
					{ "foo", BigDecimal.TEN.negate(),      "foo must be positive number, but it is -10." },
					{  null, BigDecimal.TEN.negate(), "variable must be positive number, but it is -10." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null,      "foo must be positive number, but it is null." },
					{  null, null, "variable must be positive number, but it is null." },
			};
		}// @formatter:on
	}
}
