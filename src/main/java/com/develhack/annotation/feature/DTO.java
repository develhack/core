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

	/** access level of getter */
	Access get() default Access.PUBLIC;

	/** access level of setter */
	Access set() default Access.PUBLIC;
}
