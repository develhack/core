package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkNegative {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNegativeValue")
	public void checkNegative_DoubleTypeValueIsNegative_ReturnsTheValue(String name, double value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_DoubleTypeValueIsNotNegative_ThrowsException(String name, double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNegativeValue")
	public void checkNegative_FloatTypeValueIsNegative_ReturnsTheValue(String name, float value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_FloatTypeValueIsNotNegative_ThrowsException(String name, float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNegativeValue")
	public void checkNegative_LongTypeValueIsNegative_ReturnsTheValue(String name, long value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_LongTypeValueIsNotNegative_ThrowsException(String name, long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNegativeValue")
	public void checkNegative_IntTypeValueIsNegative_ReturnsTheValue(String name, int value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_IntTypeValueIsNotNegative_ThrowsException(String name, int value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNegativeValue")
	public void checkNegative_ShortTypeValueIsNegative_ReturnsTheValue(String name, short value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_ShortTypeValueIsNotNegative_ThrowsException(String name, short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNegativeValue")
	public void checkNegative_ByteTypeValueIsNegative_ReturnsTheValue(String name, byte value) throws Exception {

		assertEquals(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_ByteTypeValueIsNotNegative_ThrowsException(String name, byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNegativeValue")
	public void checkNegative_WrappedDoubleTypeValueIsNegative_ReturnsTheValue(String name, Double value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedDoubleTypeValueIsNotNegative_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedDoubleTypeValueIsNull_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNegativeValue")
	public void checkNegative_WrappedFloatTypeValueIsNegative_ReturnsTheValue(String name, Float value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedFloatTypeValueIsNotNegative_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedFloatTypeValueIsNull_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNegativeValue")
	public void checkNegative_WrappedLongTypeValueIsNegative_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedLongTypeValueIsNotNegative_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedLongTypeValueIsNull_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNegativeValue")
	public void checkNegative_WrappedIntTypeValueIsNegative_ReturnsTheValue(String name, Integer value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedIntTypeValueIsNotNegative_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedIntTypeValueIsNull_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNegativeValue")
	public void checkNegative_WrappedShortTypeValueIsNegative_ReturnsTheValue(String name, Short value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedShortTypeValueIsNotNegative_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedShortTypeValueIsNull_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNegativeValue")
	public void checkNegative_WrappedByteTypeValueIsNegative_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedByteTypeValueIsNotNegative_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_WrappedByteTypeValueIsNull_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNegativeValue")
	public void checkNegative_BigIntegerTypeValueIsNegative_ReturnsTheValue(String name, BigInteger value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_BigIntegerTypeValueIsNotNegative_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_BigIntegerTypeValueIsNull_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNegativeValue")
	public void checkNegative_BigDecimalTypeValueIsNegative_ReturnsTheValue(String name, BigDecimal value) throws Exception {

		assertSame(Conditions.checkNegative(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_BigDecimalTypeValueIsNotNegative_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_BigDecimalTypeValueIsNull_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNegativeValue")
	public void checkNegative_ComparableTypeValueIsNegative_ReturnsTheValue(String name, Comparable value) throws Exception {

		assertSame(Conditions.checkNegative(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_ComparableTypeValueIsNotNegative_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegative_ComparableTypeValueIsNull_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegative(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedDoubleTypeValueIsNegative_ReturnsTheValue(String name, Double value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedDoubleTypeValueIsNotNegative_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedDoubleTypeValueIsNull_ReturnsNull(String name, Double value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedFloatTypeValueIsNegative_ReturnsTheValue(String name, Float value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedFloatTypeValueIsNotNegative_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedFloatTypeValueIsNull_ReturnsNull(String name, Float value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedLongTypeValueIsNegative_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedLongTypeValueIsNotNegative_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedLongTypeValueIsNull_ReturnsNull(String name, Long value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedIntTypeValueIsNegative_ReturnsTheValue(String name, Integer value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedIntTypeValueIsNotNegative_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedIntTypeValueIsNull_ReturnsNull(String name, Integer value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedShortTypeValueIsNegative_ReturnsTheValue(String name, Short value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedShortTypeValueIsNotNegative_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedShortTypeValueIsNull_ReturnsNull(String name, Short value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNegativeValue")
	public void checkNegativeIfNonnull_WrappedByteTypeValueIsNegative_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_WrappedByteTypeValueIsNotNegative_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_WrappedByteTypeValueIsNull_ReturnsNull(String name, Byte value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNegativeValue")
	public void checkNegativeIfNonnull_BigIntegerTypeValueIsNegative_ReturnsTheValue(String name, BigInteger value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_BigIntegerTypeValueIsNotNegative_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_BigIntegerTypeValueIsNull_ReturnsNull(String name, BigInteger value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNegativeValue")
	public void checkNegativeIfNonnull_BigDecimalTypeValueIsNegative_ReturnsTheValue(String name, BigDecimal value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_BigDecimalTypeValueIsNotNegative_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_BigDecimalTypeValueIsNull_ReturnsNull(String name, BigDecimal value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNegativeValue")
	public void checkNegativeIfNonnull_ComparableTypeValueIsNegative_ReturnsTheValue(String name, Comparable value)
			throws Exception {

		assertSame(Conditions.checkNegativeIfNonnull(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonnegativeValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNegativeIfNonnull_ComparableTypeValueIsNotNegative_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNegativeIfNonnull(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "zero must be non-null\\.")
	public void checkNegativeIfNonnull_ComparableTypeThresholdIsNull_ThrowsException() throws Exception {

		Conditions.checkNegativeIfNonnull("foo", BigDecimal.ONE, null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNegativeIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, Comparable value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNegativeIfNonnull(name, value, 0));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                       0D },
					{  null,                       0D },
					{ "foo",                      -0D },
					{  null,                      -0D },
					{ "foo",                    -0.1D },
					{  null,                    -0.1D },
					{ "foo",        -Double.MIN_VALUE },
					{  null,        -Double.MIN_VALUE },
					{ "foo",        -Double.MAX_VALUE },
					{  null,        -Double.MAX_VALUE },
					{ "foo", Double.NEGATIVE_INFINITY },
					{  null, Double.NEGATIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Double.NaN,           "foo must be negative number, but it is NaN." },
					{  null,               Double.NaN,      "variable must be negative number, but it is NaN." },
					{ "foo",                     0.1D,           "foo must be negative number, but it is 0.1." },
					{  null,                     0.1D,      "variable must be negative number, but it is 0.1." },
					{ "foo", Double.POSITIVE_INFINITY,      "foo must be negative number, but it is Infinity." },
					{  null, Double.POSITIVE_INFINITY, "variable must be negative number, but it is Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                      0F },
					{  null,                      0F },
					{ "foo",                     -0F },
					{  null,                     -0F },
					{ "foo",                   -0.1F },
					{  null,                   -0.1F },
					{ "foo",        -Float.MIN_VALUE },
					{  null,        -Float.MIN_VALUE },
					{ "foo",        -Float.MAX_VALUE },
					{  null,        -Float.MAX_VALUE },
					{ "foo", Float.NEGATIVE_INFINITY },
					{  null, Float.NEGATIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Float.NaN,           "foo must be negative number, but it is NaN." },
					{  null,               Float.NaN,      "variable must be negative number, but it is NaN." },
					{ "foo",                    0.1F,           "foo must be negative number, but it is 0.1." },
					{  null,                    0.1F,      "variable must be negative number, but it is 0.1." },
					{ "foo", Float.POSITIVE_INFINITY,      "foo must be negative number, but it is Infinity." },
					{  null, Float.POSITIVE_INFINITY, "variable must be negative number, but it is Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",            -0L },
					{  null,            -0L },
					{ "foo",             0L },
					{  null,             0L },
					{ "foo",            -1L },
					{  null,            -1L },
					{ "foo", Long.MIN_VALUE },
					{  null, Long.MIN_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",             1L,                        "foo must be negative number, but it is 1." },
					{  null,             1L,                   "variable must be negative number, but it is 1." },
					{ "foo", Long.MAX_VALUE,      "foo must be negative number, but it is 9223372036854775807." },
					{  null, Long.MAX_VALUE, "variable must be negative number, but it is 9223372036854775807." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                -0 },
					{  null,                -0 },
					{ "foo",                 0 },
					{  null,                 0 },
					{ "foo",                -1 },
					{  null,                -1 },
					{ "foo", Integer.MIN_VALUE },
					{  null, Integer.MIN_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",                 1,               "foo must be negative number, but it is 1." },
					{  null,                 1,          "variable must be negative number, but it is 1." },
					{ "foo", Integer.MAX_VALUE,      "foo must be negative number, but it is 2147483647." },
					{  null, Integer.MAX_VALUE, "variable must be negative number, but it is 2147483647." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (short) -0 },
					{  null,      (short) -0 },
					{ "foo",       (short) 0 },
					{  null,       (short) 0 },
					{ "foo",      (short) -1 },
					{  null,      (short) -1 },
					{ "foo", Short.MIN_VALUE },
					{  null, Short.MIN_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (short) 1,          "foo must be negative number, but it is 1." },
					{  null,       (short) 1,     "variable must be negative number, but it is 1." },
					{ "foo", Short.MAX_VALUE,      "foo must be negative number, but it is 32767." },
					{  null, Short.MAX_VALUE, "variable must be negative number, but it is 32767." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (byte) -0 },
					{  null,      (byte) -0 },
					{ "foo",       (byte) 0 },
					{  null,       (byte) 0 },
					{ "foo",      (byte) -1 },
					{  null,      (byte) -1 },
					{ "foo", Byte.MIN_VALUE },
					{  null, Byte.MIN_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (byte) 1,        "foo must be negative number, but it is 1." },
					{  null,       (byte) 1,   "variable must be negative number, but it is 1." },
					{ "foo", Byte.MAX_VALUE,      "foo must be negative number, but it is 127." },
					{  null, Byte.MAX_VALUE, "variable must be negative number, but it is 127." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ZERO.negate() },
					{  null, BigInteger.ZERO.negate() },
					{ "foo",          BigInteger.ZERO },
					{  null,          BigInteger.ZERO },
					{ "foo",  BigInteger.ONE.negate() },
					{  null,  BigInteger.ONE.negate() },
					{ "foo",  BigInteger.TEN.negate() },
					{  null,  BigInteger.TEN.negate() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ONE,       "foo must be negative number, but it is 1." },
					{  null, BigInteger.ONE,  "variable must be negative number, but it is 1." },
					{ "foo", BigInteger.TEN,      "foo must be negative number, but it is 10." },
					{  null, BigInteger.TEN, "variable must be negative number, but it is 10." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypeNegativeValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ZERO.negate() },
					{  null, BigDecimal.ZERO.negate() },
					{ "foo",          BigDecimal.ZERO },
					{  null,          BigDecimal.ZERO },
					{ "foo",  BigDecimal.ONE.negate() },
					{  null,  BigDecimal.ONE.negate() },
					{ "foo",  BigDecimal.TEN.negate() },
					{  null,  BigDecimal.TEN.negate() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypeNonnegativeValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ONE,       "foo must be negative number, but it is 1." },
					{  null, BigDecimal.ONE,  "variable must be negative number, but it is 1." },
					{ "foo", BigDecimal.TEN,      "foo must be negative number, but it is 10." },
					{  null, BigDecimal.TEN, "variable must be negative number, but it is 10." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null,      "foo must be negative number, but it is null." },
					{  null, null, "variable must be negative number, but it is null." },
			};
		}// @formatter:on
	}
}
