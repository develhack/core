package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkLessThanOrEqualTo {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_DoubleTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, double value,
			double threshold) throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_DoubleTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, double value,
			double threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number, but it is NaN\\.")
	public void checkLessThanOrEqualTo_DoubleTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkLessThanOrEqualTo(null, 0D, Double.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_FloatTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, float value,
			float threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_FloatTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, float value,
			float threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number, but it is NaN\\.")
	public void checkLessThanOrEqualTo_FloatTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkLessThanOrEqualTo(null, 0D, Float.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_LongTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, long value,
			long threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_LongTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, long value,
			long threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_IntTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, int value,
			int threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_IntTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, int value,
			int threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_ShortTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, short value,
			short threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_ShortTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, short value,
			short threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_CharTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, char value,
			char threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_CharTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, char value,
			char threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueLessThanOrEqualToThreshold")
	public void checkLessThanOrEqualTo_ByteTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(String name, byte value,
			byte threshold)
			throws Exception {

		assertEquals(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkLessThanOrEqualTo_ByteTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(String name, byte value,
			byte threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanOrEqualToThreshold")
	public <T extends Comparable<T>> void checkLessThanOrEqualTo_ComparableTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkLessThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThanOrEqualTo_ComparableTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkLessThanOrEqualTo_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkLessThanOrEqualTo("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThanOrEqualTo_ComparableTypeValueIsNull_ThrowsException(String name, T value,
			T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueLessThanOrEqualToThreshold")
	public <T extends Comparable<T>> void checkLessThanOrEqualToIfNonnull_ComparableTypeValueIsLessThanOrEqualToThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkLessThanOrEqualToIfNonnull(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkLessThanOrEqualToIfNonnull_ComparableTypeValueIsNotLessThanOrEqualToThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkLessThanOrEqualToIfNonnull(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkLessThanOrEqualToIfNonnull_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkLessThanOrEqualToIfNonnull("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public <T extends Comparable<T>> void checkLessThanOrEqualToIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name,
			T value,
			T threshold, String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkLessThanOrEqualToIfNonnull(name, value, threshold));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeValueLessThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.MIN_VALUE },
					{  null, Double.NEGATIVE_INFINITY, Double.MIN_VALUE },
					{ "foo",                    -0.1D,                       0D },
					{  null,                    -0.1D,                       0D },
					{ "foo",                     0.0D,                     0.1D },
					{  null,                     0.0D,                     0.1D },
					{ "foo",         Double.MAX_VALUE, Double.POSITIVE_INFINITY },
					{  null,         Double.MAX_VALUE, Double.POSITIVE_INFINITY },
					{ "foo", Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY },
					{  null, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY },
					{ "foo", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
					{  null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Double.NaN,                       0D,                  "foo must be less than or equal to 0.0, but it is NaN." },
					{  null,               Double.NaN,                       0D,             "variable must be less than or equal to 0.0, but it is NaN." },
					{ "foo",                     0.1D,                       0D,                  "foo must be less than or equal to 0.0, but it is 0.1." },
					{  null,                     0.1D,                       0D,             "variable must be less than or equal to 0.0, but it is 0.1." },
					{ "foo",                       0D,                    -0.1D,                 "foo must be less than or equal to -0.1, but it is 0.0." },
					{  null,                       0D,                    -0.1D,            "variable must be less than or equal to -0.1, but it is 0.0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueLessThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo", Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY },
					{  null, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY },
					{ "foo", Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY },
					{  null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Float.NaN,                      0F,                  "foo must be less than or equal to 0.0, but it is NaN." },
					{  null,               Float.NaN,                      0F,             "variable must be less than or equal to 0.0, but it is NaN." },
					{ "foo",                    0.1F,                      0F,                  "foo must be less than or equal to 0.0, but it is 0.1." },
					{  null,                    0.1F,                      0F,             "variable must be less than or equal to 0.0, but it is 0.1." },
					{ "foo",                      0F,                   -0.1F,                 "foo must be less than or equal to -0.1, but it is 0.0." },
					{  null,                      0F,                   -0.1F,            "variable must be less than or equal to -0.1, but it is 0.0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueLessThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",      Long.MIN_VALUE,      Long.MIN_VALUE },
					{  null,      Long.MIN_VALUE,      Long.MIN_VALUE },
					{ "foo",      Long.MAX_VALUE,      Long.MAX_VALUE },
					{  null,      Long.MAX_VALUE,      Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",             1L,             0L,                                            "foo must be less than or equal to 0, but it is 1." },
					{  null,             1L,             0L,                                       "variable must be less than or equal to 0, but it is 1." },
					{ "foo",             0L,            -1L,                                           "foo must be less than or equal to -1, but it is 0." },
					{  null,             0L,            -1L,                                      "variable must be less than or equal to -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueLessThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",     Integer.MIN_VALUE,     Integer.MIN_VALUE },
					{  null,     Integer.MIN_VALUE,     Integer.MIN_VALUE },
					{ "foo",     Integer.MAX_VALUE,     Integer.MAX_VALUE },
					{  null,     Integer.MAX_VALUE,     Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",                 1,                 0,                          "foo must be less than or equal to 0, but it is 1." },
					{  null,                 1,                 0,                     "variable must be less than or equal to 0, but it is 1." },
					{ "foo",                 0,                -1,                         "foo must be less than or equal to -1, but it is 0." },
					{  null,                 0,                -1,                    "variable must be less than or equal to -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueLessThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",               Short.MIN_VALUE,               Short.MIN_VALUE },
					{  null,               Short.MIN_VALUE,               Short.MIN_VALUE },
					{ "foo",               Short.MAX_VALUE,               Short.MAX_VALUE },
					{  null,               Short.MAX_VALUE,               Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (short) 1,       (short) 0,                "foo must be less than or equal to 0, but it is 1." },
					{  null,       (short) 1,       (short) 0,           "variable must be less than or equal to 0, but it is 1." },
					{ "foo",       (short) 0,      (short) -1,               "foo must be less than or equal to -1, but it is 0." },
					{  null,       (short) 0,      (short) -1,          "variable must be less than or equal to -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueLessThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo",              Character.MIN_VALUE, (char) (Character.MIN_VALUE + 1) },
					{  null,              Character.MIN_VALUE, (char) (Character.MIN_VALUE + 1) },
					{ "foo",                         (char) 0,                         (char) 1 },
					{  null,                         (char) 0,                         (char) 1 },
					{ "foo", (char) (Character.MAX_VALUE - 1),              Character.MAX_VALUE },
					{  null, (char) (Character.MAX_VALUE - 1),              Character.MAX_VALUE },
					{ "foo",              Character.MIN_VALUE,              Character.MIN_VALUE },
					{  null,              Character.MIN_VALUE,              Character.MIN_VALUE },
					{ "foo",              Character.MAX_VALUE,              Character.MAX_VALUE },
					{  null,              Character.MAX_VALUE,              Character.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",            (char) 1,            (char) 0,                "foo must be less than or equal to 0, but it is 1." },
					{  null,            (char) 1,            (char) 0,           "variable must be less than or equal to 0, but it is 1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueLessThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",              Byte.MIN_VALUE,              Byte.MIN_VALUE },
					{  null,              Byte.MIN_VALUE,              Byte.MIN_VALUE },
					{ "foo",              Byte.MAX_VALUE,              Byte.MAX_VALUE },
					{  null,              Byte.MAX_VALUE,              Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueNotLessThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (byte) 1,       (byte) 0,            "foo must be less than or equal to 0, but it is 1." },
					{  null,       (byte) 1,       (byte) 0,       "variable must be less than or equal to 0, but it is 1." },
					{ "foo",       (byte) 0,      (byte) -1,           "foo must be less than or equal to -1, but it is 0." },
					{  null,       (byte) 0,      (byte) -1,      "variable must be less than or equal to -1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null, BigDecimal.ONE,      "foo must be less than or equal to 1, but it is null." },
					{  null, null, BigDecimal.ONE, "variable must be less than or equal to 1, but it is null." },
			};
		}// @formatter:on
	}
}
