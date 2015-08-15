package com.develhack.annotation.feature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents that the instance of this class is a data transfer object.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DTO {

	/** Access level of the getters */
	Access get() default Access.PUBLIC;

	/** Access level of the setters */
	Access set() default Access.PUBLIC;
}
