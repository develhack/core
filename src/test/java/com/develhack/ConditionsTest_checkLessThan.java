package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkLessThan {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueLessThanThreshold")
	public void checkLessThan_DoubleTypeValueIsLessThanThreshold_ReturnsTheValue(String name, double value,
			double threshold) throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_DoubleTypeValueIsNotLessThanThreshold_ThrowsException(String name, double value,
			double threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number\\.")
	public void checkLessThan_DoubleTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkLessThan(null, 0D, Double.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueLessThanThreshold")
	public void checkLessThan_FloatTypeValueIsLessThanThreshold_ReturnsTheValue(String name, float value, float threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_FloatTypeValueIsNotLessThanThreshold_ThrowsException(String name, float value,
			float threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number\\.")
	public void checkLessThan_FloatTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkLessThan(null, 0D, Float.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueLessThanThreshold")
	public void checkLessThan_LongTypeValueIsLessThanThreshold_ReturnsTheValue(String name, long value, long threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_LongTypeValueIsNotLessThanThreshold_ThrowsException(String name, long value, long threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanThreshold")
	public void checkLessThan_IntTypeValueIsLessThanThreshold_ReturnsTheValue(String name, int value, int threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_IntTypeValueIsNotLessThanThreshold_ThrowsException(String name, int value, int threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueLessThanThreshold")
	public void checkLessThan_ShortTypeValueIsLessThanThreshold_ReturnsTheValue(String name, short value, short threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_ShortTypeValueIsNotLessThanThreshold_ThrowsException(String name, short value,
			short threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueLessThanThreshold")
	public void checkLessThan_CharTypeValueIsLessThanThreshold_ReturnsTheValue(String name, char value, char threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_CharTypeValueIsNotLessThanThreshold_ThrowsException(String name, char value, char threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueLessThanThreshold")
	public void checkLessThan_ByteTypeValueIsLessThanThreshold_ReturnsTheValue(String name, byte value, byte threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThan_ByteTypeValueIsNotLessThanThreshold_ThrowsException(String name, byte value, byte threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanThreshold")
	public <T extends Comparable<T>> void checkLessThan_ComparableTypeValueIsLessThanThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkLessThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThan_ComparableTypeValueIsNotLessThanThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkLessThan_ComparableTypeThresholdIsNull_ThrowsException() throws Exception {

		Conditions.checkLessThan("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThan_ComparableTypeValueIsNull_ThrowsException(String name, T value,
			T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanThreshold")
	public <T extends Comparable<T>> void checkLessThanIfNonnull_ComparableTypeValueIsLessThanThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkLessThanIfNonnull(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThanIfNonnull_ComparableTypeValueIsNotLessThanThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanIfNonnull(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkLessThanIfNonnull_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkLessThanIfNonnull("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public <T extends Comparable<T>> void checkLessThanIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, T value,
			T threshold, String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkLessThanIfNonnull(name, value, threshold));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.MIN_VALUE },
					{  null, Double.NEGATIVE_INFINITY, Double.MIN_VALUE },
					{ "foo",                    -0.1D,                       0D },
					{  null,                    -0.1D,                       0D },
					{ "foo",                     0.0D,                     0.1D },
					{  null,                     0.0D,                     0.1D },
					{ "foo",         Double.MAX_VALUE, Double.POSITIVE_INFINITY },
					{  null,         Double.MAX_VALUE, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,      "foo must be less than -Infinity, but it is -Infinity." },
					{  null, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, "variable must be less than -Infinity, but it is -Infinity." },
					{ "foo", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,        "foo must be less than Infinity, but it is Infinity." },
					{  null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,   "variable must be less than Infinity, but it is Infinity." },
					{ "foo",               Double.NaN,                       0D,                  "foo must be less than 0.0, but it is NaN." },
					{  null,               Double.NaN,                       0D,             "variable must be less than 0.0, but it is NaN." },
					{ "foo",                     0.1D,                       0D,                  "foo must be less than 0.0, but it is 0.1." },
					{  null,                     0.1D,                       0D,             "variable must be less than 0.0, but it is 0.1." },
					{ "foo",                       0D,                    -0.1D,                 "foo must be less than -0.1, but it is 0.0." },
					{  null,                       0D,                    -0.1D,            "variable must be less than -0.1, but it is 0.0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY,         Float.MIN_VALUE },
					{  null, Float.NEGATIVE_INFINITY,         Float.MIN_VALUE },
					{ "foo",                   -1.1F,                     -1F },
					{  null,                   -1.1F,                     -1F },
					{ "foo",                   -0.1F,                      0F },
					{  null,                   -0.1F,                      0F },
					{ "foo",                    0.9F,                      1F },
					{  null,                    0.9F,                      1F },
					{ "foo",         Float.MAX_VALUE, Float.POSITIVE_INFINITY },
					{  null,         Float.MAX_VALUE, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY,      "foo must be less than -Infinity, but it is -Infinity." },
					{  null, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, "variable must be less than -Infinity, but it is -Infinity." },
					{ "foo", Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,        "foo must be less than Infinity, but it is Infinity." },
					{  null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,   "variable must be less than Infinity, but it is Infinity." },
					{ "foo",               Float.NaN,                      0F,                  "foo must be less than 0.0, but it is NaN." },
					{  null,               Float.NaN,                      0F,             "variable must be less than 0.0, but it is NaN." },
					{ "foo",                    0.1F,                      0F,                  "foo must be less than 0.0, but it is 0.1." },
					{  null,                    0.1F,                      0F,             "variable must be less than 0.0, but it is 0.1." },
					{ "foo",                      0F,                   -0.1F,                 "foo must be less than -0.1, but it is 0.0." },
					{  null,                      0F,                   -0.1F,            "variable must be less than -0.1, but it is 0.0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",      Long.MIN_VALUE, Long.MIN_VALUE + 1L },
					{  null,      Long.MIN_VALUE, Long.MIN_VALUE + 1L },
					{ "foo",                 -2L,                 -1L },
					{  null,                 -2L,                 -1L },
					{ "foo",                 -1L,                  0L },
					{  null,                 -1L,                  0L },
					{ "foo",                  0L,                  1L },
					{  null,                  0L,                  1L },
					{ "foo", Long.MAX_VALUE - 1L,      Long.MAX_VALUE },
					{  null, Long.MAX_VALUE - 1L,      Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Long.MIN_VALUE, Long.MIN_VALUE,      "foo must be less than -9223372036854775808, but it is -9223372036854775808." },
					{  null, Long.MIN_VALUE, Long.MIN_VALUE, "variable must be less than -9223372036854775808, but it is -9223372036854775808." },
					{ "foo", Long.MAX_VALUE, Long.MAX_VALUE,        "foo must be less than 9223372036854775807, but it is 9223372036854775807." },
					{  null, Long.MAX_VALUE, Long.MAX_VALUE,   "variable must be less than 9223372036854775807, but it is 9223372036854775807." },
					{ "foo",             1L,             0L,                                            "foo must be less than 0, but it is 1." },
					{  null,             1L,             0L,                                       "variable must be less than 0, but it is 1." },
					{ "foo",             0L,            -1L,                                           "foo must be less than -1, but it is 0." },
					{  null,             0L,            -1L,                                      "variable must be less than -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",     Integer.MIN_VALUE, Integer.MIN_VALUE + 1 },
					{  null,     Integer.MIN_VALUE, Integer.MIN_VALUE + 1 },
					{ "foo",                    -2,                    -1 },
					{  null,                    -2,                    -1 },
					{ "foo",                    -1,                     0 },
					{  null,                    -1,                     0 },
					{ "foo",                     0,                     1 },
					{  null,                     0,                     1 },
					{ "foo", Integer.MAX_VALUE - 1,     Integer.MAX_VALUE },
					{  null, Integer.MAX_VALUE - 1,     Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE, Integer.MIN_VALUE,      "foo must be less than -2147483648, but it is -2147483648." },
					{  null, Integer.MIN_VALUE, Integer.MIN_VALUE, "variable must be less than -2147483648, but it is -2147483648." },
					{ "foo", Integer.MAX_VALUE, Integer.MAX_VALUE,        "foo must be less than 2147483647, but it is 2147483647." },
					{  null, Integer.MAX_VALUE, Integer.MAX_VALUE,   "variable must be less than 2147483647, but it is 2147483647." },
					{ "foo",                 1,                 0,                          "foo must be less than 0, but it is 1." },
					{  null,                 1,                 0,                     "variable must be less than 0, but it is 1." },
					{ "foo",                 0,                -1,                         "foo must be less than -1, but it is 0." },
					{  null,                 0,                -1,                    "variable must be less than -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",               Short.MIN_VALUE, (short) (Short.MIN_VALUE + 1) },
					{  null,               Short.MIN_VALUE, (short) (Short.MIN_VALUE + 1) },
					{ "foo",                    (short) -2,                    (short) -1 },
					{  null,                    (short) -2,                    (short) -1 },
					{ "foo",                    (short) -1,                     (short) 0 },
					{  null,                    (short) -1,                     (short) 0 },
					{ "foo",                     (short) 0,                     (short) 1 },
					{  null,                     (short) 0,                     (short) 1 },
					{ "foo", (short) (Short.MAX_VALUE - 1),               Short.MAX_VALUE },
					{  null, (short) (Short.MAX_VALUE - 1),               Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Short.MIN_VALUE, Short.MIN_VALUE,      "foo must be less than -32768, but it is -32768." },
					{  null, Short.MIN_VALUE, Short.MIN_VALUE, "variable must be less than -32768, but it is -32768." },
					{ "foo", Short.MAX_VALUE, Short.MAX_VALUE,        "foo must be less than 32767, but it is 32767." },
					{  null, Short.MAX_VALUE, Short.MAX_VALUE,   "variable must be less than 32767, but it is 32767." },
					{ "foo",       (short) 1,       (short) 0,                "foo must be less than 0, but it is 1." },
					{  null,       (short) 1,       (short) 0,           "variable must be less than 0, but it is 1." },
					{ "foo",       (short) 0,      (short) -1,               "foo must be less than -1, but it is 0." },
					{  null,       (short) 0,      (short) -1,          "variable must be less than -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",              Character.MIN_VALUE, (char) (Character.MIN_VALUE + 1) },
					{  null,              Character.MIN_VALUE, (char) (Character.MIN_VALUE + 1) },
					{ "foo",                         (char) 0,                         (char) 1 },
					{  null,                         (char) 0,                         (char) 1 },
					{ "foo", (char) (Character.MAX_VALUE - 1),              Character.MAX_VALUE },
					{  null, (char) (Character.MAX_VALUE - 1),              Character.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Character.MIN_VALUE, Character.MIN_VALUE,                "foo must be less than 0, but it is 0." },
					{  null, Character.MIN_VALUE, Character.MIN_VALUE,           "variable must be less than 0, but it is 0." },
					{ "foo", Character.MAX_VALUE, Character.MAX_VALUE,        "foo must be less than 65535, but it is 65535." },
					{  null, Character.MAX_VALUE, Character.MAX_VALUE,   "variable must be less than 65535, but it is 65535." },
					{ "foo",            (char) 1,            (char) 0,                "foo must be less than 0, but it is 1." },
					{  null,            (char) 1,            (char) 0,           "variable must be less than 0, but it is 1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",              Byte.MIN_VALUE, (byte) (Byte.MIN_VALUE + 1) },
					{  null,              Byte.MIN_VALUE, (byte) (Byte.MIN_VALUE + 1) },
					{ "foo",                   (byte) -2,                   (byte) -1 },
					{  null,                   (byte) -2,                   (byte) -1 },
					{ "foo",                   (byte) -1,                    (byte) 0 },
					{  null,                   (byte) -1,                    (byte) 0 },
					{ "foo",                    (byte) 0,                    (byte) 1 },
					{  null,                    (byte) 0,                    (byte) 1 },
					{ "foo", (byte) (Byte.MAX_VALUE - 1),              Byte.MAX_VALUE },
					{  null, (byte) (Byte.MAX_VALUE - 1),              Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueNotLessThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Byte.MIN_VALUE, Byte.MIN_VALUE,      "foo must be less than -128, but it is -128." },
					{  null, Byte.MIN_VALUE, Byte.MIN_VALUE, "variable must be less than -128, but it is -128." },
					{ "foo", Byte.MAX_VALUE, Byte.MAX_VALUE,        "foo must be less than 127, but it is 127." },
					{  null, Byte.MAX_VALUE, Byte.MAX_VALUE,   "variable must be less than 127, but it is 127." },
					{ "foo",       (byte) 1,       (byte) 0,            "foo must be less than 0, but it is 1." },
					{  null,       (byte) 1,       (byte) 0,       "variable must be less than 0, but it is 1." },
					{ "foo",       (byte) 0,      (byte) -1,           "foo must be less than -1, but it is 0." },
					{  null,       (byte) 0,      (byte) -1,      "variable must be less than -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null, BigDecimal.ONE,      "foo must be less than 1, but it is null." },
					{  null, null, BigDecimal.ONE, "variable must be less than 1, but it is null." },
			};
		}// @formatter:on
	}
}
