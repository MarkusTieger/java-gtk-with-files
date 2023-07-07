/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTimeZone is an opaque structure whose members cannot be accessed
 * <br>directly.
 * <p><a href="https://docs.gtk.org/glib/struct.TimeZone.html">https://docs.gtk.org/glib/struct.TimeZone.html</a></p>
*/
public class TimeZone extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TimeZone.class.getCanonicalName());
    }

    public TimeZone(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GTimeZone corresponding to &#64;identifier. If &#64;identifier cannot be
     * <br>parsed or loaded, %NULL is returned.
     * <br>
     * <br>&#64;identifier can either be an RFC3339/ISO 8601 time offset or
     * <br>something that would pass as a valid value for the `TZ` environment
     * <br>variable (including %NULL).
     * <br>
     * <br>In Windows, &#64;identifier can also be the unlocalized name of a time
     * <br>zone for standard time, for example &quot;Pacific Standard Time&quot;.
     * <br>
     * <br>Valid RFC3339 time offsets are `&quot;Z&quot;` (for UTC) or
     * <br>`&quot;±hh:mm&quot;`.  ISO 8601 additionally specifies
     * <br>`&quot;±hhmm&quot;` and `&quot;±hh&quot;`.  Offsets are
     * <br>time values to be added to Coordinated Universal Time (UTC) to get
     * <br>the local time.
     * <br>
     * <br>In UNIX, the `TZ` environment variable typically corresponds
     * <br>to the name of a file in the zoneinfo database, an absolute path to a file
     * <br>somewhere else, or a string in
     * <br>&quot;std offset [dst [offset],start[/time],end[/time]]&quot; (POSIX) format.
     * <br>There  are  no spaces in the specification. The name of standard
     * <br>and daylight savings time zone must be three or more alphabetic
     * <br>characters. Offsets are time values to be added to local time to
     * <br>get Coordinated Universal Time (UTC) and should be
     * <br>`&quot;[±]hh[[:]mm[:ss]]&quot;`.  Dates are either
     * <br>`&quot;Jn&quot;` (Julian day with n between 1 and 365, leap
     * <br>years not counted), `&quot;n&quot;` (zero-based Julian day
     * <br>with n between 0 and 365) or `&quot;Mm.w.d&quot;` (day d
     * <br>(0 &lt;= d &lt;= 6) of week w (1 &lt;= w &lt;= 5) of month m (1 &lt;= m &lt;= 12), day
     * <br>0 is a Sunday).  Times are in local wall clock time, the default is
     * <br>02:00:00.
     * <br>
     * <br>In Windows, the &quot;tzn[+|–]hh[:mm[:ss]][dzn]&quot; format is used, but also
     * <br>accepts POSIX format.  The Windows format uses US rules for all time
     * <br>zones; daylight savings time is 60 minutes behind the standard time
     * <br>with date and time of change taken from Pacific Standard Time.
     * <br>Offsets are time values to be added to the local time to get
     * <br>Coordinated Universal Time (UTC).
     * <br>
     * <br>g_time_zone_new_local() calls this function with the value of the
     * <br>`TZ` environment variable. This function itself is independent of
     * <br>the value of `TZ`, but if &#64;identifier is %NULL then `/etc/localtime`
     * <br>will be consulted to discover the correct time zone on UNIX and the
     * <br>registry will be consulted or GetTimeZoneInformation() will be used
     * <br>to get the local time zone on Windows.
     * <br>
     * <br>If intervals are not available, only time zone rules from `TZ`
     * <br>environment variable or other means, then they will be computed
     * <br>from year 1900 to 2037.  If the maximum year for the rules is
     * <br>available and it is greater than 2037, then it will followed
     * <br>instead.
     * <br>
     * <br>See
     * <br>[RFC3339 §5.6](http://tools.ietf.org/html/rfc3339&#35;section-5.6)
     * <br>for a precise definition of valid RFC3339 time offsets
     * <br>(the `time-offset` expansion) and ISO 8601 for the
     * <br>full list of valid time offsets.  See
     * <br>[The GNU C Library manual](http://www.gnu.org/s/libc/manual/html_node/TZ-Variable.html)
     * <br>for an explanation of the possible
     * <br>values of the `TZ` environment variable. See
     * <br>[Microsoft Time Zone Index Values](http://msdn.microsoft.com/en-us/library/ms912391%28v=winembedded.11%29.aspx)
     * <br>for the list of time zones on Windows.
     * <br>
     * <br>You should release the return value by calling g_time_zone_unref()
     * <br>when you are done with it.
     * @param identifier a timezone identifier
     * @return the requested timezone, or %NULL on     failure
    */
    public static TimeZone newIdentifierTimeZone(@Nullable ch.bailu.gtk.type.Str identifier)  {
        PointerContainer __self = cast(JnaTimeZone.INST().g_time_zone_new_identifier(asCPointer(identifier)));
        if (__self.isNull()) {
            throw new NullPointerException("TimeZone:newIdentifier");
        }
        return new TimeZone(__self);
    }        
    

    /**
     * Creates a &#35;GTimeZone corresponding to &#64;identifier. If &#64;identifier cannot be
     * <br>parsed or loaded, %NULL is returned.
     * <br>
     * <br>&#64;identifier can either be an RFC3339/ISO 8601 time offset or
     * <br>something that would pass as a valid value for the `TZ` environment
     * <br>variable (including %NULL).
     * <br>
     * <br>In Windows, &#64;identifier can also be the unlocalized name of a time
     * <br>zone for standard time, for example &quot;Pacific Standard Time&quot;.
     * <br>
     * <br>Valid RFC3339 time offsets are `&quot;Z&quot;` (for UTC) or
     * <br>`&quot;±hh:mm&quot;`.  ISO 8601 additionally specifies
     * <br>`&quot;±hhmm&quot;` and `&quot;±hh&quot;`.  Offsets are
     * <br>time values to be added to Coordinated Universal Time (UTC) to get
     * <br>the local time.
     * <br>
     * <br>In UNIX, the `TZ` environment variable typically corresponds
     * <br>to the name of a file in the zoneinfo database, an absolute path to a file
     * <br>somewhere else, or a string in
     * <br>&quot;std offset [dst [offset],start[/time],end[/time]]&quot; (POSIX) format.
     * <br>There  are  no spaces in the specification. The name of standard
     * <br>and daylight savings time zone must be three or more alphabetic
     * <br>characters. Offsets are time values to be added to local time to
     * <br>get Coordinated Universal Time (UTC) and should be
     * <br>`&quot;[±]hh[[:]mm[:ss]]&quot;`.  Dates are either
     * <br>`&quot;Jn&quot;` (Julian day with n between 1 and 365, leap
     * <br>years not counted), `&quot;n&quot;` (zero-based Julian day
     * <br>with n between 0 and 365) or `&quot;Mm.w.d&quot;` (day d
     * <br>(0 &lt;= d &lt;= 6) of week w (1 &lt;= w &lt;= 5) of month m (1 &lt;= m &lt;= 12), day
     * <br>0 is a Sunday).  Times are in local wall clock time, the default is
     * <br>02:00:00.
     * <br>
     * <br>In Windows, the &quot;tzn[+|–]hh[:mm[:ss]][dzn]&quot; format is used, but also
     * <br>accepts POSIX format.  The Windows format uses US rules for all time
     * <br>zones; daylight savings time is 60 minutes behind the standard time
     * <br>with date and time of change taken from Pacific Standard Time.
     * <br>Offsets are time values to be added to the local time to get
     * <br>Coordinated Universal Time (UTC).
     * <br>
     * <br>g_time_zone_new_local() calls this function with the value of the
     * <br>`TZ` environment variable. This function itself is independent of
     * <br>the value of `TZ`, but if &#64;identifier is %NULL then `/etc/localtime`
     * <br>will be consulted to discover the correct time zone on UNIX and the
     * <br>registry will be consulted or GetTimeZoneInformation() will be used
     * <br>to get the local time zone on Windows.
     * <br>
     * <br>If intervals are not available, only time zone rules from `TZ`
     * <br>environment variable or other means, then they will be computed
     * <br>from year 1900 to 2037.  If the maximum year for the rules is
     * <br>available and it is greater than 2037, then it will followed
     * <br>instead.
     * <br>
     * <br>See
     * <br>[RFC3339 §5.6](http://tools.ietf.org/html/rfc3339&#35;section-5.6)
     * <br>for a precise definition of valid RFC3339 time offsets
     * <br>(the `time-offset` expansion) and ISO 8601 for the
     * <br>full list of valid time offsets.  See
     * <br>[The GNU C Library manual](http://www.gnu.org/s/libc/manual/html_node/TZ-Variable.html)
     * <br>for an explanation of the possible
     * <br>values of the `TZ` environment variable. See
     * <br>[Microsoft Time Zone Index Values](http://msdn.microsoft.com/en-us/library/ms912391%28v=winembedded.11%29.aspx)
     * <br>for the list of time zones on Windows.
     * <br>
     * <br>You should release the return value by calling g_time_zone_unref()
     * <br>when you are done with it.
     * @param identifier a timezone identifier
     * @return the requested timezone, or %NULL on     failure
    */
    public static TimeZone newIdentifierTimeZone(String identifier)  {
        PointerContainer __self = cast(JnaTimeZone.INST().g_time_zone_new_identifier(identifier));
        if (__self.isNull()) {
            throw new NullPointerException("TimeZone:newIdentifier");
        }
        return new TimeZone(__self);
    }        
    

    /**
     * Creates a &#35;GTimeZone corresponding to local time.  The local time
     * <br>zone may change between invocations to this function; for example,
     * <br>if the system administrator changes it.
     * <br>
     * <br>This is equivalent to calling g_time_zone_new() with the value of
     * <br>the `TZ` environment variable (including the possibility of %NULL).
     * <br>
     * <br>You should release the return value by calling g_time_zone_unref()
     * <br>when you are done with it.
     * @return the local timezone
    */
    public static TimeZone newLocalTimeZone()  {
        PointerContainer __self = cast(JnaTimeZone.INST().g_time_zone_new_local());
        if (__self.isNull()) {
            throw new NullPointerException("TimeZone:newLocal");
        }
        return new TimeZone(__self);
    }        
    

    /**
     * Creates a &#35;GTimeZone corresponding to the given constant offset from UTC,
     * <br>in seconds.
     * <br>
     * <br>This is equivalent to calling g_time_zone_new() with a string in the form
     * <br>`[+|-]hh[:mm[:ss]]`.
     * <br>
     * <br>It is possible for this function to fail if &#64;seconds is too big (greater than
     * <br>24 hours), in which case this function will return the UTC timezone for
     * <br>backwards compatibility. To detect failures like this, use
     * <br>g_time_zone_new_identifier() directly.
     * @param seconds offset to UTC, in seconds
     * @return a timezone at the given offset from UTC, or UTC on   failure
    */
    public static TimeZone newOffsetTimeZone(int seconds)  {
        PointerContainer __self = cast(JnaTimeZone.INST().g_time_zone_new_offset(seconds));
        if (__self.isNull()) {
            throw new NullPointerException("TimeZone:newOffset");
        }
        return new TimeZone(__self);
    }        
    

    /**
     * Creates a &#35;GTimeZone corresponding to UTC.
     * <br>
     * <br>This is equivalent to calling g_time_zone_new() with a value like
     * <br>&quot;Z&quot;, &quot;UTC&quot;, &quot;+00&quot;, etc.
     * <br>
     * <br>You should release the return value by calling g_time_zone_unref()
     * <br>when you are done with it.
     * @return the universal timezone
    */
    public static TimeZone newUtcTimeZone()  {
        PointerContainer __self = cast(JnaTimeZone.INST().g_time_zone_new_utc());
        if (__self.isNull()) {
            throw new NullPointerException("TimeZone:newUtc");
        }
        return new TimeZone(__self);
    }        
    

    /**
     * Finds an interval within &#64;tz that corresponds to the given &#64;time_.
     * <br>The meaning of &#64;time_ depends on &#64;type.
     * <br>
     * <br>If &#64;type is %G_TIME_TYPE_UNIVERSAL then this function will always
     * <br>succeed (since universal time is monotonic and continuous).
     * <br>
     * <br>Otherwise &#64;time_ is treated as local time.  The distinction between
     * <br>%G_TIME_TYPE_STANDARD and %G_TIME_TYPE_DAYLIGHT is ignored except in
     * <br>the case that the given &#64;time_ is ambiguous.  In Toronto, for example,
     * <br>01:30 on November 7th 2010 occurred twice (once inside of daylight
     * <br>savings time and the next, an hour later, outside of daylight savings
     * <br>time).  In this case, the different value of &#64;type would result in a
     * <br>different interval being returned.
     * <br>
     * <br>It is still possible for this function to fail.  In Toronto, for
     * <br>example, 02:00 on March 14th 2010 does not exist (due to the leap
     * <br>forward to begin daylight savings time).  -1 is returned in that
     * <br>case.
     * @param type the &#35;GTimeType of &#64;time_
     * @param time_ a number of seconds since January 1, 1970
     * @return the interval containing &#64;time_, or -1 in case of failure
    */
    public int findInterval(int type, long time_)  {
        return JnaTimeZone.INST().g_time_zone_find_interval(asCPointer(), type, time_);
    }

    /**
     * Determines the time zone abbreviation to be used during a particular
     * <br>&#64;interval of time in the time zone &#64;tz.
     * <br>
     * <br>For example, in Toronto this is currently &quot;EST&quot; during the winter
     * <br>months and &quot;EDT&quot; during the summer months when daylight savings time
     * <br>is in effect.
     * @param interval an interval within the timezone
     * @return the time zone abbreviation, which belongs to &#64;tz
    */
    public ch.bailu.gtk.type.Str getAbbreviation(int interval)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTimeZone.INST().g_time_zone_get_abbreviation(asCPointer(), interval)));
    }

    /**
     * Get the identifier of this &#35;GTimeZone, as passed to g_time_zone_new().
     * <br>If the identifier passed at construction time was not recognised, `UTC` will
     * <br>be returned. If it was %NULL, the identifier of the local timezone at
     * <br>construction time will be returned.
     * <br>
     * <br>The identifier will be returned in the same format as provided at
     * <br>construction time: if provided as a time offset, that will be returned by
     * <br>this function.
     * @return identifier for this timezone
    */
    public ch.bailu.gtk.type.Str getIdentifier()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTimeZone.INST().g_time_zone_get_identifier(asCPointer())));
    }

    /**
     * Determines the offset to UTC in effect during a particular &#64;interval
     * <br>of time in the time zone &#64;tz.
     * <br>
     * <br>The offset is the number of seconds that you add to UTC time to
     * <br>arrive at local time for &#64;tz (ie: negative numbers for time zones
     * <br>west of GMT, positive numbers for east).
     * @param interval an interval within the timezone
     * @return the number of seconds that should be added to UTC to get the          local time in &#64;tz
    */
    public int getOffset(int interval)  {
        return JnaTimeZone.INST().g_time_zone_get_offset(asCPointer(), interval);
    }

    /**
     * Determines if daylight savings time is in effect during a particular
     * <br>&#64;interval of time in the time zone &#64;tz.
     * @param interval an interval within the timezone
     * @return %TRUE if daylight savings time is in effect
    */
    public boolean isDst(int interval)  {
        return JnaTimeZone.INST().g_time_zone_is_dst(asCPointer(), interval);
    }

    /**
     * Increases the reference count on &#64;tz.
     * @return a new reference to &#64;tz.
    */
    public TimeZone ref()  {
        return new TimeZone(new PointerContainer(JnaTimeZone.INST().g_time_zone_ref(asCPointer())));
    }

    /**
     * Decreases the reference count on &#64;tz.
    */
    public void unref()  {
        JnaTimeZone.INST().g_time_zone_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTimeZone.INST().g_time_zone_get_type(); 
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

[MethodModel:cb-deprecated:_new:[ParameterModel:Supported:{Gg:TimeZone:{c:GTimeZone*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:adjustTime:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GTimeType}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gint64*}}:{j:}]
*/
