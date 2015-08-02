package com.develhack;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

import com.develhack.annotation.assertion.FiniteNumber;
import com.develhack.annotation.assertion.GreaterThan;
import com.develhack.annotation.assertion.GreaterThanOrEqualTo;
import com.develhack.annotation.assertion.InRange;
import com.develhack.annotation.assertion.LessThan;
import com.develhack.annotation.assertion.LessThanOrEqualTo;
import com.develhack.annotation.assertion.Negative;
import com.develhack.annotation.assertion.Nonempty;
import com.develhack.annotation.assertion.Nonnull;
import com.develhack.annotation.assertion.Nonzero;
import com.develhack.annotation.assertion.Nullable;
import com.develhack.annotation.assertion.Positive;
import com.develhack.annotation.assertion.ValidNumber;

/**
 * Set of functions to checking the condition.
 */
public final class Conditions {

	/**
	 * Determines whether the specified two objects are equal.
	 *
	 * @param a an object to compare
	 * @param b an object to compare
	 * @return {@literal true} if the specified objects are equal ({@literal true} if both are {@literal null})
	 */
	public static boolean isEqual(@Nullable Object a, @Nullable Object b) {
		if (a == b) return true;
		return a == null ? b.equals(a) : a.equals(b);
	}

	/**
	 * Determines whether the specified two objects are equal.
	 *
	 * @param a an object to compare
	 * @param b an object to compare
	 * @return {@literal true} if the specified objects are equal ({@literal false} if both are {@literal null})
	 */
	public static boolean isEqualAndNonNull(@Nullable Object a, @Nullable Object b) {
		if (a == null || b == null) return false;
		return isEqual(a, b);
	}

	/**
	 * Determines whether the specified array containing a {@literal null}.
	 *
	 * @param value an array to be checked
	 * @return {@literal true} if the {@code value} containing {@literal null} ({@literal true} if the {@code value} is
	 *         {@literal null})
	 */
	public static <T> boolean isContainingNull(@Nullable T[] value) {

		if (value == null) return true;

		for (Object element : value) {
			if (element == null) return true;
		}

		return false;
	}

	/**
	 * Determines whether the specified collection containing a {@literal null}.
	 *
	 * @param value a collection of to be checked
	 * @return {@literal true} if the {@code value} containing {@literal null} ({@literal true} if the {@code value} is
	 *         {@literal null})
	 */
	public static boolean isContainingNull(@Nullable Collection<?> value) {

		if (value == null) return true;

		for (Object element : value) {
			if (element == null) return true;
		}

		return false;
	}

	/**
	 * Determines whether the specified character sequence is {@literal null} or empty.
	 *
	 * @param value a character sequence to be checked
	 * @return {@literal true} if the {@code value} is {@literal null} or empty
	 */
	public static boolean isEmpty(@Nullable CharSequence value) {
		return (value == null || value.length() == 0);
	}

	/**
	 * Determines whether the specified collection is {@literal null} or empty.
	 *
	 * @param value a collection to be checked
	 * @return {@literal true} if the {@code value} is {@literal null} or empty
	 */
	public static boolean isEmpty(@Nullable Collection<?> value) {
		return (value == null || value.isEmpty());
	}

	/**
	 * Determines whether the specified map is {@literal null} or empty.
	 *
	 * @param value a map to be checked
	 * @return {@literal true} if the {@code value} is {@literal null} or empty
	 */
	public static boolean isEmpty(@Nullable Map<?, ?> value) {
		return (value == null || value.isEmpty());
	}

	/**
	 * Determines whether the specified object is {@literal null} or empty.
	 * <p>
	 * Will check the size of the specified object if the object is an array or a implementation of {@code Collection} or
	 * {@code Map}. Otherwise, will check the length of the string representation of the specified object.
	 * </p>
	 *
	 * @param value an any object to be checked
	 * @return {@literal true} if the {@code value} is {@literal null} empty
	 */
	public static boolean isEmpty(@Nullable Object value) {
		if (value == null) return true;
		if (value.getClass().isArray()) return Array.getLength(value) == 0;
		if (value instanceof Collection) return isEmpty((Collection<?>) value);
		if (value instanceof Map) return isEmpty((Map<?, ?>) value);
		return value.toString().isEmpty();
	}

	/**
	 * Determines whether the specified value greater than the threshold.
	 *
	 * @param value a comparable object to be checked
	 * @param threshold a object that is the threshold
	 * @return {@literal true} if the {@code value} greater than the {@code threshold} ({@literal false} if the {@code value} is
	 *         {@literal null})
	 * @throws IllegalArgumentException if the {@code threshold} is null
	 */
	public static <T extends Comparable<? super T>> boolean isGreaterThan(@Nullable T value, @Nonnull T threshold)
			throws IllegalArgumentException {
		checkNonnull("threshold", threshold);
		if (value == null) return false;
		return value.compareTo(threshold) > 0;
	}

