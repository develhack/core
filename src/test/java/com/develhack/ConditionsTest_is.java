package com.develhack;

import static org.testng.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_is {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "equivalentObjectsPair")
	public void isEqual_ArgumentsAreEquivalent_ReturnsTrue(Object a, Object b) throws Exception {
		assertTrue(Conditions.isEqual(a, b));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "inequivalentObjectsPair")
	public void isEqual_ArgumentsAreInequivalent_ReturnsFalse(Object a, Object b) throws Exception {
		assertFalse(Conditions.isEqual(a, b));
	}

	@Test
	public void isEqual_ArgumentsAreBothNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isEqual(null, null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "equivalentObjectsPair")
	public void isEqualAndNonNull_ArgumentsAreEquivalent_ReturnsTrue(Object a, Object b) throws Exception {
		assertTrue(Conditions.isEqualAndNonNull(a, b));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "inequivalentObjectsPair")
	public void isEqualAndNonNull_ArgumentsAreInequivalent_ReturnsFalse(Object a, Object b) throws Exception {
		assertFalse(Conditions.isEqualAndNonNull(a, b));
	}

	@Test
	public void isEqualAndNonNull_ArgumentsAreBothNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isEqualAndNonNull(null, null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "arrayContainingNull")
	public void isContainingNull_ArrayTypeValueContainsNull_ReturnsTrue(Object[] value) throws Exception {
		assertTrue(Conditions.isContainingNull(value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "arrayNotContainingNull")
	public void isContainingNull_ArrayTypeValueNotContainsNull_ReturnsFalse(Object[] value) throws Exception {
		assertFalse(Conditions.isContainingNull(value));
	}

	@Test
	public void isContainingNull_ArrayTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isContainingNull((Object[]) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "arrayContainingNull")
	public void isContainingNull_CollectionTypeValueContainsNull_ReturnsTrue(Object[] value) throws Exception {
		assertTrue(Conditions.isContainingNull(Arrays.asList(value)));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "arrayNotContainingNull")
	public void isContainingNull_CollectionTypeValueNotContainsNull_ReturnsFalse(Object[] value) throws Exception {
		assertFalse(Conditions.isContainingNull(Arrays.asList(value)));
	}

	@Test
	public void isContainingNull_CollectionTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isContainingNull((Collection<Object>) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCharSequence")
	public void isEmpty_CharSequenceTypeValueIsEmpty_ReturnsTrue(CharSequence value) throws Exception {
		assertTrue(Conditions.isEmpty(value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nonemptyCharSequence")
	public void isEmpty_CharSequenceTypeValueIsNonempty_ReturnsFalse(CharSequence value) throws Exception {
		assertFalse(Conditions.isEmpty(value));
	}

	@Test
	public void isEmpty_CharSequenceTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isEmpty((CharSequence) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCollection")
	public void isEmpty_CollectionTypeValueIsEmpty_ReturnsTrue(Collection<?> value) throws Exception {
		assertTrue(Conditions.isEmpty(value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nonemptyCollection")
	public void isEmpty_CollectionTypeValueIsNonempty_ReturnsFalse(Collection<?> value) throws Exception {
		assertFalse(Conditions.isEmpty(value));
	}

	@Test
	public void isEmpty_CollectionTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isEmpty((Collection<?>) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyMap")
	public void isEmpty_MapTypeValueIsEmpty_ReturnsTrue(Map<?, ?> value) throws Exception {
		assertTrue(Conditions.isEmpty(value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nonemptyMap")
	public void isEmpty_MapTypeValueIsNonempty_ReturnsFalse(Map<?, ?> value) throws Exception {
		assertFalse(Conditions.isEmpty(value));
	}

	@Test
	public void isEmpty_MapTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isEmpty((Map<?, ?>) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyObject")
	public void isEmpty_ObjectTypeValueIsEmpty_ReturnsTrue(Object value) throws Exception {
		assertTrue(Conditions.isEmpty(value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nonemptyObject")
	public void isEmpty_ObjectTypeValueIsNonempty_ReturnsFalse(Object value) throws Exception {
		assertFalse(Conditions.isEmpty(value));
	}

	@Test
	public void isEmpty_ObjectTypeValueIsNull_ReturnsTrue() throws Exception {
		assertTrue(Conditions.isEmpty((Object) null));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "valueAndThresholdWithWhetherValueGreaterThanThreshold")
	public <T extends Comparable<T>> void isGreaterThan_ValueAndThresholdAreSpecified_ReturnsWhetherValueGreaterThanThreshold(
			T value, T threshold, boolean expected) throws Exception {
		assertEquals(Conditions.isGreaterThan(value, threshold), expected);
	}

	@Test
	public void isGreaterThan_ValueIsNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isGreaterThan(null, 0));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isGreaterThan_ThresholdIsNull_ThrowsException() throws Exception {
		Conditions.isGreaterThan(1, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "valueAndThresholdWithWhetherValueGreaterThanOrEqualToThreshold")
	public <T extends Comparable<T>> void isGreaterThanOrEqualTo_ValueAndThresholdAreSpecified_ReturnsWhetherValueGreaterThanOrEqualToThreshold(
			T value, T threshold, boolean expected) throws Exception {
		assertEquals(Conditions.isGreaterThanOrEqualTo(value, threshold), expected);
	}

	@Test
	public void isGreaterThanOrEqualTo_ValueIsNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isGreaterThanOrEqualTo(null, 0));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isGreaterThanOrEqualTo_ThresholdIsNull_ThrowsException() throws Exception {
		Conditions.isGreaterThanOrEqualTo(1, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "valueAndThresholdWithWhetherValueLessThanThreshold")
	public <T extends Comparable<T>> void isLessThan_ValueAndThresholdAreSpecified_ReturnsWhetherValueLessThanThreshold(
			T value, T threshold, boolean expected) throws Exception {
		assertEquals(Conditions.isLessThan(value, threshold), expected);
	}

	@Test
	public void isLessThan_ValueIsNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isLessThan(null, 0));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isLessThan_ThresholdIsNull_ThrowsException() throws Exception {
		Conditions.isLessThan(1, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "valueAndThresholdWithWhetherValueLessThanOrEqualToThreshold")
	public <T extends Comparable<T>> void isLessThanOrEqualTo_ValueAndThresholdAreSpecified_ReturnsWhetherValueLessThanOrEqualToThreshold(
			T value, T threshold, boolean expected) throws Exception {
		assertEquals(Conditions.isLessThanOrEqualTo(value, threshold), expected);
	}

	@Test
	public void isLessThanOrEqualTo_ValueIsNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isLessThanOrEqualTo(null, 0));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void isLessThanOrEqualTo_ThresholdIsNull_ThrowsException() throws Exception {
		Conditions.isLessThanOrEqualTo(1, null);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "doubleTypeValueAndRangeWithWhetherValueInRange")
	public void isInRange_DoubleTypeArgumentsAreSpecified_ReturnsWhetherValueBetweenFromAndTo(double value, double from,
			double to, boolean expected) throws Exception {
		assertEquals(Conditions.isInRange(value, from, to), expected);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "longTypeValueAndRangeWithWhetherValueInRange")
	public void isInRange_LongTypeArgumentsAreSpecified_ReturnsWhetherValueBetweenFromAndTo(long value, long from, long to,
			boolean expected) throws Exception {
		assertEquals(Conditions.isInRange(value, from, to), expected);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "comparableTypeValueAndRangeWithWhetherValueInRange")
	public <T extends Comparable<T>> void isInRange_ComparableTypeArgumentsAreSpecified_ReturnsWhetherValueBetweenFromAndTo(
			T value, T from, T to, boolean expected) throws Exception {
		assertEquals(Conditions.isInRange(value, from, to), expected);
	}

	@Test
	public <T extends Comparable<T>> void isInRange_ComparableTypeValueIsNull_ReturnsFalse() throws Exception {
		assertFalse(Conditions.isInRange(null, BigDecimal.ZERO, BigDecimal.TEN));
	}

	static class DataProviders {

		@DataProvider
		static Object[][] equivalentObjectsPair() {// @formatter:off
			final Object object = new Object();
			return new Object[][] {
					{ object, object },
					{ 1, 1 },
					{ "A", "A" },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] inequivalentObjectsPair() {// @formatter:off
			return new Object[][] {
					{ new Object(), null },
					{ null, new Object() },
					{ new Object(), new Object() },
					{ 1, 2 },
					{ "A", "B" },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] arrayContainingNull() {// @formatter:off
			return new Object[][] {
					{ new Object[] { null, new Object() } },
					{ new Object[] { new Object(), null } },
					{ new Object[] { null } },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] arrayNotContainingNull() {// @formatter:off
			return new Object[][] {
					{ new Object[] {} },
					{ new Object[] { new Object() } },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyCharSequence() {// @formatter:off
			return new Object[][] {
					{ "" },
					{ new StringBuilder() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nonemptyCharSequence() {// @formatter:off
			return new Object[][] {
					{ " " },
					{ "A" },
					{ new StringBuilder(" ") },
					{ new StringBuilder("A") },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyCollection() {// @formatter:off
			return new Object[][] {
					{ Collections.emptySet() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nonemptyCollection() {// @formatter:off
			return new Object[][] {
					{ Collections.singleton(null) },
					{ Collections.singleton("foo") },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyMap() {// @formatter:off
			return new Object[][] {
					{ Collections.emptyMap() },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] nonemptyMap() {// @formatter:off
			return new Object[][] {
					{ Collections.singletonMap("foo", "bar") },
					{ Collections.singletonMap(null, "bar") },
					{ Collections.singletonMap("foo", null) },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyObject() {// @formatter:off
			return concatenate(
					emptyCharSequence(),
					emptyCollection(),
					emptyMap(),
					new Object[][] { { new Object[0] }, { new Object() { @Override
					public String toString() { return "";} } } });
		}// @formatter:on

		@DataProvider
		static Object[][] nonemptyObject() {// @formatter:off
			return concatenate(
					nonemptyCharSequence(),
					nonemptyCollection(),
					nonemptyMap(),
					new Object[][] { { new Object[]{ null } }, { new Object() } });
		}// @formatter:on

		@DataProvider
		static Object[][] valueAndThresholdWithWhetherValueGreaterThanThreshold() {// @formatter:off
			return new Object[][] {
					{ -1, -1, false },
					{ -1,  0, false },
					{ -1,  1, false },
					{  0, -1,  true },
					{  0,  0, false },
					{  0,  1, false },
					{  1, -1,  true },
					{  1,  0,  true },
					{  1,  1, false },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] valueAndThresholdWithWhetherValueGreaterThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ -1, -1,  true },
					{ -1,  0, false },
					{ -1,  1, false },
					{  0, -1,  true },
					{  0,  0,  true },
					{  0,  1, false },
					{  1, -1,  true },
					{  1,  0,  true },
					{  1,  1,  true },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] valueAndThresholdWithWhetherValueLessThanThreshold() {// @formatter:off
			return new Object[][] {
					{ -1, -1, false },
					{ -1,  0,  true },
					{ -1,  1,  true },
					{  0, -1, false },
					{  0,  0, false },
					{  0,  1,  true },
					{  1, -1, false },
					{  1,  0, false },
					{  1,  1, false },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] valueAndThresholdWithWhetherValueLessThanOrEqualToThreshold() {// @formatter:off
			return new Object[][] {
					{ -1, -1,  true },
					{ -1,  0,  true },
					{ -1,  1,  true },
					{  0, -1, false },
					{  0,  0,  true },
					{  0,  1,  true },
					{  1, -1, false },
					{  1,  0, false },
					{  1,  1,  true },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] doubleTypeValueAndRangeWithWhetherValueInRange() {// @formatter:off
			return new Object[][] {
					{ Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,                       1D,  true },
					{ Double.NEGATIVE_INFINITY,                      -1D,                       1D, false },
					{                      -2D,                      -1D,                       1D, false },
					{                      -1D,                      -1D,                       1D,  true },
					{                       0D,                      -1D,                       1D,  true },
					{                       1D,                      -1D,                       1D,  true },
					{                       2D,                      -1D,                       1D, false },
					{ Double.POSITIVE_INFINITY,                      -1D,                       1D, false },
					{ Double.POSITIVE_INFINITY,                      -1D, Double.POSITIVE_INFINITY,  true },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] longTypeValueAndRangeWithWhetherValueInRange() {// @formatter:off
			return new Object[][] {
					{ -2L, -1L,  1L, false },
					{ -1L, -1L,  1L,  true },
					{  0L, -1L,  1L,  true },
					{  1L, -1L,  1L,  true },
					{  2L, -1L,  1L, false },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] comparableTypeValueAndRangeWithWhetherValueInRange() {// @formatter:off
			return new Object[][] {
					{ -2,   -1,    1, false },
					{ -1,   -1,    1,  true },
					{  0,   -1,    1,  true },
					{  1,   -1,    1,  true },
					{  2,   -1,    1, false },
					{ -2,   -1, null, false },
					{ -1,   -1, null,  true },
					{  0,   -1, null,  true },
					{  1,   -1, null,  true },
					{  2,   -1, null,  true },
					{ -2, null,    1,  true },
					{ -1, null,    1,  true },
					{  0, null,    1,  true },
					{  1, null,    1,  true },
					{  2, null,    1, false },
					{ -2, null, null,  true },
					{ -1, null, null,  true },
					{  0, null, null,  true },
					{  1, null, null,  true },
					{  2, null, null,  true },
			};
		}// @formatter:on

		private static Object[][] concatenate(Object[][]... sources) {

			int length = 0;
			for (Object[] value : sources) {
				length += value.length;
			}

			Object[][] result = new Object[length][];
			int offset = 0;
			for (Object[] value : sources) {
				if (value != null) {
					System.arraycopy(value, 0, result, offset, value.length);
					offset += value.length;
				}
			}

			return result;
		}
	}
}
