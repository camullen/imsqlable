package io.skio.imsqlable.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.skio.imsqlable.ColumnType;

@Retention(CLASS)
@Target(METHOD)
public @interface Column {
  String name() default "__inferred__";
  ColumnType type() default ColumnType.INFERRED;
}
