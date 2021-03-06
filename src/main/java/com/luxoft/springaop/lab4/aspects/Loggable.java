package com.luxoft.springaop.lab4.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @see LoggingAspect#logIt(ProceedingJoinPoint)
 */
@Target({METHOD, TYPE})
@Retention(RUNTIME)
public @interface Loggable {
}
