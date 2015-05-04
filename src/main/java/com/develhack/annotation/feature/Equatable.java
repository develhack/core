package com.develhack.annotation.feature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents that the instance of this class is determinable the equality by the {@link Object#equals(Object)} and
 * {@link Object#hashCode()}.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Equatable {

	/** evaluate the superclass. */
	boolean evaluateSuperclass() default false;
}