	/**
	 * Determines whether the specified value greater than or equal to the threshold.
	 *
	 * @param value a comparable object to be checked
	 * @param threshold a object that is the threshold
	 * @return {@literal true} if the {@code value} greater than or equal to the {@code threshold} ({@literal false} if the
	 *         {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code threshold} is null
	 */
	public static <T extends Comparable<? super T>> boolean isGreaterThanOrEqualTo(@Nullable T value, @Nonnull T threshold)
			throws IllegalArgumentException {
		checkNonnull("threshold", threshold);
		if (value == null) return false;
		return value.compareTo(threshold) >= 0;
	}

	/**
	 * Determines whether the specified value less than the threshold.
	 *
	 * @param value a comparable object to be checked
	 * @param threshold a object that is the threshold
	 * @return {@literal true} if the {@code value} less than the {@code threshold} ({@literal false} if the {@code value} is
	 *         {@literal null})
	 * @throws IllegalArgumentException if the {@code threshold} is null
	 */
	public static <T extends Comparable<? super T>> boolean isLessThan(@Nullable T value, @Nonnull T threshold)
			throws IllegalArgumentException {
		checkNonnull("threshold", threshold);
		if (value == null) return false;
		return value.compareTo(threshold) < 0;
	}

	/**
	 * Determines whether the specified value less than or equal to the threshold.
	 *
	 * @param value a comparable object to be checked
	 * @param threshold a object that is the threshold
	 * @return {@literal true} if the {@code value} less than or equal to the {@code threshold} ({@literal false} if the
	 *         {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code threshold} is null
	 */
	public static <T extends Comparable<? super T>> boolean isLessThanOrEqualTo(@Nullable T value, @Nonnull T threshold)
			throws IllegalArgumentException {
		checkNonnull("threshold", threshold);
		if (value == null) return false;
		return value.compareTo(threshold) <= 0;
	}

	/**
	 * Determines whether the specified value is included in the range.
	 *
	 * @param value a value to be checked.
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return {@literal true} if the {@code value} is between {@code from} and {@code to} ({@code false} if arguments contain
	 *         {@link Double#NaN})
	 */
	public static boolean isInRange(double value, double from, double to) {
		return (value >= from && value <= to);
	}

	/**
	 * Determines whether the specified value is included in the range.
	 *
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return {@literal true} if the {@code value} is between {@code from} and {@code to}
	 */
	public static boolean isInRange(long value, long from, long to) {
		return (value >= from && value <= to);
	}

	/**
	 * Determines whether the specified value is included in the range.
	 *
	 * @param value a value to be checked.
	 * @param from inclusive lower limit of the range (unlimited if {@literal null})
	 * @param to inclusive upper limit of the range (unlimited if {@literal null})
	 * @return {@literal true} if the {@code value} between the {@code from} and {@code to} ({@literal false} if {@code value}
	 *         is {@literal null})
	 */
	public static <T extends Comparable<? super T>> boolean isInRange(@Nullable T value, @Nullable T from, @Nullable T to) {
		if (value == null) return false;
		if (from != null && !isGreaterThanOrEqualTo(value, from)) return false;
		if (to != null && !isLessThanOrEqualTo(value, to)) return false;
		return true;
	}

	/**
	 * Ensures that the specified object meets the condition.
	 * <p>
	 * e.g. <br>
	 * <code>
	 * int variable = 0;<br>
	 * check("foo", variable, variable == 1, "must be one"); // will throw new IllegalArgumentException("foo must be one, but it is 0.")
	 * </code>
	 * </p>
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @param checkResult result of checking the condition
	 * @param requirement requirement
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code checkResult} is {@literal false}
	 */
	public static <T> T check(@Nullable String name, @Nullable T value, boolean checkResult, @Nullable String requirement)
			throws IllegalArgumentException {
		if (!checkResult) {
			if (isEmpty(requirement)) {
				throw new IllegalArgumentException(format("assertion failed. %1$s is %2$s.", name, value));
			}
			throw new IllegalArgumentException(format("%1$s %2$s, but it is %3$s.", name, requirement, value));
		}

		return value;
	}

	/**
	 * Ensures that the specified object is non-null.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null}
	 */
	public static <T> T checkNonnull(@Nullable String name, @Nonnull T value) throws IllegalArgumentException {
		if (value == null) throw new IllegalArgumentException(mustBeNonnull(name));
		return value;
	}

