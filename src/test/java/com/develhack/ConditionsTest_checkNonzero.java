package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkNonzero {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonzeroValue")
	public void checkNonzero_DoubleTypeValueIsPositive_ReturnsTheValue(String name, double value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_DoubleTypeValueIsNotPositive_ThrowsException(String name, double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonzeroValue")
	public void checkNonzero_FloatTypeValueIsPositive_ReturnsTheValue(String name, float value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_FloatTypeValueIsNotPositive_ThrowsException(String name, float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonzeroValue")
	public void checkNonzero_LongTypeValueIsPositive_ReturnsTheValue(String name, long value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_LongTypeValueIsNotPositive_ThrowsException(String name, long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonzeroValue")
	public void checkNonzero_IntTypeValueIsPositive_ReturnsTheValue(String name, int value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_IntTypeValueIsNotPositive_ThrowsException(String name, int value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonzeroValue")
	public void checkNonzero_ShortTypeValueIsPositive_ReturnsTheValue(String name, short value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_ShortTypeValueIsNotPositive_ThrowsException(String name, short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeNonzeroValue")
	public void checkNonzero_CharTypeValueIsPositive_ReturnsTheValue(String name, char value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_CharTypeValueIsNotPositive_ThrowsException(String name, char value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonzeroValue")
	public void checkNonzero_ByteTypeValueIsPositive_ReturnsTheValue(String name, byte value) throws Exception {

		assertEquals(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_ByteTypeValueIsNotPositive_ThrowsException(String name, byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonzeroValue")
	public void checkNonzero_WrappedDoubleTypeValueIsPositive_ReturnsTheValue(String name, Double value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedDoubleTypeValueIsNotPositive_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedDoubleTypeValueIsNull_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonzeroValue")
	public void checkNonzero_WrappedFloatTypeValueIsPositive_ReturnsTheValue(String name, Float value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedFloatTypeValueIsNotPositive_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedFloatTypeValueIsNull_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonzeroValue")
	public void checkNonzero_WrappedLongTypeValueIsPositive_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedLongTypeValueIsNotPositive_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedLongTypeValueIsNull_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonzeroValue")
	public void checkNonzero_WrappedIntTypeValueIsPositive_ReturnsTheValue(String name, Integer value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedIntTypeValueIsNotPositive_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedIntTypeValueIsNull_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonzeroValue")
	public void checkNonzero_WrappedShortTypeValueIsPositive_ReturnsTheValue(String name, Short value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedShortTypeValueIsNotPositive_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedShortTypeValueIsNull_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeNonzeroValue")
	public void checkNonzero_WrappedCharTypeValueIsPositive_ReturnsTheValue(String name, Character value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedCharTypeValueIsNotPositive_ThrowsException(String name, Character value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedCharTypeValueIsNull_ThrowsException(String name, Character value,
			String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonzeroValue")
	public void checkNonzero_WrappedByteTypeValueIsPositive_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedByteTypeValueIsNotPositive_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_WrappedByteTypeValueIsNull_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonzeroValue")
	public void checkNonzero_BigIntegerTypeValueIsPositive_ReturnsTheValue(String name, BigInteger value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_BigIntegerTypeValueIsNotPositive_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_BigIntegerTypeValueIsNull_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonzeroValue")
	public void checkNonzero_BigDecimalTypeValueIsPositive_ReturnsTheValue(String name, BigDecimal value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_BigDecimalTypeValueIsNotPositive_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_BigDecimalTypeValueIsNull_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonzeroValue")
	public void checkNonzero_ComparableTypeValueIsPositive_ReturnsTheValue(String name, Comparable value) throws Exception {

		assertSame(Conditions.checkNonzero(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_ComparableTypeValueIsNotPositive_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzero_ComparableTypeValueIsNull_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzero(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedDoubleTypeValueIsPositive_ReturnsTheValue(String name, Double value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedDoubleTypeValueIsNotPositive_ThrowsException(String name, Double value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedDoubleTypeValueIsNull_ReturnsNull(String name, Double value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedFloatTypeValueIsPositive_ReturnsTheValue(String name, Float value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedFloatTypeValueIsNotPositive_ThrowsException(String name, Float value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedFloatTypeValueIsNull_ReturnsNull(String name, Float value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedLongTypeValueIsPositive_ReturnsTheValue(String name, Long value) throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedLongTypeValueIsNotPositive_ThrowsException(String name, Long value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedLongTypeValueIsNull_ReturnsNull(String name, Long value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedIntTypeValueIsPositive_ReturnsTheValue(String name, Integer value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedIntTypeValueIsNotPositive_ThrowsException(String name, Integer value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedIntTypeValueIsNull_ReturnsNull(String name, Integer value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedShortTypeValueIsPositive_ReturnsTheValue(String name, Short value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedShortTypeValueIsNotPositive_ThrowsException(String name, Short value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedShortTypeValueIsNull_ReturnsNull(String name, Short value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedCharTypeValueIsPositive_ReturnsTheValue(String name, Character value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedCharTypeValueIsNotPositive_ThrowsException(String name, Character value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedCharTypeValueIsNull_ReturnsNull(String name, Character value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeNonzeroValue")
	public void checkNonzeroIfNonnull_WrappedByteTypeValueIsPositive_ReturnsTheValue(String name, Byte value) throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_WrappedByteTypeValueIsNotPositive_ThrowsException(String name, Byte value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_WrappedByteTypeValueIsNull_ReturnsNull(String name, Byte value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeNonzeroValue")
	public void checkNonzeroIfNonnull_BigIntegerTypeValueIsPositive_ReturnsTheValue(String name, BigInteger value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigIntegerTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_BigIntegerTypeValueIsNotPositive_ThrowsException(String name, BigInteger value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_BigIntegerTypeValueIsNull_ReturnsNull(String name, BigInteger value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeNonzeroValue")
	public void checkNonzeroIfNonnull_BigDecimalTypeValueIsPositive_ReturnsTheValue(String name, BigDecimal value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bigDecimalTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_BigDecimalTypeValueIsNotPositive_ThrowsException(String name, BigDecimal value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_BigDecimalTypeValueIsNull_ReturnsNull(String name, BigDecimal value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeNonzeroValue")
	public void checkNonzeroIfNonnull_ComparableTypeValueIsPositive_ReturnsTheValue(String name, Comparable value)
			throws Exception {

		assertSame(Conditions.checkNonzeroIfNonnull(name, value, 0), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeZeroValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonzeroIfNonnull_ComparableTypeValueIsNotPositive_ThrowsException(String name, Comparable value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonzeroIfNonnull(name, value, 0);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "zero must be non-null\\.")
	public void checkNonzeroIfNonnull_ComparableTypeThresholdIsNull_ThrowsException() throws Exception {

		Conditions.checkNonzeroIfNonnull("foo", BigDecimal.ONE, null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkNonzeroIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, Comparable value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonzeroIfNonnull(name, value, 0));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                    -0.1D },
					{  null,                    -0.1D },
					{ "foo",                     0.1D },
					{  null,                     0.1D },
					{ "foo",               Double.NaN },
					{  null,               Double.NaN },
					{ "foo",         Double.MIN_VALUE },
					{  null,         Double.MIN_VALUE },
					{ "foo",         Double.MAX_VALUE },
					{  null,         Double.MAX_VALUE },
					{ "foo", Double.NEGATIVE_INFINITY },
					{  null, Double.NEGATIVE_INFINITY },
					{ "foo", Double.POSITIVE_INFINITY },
					{  null, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",  0.0D,      "foo must be non-zero." },
					{  null,  0.0D, "variable must be non-zero." },
					{ "foo", -0.0D,      "foo must be non-zero." },
					{  null, -0.0D, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                   -0.1F },
					{  null,                   -0.1F },
					{ "foo",                    0.1F },
					{  null,                    0.1F },
					{ "foo",               Float.NaN },
					{  null,               Float.NaN },
					{ "foo",         Float.MIN_VALUE },
					{  null,         Float.MIN_VALUE },
					{ "foo",         Float.MAX_VALUE },
					{  null,         Float.MAX_VALUE },
					{ "foo", Float.NEGATIVE_INFINITY },
					{  null, Float.NEGATIVE_INFINITY },
					{ "foo", Float.POSITIVE_INFINITY },
					{  null, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",  0.0F,      "foo must be non-zero." },
					{  null,  0.0F, "variable must be non-zero." },
					{ "foo", -0.0F,      "foo must be non-zero." },
					{  null, -0.0F, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",            -1L },
					{  null,            -1L },
					{ "foo",             1L },
					{  null,             1L },
					{ "foo", Long.MIN_VALUE },
					{  null, Long.MIN_VALUE },
					{ "foo", Long.MAX_VALUE },
					{  null, Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", -0L,      "foo must be non-zero." },
					{  null, -0L, "variable must be non-zero." },
					{ "foo",  0L,      "foo must be non-zero." },
					{  null,  0L, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",                -1 },
					{  null,                -1 },
					{ "foo",                 1 },
					{  null,                 1 },
					{ "foo", Integer.MIN_VALUE },
					{  null, Integer.MIN_VALUE },
					{ "foo", Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", -0,      "foo must be non-zero." },
					{  null, -0, "variable must be non-zero." },
					{ "foo",  0,      "foo must be non-zero." },
					{  null,  0, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (short) -1 },
					{  null,      (short) -1 },
					{ "foo",       (short) 1 },
					{  null,       (short) 1 },
					{ "foo", Short.MAX_VALUE },
					{  null, Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", (short) -0,      "foo must be non-zero." },
					{  null, (short) -0, "variable must be non-zero." },
					{ "foo",  (short) 0,      "foo must be non-zero." },
					{  null,  (short) 0, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",           (char) -1 },
					{  null,           (char) -1 },
					{ "foo",            (char) 1 },
					{  null,            (char) 1 },
					{ "foo", Character.MAX_VALUE },
					{  null, Character.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", (char) -0,      "foo must be non-zero." },
					{  null, (char) -0, "variable must be non-zero." },
					{ "foo",  (char) 0,      "foo must be non-zero." },
					{  null,  (char) 0, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo",      (byte) -1 },
					{  null,      (byte) -1 },
					{ "foo",       (byte) 1 },
					{  null,       (byte) 1 },
					{ "foo", Byte.MAX_VALUE },
					{  null, Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", (byte) -0,      "foo must be non-zero." },
					{  null, (byte) -0, "variable must be non-zero." },
					{ "foo",  (byte) 0,      "foo must be non-zero." },
					{  null,  (byte) 0, "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ONE.negate() },
					{  null, BigInteger.ONE.negate() },
					{ "foo",          BigInteger.ONE },
					{  null,          BigInteger.ONE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigIntegerTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigInteger.ZERO.negate(),      "foo must be non-zero." },
					{  null, BigInteger.ZERO.negate(), "variable must be non-zero." },
					{ "foo", BigInteger.ZERO,               "foo must be non-zero." },
					{  null, BigInteger.ZERO,          "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypeNonzeroValue() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ONE.negate() },
					{  null, BigDecimal.ONE.negate() },
					{ "foo",          BigDecimal.ONE },
					{  null,          BigDecimal.ONE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] bigDecimalTypeZeroValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", BigDecimal.ZERO.negate(),      "foo must be non-zero." },
					{  null, BigDecimal.ZERO.negate(), "variable must be non-zero." },
					{ "foo", BigDecimal.ZERO,               "foo must be non-zero." },
					{  null, BigDecimal.ZERO,          "variable must be non-zero." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null,      "foo must be non-zero." },
					{  null, null, "variable must be non-zero." },
			};
		}// @formatter:on
	}
}
