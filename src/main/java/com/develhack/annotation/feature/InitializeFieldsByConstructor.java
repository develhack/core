package com.develhack.annotation.feature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents that the instance of the class initializes fields by constructor.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InitializeFieldsByConstructor {

	/** Access level of the constructor that initialize only final fields */
	Access finalFieldsInitializer() default Access.PUBLIC;

	/** Access level of the constructor that initialize all fields */
	Access allFieldsInitializer() default Access.NONE;
}
