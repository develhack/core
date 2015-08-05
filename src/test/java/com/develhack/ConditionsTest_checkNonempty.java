package com.develhack;

import static org.testng.Assert.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("javadoc")
public class ConditionsTest_checkNonempty {

	@Test
	public void checkNonempty_CharSequenceTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		String value = "value";
		assertSame(Conditions.checkNonempty(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_CharSequenceTypeValueIsNull_ThrowsException(String name, CharSequence value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCharSequenceWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_CharSequenceTypeValueIsEmpty_ThrowsException(String name, CharSequence value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonempty_CollectionTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Collection<?> value = Collections.singleton("value");
		assertSame(Conditions.checkNonempty(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_CollectionTypeValueIsNull_ThrowsException(String name, Collection<?> value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCollectionWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_CollectionTypeValueIsEmpty_ThrowsException(String name, Collection<?> value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonempty_MapTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Map<?, ?> value = Collections.singletonMap("key", "value");
		assertSame(Conditions.checkNonempty(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_MapTypeValueIsNull_ThrowsException(String name, Map<?, ?> value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyMapWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_MapTypeValueIsEmpty_ThrowsException(String name, Map<?, ?> value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonempty_ObjectTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Object value = new Object();
		assertSame(Conditions.checkNonempty(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_ObjectTypeValueIsNull_ThrowsException(String name, Object value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyObjectWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonempty_ObjectTypeValueIsEmpty_ThrowsException(String name, Object value, String expectedExceptionMessage)
			throws Exception {

		try {
			Conditions.checkNonempty(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonemptyIfNonnull_CharSequenceTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		String value = "value";
		assertSame(Conditions.checkNonemptyIfNonnull(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage")
	public void checkNonemptyIfNonnull_CharSequenceTypeValueIsNull_ReturnsNull(String name, CharSequence value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonemptyIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCharSequenceWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonemptyIfNonnull_CharSequenceTypeValueIsEmpty_ThrowsException(String name, CharSequence value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonemptyIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonemptyIfNonnull_CollectionTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Collection<?> value = Collections.singleton("value");
		assertSame(Conditions.checkNonemptyIfNonnull(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage")
	public void checkNonemptyIfNonnull_CollectionTypeValueIsNull_ReturnsNull(String name, Collection<?> value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonemptyIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyCollectionWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonemptyIfNonnull_CollectionTypeValueIsEmpty_ThrowsException(String name, Collection<?> value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonemptyIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonemptyIfNonnull_MapTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Map<?, ?> value = Collections.singletonMap("key", "value");
		assertSame(Conditions.checkNonemptyIfNonnull(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage")
	public void checkNonemptyIfNonnull_MapTypeValueIsNull_ReturnsNull(String name, Map<?, ?> value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonemptyIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyMapWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonemptyIfNonnull_MapTypeValueIsEmpty_ThrowsException(String name, Map<?, ?> value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonemptyIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	@Test
	public void checkNonemptyIfNonnull_ObjectTypeValueIsNonempty_ReturnsTheValue() throws Exception {

		Object value = new Object();
		assertSame(Conditions.checkNonemptyIfNonnull(null, value), value);
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "nullWithExpectedExceptionMessage")
	public void checkNonemptyIfNonnull_ObjectTypeValueIsNull_ReturnsNull(String name, Object value,
			String ignoredExceptionMessage) throws Exception {

		assertNull(Conditions.checkNonemptyIfNonnull(name, value));
	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "emptyObjectWithExpectedExceptionMessage", expectedExceptions = IllegalArgumentException.class)
	public void checkNonemptyIfNonnull_ObjectTypeValueIsEmpty_ThrowsException(String name, Object value,
			String expectedExceptionMessage) throws Exception {

		try {
			Conditions.checkNonemptyIfNonnull(name, value);
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), expectedExceptionMessage);
			throw e;
		}
	}

	static class DataProviders {

		@DataProvider
		static Object[][] nullWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", null,      "foo must be non-empty, but it is null." },
					{  null, null, "variable must be non-empty, but it is null." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyCharSequenceWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo",   "",      "foo must be non-empty, but it is empty." },
					{  null,   "", "variable must be non-empty, but it is empty." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyCollectionWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Collections.emptyList(),      "foo must be non-empty, but it is empty." },
					{  null, Collections.emptyList(), "variable must be non-empty, but it is empty." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyMapWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", Collections.emptyMap(),      "foo must be non-empty, but it is empty." },
					{  null, Collections.emptyMap(), "variable must be non-empty, but it is empty." },
			};
		}// @formatter:on

		@DataProvider
		static Object[][] emptyObjectWithExpectedExceptionMessage() {// @formatter:off
			return new Object[][] {
					{ "foo", new Object[0],      "foo must be non-empty, but it is empty." },
					{  null, new Object[0], "variable must be non-empty, but it is empty." },
			};
		}// @formatter:on
	}
}
