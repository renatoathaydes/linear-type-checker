package com.athaydes.checker.linear.qual;

import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.*;

/** @checker_framework.manual #linear-checker Linear Checker */
@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({})
public @interface Unusable {}
