package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkGreaterThan {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueGreaterThanThreshold")
	public void checkGreaterThan_DoubleTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, double value,
			double threshold) throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_DoubleTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, double value,
			double threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number\\.")
	public void checkGreaterThan_DoubleTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkGreaterThan(null, 0D, Double.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueGreaterThanThreshold")
	public void checkGreaterThan_FloatTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, float value, float threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_FloatTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, float value,
			float threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number\\.")
	public void checkGreaterThan_FloatTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkGreaterThan(null, 0D, Float.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueGreaterThanThreshold")
	public void checkGreaterThan_LongTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, long value, long threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_LongTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, long value, long threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanThreshold")
	public void checkGreaterThan_IntTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, int value, int threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_IntTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, int value, int threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueGreaterThanThreshold")
	public void checkGreaterThan_ShortTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, short value, short threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_ShortTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, short value,
			short threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueGreaterThanThreshold")
	public void checkGreaterThan_CharTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, char value, char threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_CharTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, char value, char threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueGreaterThanThreshold")
	public void checkGreaterThan_ByteTypeValueIsGreaterThanThreshold_ReturnsTheValue(String name, byte value, byte threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThan_ByteTypeValueIsNotGreaterThanThreshold_ThrowsException(String name, byte value, byte threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanThreshold")
	public <T extends Comparable<T>> void checkGreaterThan_ComparableTypeValueIsGreaterThanThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkGreaterThan(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThan_ComparableTypeValueIsNotGreaterThanThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkGreaterThan_ComparableTypeThresholdIsNull_ThrowsException() throws Exception {

		Conditions.checkGreaterThan("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThan_ComparableTypeValueIsNull_ThrowsException(String name, T value,
			T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThan(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanThreshold")
	public <T extends Comparable<T>> void checkGreaterThanIfNonnull_ComparableTypeValueIsGreaterThanThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkGreaterThanIfNonnull(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThanIfNonnull_ComparableTypeValueIsNotGreaterThanThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanIfNonnull(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkGreaterThanIfNonnull_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkGreaterThanIfNonnull("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public <T extends Comparable<T>> void checkGreaterThanIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name, T value,
			T threshold, String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkGreaterThanIfNonnull(name, value, threshold));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",         Double.MIN_VALUE, Double.NEGATIVE_INFINITY },
					{  null,         Double.MIN_VALUE, Double.NEGATIVE_INFINITY },
					{ "foo",                       0D,                    -0.1D },
					{  null,                       0D,                    -0.1D },
					{ "foo",                     0.1D,                     0.0D },
					{  null,                     0.1D,                     0.0D },
					{ "foo", Double.POSITIVE_INFINITY,         Double.MAX_VALUE },
					{  null, Double.POSITIVE_INFINITY,         Double.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,      "foo must be greater than -Infinity, but it is -Infinity." },
					{  null, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, "variable must be greater than -Infinity, but it is -Infinity." },
					{ "foo", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,        "foo must be greater than Infinity, but it is Infinity." },
					{  null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,   "variable must be greater than Infinity, but it is Infinity." },
					{ "foo",               Double.NaN,                       0D,                  "foo must be greater than 0.0, but it is NaN." },
					{  null,               Double.NaN,                       0D,             "variable must be greater than 0.0, but it is NaN." },
					{ "foo",                       0D,                     0.1D,                  "foo must be greater than 0.1, but it is 0.0." },
					{  null,                       0D,                     0.1D,             "variable must be greater than 0.1, but it is 0.0." },
					{ "foo",                    -0.1D,                       0D,                 "foo must be greater than 0.0, but it is -0.1." },
					{  null,                    -0.1D,                       0D,            "variable must be greater than 0.0, but it is -0.1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",         Float.MIN_VALUE, Float.NEGATIVE_INFINITY },
					{  null,         Float.MIN_VALUE, Float.NEGATIVE_INFINITY },
					{ "foo",                     -1F,                   -1.1F },
					{  null,                     -1F,                   -1.1F },
					{ "foo",                      0F,                   -0.1F },
					{  null,                      0F,                   -0.1F },
					{ "foo",                      1F,                    0.9F },
					{  null,                      1F,                    0.9F },
					{ "foo", Float.POSITIVE_INFINITY,         Float.MAX_VALUE },
					{  null, Float.POSITIVE_INFINITY,         Float.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY,      "foo must be greater than -Infinity, but it is -Infinity." },
					{  null, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, "variable must be greater than -Infinity, but it is -Infinity." },
					{ "foo", Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,        "foo must be greater than Infinity, but it is Infinity." },
					{  null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,   "variable must be greater than Infinity, but it is Infinity." },
					{ "foo",               Float.NaN,                      0F,                  "foo must be greater than 0.0, but it is NaN." },
					{  null,               Float.NaN,                      0F,             "variable must be greater than 0.0, but it is NaN." },
					{ "foo",                      0F,                    0.1F,                  "foo must be greater than 0.1, but it is 0.0." },
					{  null,                      0F,                    0.1F,             "variable must be greater than 0.1, but it is 0.0." },
					{ "foo",                   -0.1F,                      0F,                 "foo must be greater than 0.0, but it is -0.1." },
					{  null,                   -0.1F,                      0F,            "variable must be greater than 0.0, but it is -0.1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Long.MIN_VALUE + 1L,      Long.MIN_VALUE },
					{  null, Long.MIN_VALUE + 1L,      Long.MIN_VALUE },
					{ "foo",                 -1L,                 -2L },
					{  null,                 -1L,                 -2L },
					{ "foo",                  0L,                 -1L },
					{  null,                  0L,                 -1L },
					{ "foo",                  1L,                  0L },
					{  null,                  1L,                  0L },
					{ "foo",      Long.MAX_VALUE, Long.MAX_VALUE - 1L },
					{  null,      Long.MAX_VALUE, Long.MAX_VALUE - 1L },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Long.MIN_VALUE, Long.MIN_VALUE,      "foo must be greater than -9223372036854775808, but it is -9223372036854775808." },
					{  null, Long.MIN_VALUE, Long.MIN_VALUE, "variable must be greater than -9223372036854775808, but it is -9223372036854775808." },
					{ "foo", Long.MAX_VALUE, Long.MAX_VALUE,        "foo must be greater than 9223372036854775807, but it is 9223372036854775807." },
					{  null, Long.MAX_VALUE, Long.MAX_VALUE,   "variable must be greater than 9223372036854775807, but it is 9223372036854775807." },
					{ "foo",             0L,             1L,                                            "foo must be greater than 1, but it is 0." },
					{  null,             0L,             1L,                                       "variable must be greater than 1, but it is 0." },
					{ "foo",            -1L,             0L,                                           "foo must be greater than 0, but it is -1." },
					{  null,            -1L,             0L,                                      "variable must be greater than 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE + 1,     Integer.MIN_VALUE },
					{  null, Integer.MIN_VALUE + 1,     Integer.MIN_VALUE },
					{ "foo",                    -1,                    -2 },
					{  null,                    -1,                    -2 },
					{ "foo",                     0,                    -1 },
					{  null,                     0,                    -1 },
					{ "foo",                     1,                     0 },
					{  null,                     1,                     0 },
					{ "foo",     Integer.MAX_VALUE, Integer.MAX_VALUE - 1 },
					{  null,     Integer.MAX_VALUE, Integer.MAX_VALUE - 1 },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Integer.MIN_VALUE, Integer.MIN_VALUE,      "foo must be greater than -2147483648, but it is -2147483648." },
					{  null, Integer.MIN_VALUE, Integer.MIN_VALUE, "variable must be greater than -2147483648, but it is -2147483648." },
					{ "foo", Integer.MAX_VALUE, Integer.MAX_VALUE,        "foo must be greater than 2147483647, but it is 2147483647." },
					{  null, Integer.MAX_VALUE, Integer.MAX_VALUE,   "variable must be greater than 2147483647, but it is 2147483647." },
					{ "foo",                 0,                 1,                          "foo must be greater than 1, but it is 0." },
					{  null,                 0,                 1,                     "variable must be greater than 1, but it is 0." },
					{ "foo",                -1,                 0,                         "foo must be greater than 0, but it is -1." },
					{  null,                -1,                 0,                    "variable must be greater than 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", (short) (Short.MIN_VALUE + 1),               Short.MIN_VALUE },
					{  null, (short) (Short.MIN_VALUE + 1),               Short.MIN_VALUE },
					{ "foo",                    (short) -1,                    (short) -2 },
					{  null,                    (short) -1,                    (short) -2 },
					{ "foo",                     (short) 0,                    (short) -1 },
					{  null,                     (short) 0,                    (short) -1 },
					{ "foo",                     (short) 1,                     (short) 0 },
					{  null,                     (short) 1,                     (short) 0 },
					{ "foo",               Short.MAX_VALUE, (short) (Short.MAX_VALUE - 1) },
					{  null,               Short.MAX_VALUE, (short) (Short.MAX_VALUE - 1) },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Short.MIN_VALUE, Short.MIN_VALUE,      "foo must be greater than -32768, but it is -32768." },
					{  null, Short.MIN_VALUE, Short.MIN_VALUE, "variable must be greater than -32768, but it is -32768." },
					{ "foo", Short.MAX_VALUE, Short.MAX_VALUE,        "foo must be greater than 32767, but it is 32767." },
					{  null, Short.MAX_VALUE, Short.MAX_VALUE,   "variable must be greater than 32767, but it is 32767." },
					{ "foo",       (short) 0,       (short) 1,                "foo must be greater than 1, but it is 0." },
					{  null,       (short) 0,       (short) 1,           "variable must be greater than 1, but it is 0." },
					{ "foo",      (short) -1,       (short) 0,               "foo must be greater than 0, but it is -1." },
					{  null,      (short) -1,       (short) 0,          "variable must be greater than 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", (char) (Character.MIN_VALUE + 1),              Character.MIN_VALUE },
					{  null, (char) (Character.MIN_VALUE + 1),              Character.MIN_VALUE },
					{ "foo",                         (char) 1,                         (char) 0 },
					{  null,                         (char) 1,                         (char) 0 },
					{ "foo",              Character.MAX_VALUE, (char) (Character.MAX_VALUE - 1) },
					{  null,              Character.MAX_VALUE, (char) (Character.MAX_VALUE - 1) },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Character.MIN_VALUE, Character.MIN_VALUE,                "foo must be greater than 0, but it is 0." },
					{  null, Character.MIN_VALUE, Character.MIN_VALUE,           "variable must be greater than 0, but it is 0." },
					{ "foo", Character.MAX_VALUE, Character.MAX_VALUE,        "foo must be greater than 65535, but it is 65535." },
					{  null, Character.MAX_VALUE, Character.MAX_VALUE,   "variable must be greater than 65535, but it is 65535." },
					{ "foo",            (char) 0,            (char) 1,                "foo must be greater than 1, but it is 0." },
					{  null,            (char) 0,            (char) 1,           "variable must be greater than 1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", (byte) (Byte.MIN_VALUE + 1),              Byte.MIN_VALUE },
					{  null, (byte) (Byte.MIN_VALUE + 1),              Byte.MIN_VALUE },
					{ "foo",                   (byte) -1,                   (byte) -2 },
					{  null,                   (byte) -1,                   (byte) -2 },
					{ "foo",                    (byte) 0,                   (byte) -1 },
					{  null,                    (byte) 0,                   (byte) -1 },
					{ "foo",                    (byte) 1,                    (byte) 0 },
					{  null,                    (byte) 1,                    (byte) 0 },
					{ "foo",              Byte.MAX_VALUE, (byte) (Byte.MAX_VALUE - 1) },
					{  null,              Byte.MAX_VALUE, (byte) (Byte.MAX_VALUE - 1) },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueNotGreaterThanThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Byte.MIN_VALUE, Byte.MIN_VALUE,      "foo must be greater than -128, but it is -128." },
					{  null, Byte.MIN_VALUE, Byte.MIN_VALUE, "variable must be greater than -128, but it is -128." },
					{ "foo", Byte.MAX_VALUE, Byte.MAX_VALUE,        "foo must be greater than 127, but it is 127." },
					{  null, Byte.MAX_VALUE, Byte.MAX_VALUE,   "variable must be greater than 127, but it is 127." },
					{ "foo",       (byte) 0,       (byte) 1,            "foo must be greater than 1, but it is 0." },
					{  null,       (byte) 0,       (byte) 1,       "variable must be greater than 1, but it is 0." },
					{ "foo",      (byte) -1,       (byte) 0,           "foo must be greater than 0, but it is -1." },
					{  null,      (byte) -1,       (byte) 0,      "variable must be greater than 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null, BigDecimal.ONE,      "foo must be greater than 1, but it is null." },
					{  null, null, BigDecimal.ONE, "variable must be greater than 1, but it is null." },
			};
		}// @formatter:on
	}
}
