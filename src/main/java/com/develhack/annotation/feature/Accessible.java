package com.develhack.annotation.feature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents that the field is accessible.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Accessible {

	/** access level of getter */
	Access get() default Access.PUBLIC;

	/** access level of setter */
	Access set() default Access.PUBLIC;
}
