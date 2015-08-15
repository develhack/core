package com.develhack.annotation.feature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Additional metadata of any elements.
 */
@Documented
@Target({ ElementType.PACKAGE, ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD,
		ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE })
@Retention(RetentionPolicy.SOURCE)
public @interface Meta {

	/** Additional metadata */
	String[] value();
}
