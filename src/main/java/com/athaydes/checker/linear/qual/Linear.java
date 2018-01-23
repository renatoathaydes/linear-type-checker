package com.athaydes.checker.linear.qual;

import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.*;

/** @checker_framework.manual #linear-checker Linear Checker */
@Documented
@Retention( RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({TypeUseLocation.LOWER_BOUND})
@SubtypeOf(Normal.class)
public @interface Linear {}
