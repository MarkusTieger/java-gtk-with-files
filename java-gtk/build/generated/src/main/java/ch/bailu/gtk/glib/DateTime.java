/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure that represents a date and time, including a time zone.
 * <p><a href="https://docs.gtk.org/glib/struct.DateTime.html">https://docs.gtk.org/glib/struct.DateTime.html</a></p>
*/
public class DateTime extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DateTime.class.getCanonicalName());
    }

    public DateTime(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GDateTime corresponding to the given
     * <br>[ISO 8601 formatted string](https://en.wikipedia.org/wiki/ISO_8601)
     * <br>&#64;text. ISO 8601 strings of the form &lt;date&gt;&lt;sep&gt;&lt;time&gt;&lt;tz&gt; are supported, with
     * <br>some extensions from [RFC 3339](https://tools.ietf.org/html/rfc3339) as
     * <br>mentioned below.
     * <br>
     * <br>Note that as &#35;GDateTime &quot;is oblivious to leap seconds&quot;, leap seconds information
     * <br>in an ISO-8601 string will be ignored, so a `23:59:60` time would be parsed as
     * <br>`23:59:59`.
     * <br>
     * <br>&lt;sep&gt; is the separator and can be either 'T', 't' or ' '. The latter two
     * <br>separators are an extension from
     * <br>[RFC 3339](https://tools.ietf.org/html/rfc3339&#35;section-5.6).
     * <br>
     * <br>&lt;date&gt; is in the form:
     * <br>
     * <br>- `YYYY-MM-DD` - Year/month/day, e.g. 2016-08-24.
     * <br>- `YYYYMMDD` - Same as above without dividers.
     * <br>- `YYYY-DDD` - Ordinal day where DDD is from 001 to 366, e.g. 2016-237.
     * <br>- `YYYYDDD` - Same as above without dividers.
     * <br>- `YYYY-Www-D` - Week day where ww is from 01 to 52 and D from 1-7,
     * <br>  e.g. 2016-W34-3.
     * <br>- `YYYYWwwD` - Same as above without dividers.
     * <br>
     * <br>&lt;time&gt; is in the form:
     * <br>
     * <br>- `hh:mm:ss(.sss)` - Hours, minutes, seconds (subseconds), e.g. 22:10:42.123.
     * <br>- `hhmmss(.sss)` - Same as above without dividers.
     * <br>
     * <br>&lt;tz&gt; is an optional timezone suffix of the form:
     * <br>
     * <br>- `Z` - UTC.
     * <br>- `+hh:mm` or `-hh:mm` - Offset from UTC in hours and minutes, e.g. +12:00.
     * <br>- `+hh` or `-hh` - Offset from UTC in hours, e.g. +12.
     * <br>
     * <br>If the timezone is not provided in &#64;text it must be provided in &#64;default_tz
     * <br>(this field is otherwise ignored).
     * <br>
     * <br>This call can fail (returning %NULL) if &#64;text is not a valid ISO 8601
     * <br>formatted string.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param text an ISO 8601 formatted time string.
     * @param default_tz a &#35;GTimeZone to use if the text doesn't contain a                          timezone, or %NULL.
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newFromIso8601DateTime(@Nonnull ch.bailu.gtk.type.Str text, @Nullable TimeZone default_tz)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_from_iso8601(asCPointerNotNull(text), asCPointer(default_tz)));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newFromIso8601");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to the given
     * <br>[ISO 8601 formatted string](https://en.wikipedia.org/wiki/ISO_8601)
     * <br>&#64;text. ISO 8601 strings of the form &lt;date&gt;&lt;sep&gt;&lt;time&gt;&lt;tz&gt; are supported, with
     * <br>some extensions from [RFC 3339](https://tools.ietf.org/html/rfc3339) as
     * <br>mentioned below.
     * <br>
     * <br>Note that as &#35;GDateTime &quot;is oblivious to leap seconds&quot;, leap seconds information
     * <br>in an ISO-8601 string will be ignored, so a `23:59:60` time would be parsed as
     * <br>`23:59:59`.
     * <br>
     * <br>&lt;sep&gt; is the separator and can be either 'T', 't' or ' '. The latter two
     * <br>separators are an extension from
     * <br>[RFC 3339](https://tools.ietf.org/html/rfc3339&#35;section-5.6).
     * <br>
     * <br>&lt;date&gt; is in the form:
     * <br>
     * <br>- `YYYY-MM-DD` - Year/month/day, e.g. 2016-08-24.
     * <br>- `YYYYMMDD` - Same as above without dividers.
     * <br>- `YYYY-DDD` - Ordinal day where DDD is from 001 to 366, e.g. 2016-237.
     * <br>- `YYYYDDD` - Same as above without dividers.
     * <br>- `YYYY-Www-D` - Week day where ww is from 01 to 52 and D from 1-7,
     * <br>  e.g. 2016-W34-3.
     * <br>- `YYYYWwwD` - Same as above without dividers.
     * <br>
     * <br>&lt;time&gt; is in the form:
     * <br>
     * <br>- `hh:mm:ss(.sss)` - Hours, minutes, seconds (subseconds), e.g. 22:10:42.123.
     * <br>- `hhmmss(.sss)` - Same as above without dividers.
     * <br>
     * <br>&lt;tz&gt; is an optional timezone suffix of the form:
     * <br>
     * <br>- `Z` - UTC.
     * <br>- `+hh:mm` or `-hh:mm` - Offset from UTC in hours and minutes, e.g. +12:00.
     * <br>- `+hh` or `-hh` - Offset from UTC in hours, e.g. +12.
     * <br>
     * <br>If the timezone is not provided in &#64;text it must be provided in &#64;default_tz
     * <br>(this field is otherwise ignored).
     * <br>
     * <br>This call can fail (returning %NULL) if &#64;text is not a valid ISO 8601
     * <br>formatted string.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param text an ISO 8601 formatted time string.
     * @param default_tz a &#35;GTimeZone to use if the text doesn't contain a                          timezone, or %NULL.
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newFromIso8601DateTime(String text, @Nullable TimeZone default_tz)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_from_iso8601(text, asCPointer(default_tz)));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newFromIso8601");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to the given Unix time &#64;t in the
     * <br>local time zone.
     * <br>
     * <br>Unix time is the number of seconds that have elapsed since 1970-01-01
     * <br>00:00:00 UTC, regardless of the local time offset.
     * <br>
     * <br>This call can fail (returning %NULL) if &#64;t represents a time outside
     * <br>of the supported range of &#35;GDateTime.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param t the Unix time
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newFromUnixLocalDateTime(long t)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_from_unix_local(t));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newFromUnixLocal");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to the given Unix time &#64;t in UTC.
     * <br>
     * <br>Unix time is the number of seconds that have elapsed since 1970-01-01
     * <br>00:00:00 UTC.
     * <br>
     * <br>This call can fail (returning %NULL) if &#64;t represents a time outside
     * <br>of the supported range of &#35;GDateTime.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param t the Unix time
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newFromUnixUtcDateTime(long t)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_from_unix_utc(t));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newFromUnixUtc");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a new &#35;GDateTime corresponding to the given date and time in
     * <br>the local time zone.
     * <br>
     * <br>This call is equivalent to calling g_date_time_new() with the time
     * <br>zone returned by g_time_zone_new_local().
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
     * @return a &#35;GDateTime, or %NULL
    */
    public static DateTime newLocalDateTime(int year, int month, int day, int hour, int minute, double seconds)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_local(year, month, day, hour, minute, seconds));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newLocal");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to this exact instant in the given
     * <br>time zone &#64;tz.  The time is as accurate as the system allows, to a
     * <br>maximum accuracy of 1 microsecond.
     * <br>
     * <br>This function will always succeed unless GLib is still being used after the
     * <br>year 9999.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param tz a &#35;GTimeZone
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newNowDateTime(@Nonnull TimeZone tz)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_now(asCPointerNotNull(tz)));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newNow");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to this exact instant in the local
     * <br>time zone.
     * <br>
     * <br>This is equivalent to calling g_date_time_new_now() with the time
     * <br>zone returned by g_time_zone_new_local().
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newNowLocalDateTime()  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_now_local());
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newNowLocal");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a &#35;GDateTime corresponding to this exact instant in UTC.
     * <br>
     * <br>This is equivalent to calling g_date_time_new_now() with the time
     * <br>zone returned by g_time_zone_new_utc().
     * @return a new &#35;GDateTime, or %NULL
    */
    public static DateTime newNowUtcDateTime()  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_now_utc());
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newNowUtc");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a new &#35;GDateTime corresponding to the given date and time in
     * <br>UTC.
     * <br>
     * <br>This call is equivalent to calling g_date_time_new() with the time
     * <br>zone returned by g_time_zone_new_utc().
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
     * @return a &#35;GDateTime, or %NULL
    */
    public static DateTime newUtcDateTime(int year, int month, int day, int hour, int minute, double seconds)  {
        PointerContainer __self = cast(JnaDateTime.INST().g_date_time_new_utc(year, month, day, hour, minute, seconds));
        if (__self.isNull()) {
            throw new NullPointerException("DateTime:newUtc");
        }
        return new DateTime(__self);
    }        
    

    /**
     * Creates a new &#35;GDateTime corresponding to the given date and time in
     * <br>the time zone &#64;tz.
     * <br>
     * <br>The &#64;year must be between 1 and 9999, &#64;month between 1 and 12 and &#64;day
     * <br>between 1 and 28, 29, 30 or 31 depending on the month and the year.
     * <br>
     * <br>&#64;hour must be between 0 and 23 and &#64;minute must be between 0 and 59.
     * <br>
     * <br>&#64;seconds must be at least 0.0 and must be strictly less than 60.0.
     * <br>It will be rounded down to the nearest microsecond.
     * <br>
     * <br>If the given time is not representable in the given time zone (for
     * <br>example, 02:30 on March 14th 2010 in Toronto, due to daylight savings
     * <br>time) then the time will be rounded up to the nearest existing time
     * <br>(in this case, 03:00).  If this matters to you then you should verify
     * <br>the return value for containing the same as the numbers you gave.
     * <br>
     * <br>In the case that the given time is ambiguous in the given time zone
     * <br>(for example, 01:30 on November 7th 2010 in Toronto, due to daylight
     * <br>savings time) then the time falling within standard (ie:
     * <br>non-daylight) time is taken.
     * <br>
     * <br>It not considered a programmer error for the values to this function
     * <br>to be out of range, but in the case that they are, the function will
     * <br>return %NULL.
     * <br>
     * <br>You should release the return value by calling g_date_time_unref()
     * <br>when you are done with it.
     * @param tz a &#35;GTimeZone
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
    */
    public DateTime(@Nonnull TimeZone tz, int year, int month, int day, int hour, int minute, double seconds) {
        super(cast(JnaDateTime.INST().g_date_time_new(asCPointerNotNull(tz), year, month, day, hour, minute, seconds)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of days to the
     * <br>copy. Add negative values to subtract days.
     * @param days the number of days
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addDays(int days)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_days(asCPointer(), days)));
    }

    /**
     * Creates a new &#35;GDateTime adding the specified values to the current date and
     * <br>time in &#64;datetime. Add negative values to subtract.
     * @param years the number of years to add
     * @param months the number of months to add
     * @param days the number of days to add
     * @param hours the number of hours to add
     * @param minutes the number of minutes to add
     * @param seconds the number of seconds to add
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addFull(int years, int months, int days, int hours, int minutes, double seconds)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_full(asCPointer(), years, months, days, hours, minutes, seconds)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of hours.
     * <br>Add negative values to subtract hours.
     * @param hours the number of hours to add
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addHours(int hours)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_hours(asCPointer(), hours)));
    }

    /**
     * Creates a copy of &#64;datetime adding the specified number of minutes.
     * <br>Add negative values to subtract minutes.
     * @param minutes the number of minutes to add
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addMinutes(int minutes)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_minutes(asCPointer(), minutes)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of months to the
     * <br>copy. Add negative values to subtract months.
     * <br>
     * <br>The day of the month of the resulting &#35;GDateTime is clamped to the number
     * <br>of days in the updated calendar month. For example, if adding 1 month to
     * <br>31st January 2018, the result would be 28th February 2018. In 2020 (a leap
     * <br>year), the result would be 29th February.
     * @param months the number of months
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addMonths(int months)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_months(asCPointer(), months)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of seconds.
     * <br>Add negative values to subtract seconds.
     * @param seconds the number of seconds to add
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addSeconds(double seconds)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_seconds(asCPointer(), seconds)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of weeks to the
     * <br>copy. Add negative values to subtract weeks.
     * @param weeks the number of weeks
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addWeeks(int weeks)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_weeks(asCPointer(), weeks)));
    }

    /**
     * Creates a copy of &#64;datetime and adds the specified number of years to the
     * <br>copy. Add negative values to subtract years.
     * <br>
     * <br>As with g_date_time_add_months(), if the resulting date would be 29th
     * <br>February on a non-leap year, the day will be clamped to 28th February.
     * @param years the number of years
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime addYears(int years)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_add_years(asCPointer(), years)));
    }

    /**
     * A comparison function for &#35;GDateTimes that is suitable
     * <br>as a &#35;GCompareFunc. Both &#35;GDateTimes must be non-%NULL.
     * @param dt2 second &#35;GDateTime to compare
     * @return -1, 0 or 1 if &#64;dt1 is less than, equal to or greater   than &#64;dt2.
    */
    public int compare(@Nonnull ch.bailu.gtk.type.Pointer dt2)  {
        return JnaDateTime.INST().g_date_time_compare(asCPointer(), asCPointerNotNull(dt2));
    }

    /**
     * Checks to see if &#64;dt1 and &#64;dt2 are equal.
     * <br>
     * <br>Equal here means that they represent the same moment after converting
     * <br>them to the same time zone.
     * @param dt2 a &#35;GDateTime
     * @return %TRUE if &#64;dt1 and &#64;dt2 are equal
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer dt2)  {
        return JnaDateTime.INST().g_date_time_equal(asCPointer(), asCPointerNotNull(dt2));
    }

    /**
     * Creates a newly allocated string representing the requested &#64;format.
     * <br>
     * <br>The format strings understood by this function are a subset of the
     * <br>strftime() format language as specified by C99.  The &#92;%D, &#92;%U and &#92;%W
     * <br>conversions are not supported, nor is the 'E' modifier.  The GNU
     * <br>extensions &#92;%k, &#92;%l, &#92;%s and &#92;%P are supported, however, as are the
     * <br>'0', '_' and '-' modifiers. The Python extension &#92;%f is also supported.
     * <br>
     * <br>In contrast to strftime(), this function always produces a UTF-8
     * <br>string, regardless of the current locale.  Note that the rendering of
     * <br>many formats is locale-dependent and may not match the strftime()
     * <br>output exactly.
     * <br>
     * <br>The following format specifiers are supported:
     * <br>
     * <br>- &#92;%a: the abbreviated weekday name according to the current locale
     * <br>- &#92;%A: the full weekday name according to the current locale
     * <br>- &#92;%b: the abbreviated month name according to the current locale
     * <br>- &#92;%B: the full month name according to the current locale
     * <br>- &#92;%c: the preferred date and time representation for the current locale
     * <br>- &#92;%C: the century number (year/100) as a 2-digit integer (00-99)
     * <br>- &#92;%d: the day of the month as a decimal number (range 01 to 31)
     * <br>- &#92;%e: the day of the month as a decimal number (range 1 to 31);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%F: equivalent to `%Y-%m-%d` (the ISO 8601 date format)
     * <br>- &#92;%g: the last two digits of the ISO 8601 week-based year as a
     * <br>  decimal number (00-99). This works well with &#92;%V and &#92;%u.
     * <br>- &#92;%G: the ISO 8601 week-based year as a decimal number. This works
     * <br>  well with &#92;%V and &#92;%u.
     * <br>- &#92;%h: equivalent to &#92;%b
     * <br>- &#92;%H: the hour as a decimal number using a 24-hour clock (range 00 to 23)
     * <br>- &#92;%I: the hour as a decimal number using a 12-hour clock (range 01 to 12)
     * <br>- &#92;%j: the day of the year as a decimal number (range 001 to 366)
     * <br>- &#92;%k: the hour (24-hour clock) as a decimal number (range 0 to 23);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%l: the hour (12-hour clock) as a decimal number (range 1 to 12);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%m: the month as a decimal number (range 01 to 12)
     * <br>- &#92;%M: the minute as a decimal number (range 00 to 59)
     * <br>- &#92;%f: the microsecond as a decimal number (range 000000 to 999999)
     * <br>- &#92;%p: either &quot;AM&quot; or &quot;PM&quot; according to the given time value, or the
     * <br>  corresponding  strings for the current locale.  Noon is treated as
     * <br>  &quot;PM&quot; and midnight as &quot;AM&quot;. Use of this format specifier is discouraged, as
     * <br>  many locales have no concept of AM/PM formatting. Use &#92;%c or &#92;%X instead.
     * <br>- &#92;%P: like &#92;%p but lowercase: &quot;am&quot; or &quot;pm&quot; or a corresponding string for
     * <br>  the current locale. Use of this format specifier is discouraged, as
     * <br>  many locales have no concept of AM/PM formatting. Use &#92;%c or &#92;%X instead.
     * <br>- &#92;%r: the time in a.m. or p.m. notation. Use of this format specifier is
     * <br>  discouraged, as many locales have no concept of AM/PM formatting. Use &#92;%c
     * <br>  or &#92;%X instead.
     * <br>- &#92;%R: the time in 24-hour notation (&#92;%H:&#92;%M)
     * <br>- &#92;%s: the number of seconds since the Epoch, that is, since 1970-01-01
     * <br>  00:00:00 UTC
     * <br>- &#92;%S: the second as a decimal number (range 00 to 60)
     * <br>- &#92;%t: a tab character
     * <br>- &#92;%T: the time in 24-hour notation with seconds (&#92;%H:&#92;%M:&#92;%S)
     * <br>- &#92;%u: the ISO 8601 standard day of the week as a decimal, range 1 to 7,
     * <br>   Monday being 1. This works well with &#92;%G and &#92;%V.
     * <br>- &#92;%V: the ISO 8601 standard week number of the current year as a decimal
     * <br>  number, range 01 to 53, where week 1 is the first week that has at
     * <br>  least 4 days in the new year. See g_date_time_get_week_of_year().
     * <br>  This works well with &#92;%G and &#92;%u.
     * <br>- &#92;%w: the day of the week as a decimal, range 0 to 6, Sunday being 0.
     * <br>  This is not the ISO 8601 standard format -- use &#92;%u instead.
     * <br>- &#92;%x: the preferred date representation for the current locale without
     * <br>  the time
     * <br>- &#92;%X: the preferred time representation for the current locale without
     * <br>  the date
     * <br>- &#92;%y: the year as a decimal number without the century
     * <br>- &#92;%Y: the year as a decimal number including the century
     * <br>- &#92;%z: the time zone as an offset from UTC (+hhmm)
     * <br>- &#92;%:z: the time zone as an offset from UTC (+hh:mm).
     * <br>  This is a gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%::z: the time zone as an offset from UTC (+hh:mm:ss). This is a
     * <br>  gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%:::z: the time zone as an offset from UTC, with : to necessary
     * <br>  precision (e.g., -04, +05:30). This is a gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%Z: the time zone or name or abbreviation
     * <br>- &#92;%&#92;%: a literal &#92;% character
     * <br>
     * <br>Some conversion specifications can be modified by preceding the
     * <br>conversion specifier by one or more modifier characters. The
     * <br>following modifiers are supported for many of the numeric
     * <br>conversions:
     * <br>
     * <br>- O: Use alternative numeric symbols, if the current locale supports those.
     * <br>- _: Pad a numeric result with spaces. This overrides the default padding
     * <br>  for the specifier.
     * <br>- -: Do not pad a numeric result. This overrides the default padding
     * <br>  for the specifier.
     * <br>- 0: Pad a numeric result with zeros. This overrides the default padding
     * <br>  for the specifier.
     * <br>
     * <br>Additionally, when O is used with B, b, or h, it produces the alternative
     * <br>form of a month name. The alternative form should be used when the month
     * <br>name is used without a day number (e.g., standalone). It is required in
     * <br>some languages (Baltic, Slavic, Greek, and more) due to their grammatical
     * <br>rules. For other languages there is no difference. &#92;%OB is a GNU and BSD
     * <br>strftime() extension expected to be added to the future POSIX specification,
     * <br>&#92;%Ob and &#92;%Oh are GNU strftime() extensions. Since: 2.56
     * @param format a valid UTF-8 string, containing the format for the          &#35;GDateTime
     * @return a newly allocated string formatted to    the requested format or %NULL in the case that there was an error (such    as a format specifier not being supported in the current locale). The    string should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str format(@Nonnull ch.bailu.gtk.type.Str format)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDateTime.INST().g_date_time_format(asCPointer(), asCPointerNotNull(format))));
    }

    /**
     * Creates a newly allocated string representing the requested &#64;format.
     * <br>
     * <br>The format strings understood by this function are a subset of the
     * <br>strftime() format language as specified by C99.  The &#92;%D, &#92;%U and &#92;%W
     * <br>conversions are not supported, nor is the 'E' modifier.  The GNU
     * <br>extensions &#92;%k, &#92;%l, &#92;%s and &#92;%P are supported, however, as are the
     * <br>'0', '_' and '-' modifiers. The Python extension &#92;%f is also supported.
     * <br>
     * <br>In contrast to strftime(), this function always produces a UTF-8
     * <br>string, regardless of the current locale.  Note that the rendering of
     * <br>many formats is locale-dependent and may not match the strftime()
     * <br>output exactly.
     * <br>
     * <br>The following format specifiers are supported:
     * <br>
     * <br>- &#92;%a: the abbreviated weekday name according to the current locale
     * <br>- &#92;%A: the full weekday name according to the current locale
     * <br>- &#92;%b: the abbreviated month name according to the current locale
     * <br>- &#92;%B: the full month name according to the current locale
     * <br>- &#92;%c: the preferred date and time representation for the current locale
     * <br>- &#92;%C: the century number (year/100) as a 2-digit integer (00-99)
     * <br>- &#92;%d: the day of the month as a decimal number (range 01 to 31)
     * <br>- &#92;%e: the day of the month as a decimal number (range 1 to 31);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%F: equivalent to `%Y-%m-%d` (the ISO 8601 date format)
     * <br>- &#92;%g: the last two digits of the ISO 8601 week-based year as a
     * <br>  decimal number (00-99). This works well with &#92;%V and &#92;%u.
     * <br>- &#92;%G: the ISO 8601 week-based year as a decimal number. This works
     * <br>  well with &#92;%V and &#92;%u.
     * <br>- &#92;%h: equivalent to &#92;%b
     * <br>- &#92;%H: the hour as a decimal number using a 24-hour clock (range 00 to 23)
     * <br>- &#92;%I: the hour as a decimal number using a 12-hour clock (range 01 to 12)
     * <br>- &#92;%j: the day of the year as a decimal number (range 001 to 366)
     * <br>- &#92;%k: the hour (24-hour clock) as a decimal number (range 0 to 23);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%l: the hour (12-hour clock) as a decimal number (range 1 to 12);
     * <br>  single digits are preceded by a figure space
     * <br>- &#92;%m: the month as a decimal number (range 01 to 12)
     * <br>- &#92;%M: the minute as a decimal number (range 00 to 59)
     * <br>- &#92;%f: the microsecond as a decimal number (range 000000 to 999999)
     * <br>- &#92;%p: either &quot;AM&quot; or &quot;PM&quot; according to the given time value, or the
     * <br>  corresponding  strings for the current locale.  Noon is treated as
     * <br>  &quot;PM&quot; and midnight as &quot;AM&quot;. Use of this format specifier is discouraged, as
     * <br>  many locales have no concept of AM/PM formatting. Use &#92;%c or &#92;%X instead.
     * <br>- &#92;%P: like &#92;%p but lowercase: &quot;am&quot; or &quot;pm&quot; or a corresponding string for
     * <br>  the current locale. Use of this format specifier is discouraged, as
     * <br>  many locales have no concept of AM/PM formatting. Use &#92;%c or &#92;%X instead.
     * <br>- &#92;%r: the time in a.m. or p.m. notation. Use of this format specifier is
     * <br>  discouraged, as many locales have no concept of AM/PM formatting. Use &#92;%c
     * <br>  or &#92;%X instead.
     * <br>- &#92;%R: the time in 24-hour notation (&#92;%H:&#92;%M)
     * <br>- &#92;%s: the number of seconds since the Epoch, that is, since 1970-01-01
     * <br>  00:00:00 UTC
     * <br>- &#92;%S: the second as a decimal number (range 00 to 60)
     * <br>- &#92;%t: a tab character
     * <br>- &#92;%T: the time in 24-hour notation with seconds (&#92;%H:&#92;%M:&#92;%S)
     * <br>- &#92;%u: the ISO 8601 standard day of the week as a decimal, range 1 to 7,
     * <br>   Monday being 1. This works well with &#92;%G and &#92;%V.
     * <br>- &#92;%V: the ISO 8601 standard week number of the current year as a decimal
     * <br>  number, range 01 to 53, where week 1 is the first week that has at
     * <br>  least 4 days in the new year. See g_date_time_get_week_of_year().
     * <br>  This works well with &#92;%G and &#92;%u.
     * <br>- &#92;%w: the day of the week as a decimal, range 0 to 6, Sunday being 0.
     * <br>  This is not the ISO 8601 standard format -- use &#92;%u instead.
     * <br>- &#92;%x: the preferred date representation for the current locale without
     * <br>  the time
     * <br>- &#92;%X: the preferred time representation for the current locale without
     * <br>  the date
     * <br>- &#92;%y: the year as a decimal number without the century
     * <br>- &#92;%Y: the year as a decimal number including the century
     * <br>- &#92;%z: the time zone as an offset from UTC (+hhmm)
     * <br>- &#92;%:z: the time zone as an offset from UTC (+hh:mm).
     * <br>  This is a gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%::z: the time zone as an offset from UTC (+hh:mm:ss). This is a
     * <br>  gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%:::z: the time zone as an offset from UTC, with : to necessary
     * <br>  precision (e.g., -04, +05:30). This is a gnulib strftime() extension. Since: 2.38
     * <br>- &#92;%Z: the time zone or name or abbreviation
     * <br>- &#92;%&#92;%: a literal &#92;% character
     * <br>
     * <br>Some conversion specifications can be modified by preceding the
     * <br>conversion specifier by one or more modifier characters. The
     * <br>following modifiers are supported for many of the numeric
     * <br>conversions:
     * <br>
     * <br>- O: Use alternative numeric symbols, if the current locale supports those.
     * <br>- _: Pad a numeric result with spaces. This overrides the default padding
     * <br>  for the specifier.
     * <br>- -: Do not pad a numeric result. This overrides the default padding
     * <br>  for the specifier.
     * <br>- 0: Pad a numeric result with zeros. This overrides the default padding
     * <br>  for the specifier.
     * <br>
     * <br>Additionally, when O is used with B, b, or h, it produces the alternative
     * <br>form of a month name. The alternative form should be used when the month
     * <br>name is used without a day number (e.g., standalone). It is required in
     * <br>some languages (Baltic, Slavic, Greek, and more) due to their grammatical
     * <br>rules. For other languages there is no difference. &#92;%OB is a GNU and BSD
     * <br>strftime() extension expected to be added to the future POSIX specification,
     * <br>&#92;%Ob and &#92;%Oh are GNU strftime() extensions. Since: 2.56
     * @param format a valid UTF-8 string, containing the format for the          &#35;GDateTime
     * @return a newly allocated string formatted to    the requested format or %NULL in the case that there was an error (such    as a format specifier not being supported in the current locale). The    string should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str format(String format)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDateTime.INST().g_date_time_format(asCPointer(), format)));
    }

    /**
     * Format &#64;datetime in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601),
     * <br>including the date, time and time zone, and return that as a UTF-8 encoded
     * <br>string.
     * <br>
     * <br>Since GLib 2.66, this will output to sub-second precision if needed.
     * @return a newly allocated string formatted in   ISO 8601 format or %NULL in the case that there was an error. The string   should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str formatIso8601()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDateTime.INST().g_date_time_format_iso8601(asCPointer())));
    }

    /**
     * Retrieves the day of the month represented by &#64;datetime in the gregorian
     * <br>calendar.
     * @return the day of the month
    */
    public int getDayOfMonth()  {
        return JnaDateTime.INST().g_date_time_get_day_of_month(asCPointer());
    }

    /**
     * Retrieves the ISO 8601 day of the week on which &#64;datetime falls (1 is
     * <br>Monday, 2 is Tuesday... 7 is Sunday).
     * @return the day of the week
    */
    public int getDayOfWeek()  {
        return JnaDateTime.INST().g_date_time_get_day_of_week(asCPointer());
    }

    /**
     * Retrieves the day of the year represented by &#64;datetime in the Gregorian
     * <br>calendar.
     * @return the day of the year
    */
    public int getDayOfYear()  {
        return JnaDateTime.INST().g_date_time_get_day_of_year(asCPointer());
    }

    /**
     * Retrieves the hour of the day represented by &#64;datetime
     * @return the hour of the day
    */
    public int getHour()  {
        return JnaDateTime.INST().g_date_time_get_hour(asCPointer());
    }

    /**
     * Retrieves the microsecond of the date represented by &#64;datetime
     * @return the microsecond of the second
    */
    public int getMicrosecond()  {
        return JnaDateTime.INST().g_date_time_get_microsecond(asCPointer());
    }

    /**
     * Retrieves the minute of the hour represented by &#64;datetime
     * @return the minute of the hour
    */
    public int getMinute()  {
        return JnaDateTime.INST().g_date_time_get_minute(asCPointer());
    }

    /**
     * Retrieves the month of the year represented by &#64;datetime in the Gregorian
     * <br>calendar.
     * @return the month represented by &#64;datetime
    */
    public int getMonth()  {
        return JnaDateTime.INST().g_date_time_get_month(asCPointer());
    }

    /**
     * Retrieves the second of the minute represented by &#64;datetime
     * @return the second represented by &#64;datetime
    */
    public int getSecond()  {
        return JnaDateTime.INST().g_date_time_get_second(asCPointer());
    }

    /**
     * Retrieves the number of seconds since the start of the last minute,
     * <br>including the fractional part.
     * @return the number of seconds
    */
    public double getSeconds()  {
        return JnaDateTime.INST().g_date_time_get_seconds(asCPointer());
    }

    /**
     * Get the time zone for this &#64;datetime.
     * @return the time zone
    */
    public TimeZone getTimezone()  {
        return new TimeZone(new PointerContainer(JnaDateTime.INST().g_date_time_get_timezone(asCPointer())));
    }

    /**
     * Determines the time zone abbreviation to be used at the time and in
     * <br>the time zone of &#64;datetime.
     * <br>
     * <br>For example, in Toronto this is currently &quot;EST&quot; during the winter
     * <br>months and &quot;EDT&quot; during the summer months when daylight savings
     * <br>time is in effect.
     * @return the time zone abbreviation. The returned          string is owned by the &#35;GDateTime and it should not be          modified or freed
    */
    public ch.bailu.gtk.type.Str getTimezoneAbbreviation()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDateTime.INST().g_date_time_get_timezone_abbreviation(asCPointer())));
    }

    /**
     * Returns the ISO 8601 week-numbering year in which the week containing
     * <br>&#64;datetime falls.
     * <br>
     * <br>This function, taken together with g_date_time_get_week_of_year() and
     * <br>g_date_time_get_day_of_week() can be used to determine the full ISO
     * <br>week date on which &#64;datetime falls.
     * <br>
     * <br>This is usually equal to the normal Gregorian year (as returned by
     * <br>g_date_time_get_year()), except as detailed below:
     * <br>
     * <br>For Thursday, the week-numbering year is always equal to the usual
     * <br>calendar year.  For other days, the number is such that every day
     * <br>within a complete week (Monday to Sunday) is contained within the
     * <br>same week-numbering year.
     * <br>
     * <br>For Monday, Tuesday and Wednesday occurring near the end of the year,
     * <br>this may mean that the week-numbering year is one greater than the
     * <br>calendar year (so that these days have the same week-numbering year
     * <br>as the Thursday occurring early in the next year).
     * <br>
     * <br>For Friday, Saturday and Sunday occurring near the start of the year,
     * <br>this may mean that the week-numbering year is one less than the
     * <br>calendar year (so that these days have the same week-numbering year
     * <br>as the Thursday occurring late in the previous year).
     * <br>
     * <br>An equivalent description is that the week-numbering year is equal to
     * <br>the calendar year containing the majority of the days in the current
     * <br>week (Monday to Sunday).
     * <br>
     * <br>Note that January 1 0001 in the proleptic Gregorian calendar is a
     * <br>Monday, so this function never returns 0.
     * @return the ISO 8601 week-numbering year for &#64;datetime
    */
    public int getWeekNumberingYear()  {
        return JnaDateTime.INST().g_date_time_get_week_numbering_year(asCPointer());
    }

    /**
     * Returns the ISO 8601 week number for the week containing &#64;datetime.
     * <br>The ISO 8601 week number is the same for every day of the week (from
     * <br>Moday through Sunday).  That can produce some unusual results
     * <br>(described below).
     * <br>
     * <br>The first week of the year is week 1.  This is the week that contains
     * <br>the first Thursday of the year.  Equivalently, this is the first week
     * <br>that has more than 4 of its days falling within the calendar year.
     * <br>
     * <br>The value 0 is never returned by this function.  Days contained
     * <br>within a year but occurring before the first ISO 8601 week of that
     * <br>year are considered as being contained in the last week of the
     * <br>previous year.  Similarly, the final days of a calendar year may be
     * <br>considered as being part of the first ISO 8601 week of the next year
     * <br>if 4 or more days of that week are contained within the new year.
     * @return the ISO 8601 week number for &#64;datetime.
    */
    public int getWeekOfYear()  {
        return JnaDateTime.INST().g_date_time_get_week_of_year(asCPointer());
    }

    /**
     * Retrieves the year represented by &#64;datetime in the Gregorian calendar.
     * @return the year represented by &#64;datetime
    */
    public int getYear()  {
        return JnaDateTime.INST().g_date_time_get_year(asCPointer());
    }

    /**
     * Retrieves the Gregorian day, month, and year of a given &#35;GDateTime.
     * @param year the return location for the gregorian year, or %NULL.
     * @param month the return location for the month of the year, or %NULL.
     * @param day the return location for the day of the month, or %NULL.
    */
    public void getYmd(@Nullable ch.bailu.gtk.type.Int year, @Nullable ch.bailu.gtk.type.Int month, @Nullable ch.bailu.gtk.type.Int day)  {
        JnaDateTime.INST().g_date_time_get_ymd(asCPointer(), asCPointer(year), asCPointer(month), asCPointer(day));
    }

    /**
     * Hashes &#64;datetime into a &#35;guint, suitable for use within &#35;GHashTable.
     * @return a &#35;guint containing the hash
    */
    public int hash()  {
        return JnaDateTime.INST().g_date_time_hash(asCPointer());
    }

    /**
     * Determines if daylight savings time is in effect at the time and in
     * <br>the time zone of &#64;datetime.
     * @return %TRUE if daylight savings time is in effect
    */
    public boolean isDaylightSavings()  {
        return JnaDateTime.INST().g_date_time_is_daylight_savings(asCPointer());
    }

    /**
     * Atomically increments the reference count of &#64;datetime by one.
     * @return the &#35;GDateTime with the reference count increased
    */
    public DateTime ref()  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_ref(asCPointer())));
    }

    /**
     * Creates a new &#35;GDateTime corresponding to the same instant in time as
     * <br>&#64;datetime, but in the local time zone.
     * <br>
     * <br>This call is equivalent to calling g_date_time_to_timezone() with the
     * <br>time zone returned by g_time_zone_new_local().
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime toLocal()  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_to_local(asCPointer())));
    }

    /**
     * Create a new &#35;GDateTime corresponding to the same instant in time as
     * <br>&#64;datetime, but in the time zone &#64;tz.
     * <br>
     * <br>This call can fail in the case that the time goes out of bounds.  For
     * <br>example, converting 0001-01-01 00:00:00 UTC to a time zone west of
     * <br>Greenwich will fail (due to the year 0 being out of range).
     * @param tz the new &#35;GTimeZone
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime toTimezone(@Nonnull TimeZone tz)  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_to_timezone(asCPointer(), asCPointerNotNull(tz))));
    }

    /**
     * Gives the Unix time corresponding to &#64;datetime, rounding down to the
     * <br>nearest second.
     * <br>
     * <br>Unix time is the number of seconds that have elapsed since 1970-01-01
     * <br>00:00:00 UTC, regardless of the time zone associated with &#64;datetime.
     * @return the Unix time corresponding to &#64;datetime
    */
    public long toUnix()  {
        return JnaDateTime.INST().g_date_time_to_unix(asCPointer());
    }

    /**
     * Creates a new &#35;GDateTime corresponding to the same instant in time as
     * <br>&#64;datetime, but in UTC.
     * <br>
     * <br>This call is equivalent to calling g_date_time_to_timezone() with the
     * <br>time zone returned by g_time_zone_new_utc().
     * @return the newly created &#35;GDateTime which   should be freed with g_date_time_unref(), or %NULL
    */
    public DateTime toUtc()  {
        return new DateTime(new PointerContainer(JnaDateTime.INST().g_date_time_to_utc(asCPointer())));
    }

    /**
     * Atomically decrements the reference count of &#64;datetime by one.
     * <br>
     * <br>When the reference count reaches zero, the resources allocated by
     * <br>&#64;datetime are freed
    */
    public void unref()  {
        JnaDateTime.INST().g_date_time_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDateTime.INST().g_date_time_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
record-type
all-fields-supported

[MethodModel:cb-deprecated:newFromTimevalLocal:[ParameterModel:Supported:{Gg:DateTime:{c:GDateTime*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:const GTimeVal*}}:{j:long}]

[MethodModel:cb-deprecated:newFromTimevalUtc:[ParameterModel:Supported:{Gg:DateTime:{c:GDateTime*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:const GTimeVal*}}:{j:long}]

[MethodModel:java-type-not-supported:add:[ParameterModel:Supported:{Gg:DateTime:{c:GDateTime*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTimeSpan}}:{j:}]

[MethodModel:cb-return-value-not-supported:difference:[ParameterModel:java-type-not-supported:{G_::{c:GTimeSpan}}:{j:}]]
        [ParameterModel:Supported:{Gg:DateTime:{c:GDateTime*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getUtcOffset:[ParameterModel:java-type-not-supported:{G_::{c:GTimeSpan}}:{j:}]]

[MethodModel:cb-deprecated:toTimeval:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]
*/
