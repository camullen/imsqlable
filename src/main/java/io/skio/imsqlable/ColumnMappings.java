package io.skio.imsqlable;

import static io.skio.imsqlable.ColumnType.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ColumnMappings {
  public static final Map<ColumnType, Class<?>> COLUMN_TYPE_MAP =
    ImmutableMap.<ColumnType, Class<?>>builder()
    .put(BINARY, byte[].class)
    .put(BOOLEAN, Boolean.class)
    .put(DATE, Date.class)
    .put(DATETIME, Timestamp.class)
    .put(DECIMAL, BigDecimal.class)
    .put(FLOAT, Float.class)
    .put(INTEGER, Integer.class)
    .put(BIGINT, BigInteger.class)
    .put(PRIMARY_KEY, Long.class)
    .put(REFERENCES, Long.class)
    .put(TEXT, String.class)
    .put(STRING, String.class)
    .put(TIME, Time.class)
    .put(TIMESTAMP, Timestamp.class)
    .build();

}
