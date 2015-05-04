package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkInRange {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, double value, double from, double to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, double value, double from, double to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, float value, float from, float to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, float value, float from, float to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, long value, long from, long to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, long value, long from, long to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, int value, int from, int to) throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, int value, int from, int to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, short value, short from, short to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, short value, short from, short to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, char value, char from, char to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, char value, char from, char to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueInRange")
	public void checkInRange_DoubleTypeValueInRange_ReturnsTheValue(String name, byte value, byte from, byte to)
			throws Exception {
		assertEquals(Conditions.checkInRange(name, value, from, to), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_DoubleTypeValueOutOfRange_ThrowsException(String name, byte value, byte from, byte to,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "comparableTypeValueInRange")
	public void checkInRange_ComparableTypeValueInRange_ReturnsTheValue(String name, Comparable value, Comparable from,
			Comparable to) throws Exception {

		assertSame(Conditions.checkInRange(name, value, from, to), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_ComparableTypeValueOutOfRange_ThrowsException(String name, Comparable value, Comparable from,
			Comparable to, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRange_ComparableTypeValueIsNull_ThrowsException(String name, Comparable value, Comparable from,
			Comparable to, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRange(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "comparableTypeValueInRange")
	public void checkInRangeIfNonnull_ComparableTypeValueInRange_ReturnsTheValue(String name, Comparable value,
			Comparable from, Comparable to) throws Exception {

		assertSame(Conditions.checkInRangeIfNonnull(name, value, from, to), value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueOutOfRangeWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkInRangeIfNonnull_ComparableTypeValueOutOfRange_ThrowsException(String name, Comparable value,
			Comparable from, Comparable to, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkInRangeIfNonnull(name, value, from, to);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public void checkInRangeIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, Comparable value, Comparable from,
			Comparable to, String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkInRangeIfNonnull(name, value, from, to));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,                       1D },
					{  null, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,                       1D },
					{ "foo",                      -1D,                      -1D,                       1D },
					{  null,                      -1D,                      -1D,                       1D },
					{ "foo",                       0D,                      -1D,                       1D },
					{  null,                       0D,                      -1D,                       1D },
					{ "foo",                       1D,                      -1D,                       1D },
					{  null,                       1D,                      -1D,                       1D },
					{ "foo", Double.POSITIVE_INFINITY,                      -1D, Double.POSITIVE_INFINITY },
					{  null, Double.POSITIVE_INFINITY,                      -1D, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, -1D, 1D,      "foo must be in the range of from -1.0 to 1.0, but it is -Infinity." },
					{  null, Double.NEGATIVE_INFINITY, -1D, 1D, "variable must be in the range of from -1.0 to 1.0, but it is -Infinity." },
					{ "foo",                      -2D, -1D, 1D,           "foo must be in the range of from -1.0 to 1.0, but it is -2.0." },
					{  null,                      -2D, -1D, 1D,      "variable must be in the range of from -1.0 to 1.0, but it is -2.0." },
					{ "foo",                       2D, -1D, 1D,            "foo must be in the range of from -1.0 to 1.0, but it is 2.0." },
					{  null,                       2D, -1D, 1D,       "variable must be in the range of from -1.0 to 1.0, but it is 2.0." },
					{ "foo", Double.POSITIVE_INFINITY, -1D, 1D,       "foo must be in the range of from -1.0 to 1.0, but it is Infinity." },
					{  null, Double.POSITIVE_INFINITY, -1D, 1D,  "variable must be in the range of from -1.0 to 1.0, but it is Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY,                       1F },
					{  null, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY,                       1F },
					{ "foo",                     -1F,                      -1F,                      1F },
					{  null,                     -1F,                      -1F,                      1F },
					{ "foo",                      0F,                      -1F,                      1F },
					{  null,                      0F,                      -1F,                      1F },
					{ "foo",                      1F,                      -1F,                      1F },
					{  null,                      1F,                      -1F,                      1F },
					{ "foo", Float.POSITIVE_INFINITY,                      -1F, Float.POSITIVE_INFINITY },
					{  null, Float.POSITIVE_INFINITY,                      -1F, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY, -1F, 1F,      "foo must be in the range of from -1.0 to 1.0, but it is -Infinity." },
					{  null, Float.NEGATIVE_INFINITY, -1F, 1F, "variable must be in the range of from -1.0 to 1.0, but it is -Infinity." },
					{ "foo",                     -2F, -1F, 1F,           "foo must be in the range of from -1.0 to 1.0, but it is -2.0." },
					{  null,                     -2F, -1F, 1F,      "variable must be in the range of from -1.0 to 1.0, but it is -2.0." },
					{ "foo",                      2F, -1F, 1F,            "foo must be in the range of from -1.0 to 1.0, but it is 2.0." },
					{  null,                      2F, -1F, 1F,       "variable must be in the range of from -1.0 to 1.0, but it is 2.0." },
					{ "foo", Float.POSITIVE_INFINITY, -1F, 1F,       "foo must be in the range of from -1.0 to 1.0, but it is Infinity." },
					{  null, Float.POSITIVE_INFINITY, -1F, 1F,  "variable must be in the range of from -1.0 to 1.0, but it is Infinity." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Long.MIN_VALUE, Long.MIN_VALUE,             1L },
					{  null, Long.MIN_VALUE, Long.MIN_VALUE,             1L },
					{ "foo",            -1L,            -1L,             1L },
					{  null,            -1L,            -1L,             1L },
					{ "foo",             0L,            -1L,             1L },
					{  null,             0L,            -1L,             1L },
					{ "foo",             1L,            -1L,             1L },
					{  null,             1L,            -1L,             1L },
					{ "foo", Long.MAX_VALUE,            -1L, Long.MAX_VALUE },
					{  null, Long.MAX_VALUE,            -1L, Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Long.MIN_VALUE, -1L, 1L,      "foo must be in the range of from -1 to 1, but it is -9223372036854775808." },
					{  null, Long.MIN_VALUE, -1L, 1L, "variable must be in the range of from -1 to 1, but it is -9223372036854775808." },
					{ "foo",            -2L, -1L, 1L,                        "foo must be in the range of from -1 to 1, but it is -2." },
					{  null,            -2L, -1L, 1L,                   "variable must be in the range of from -1 to 1, but it is -2." },
					{ "foo",             2L, -1L, 1L,                         "foo must be in the range of from -1 to 1, but it is 2." },
					{  null,             2L, -1L, 1L,                    "variable must be in the range of from -1 to 1, but it is 2." },
					{ "foo", Long.MAX_VALUE, -1L, 1L,       "foo must be in the range of from -1 to 1, but it is 9223372036854775807." },
					{  null, Long.MAX_VALUE, -1L, 1L,  "variable must be in the range of from -1 to 1, but it is 9223372036854775807." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE, Integer.MIN_VALUE,                 1 },
					{  null, Integer.MIN_VALUE, Integer.MIN_VALUE,                 1 },
					{ "foo",                -1,                -1,                 1 },
					{  null,                -1,                -1,                 1 },
					{ "foo",                 0,                -1,                 1 },
					{  null,                 0,                -1,                 1 },
					{ "foo",                 1,                -1,                 1 },
					{  null,                 1,                -1,                 1 },
					{ "foo", Integer.MAX_VALUE,                -1, Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE,                -1, Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE, -1, 1,      "foo must be in the range of from -1 to 1, but it is -2147483648." },
					{  null, Integer.MIN_VALUE, -1, 1, "variable must be in the range of from -1 to 1, but it is -2147483648." },
					{ "foo",                -2, -1, 1,               "foo must be in the range of from -1 to 1, but it is -2." },
					{  null,                -2, -1, 1,          "variable must be in the range of from -1 to 1, but it is -2." },
					{ "foo",                 2, -1, 1,                "foo must be in the range of from -1 to 1, but it is 2." },
					{  null,                 2, -1, 1,           "variable must be in the range of from -1 to 1, but it is 2." },
					{ "foo", Integer.MAX_VALUE, -1, 1,       "foo must be in the range of from -1 to 1, but it is 2147483647." },
					{  null, Integer.MAX_VALUE, -1, 1,  "variable must be in the range of from -1 to 1, but it is 2147483647." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Short.MIN_VALUE, Short.MIN_VALUE,       (short) 1 },
					{  null, Short.MIN_VALUE, Short.MIN_VALUE,       (short) 1 },
					{ "foo",      (short) -1,      (short) -1,       (short) 1 },
					{  null,      (short) -1,      (short) -1,       (short) 1 },
					{ "foo",       (short) 0,      (short) -1,       (short) 1 },
					{  null,       (short) 0,      (short) -1,       (short) 1 },
					{ "foo",       (short) 1,      (short) -1,       (short) 1 },
					{  null,       (short) 1,      (short) -1,       (short) 1 },
					{ "foo", Short.MAX_VALUE,      (short) -1, Short.MAX_VALUE },
					{  null, Short.MAX_VALUE,      (short) -1, Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Short.MIN_VALUE, (short) -1, (short) 1,      "foo must be in the range of from -1 to 1, but it is -32768." },
					{  null, Short.MIN_VALUE, (short) -1, (short) 1, "variable must be in the range of from -1 to 1, but it is -32768." },
					{ "foo",      (short) -2, (short) -1, (short) 1,          "foo must be in the range of from -1 to 1, but it is -2." },
					{  null,      (short) -2, (short) -1, (short) 1,     "variable must be in the range of from -1 to 1, but it is -2." },
					{ "foo",       (short) 2, (short) -1, (short) 1,           "foo must be in the range of from -1 to 1, but it is 2." },
					{  null,       (short) 2, (short) -1, (short) 1,      "variable must be in the range of from -1 to 1, but it is 2." },
					{ "foo", Short.MAX_VALUE, (short) -1, (short) 1,       "foo must be in the range of from -1 to 1, but it is 32767." },
					{  null, Short.MAX_VALUE, (short) -1, (short) 1,  "variable must be in the range of from -1 to 1, but it is 32767." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", '0', '0', '9' },
					{  null, '0', '0', '9' },
					{ "foo", '9', '0', '9' },
					{  null, '9', '0', '9' },
					{ "foo", 'a', 'a', 'z' },
					{  null, 'a', 'a', 'z' },
					{ "foo", 'z', 'a', 'z' },
					{  null, 'z', 'a', 'z' },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", '0', 'a', 'z',      "foo must be in the range of from a to z, but it is 0." },
					{  null, '0', 'a', 'z', "variable must be in the range of from a to z, but it is 0." },
					{ "foo", 'a', '0', '9',      "foo must be in the range of from 0 to 9, but it is a." },
					{  null, 'a', '0', '9', "variable must be in the range of from 0 to 9, but it is a." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Byte.MIN_VALUE, Byte.MIN_VALUE,       (byte) 1 },
					{  null, Byte.MIN_VALUE, Byte.MIN_VALUE,       (byte) 1 },
					{ "foo",      (byte) -1,      (byte) -1,       (byte) 1 },
					{  null,      (byte) -1,      (byte) -1,       (byte) 1 },
					{ "foo",       (byte) 0,      (byte) -1,       (byte) 1 },
					{  null,       (byte) 0,      (byte) -1,       (byte) 1 },
					{ "foo",       (byte) 1,      (byte) -1,       (byte) 1 },
					{  null,       (byte) 1,      (byte) -1,       (byte) 1 },
					{ "foo", Byte.MAX_VALUE,      (byte) -1, Byte.MAX_VALUE },
					{  null, Byte.MAX_VALUE,      (byte) -1, Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueOutOfRangeWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Byte.MIN_VALUE, (byte) -1, (byte) 1,      "foo must be in the range of from -1 to 1, but it is -128." },
					{  null, Byte.MIN_VALUE, (byte) -1, (byte) 1, "variable must be in the range of from -1 to 1, but it is -128." },
					{ "foo",      (byte) -2, (byte) -1, (byte) 1,        "foo must be in the range of from -1 to 1, but it is -2." },
					{  null,      (byte) -2, (byte) -1, (byte) 1,   "variable must be in the range of from -1 to 1, but it is -2." },
					{ "foo",       (byte) 2, (byte) -1, (byte) 1,         "foo must be in the range of from -1 to 1, but it is 2." },
					{  null,       (byte) 2, (byte) -1, (byte) 1,    "variable must be in the range of from -1 to 1, but it is 2." },
					{ "foo", Byte.MAX_VALUE, (byte) -1, (byte) 1,       "foo must be in the range of from -1 to 1, but it is 127." },
					{  null, Byte.MAX_VALUE, (byte) -1, (byte) 1,  "variable must be in the range of from -1 to 1, but it is 127." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] comparableTypeValueInRange() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE, Integer.MIN_VALUE,                 1 },
					{  null, Integer.MIN_VALUE, Integer.MIN_VALUE,                 1 },
					{ "foo",                -1,                -1,                 1 },
					{  null,                -1,                -1,                 1 },
					{ "foo",                 0,                -1,                 1 },
					{  null,                 0,                -1,                 1 },
					{ "foo",                 1,                -1,                 1 },
					{  null,                 1,                -1,                 1 },
					{ "foo", Integer.MAX_VALUE,                -1, Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE,                -1, Integer.MAX_VALUE },
					{ "foo", Integer.MIN_VALUE,              null,                 1 },
					{  null, Integer.MIN_VALUE,              null,                 1 },
					{ "foo",                -1,              null,                 1 },
					{  null,                -1,              null,                 1 },
					{ "foo",                 0,              null,                 1 },
					{  null,                 0,              null,                 1 },
					{ "foo",                 1,              null,                 1 },
					{  null,                 1,              null,                 1 },
					{ "foo", Integer.MAX_VALUE,              null, Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE,              null, Integer.MAX_VALUE },
					{ "foo", Integer.MIN_VALUE, Integer.MIN_VALUE,              null },
					{  null, Integer.MIN_VALUE, Integer.MIN_VALUE,              null },
					{ "foo",                -1,                -1,              null },
					{  null,                -1,                -1,              null },
					{ "foo",                 0,                -1,              null },
					{  null,                 0,                -1,              null },
					{ "foo",                 1,                -1,              null },
					{  null,                 1,                -1,              null },
					{ "foo", Integer.MAX_VALUE,                -1,              null },
					{  null, Integer.MAX_VALUE,                -1,              null },
					{ "foo", Integer.MIN_VALUE,              null,              null },
					{  null, Integer.MIN_VALUE,              null,              null },
					{ "foo",                -1,              null,              null },
					{  null,                -1,              null,              null },
					{ "foo",                 0,              null,              null },
					{  null,                 0,              null,              null },
					{ "foo",                 1,              null,              null },
					{  null,                 1,              null,              null },
					{ "foo", Integer.MAX_VALUE,              null,              null },
					{  null, Integer.MAX_VALUE,              null,              null },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null, BigDecimal.ONE, BigDecimal.TEN,      "foo must be in the range of from 1 to 10, but it is null." },
					{  null, null, BigDecimal.ONE, BigDecimal.TEN, "variable must be in the range of from 1 to 10, but it is null." },
			};
		}// @formatter:on

	}
}