	/**
	 * Ensures that the specified character sequence is non-null and non-empty.
	 *
	 * @param name a name of the value
	 * @param value a character sequence to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@code null} or empty
	 */
	public static <T extends CharSequence> T checkNonempty(@Nullable String name, @Nonempty T value)
			throws IllegalArgumentException {
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified collection is non-null and non-empty.
	 *
	 * @param name a name of the value
	 * @param value a collection to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@code null} or empty
	 */
	public static <T extends Collection<?>> T checkNonempty(@Nullable String name, @Nonempty T value)
			throws IllegalArgumentException {
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified map is non-null and non-empty.
	 *
	 * @param name a name of the value
	 * @param value a map to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@code null} or empty
	 */
	public static <T extends Map<?, ?>> T checkNonempty(@Nullable String name, @Nonempty T value)
			throws IllegalArgumentException {
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified object is non-null and non-empty.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@code null} or empty
	 * @see #isEmpty(Object)
	 */
	public static <T> T checkNonempty(@Nullable String name, @Nonempty T value) throws IllegalArgumentException {
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified character sequence is {@literal null} or non-empty.
	 *
	 * @param name a name of the value
	 * @param value a character sequence to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is empty
	 */
	public static <T extends CharSequence> T checkNonemptyIfNonnull(@Nullable String name, @Nullable @Nonempty T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified collection is {@literal null} or non-empty.
	 *
	 * @param name a name of the value
	 * @param value a collection to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is empty
	 */
	public static <T extends Collection<?>> T checkNonemptyIfNonnull(@Nullable String name, @Nullable @Nonempty T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified map is {@literal null} or non-empty.
	 *
	 * @param name a name of the value
	 * @param value a map to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is empty
	 */
	public static <T extends Map<?, ?>> T checkNonemptyIfNonnull(@Nullable String name, @Nullable @Nonempty T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified object is {@literal null} or non-empty.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is empty
	 * @see #isEmpty(Object)
	 */
	public static <T> T checkNonemptyIfNonnull(@Nullable String name, @Nullable @Nonempty T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (isEmpty(value)) throw new IllegalArgumentException(mustBeNonempty(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@link Double#NaN NaN}.
	 */
	public static double checkValidNumber(@Nullable String name, @ValidNumber double value) throws IllegalArgumentException {
		if (Double.isNaN(value)) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@link Float#NaN NaN}.
	 */
	public static float checkValidNumber(@Nullable String name, @ValidNumber float value) throws IllegalArgumentException {
		if (Double.isNaN(value)) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null} or {@link Double#NaN NaN}.
	 */
	public static Double checkValidNumber(@Nullable String name, @ValidNumber Double value) throws IllegalArgumentException {
		if (value == null || value.isNaN()) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null} or {@link Float#NaN NaN}.
	 */
	public static Float checkValidNumber(@Nullable String name, @ValidNumber Float value) throws IllegalArgumentException {
		if (value == null || value.isNaN()) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is {@link Double#NaN NaN}.
	 */
	public static Double checkValidNumberIfNonnull(@Nullable String name, @Nullable @ValidNumber Double value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (value.isNaN()) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or valid number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is {@link Float#NaN NaN}.
	 */
	public static Float checkValidNumberIfNonnull(@Nullable String name, @Nullable @ValidNumber Float value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (value.isNaN()) throw new IllegalArgumentException(mustBeValidNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@link Double#NaN NaN} or {@link Double#POSITIVE_INFINITY
	 *             positive infinity} or {@link Double#NEGATIVE_INFINITY negative infinity}.
	 */
	public static double checkFiniteNumber(@Nullable String name, @FiniteNumber double value) throws IllegalArgumentException {
		if (Double.isNaN(value) || Double.isInfinite(value)) throw new IllegalArgumentException(mustBeFiniteNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null} or {@link Float#NaN NaN} or
	 *             {@link Float#POSITIVE_INFINITY positive infinity} or {@link Float#NEGATIVE_INFINITY negative infinity}.
	 */
	public static float checkFiniteNumber(@Nullable String name, @FiniteNumber float value) throws IllegalArgumentException {
		if (Float.isNaN(value) || Float.isInfinite(value)) throw new IllegalArgumentException(mustBeFiniteNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null} or {@link Double#NaN NaN} or
	 *             {@link Double#POSITIVE_INFINITY positive infinity} or {@link Double#NEGATIVE_INFINITY negative infinity}.
	 */
	public static Double checkFiniteNumber(@Nullable String name, @FiniteNumber Double value) throws IllegalArgumentException {
		if (value == null || value.isNaN() || value.isInfinite()) throw new IllegalArgumentException(mustBeFiniteNumber(name,
				value));
		return value;
	}

	/**
	 * Ensures that the specified value is a valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if the {@code value} is {@literal null} or {@link Float#NaN NaN} or
	 *             {@link Float#POSITIVE_INFINITY positive infinity} or {@link Float#NEGATIVE_INFINITY negative infinity}.
	 */
	public static Float checkFiniteNumber(@Nullable String name, @FiniteNumber Float value) throws IllegalArgumentException {
		if (value == null || value.isNaN() || value.isInfinite()) throw new IllegalArgumentException(mustBeFiniteNumber(name,
				value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is {@link Double#NaN NaN} or {@link Double#POSITIVE_INFINITY
	 *             positive infinity} or {@link Double#NEGATIVE_INFINITY negative infinity}.
	 */
	public static Double checkFiniteNumberIfNonnull(@Nullable String name, @Nullable @FiniteNumber Double value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (value.isNaN() || value.isInfinite()) throw new IllegalArgumentException(mustBeFiniteNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or valid finite number.
	 *
	 * @param name a name of the value
	 * @param value an object to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if the {@code value} is {@link Float#NaN NaN} or {@link Float#POSITIVE_INFINITY positive
	 *             infinity} or {@link Float#NEGATIVE_INFINITY negative infinity}.
	 */
	public static Float checkFiniteNumberIfNonnull(@Nullable String name, @Nullable @FiniteNumber Float value)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (value.isNaN() || value.isInfinite()) throw new IllegalArgumentException(mustBeFiniteNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static double checkGreaterThan(@Nullable String name, @GreaterThan("threshold") double value,
			@ValidNumber double threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static float checkGreaterThan(@Nullable String name, @GreaterThan("threshold") float value,
			@ValidNumber float threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static long checkGreaterThan(@Nullable String name, @GreaterThan("threshold") long value, long threshold)
			throws IllegalArgumentException {
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static int checkGreaterThan(@Nullable String name, @GreaterThan("threshold") int value, int threshold)
			throws IllegalArgumentException {
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static short checkGreaterThan(@Nullable String name, @GreaterThan("threshold") short value, short threshold)
			throws IllegalArgumentException {
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static char checkGreaterThan(@Nullable String name, @GreaterThan("threshold") char value, char threshold)
			throws IllegalArgumentException {
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, (int) value, (int) threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value > threshold)}
	 */
	public static byte checkGreaterThan(@Nullable String name, @GreaterThan("threshold") byte value, byte threshold)
			throws IllegalArgumentException {
		if (!(value > threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isGreaterThan(value, threshold)}
	 * @see #isGreaterThan(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkGreaterThan(@Nullable String name,
			@GreaterThan("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (!isGreaterThan(value, threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or greater than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isGreaterThan(value, threshold)}
	 * @see #isGreaterThan(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkGreaterThanIfNonnull(@Nullable String name,
			@Nullable @GreaterThan("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (value == null) return null;
		if (!isGreaterThan(value, threshold)) throw new IllegalArgumentException(mustBeGreaterThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static double checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") double value,
			@ValidNumber double threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static float checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") float value,
			@ValidNumber float threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static long checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") long value,
			long threshold) throws IllegalArgumentException {
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static int checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") int value,
			int threshold) throws IllegalArgumentException {
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static short checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") short value,
			short threshold) throws IllegalArgumentException {
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static char checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") char value,
			char threshold) throws IllegalArgumentException {
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, (int) value,
				(int) threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= threshold)}
	 */
	public static byte checkGreaterThanOrEqualTo(@Nullable String name, @GreaterThanOrEqualTo("threshold") byte value,
			byte threshold) throws IllegalArgumentException {
		if (!(value >= threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isGreaterThanOrEqualTo(value, threshold)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkGreaterThanOrEqualTo(@Nullable String name,
			@GreaterThanOrEqualTo("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (!isGreaterThanOrEqualTo(value, threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name,
				value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or greater than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isGreaterThanOrEqualTo(value, threshold)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkGreaterThanOrEqualToIfNonnull(@Nullable String name,
			@Nullable @GreaterThanOrEqualTo("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (value == null) return null;
		if (!isGreaterThanOrEqualTo(value, threshold)) throw new IllegalArgumentException(mustBeGreaterThanOrEqualTo(name,
				value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static double checkLessThan(@Nullable String name, @LessThan("threshold") double value, @ValidNumber double threshold)
			throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static float checkLessThan(@Nullable String name, @LessThan("threshold") float value, @ValidNumber float threshold)
			throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static long checkLessThan(@Nullable String name, @LessThan("threshold") long value, long threshold)
			throws IllegalArgumentException {
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static int checkLessThan(@Nullable String name, @LessThan("threshold") int value, int threshold)
			throws IllegalArgumentException {
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static short checkLessThan(@Nullable String name, @LessThan("threshold") short value, short threshold)
			throws IllegalArgumentException {
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static char checkLessThan(@Nullable String name, @LessThan("threshold") char value, char threshold)
			throws IllegalArgumentException {
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, (int) value, (int) threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value < threshold)}
	 */
	public static byte checkLessThan(@Nullable String name, @LessThan("threshold") byte value, byte threshold)
			throws IllegalArgumentException {
		if (!(value < threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isLessThan(value, threshold)}
	 * @see #isLessThan(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkLessThan(@Nullable String name, @LessThan("threshold") T value,
			@Nonnull T threshold) throws IllegalArgumentException {
		if (!isLessThan(value, threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or less than the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isLessThan(value, threshold)}
	 * @see #isLessThan(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkLessThanIfNonnull(@Nullable String name,
			@Nullable @LessThan("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (value == null) return null;
		if (!isLessThan(value, threshold)) throw new IllegalArgumentException(mustBeLessThan(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static double checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") double value,
			@ValidNumber double threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static float checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") float value,
			@ValidNumber float threshold) throws IllegalArgumentException {
		checkValidNumber("threshold", threshold);
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static long checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") long value, long threshold)
			throws IllegalArgumentException {
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static int checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") int value, int threshold)
			throws IllegalArgumentException {
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static short checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") short value,
			short threshold) throws IllegalArgumentException {
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static char checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") char value, char threshold)
			throws IllegalArgumentException {
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, (int) value,
				(int) threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= threshold)}
	 */
	public static byte checkLessThanOrEqualTo(@Nullable String name, @LessThanOrEqualTo("threshold") byte value, byte threshold)
			throws IllegalArgumentException {
		if (!(value <= threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value, threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isLessThanOrEqualTo(value, threshold)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkLessThanOrEqualTo(@Nullable String name,
			@LessThanOrEqualTo("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (!isLessThanOrEqualTo(value, threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value,
				threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or less than or equal to the threshold.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param threshold a threshold
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isLessThanOrEqualTo(value, threshold)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkLessThanOrEqualToIfNonnull(@Nullable String name,
			@LessThanOrEqualTo("threshold") T value, @Nonnull T threshold) throws IllegalArgumentException {
		if (value == null) return null;
		if (!isLessThanOrEqualTo(value, threshold)) throw new IllegalArgumentException(mustBeLessThanOrEqualTo(name, value,
				threshold));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0D)}
	 */
	public static double checkPositive(@Nullable String name, @Positive double value) throws IllegalArgumentException {
		if (!(value >= 0D)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0F)}
	 */
	public static float checkPositive(@Nullable String name, @Positive float value) throws IllegalArgumentException {
		if (!(value >= 0F)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0L)}
	 */
	public static long checkPositive(@Nullable String name, @Positive long value) throws IllegalArgumentException {
		if (!(value >= 0L)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0)}
	 */
	public static int checkPositive(@Nullable String name, @Positive int value) throws IllegalArgumentException {
		if (!(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0)}
	 */
	public static short checkPositive(@Nullable String name, @Positive short value) throws IllegalArgumentException {
		if (!(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value >= 0)}
	 */
	public static byte checkPositive(@Nullable String name, @Positive byte value) throws IllegalArgumentException {
		if (!(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0D)}
	 */
	public static Double checkPositive(@Nullable String name, @Positive Double value) throws IllegalArgumentException {
		if (value == null || !(value >= 0D)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0F)}
	 */
	public static Float checkPositive(@Nullable String name, @Positive Float value) throws IllegalArgumentException {
		if (value == null || !(value >= 0F)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0L)}
	 */
	public static Long checkPositive(@Nullable String name, @Positive Long value) throws IllegalArgumentException {
		if (value == null || !(value >= 0L)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0)}
	 */
	public static Integer checkPositive(@Nullable String name, @Positive Integer value) throws IllegalArgumentException {
		if (value == null || !(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0)}
	 */
	public static Short checkPositive(@Nullable String name, @Positive Short value) throws IllegalArgumentException {
		if (value == null || !(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value >= 0)}
	 */
	public static Byte checkPositive(@Nullable String name, @Positive Byte value) throws IllegalArgumentException {
		if (value == null || !(value >= 0)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isGreaterThanOrEqualTo(value, BigInteger.ZERO)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigInteger> T checkPositive(@Nullable String name, @Positive T value)
			throws IllegalArgumentException {
		if (!isGreaterThanOrEqualTo(value, BigInteger.ZERO)) throw new IllegalArgumentException(mustBePositiveNumber(name,
				value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isGreaterThanOrEqualTo(value, BigDecimal.ZERO)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigDecimal> T checkPositive(@Nullable String name, @Positive T value)
			throws IllegalArgumentException {
		if (!isGreaterThanOrEqualTo(value, BigDecimal.ZERO)) throw new IllegalArgumentException(mustBePositiveNumber(name,
				value));
		return value;
	}

	/**
	 * Ensures that the specified value is positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isGreaterThanOrEqualTo(value, zero)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkPositive(@Nullable String name, @Positive T value, @Nonnull T zero)
			throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (!isGreaterThanOrEqualTo(value, zero)) throw new IllegalArgumentException(mustBePositiveNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0D)}
	 */
	public static Double checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Double value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0F)}
	 */
	public static Float checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Float value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0L)}
	 */
	public static Long checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Long value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0)}
	 */
	public static Integer checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Integer value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0)}
	 */
	public static Short checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Short value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value >= 0)}
	 */
	public static Byte checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive Byte value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isGreaterThanOrEqualTo(value, BigInteger.ZERO)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigInteger> T checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isGreaterThanOrEqualTo(value, BigDecimal.ZERO)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigDecimal> T checkPositiveIfNonnull(@Nullable String name, @Nullable @Positive T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkPositive(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or positive number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isGreaterThanOrEqualTo(value, zero)}
	 * @see #isGreaterThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkPositiveIfNonnull(@Nullable String name,
			@Nullable @Positive T value, @Nonnull T zero) throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (value == null) return null;
		checkPositive(name, value, zero);
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0D)}
	 */
	public static double checkNegative(@Nullable String name, @Negative double value) throws IllegalArgumentException {
		if (!(value <= 0D)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0F)}
	 */
	public static float checkNegative(@Nullable String name, @Negative float value) throws IllegalArgumentException {
		if (!(value <= 0F)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0L)}
	 */
	public static long checkNegative(@Nullable String name, @Negative long value) throws IllegalArgumentException {
		if (!(value <= 0L)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0)}
	 */
	public static int checkNegative(@Nullable String name, @Negative int value) throws IllegalArgumentException {
		if (!(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0)}
	 */
	public static short checkNegative(@Nullable String name, @Negative short value) throws IllegalArgumentException {
		if (!(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !(value <= 0)}
	 */
	public static byte checkNegative(@Nullable String name, @Negative byte value) throws IllegalArgumentException {
		if (!(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0D)}
	 */
	public static Double checkNegative(@Nullable String name, @Negative Double value) throws IllegalArgumentException {
		if (value == null || !(value <= 0D)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0F)}
	 */
	public static Float checkNegative(@Nullable String name, @Negative Float value) throws IllegalArgumentException {
		if (value == null || !(value <= 0F)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0L)}
	 */
	public static Long checkNegative(@Nullable String name, @Negative Long value) throws IllegalArgumentException {
		if (value == null || !(value <= 0L)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0)}
	 */
	public static Integer checkNegative(@Nullable String name, @Negative Integer value) throws IllegalArgumentException {
		if (value == null || !(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0)}
	 */
	public static Short checkNegative(@Nullable String name, @Negative Short value) throws IllegalArgumentException {
		if (value == null || !(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || !(value <= 0)}
	 */
	public static Byte checkNegative(@Nullable String name, @Negative Byte value) throws IllegalArgumentException {
		if (value == null || !(value <= 0)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isLessThanOrEqualTo(value, BigInteger.ZERO)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigInteger> T checkNegative(@Nullable String name, @Negative T value)
			throws IllegalArgumentException {
		if (!isLessThanOrEqualTo(value, BigInteger.ZERO)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isLessThanOrEqualTo(value, BigDecimal.ZERO)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigDecimal> T checkNegative(@Nullable String name, @Negative T value)
			throws IllegalArgumentException {
		if (!isLessThanOrEqualTo(value, BigDecimal.ZERO)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isLessThanOrEqualTo(value, zero)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkNegative(@Nullable String name, @Negative T value, @Nonnull T zero)
			throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (!isLessThanOrEqualTo(value, zero)) throw new IllegalArgumentException(mustBeNegativeNumber(name, value));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0D)}
	 */
	public static Double checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Double value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0F)}
	 */
	public static Float checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Float value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0L)}
	 */
	public static Long checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Long value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0)}
	 */
	public static Integer checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Integer value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0)}
	 */
	public static Short checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Short value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !(value <= 0)}
	 */
	public static Byte checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative Byte value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isLessThanOrEqualTo(value, BigInteger.ZERO)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigInteger> T checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isLessThanOrEqualTo(value, BigDecimal.ZERO)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends BigDecimal> T checkNegativeIfNonnull(@Nullable String name, @Nullable @Negative T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNegative(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or negative number.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isLessThanOrEqualTo(value, zero)}
	 * @see #isLessThanOrEqualTo(Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkNegativeIfNonnull(@Nullable String name,
			@Nullable @Negative T value, @Nonnull T zero) throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (value == null) return null;
		checkNegative(name, value, zero);
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0D}
	 */
	public static double checkNonzero(@Nullable String name, @Nonzero double value) throws IllegalArgumentException {
		if (value == 0D) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0F}
	 */
	public static float checkNonzero(@Nullable String name, @Nonzero float value) throws IllegalArgumentException {
		if (value == 0F) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0L}
	 */
	public static long checkNonzero(@Nullable String name, @Nonzero long value) throws IllegalArgumentException {
		if (value == 0L) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0}
	 */
	public static int checkNonzero(@Nullable String name, @Nonzero int value) throws IllegalArgumentException {
		if (value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0}
	 */
	public static short checkNonzero(@Nullable String name, @Nonzero short value) throws IllegalArgumentException {
		if (value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0}
	 */
	public static char checkNonzero(@Nullable String name, @Nonzero char value) throws IllegalArgumentException {
		if (value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == 0}
	 */
	public static byte checkNonzero(@Nullable String name, @Nonzero byte value) throws IllegalArgumentException {
		if (value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0D}
	 */
	public static Double checkNonzero(@Nullable String name, @Nonzero Double value) throws IllegalArgumentException {
		if (value == null || value == 0D) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0F}
	 */
	public static Float checkNonzero(@Nullable String name, @Nonzero Float value) throws IllegalArgumentException {
		if (value == null || value == 0F) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0L}
	 */
	public static Long checkNonzero(@Nullable String name, @Nonzero Long value) throws IllegalArgumentException {
		if (value == null || value == 0L) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0}
	 */
	public static Integer checkNonzero(@Nullable String name, @Nonzero Integer value) throws IllegalArgumentException {
		if (value == null || value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0}
	 */
	public static Short checkNonzero(@Nullable String name, @Nonzero Short value) throws IllegalArgumentException {
		if (value == null || value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0}
	 */
	public static Character checkNonzero(@Nullable String name, @Nonzero Character value) throws IllegalArgumentException {
		if (value == null || value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value == 0}
	 */
	public static Byte checkNonzero(@Nullable String name, @Nonzero Byte value) throws IllegalArgumentException {
		if (value == null || value == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value.compareTo(BigInteger.ZERO) == 0}
	 */
	public static <T extends BigInteger> T checkNonzero(@Nullable String name, @Nonzero T value)
			throws IllegalArgumentException {
		if (value == null || value.compareTo(BigInteger.ZERO) == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value.compareTo(BigDecimal.ZERO) == 0}
	 */
	public static <T extends BigDecimal> T checkNonzero(@Nullable String name, @Nonzero T value)
			throws IllegalArgumentException {
		if (value == null || value.compareTo(BigDecimal.ZERO) == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is non-zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code value == null || value.compareTo(zero) == 0}
	 */
	public static <T extends Comparable<? super T>> T checkNonzero(@Nullable String name, @Nonzero T value, @Nonnull T zero)
			throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (value == null || value.compareTo(zero) == 0) throw new IllegalArgumentException(mustBeNonZero(name));
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0D}
	 */
	public static Double checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Double value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0F}
	 */
	public static Float checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Float value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0L}
	 */
	public static Long checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Long value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0}
	 */
	public static Integer checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Integer value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0}
	 */
	public static Short checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Short value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0}
	 */
	public static Character checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Character value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value == 0}
	 */
	public static Byte checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero Byte value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value.compareTo(BigInteger.ZERO) == 0}
	 */
	public static <T extends BigInteger> T checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value.compareTo(BigDecimal.ZERO) == 0}
	 */
	public static <T extends BigDecimal> T checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero T value)
			throws IllegalArgumentException {
		if (value == null) return null;
		checkNonzero(name, value);
		return value;
	}

	/**
	 * Ensures that the specified value is {@literal null} or not zero.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param zero a zero value
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && value.compareTo(zero) == 0}
	 */
	public static <T extends Comparable<? super T>> T checkNonzeroIfNonnull(@Nullable String name, @Nullable @Nonzero T value,
			@Nonnull T zero) throws IllegalArgumentException {
		checkNonnull("zero", zero);
		if (value == null) return null;
		checkNonzero(name, value, zero);
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(double, double, double)
	 */
	public static double checkInRange(@Nullable String name, @InRange(from = "from", to = "to") double value,
			@ValidNumber double from, @ValidNumber double to) throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(double, double, double)
	 */
	public static float checkInRange(@Nullable String name, @InRange(from = "from", to = "to") float value,
			@ValidNumber float from, @ValidNumber float to) throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(long, long, long)
	 */
	public static long checkInRange(@Nullable String name, @InRange(from = "from", to = "to") long value, long from, long to)
			throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(long, long, long)
	 */
	public static int checkInRange(@Nullable String name, @InRange(from = "from", to = "to") int value, int from, int to)
			throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(long, long, long)
	 */
	public static short checkInRange(@Nullable String name, @InRange(from = "from", to = "to") short value, short from, short to)
			throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(long, long, long)
	 */
	public static char checkInRange(@Nullable String name, @InRange(from = "from", to = "to") char value, char from, char to)
			throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range
	 * @param to inclusive upper limit of the range
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(long, long, long)
	 */
	public static byte checkInRange(@Nullable String name, @InRange(from = "from", to = "to") byte value, byte from, byte to)
			throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range (unlimited if {@literal null})
	 * @param to inclusive upper limit of the range (unlimited if {@literal null})
	 * @return the {@code value}
	 * @throws IllegalArgumentException if {@code !isInRange(value, from, to)}
	 * @see #isInRange(Comparable, Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkInRange(@Nullable String name,
			@InRange(from = "from", to = "to") T value, @Nullable T from, @Nullable T to) throws IllegalArgumentException {
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	/**
	 * Ensures that the specified value is {@code null} or included in the range.
	 *
	 * @param name a name of the value
	 * @param value a value to be checked
	 * @param from inclusive lower limit of the range (unlimited if {@literal null})
	 * @param to inclusive upper limit of the range (unlimited if {@literal null})
	 * @return the {@code value} ({@literal null} if the {@code value} is {@literal null})
	 * @throws IllegalArgumentException if {@code value != null && !isInRange(value, from, to)}
	 * @see #isInRange(Comparable, Comparable, Comparable)
	 */
	public static <T extends Comparable<? super T>> T checkInRangeIfNonnull(@Nullable String name,
			@Nullable @InRange(from = "from", to = "to") T value, @Nullable T from, @Nullable T to)
			throws IllegalArgumentException {
		if (value == null) return null;
		if (!isInRange(value, from, to)) throw new IllegalArgumentException(mustBeInRange(name, value, from, to));
		return value;
	}

	private static String mustBeNonnull(String name) {
		return format("%1$s must be non-null.", name);
	}

	private static String mustBeNonempty(String name, Object value) {
		return format("%1$s must be non-empty, but it is %2$s.", name, value == null ? "null" : "empty");
	}

	private static String mustBeValidNumber(String name, Object value) {
		return format("%1$s must be valid number, but it is %2$s.", name, value);
	}

	private static String mustBeFiniteNumber(String name, Object value) {
		return format("%1$s must be finite number, but it is %2$s.", name, value);
	}

	private static String mustBeGreaterThan(String name, Object value, Object threshold) {
		return format("%1$s must be greater than %2$s, but it is %3$s.", name, threshold, value);
	}

	private static String mustBeGreaterThanOrEqualTo(String name, Object value, Object threshold) {
		return format("%1$s must be greater than or equal to %2$s, but it is %3$s.", name, threshold, value);
	}

	private static String mustBeLessThan(String name, Object value, Object threshold) {
		return format("%1$s must be less than %2$s, but it is %3$s.", name, threshold, value);
	}

	private static String mustBeLessThanOrEqualTo(String name, Object value, Object threshold) {
		return format("%1$s must be less than or equal to %2$s, but it is %3$s.", name, threshold, value);
	}

	private static String mustBePositiveNumber(String name, Object value) {
		return format("%1$s must be positive number, but it is %2$s.", name, value);
	}

	private static String mustBeNegativeNumber(String name, Object value) {
		return format("%1$s must be negative number, but it is %2$s.", name, value);
	}

	private static String mustBeNonZero(String name) {
		return format("%1$s must be non-zero.", name);
	}

	private static String mustBeInRange(String name, Object value, Object from, Object to) {
		return format("%1$s must be in the range of from %2$s to %3$s, but it is %4$s.", name, from, to, value);
	}

	private static String format(String message, String name, Object... parameters) {
		Object[] nameWithParameters = new Object[parameters.length + 1];
		nameWithParameters[0] = isEmpty(name) ? "variable" : name;
		System.arraycopy(parameters, 0, nameWithParameters, 1, parameters.length);
		return String.format(message, nameWithParameters);
	}

	private Conditions() {
		throw new AssertionError();
	}
}
