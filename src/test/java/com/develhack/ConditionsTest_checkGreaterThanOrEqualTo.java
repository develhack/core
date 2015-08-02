package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkGreaterThanOrEqualTo {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_DoubleTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name,
			double value,
			double threshold) throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_DoubleTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			double value,
			double threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number, but it is NaN\\.")
	public void checkGreaterThanOrEqualTo_DoubleTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkGreaterThanOrEqualTo(null, 0D, Double.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_FloatTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name,
			float value, float threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "floatTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_FloatTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			float value,
			float threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be valid number, but it is NaN\\.")
	public void checkGreaterThanOrEqualTo_FloatTypeThresholdIsNaN_ThrowsException() throws Exception {
		Conditions.checkGreaterThanOrEqualTo(null, 0D, Float.NaN);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_LongTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name, long value,
			long threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_LongTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			long value, long threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_IntTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name, int value,
			int threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_IntTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name, int value,
			int threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_ShortTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name,
			short value, short threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "shortTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_ShortTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			short value,
			short threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_CharTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name, char value,
			char threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "charTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_CharTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			char value, char threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueGreaterThanOrEqualToThreshold")
	public void checkGreaterThanOrEqualTo_ByteTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(String name, byte value,
			byte threshold)
			throws Exception {

		assertEquals(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "byteTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkGreaterThanOrEqualTo_ByteTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(String name,
			byte value, byte threshold,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanOrEqualToThreshold")
	public <T extends Comparable<T>> void checkGreaterThanOrEqualTo_ComparableTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkGreaterThanOrEqualTo(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThanOrEqualTo_ComparableTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkGreaterThanOrEqualTo_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkGreaterThanOrEqualTo("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThanOrEqualTo_ComparableTypeValueIsNull_ThrowsException(String name,
			T value,
			T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualTo(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueGreaterThanOrEqualToThreshold")
	public <T extends Comparable<T>> void checkGreaterThanOrEqualToIfNonnull_ComparableTypeValueIsGreaterThanOrEqualToThreshold_ReturnsTheValue(
			String name, T value, T threshold) throws Exception {

		assertSame(Conditions.checkGreaterThanOrEqualToIfNonnull(name, value, threshold), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "intTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public <T extends Comparable<T>> void checkGreaterThanOrEqualToIfNonnull_ComparableTypeValueIsNotGreaterThanOrEqualToThreshold_ThrowsException(
			String name, T value, T threshold, String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkGreaterThanOrEqualToIfNonnull(name, value, threshold);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "threshold must be non-null\\.")
	public void checkGreaterThanOrEqualToIfNonnull_ComparableTypeThresholdIsNull_ThrowsException()
			throws Exception {

		Conditions.checkGreaterThanOrEqualToIfNonnull("foo", BigDecimal.ONE, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullValueWithExpectedExceptionMessage")
	public <T extends Comparable<T>> void checkGreaterThanOrEqualToIfNonnull_ComparableTypeValueIsNull_ReturnsNull(String name,
			T value,
			T threshold, String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkGreaterThanOrEqualToIfNonnull(name, value, threshold));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] doubleTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY },
					{  null, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY },
					{ "foo",         Double.MIN_VALUE, Double.NEGATIVE_INFINITY },
					{  null,         Double.MIN_VALUE, Double.NEGATIVE_INFINITY },
					{ "foo",                       0D,                    -0.1D },
					{  null,                       0D,                    -0.1D },
					{ "foo",                     0.1D,                     0.0D },
					{  null,                     0.1D,                     0.0D },
					{ "foo", Double.POSITIVE_INFINITY,         Double.MAX_VALUE },
					{  null, Double.POSITIVE_INFINITY,         Double.MAX_VALUE },
					{ "foo", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
					{  null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Double.NaN,                       0D,                  "foo must be greater than or equal to 0.0, but it is NaN." },
					{  null,               Double.NaN,                       0D,             "variable must be greater than or equal to 0.0, but it is NaN." },
					{ "foo",                       0D,                     0.1D,                  "foo must be greater than or equal to 0.1, but it is 0.0." },
					{  null,                       0D,                     0.1D,             "variable must be greater than or equal to 0.1, but it is 0.0." },
					{ "foo",                    -0.1D,                       0D,                 "foo must be greater than or equal to 0.0, but it is -0.1." },
					{  null,                    -0.1D,                       0D,            "variable must be greater than or equal to 0.0, but it is -0.1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo", Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY },
					{  null, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY },
					{ "foo", Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY },
					{  null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] floatTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",               Float.NaN,                      0F,                  "foo must be greater than or equal to 0.0, but it is NaN." },
					{  null,               Float.NaN,                      0F,             "variable must be greater than or equal to 0.0, but it is NaN." },
					{ "foo",                      0F,                    0.1F,                  "foo must be greater than or equal to 0.1, but it is 0.0." },
					{  null,                      0F,                    0.1F,             "variable must be greater than or equal to 0.1, but it is 0.0." },
					{ "foo",                   -0.1F,                      0F,                 "foo must be greater than or equal to 0.0, but it is -0.1." },
					{  null,                   -0.1F,                      0F,            "variable must be greater than or equal to 0.0, but it is -0.1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",      Long.MIN_VALUE,      Long.MIN_VALUE },
					{  null,      Long.MIN_VALUE,      Long.MIN_VALUE },
					{ "foo",      Long.MAX_VALUE,      Long.MAX_VALUE },
					{  null,      Long.MAX_VALUE,      Long.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",             0L,             1L,                                            "foo must be greater than or equal to 1, but it is 0." },
					{  null,             0L,             1L,                                       "variable must be greater than or equal to 1, but it is 0." },
					{ "foo",            -1L,             0L,                                           "foo must be greater than or equal to 0, but it is -1." },
					{  null,            -1L,             0L,                                      "variable must be greater than or equal to 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",     Integer.MIN_VALUE,     Integer.MIN_VALUE },
					{  null,     Integer.MIN_VALUE,     Integer.MIN_VALUE },
					{ "foo",     Integer.MAX_VALUE,     Integer.MAX_VALUE },
					{  null,     Integer.MAX_VALUE,     Integer.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] intTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",                 0,                 1,                          "foo must be greater than or equal to 1, but it is 0." },
					{  null,                 0,                 1,                     "variable must be greater than or equal to 1, but it is 0." },
					{ "foo",                -1,                 0,                         "foo must be greater than or equal to 0, but it is -1." },
					{  null,                -1,                 0,                    "variable must be greater than or equal to 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",               Short.MIN_VALUE,               Short.MIN_VALUE },
					{  null,               Short.MIN_VALUE,               Short.MIN_VALUE },
					{ "foo",               Short.MAX_VALUE,               Short.MAX_VALUE },
					{  null,               Short.MAX_VALUE,               Short.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] shortTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (short) 0,       (short) 1,                "foo must be greater than or equal to 1, but it is 0." },
					{  null,       (short) 0,       (short) 1,           "variable must be greater than or equal to 1, but it is 0." },
					{ "foo",      (short) -1,       (short) 0,               "foo must be greater than or equal to 0, but it is -1." },
					{  null,      (short) -1,       (short) 0,          "variable must be greater than or equal to 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ "foo", (char) (Character.MIN_VALUE + 1),              Character.MIN_VALUE },
					{  null, (char) (Character.MIN_VALUE + 1),              Character.MIN_VALUE },
					{ "foo",                         (char) 1,                         (char) 0 },
					{  null,                         (char) 1,                         (char) 0 },
					{ "foo",              Character.MAX_VALUE, (char) (Character.MAX_VALUE - 1) },
					{  null,              Character.MAX_VALUE, (char) (Character.MAX_VALUE - 1) },
					{ "foo",              Character.MIN_VALUE,              Character.MIN_VALUE },
					{  null,              Character.MIN_VALUE,              Character.MIN_VALUE },
					{ "foo",              Character.MAX_VALUE,              Character.MAX_VALUE },
					{  null,              Character.MAX_VALUE,              Character.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] charTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",            (char) 0,            (char) 1,                "foo must be greater than or equal to 1, but it is 0." },
					{  null,            (char) 0,            (char) 1,           "variable must be greater than or equal to 1, but it is 0." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueGreaterThanOrEqualToThreshold() {// @formatter:off
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
					{ "foo",              Byte.MIN_VALUE,              Byte.MIN_VALUE },
					{  null,              Byte.MIN_VALUE,              Byte.MIN_VALUE },
					{ "foo",              Byte.MAX_VALUE,              Byte.MAX_VALUE },
					{  null,              Byte.MAX_VALUE,              Byte.MAX_VALUE },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] byteTypeValueNotGreaterThanOrEqualToThresholdWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",       (byte) 0,       (byte) 1,            "foo must be greater than or equal to 1, but it is 0." },
					{  null,       (byte) 0,       (byte) 1,       "variable must be greater than or equal to 1, but it is 0." },
					{ "foo",      (byte) -1,       (byte) 0,           "foo must be greater than or equal to 0, but it is -1." },
					{  null,      (byte) -1,       (byte) 0,      "variable must be greater than or equal to 0, but it is -1." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nullValueWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null, BigDecimal.ONE,      "foo must be greater than or equal to 1, but it is null." },
					{  null, null, BigDecimal.ONE, "variable must be greater than or equal to 1, but it is null." },
			};
		}// @formatter:on
	}
}
