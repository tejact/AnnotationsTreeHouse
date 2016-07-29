package com.teja.docgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Must for defining annotation. Value can be removed.
//Retention pollicy states the lifetime of anotations. Compiler or byte code or class
@Retention(value = RetentionPolicy.RUNTIME)
//Defines where the annotations can be used.
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Doc {
	//These are elements , ie attributes of Annotation
    /** Description of class or method */
	String Desc() default "";
    /** Description of parameters, if annotated element is a method & has parameters */
	String[] params() default {};
    /** Description of return value, if annotated element is a method & isn't void */
	String returnVal() default "";
}