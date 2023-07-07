/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a day between January 1, Year 1 and a few thousand years in
 * <br>the future. None of its members should be accessed directly.
 * <br>
 * <br>If the `GDate` is obtained from g_date_new(), it will be safe
 * <br>to mutate but invalid and thus not safe for calendrical computations.
 * <br>
 * <br>If it's declared on the stack, it will contain garbage so must be
 * <br>initialized with g_date_clear(). g_date_clear() makes the date invalid
 * <br>but safe. An invalid date doesn't represent a day, it's &quot;empty.&quot; A date
 * <br>becomes valid after you set it to a Julian day or you set a day, month,
 * <br>and year.
 * <p><a href="https://docs.gtk.org/glib/struct.Date.html">https://docs.gtk.org/glib/struct.Date.html</a></p>
*/
public class Date extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Date.class.getCanonicalName());
    }

    public Date(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDate.Fields _fields;
    
    JnaDate.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDate.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the Julian representation of the date
    */
    public static final String JULIAN_DAYS = "julian_days";

    /**
     * the Julian representation of the date
    */
    public void setFieldJulianDays(int julian_days) {
        toFields().julian_days = julian_days;
        toFields().writeField(JULIAN_DAYS);
    }

    /**
     * the Julian representation of the date
    */
    public int getFieldJulianDays() {
       toFields().readField(JULIAN_DAYS);
       return toFields().julian_days;
    } 

    /**
     * this bit is set if &#64;julian_days is valid
    */
    public static final String JULIAN = "julian";

    /**
     * this bit is set if &#64;julian_days is valid
    */
    public void setFieldJulian(int julian) {
        toFields().julian = julian;
        toFields().writeField(JULIAN);
    }

    /**
     * this bit is set if &#64;julian_days is valid
    */
    public int getFieldJulian() {
       toFields().readField(JULIAN);
       return toFields().julian;
    } 

    /**
     * this is set if &#64;day, &#64;month and &#64;year are valid
    */
    public static final String DMY = "dmy";

    /**
     * this is set if &#64;day, &#64;month and &#64;year are valid
    */
    public void setFieldDmy(int dmy) {
        toFields().dmy = dmy;
        toFields().writeField(DMY);
    }

    /**
     * this is set if &#64;day, &#64;month and &#64;year are valid
    */
    public int getFieldDmy() {
       toFields().readField(DMY);
       return toFields().dmy;
    } 

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 31
    */
    public static final String DAY = "day";

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 31
    */
    public void setFieldDay(int day) {
        toFields().day = day;
        toFields().writeField(DAY);
    }

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 31
    */
    public int getFieldDay() {
       toFields().readField(DAY);
       return toFields().day;
    } 

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 12
    */
    public static final String MONTH = "month";

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 12
    */
    public void setFieldMonth(int month) {
        toFields().month = month;
        toFields().writeField(MONTH);
    }

    /**
     * the day of the day-month-year representation of the date,
     * <br>  as a number between 1 and 12
    */
    public int getFieldMonth() {
       toFields().readField(MONTH);
       return toFields().month;
    } 

    /**
     * the day of the day-month-year representation of the date
    */
    public static final String YEAR = "year";

    /**
     * the day of the day-month-year representation of the date
    */
    public void setFieldYear(int year) {
        toFields().year = year;
        toFields().writeField(YEAR);
    }

    /**
     * the day of the day-month-year representation of the date
    */
    public int getFieldYear() {
       toFields().readField(YEAR);
       return toFields().year;
    } 

    /**
     * Create a new &#35;GDate representing the given Julian date.
     * <br>
     * <br>The &#64;julian_day you pass in must be valid. Use g_date_valid_julian() if
     * <br>needed to validate it. The returned &#35;GDate is guaranteed to be non-%NULL and
     * <br>valid.
     * @param julian_day days since January 1, Year 1
     * @return a newly-allocated &#35;GDate initialized   with &#64;julian_day
    */
    public static Date newJulianDate(int julian_day)  {
        PointerContainer __self = cast(JnaDate.INST().g_date_new_julian(julian_day));
        if (__self.isNull()) {
            throw new NullPointerException("Date:newJulian");
        }
        return new Date(__self);
    }        
    

    /**
     * Allocates a &#35;GDate and initializes
     * <br>it to a safe state. The new date will
     * <br>be cleared (as if you'd called g_date_clear()) but invalid (it won't
     * <br>represent an existing day). Free the return value with g_date_free().
    */
    public Date() {
        super(cast(JnaDate.INST().g_date_new()));
    }

    /**
     * Increments a date some number of days.
     * <br>To move forward by weeks, add weeks*7 days.
     * <br>The date must be valid.
     * @param n_days number of days to move the date forward
    */
    public void addDays(int n_days)  {
        JnaDate.INST().g_date_add_days(asCPointer(), n_days);
    }

    /**
     * Increments a date by some number of months.
     * <br>If the day of the month is greater than 28,
     * <br>this routine may change the day of the month
     * <br>(because the destination month may not have
     * <br>the current day in it). The date must be valid.
     * @param n_months number of months to move forward
    */
    public void addMonths(int n_months)  {
        JnaDate.INST().g_date_add_months(asCPointer(), n_months);
    }

    /**
     * Increments a date by some number of years.
     * <br>If the date is February 29, and the destination
     * <br>year is not a leap year, the date will be changed
     * <br>to February 28. The date must be valid.
     * @param n_years number of years to move forward
    */
    public void addYears(int n_years)  {
        JnaDate.INST().g_date_add_years(asCPointer(), n_years);
    }

    /**
     * If &#64;date is prior to &#64;min_date, sets &#64;date equal to &#64;min_date.
     * <br>If &#64;date falls after &#64;max_date, sets &#64;date equal to &#64;max_date.
     * <br>Otherwise, &#64;date is unchanged.
     * <br>Either of &#64;min_date and &#64;max_date may be %NULL.
     * <br>All non-%NULL dates must be valid.
     * @param min_date minimum accepted value for &#64;date
     * @param max_date maximum accepted value for &#64;date
    */
    public void clamp(@Nonnull Date min_date, @Nonnull Date max_date)  {
        JnaDate.INST().g_date_clamp(asCPointer(), asCPointerNotNull(min_date), asCPointerNotNull(max_date));
    }

    /**
     * Initializes one or more &#35;GDate structs to a safe but invalid
     * <br>state. The cleared dates will not represent an existing date, but will
     * <br>not contain garbage. Useful to init a date declared on the stack.
     * <br>Validity can be tested with g_date_valid().
     * @param n_dates number of dates to clear
    */
    public void clear(int n_dates)  {
        JnaDate.INST().g_date_clear(asCPointer(), n_dates);
    }

    /**
     * qsort()-style comparison function for dates.
     * <br>Both dates must be valid.
     * @param rhs second date to compare
     * @return 0 for equal, less than zero if &#64;lhs is less than &#64;rhs,     greater than zero if &#64;lhs is greater than &#64;rhs
    */
    public int compare(@Nonnull Date rhs)  {
        return JnaDate.INST().g_date_compare(asCPointer(), asCPointerNotNull(rhs));
    }

    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * <br>(as determined by g_date_valid()), the invalid state will be copied
     * <br>as is into the new object.
     * @return a newly-allocated &#35;GDate initialized from &#64;date
    */
    public Date copy()  {
        return new Date(new PointerContainer(JnaDate.INST().g_date_copy(asCPointer())));
    }

    /**
     * Computes the number of days between two dates.
     * <br>If &#64;date2 is prior to &#64;date1, the returned value is negative.
     * <br>Both dates must be valid.
     * @param date2 the second date
     * @return the number of days between &#64;date1 and &#64;date2
    */
    public int daysBetween(@Nonnull Date date2)  {
        return JnaDate.INST().g_date_days_between(asCPointer(), asCPointerNotNull(date2));
    }

    /**
     * Frees a &#35;GDate returned from g_date_new().
    */
    public void free()  {
        JnaDate.INST().g_date_free(asCPointer());
    }

    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * <br>year. The date must be valid.
     * @return day of the year
    */
    public int getDayOfYear()  {
        return JnaDate.INST().g_date_get_day_of_year(asCPointer());
    }

    /**
     * Returns the week of the year, where weeks are interpreted according
     * <br>to ISO 8601.
     * @return ISO 8601 week number of the year.
    */
    public int getIso8601WeekOfYear()  {
        return JnaDate.INST().g_date_get_iso8601_week_of_year(asCPointer());
    }

    /**
     * Returns the Julian day or &quot;serial number&quot; of the &#35;GDate. The
     * <br>Julian day is simply the number of days since January 1, Year 1; i.e.,
     * <br>January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * <br>etc. The date must be valid.
     * @return Julian day
    */
    public int getJulian()  {
        return JnaDate.INST().g_date_get_julian(asCPointer());
    }

    /**
     * Returns the week of the year, where weeks are understood to start on
     * <br>Monday. If the date is before the first Monday of the year, return 0.
     * <br>The date must be valid.
     * @return week of the year
    */
    public int getMondayWeekOfYear()  {
        return JnaDate.INST().g_date_get_monday_week_of_year(asCPointer());
    }

    /**
     * Returns the month of the year. The date must be valid.
     * @return month of the year as a &#35;GDateMonth
    */
    public int getMonth()  {
        return JnaDate.INST().g_date_get_month(asCPointer());
    }

    /**
     * Returns the week of the year during which this date falls, if
     * <br>weeks are understood to begin on Sunday. The date must be valid.
     * <br>Can return 0 if the day is before the first Sunday of the year.
     * @return week number
    */
    public int getSundayWeekOfYear()  {
        return JnaDate.INST().g_date_get_sunday_week_of_year(asCPointer());
    }

    /**
     * Returns the day of the week for a &#35;GDate. The date must be valid.
     * @return day of the week as a &#35;GDateWeekday.
    */
    public int getWeekday()  {
        return JnaDate.INST().g_date_get_weekday(asCPointer());
    }

    /**
     * Returns %TRUE if the date is on the first of a month.
     * <br>The date must be valid.
     * @return %TRUE if the date is the first of the month
    */
    public boolean isFirstOfMonth()  {
        return JnaDate.INST().g_date_is_first_of_month(asCPointer());
    }

    /**
     * Returns %TRUE if the date is the last day of the month.
     * <br>The date must be valid.
     * @return %TRUE if the date is the last day of the month
    */
    public boolean isLastOfMonth()  {
        return JnaDate.INST().g_date_is_last_of_month(asCPointer());
    }

    /**
     * Checks if &#64;date1 is less than or equal to &#64;date2,
     * <br>and swap the values if this is not the case.
     * @param date2 the second date
    */
    public void order(@Nonnull Date date2)  {
        JnaDate.INST().g_date_order(asCPointer(), asCPointerNotNull(date2));
    }

    /**
     * Sets the value of a &#35;GDate from a Julian day number.
     * @param julian_date Julian day number (days since January 1, Year 1)
    */
    public void setJulian(int julian_date)  {
        JnaDate.INST().g_date_set_julian(asCPointer(), julian_date);
    }

    /**
     * Sets the month of the year for a &#35;GDate.  If the resulting
     * <br>day-month-year triplet is invalid, the date will be invalid.
     * @param month month to set
    */
    public void setMonth(int month)  {
        JnaDate.INST().g_date_set_month(asCPointer(), month);
    }

    /**
     * Parses a user-inputted string &#64;str, and try to figure out what date it
     * <br>represents, taking the [current locale][setlocale] into account. If the
     * <br>string is successfully parsed, the date will be valid after the call.
     * <br>Otherwise, it will be invalid. You should check using g_date_valid()
     * <br>to see whether the parsing succeeded.
     * <br>
     * <br>This function is not appropriate for file formats and the like; it
     * <br>isn't very precise, and its exact behavior varies with the locale.
     * <br>It's intended to be a heuristic routine that guesses what the user
     * <br>means by a given string (and it does work pretty well in that
     * <br>capacity).
     * @param str string to parse
    */
    public void setParse(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaDate.INST().g_date_set_parse(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Parses a user-inputted string &#64;str, and try to figure out what date it
     * <br>represents, taking the [current locale][setlocale] into account. If the
     * <br>string is successfully parsed, the date will be valid after the call.
     * <br>Otherwise, it will be invalid. You should check using g_date_valid()
     * <br>to see whether the parsing succeeded.
     * <br>
     * <br>This function is not appropriate for file formats and the like; it
     * <br>isn't very precise, and its exact behavior varies with the locale.
     * <br>It's intended to be a heuristic routine that guesses what the user
     * <br>means by a given string (and it does work pretty well in that
     * <br>capacity).
     * @param str string to parse
    */
    public void setParse(String str)  {
        JnaDate.INST().g_date_set_parse(asCPointer(), str);
    }

    /**
     * Sets the value of a date to the date corresponding to a time
     * <br>specified as a time_t. The time to date conversion is done using
     * <br>the user's current timezone.
     * <br>
     * <br>To set the value of a date to the current day, you could write:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  time_t now = time (NULL);
     *  if (now == (time_t) -1)
     *    // handle the error
     *  g_date_set_time_t (date, now);
     * </pre>
     * @param timet time_t value to set
    */
    public void setTimeT(long timet)  {
        JnaDate.INST().g_date_set_time_t(asCPointer(), timet);
    }

    /**
     * Moves a date some number of days into the past.
     * <br>To move by weeks, just move by weeks*7 days.
     * <br>The date must be valid.
     * @param n_days number of days to move
    */
    public void subtractDays(int n_days)  {
        JnaDate.INST().g_date_subtract_days(asCPointer(), n_days);
    }

    /**
     * Moves a date some number of months into the past.
     * <br>If the current day of the month doesn't exist in
     * <br>the destination month, the day of the month
     * <br>may change. The date must be valid.
     * @param n_months number of months to move
    */
    public void subtractMonths(int n_months)  {
        JnaDate.INST().g_date_subtract_months(asCPointer(), n_months);
    }

    /**
     * Moves a date some number of years into the past.
     * <br>If the current day doesn't exist in the destination
     * <br>year (i.e. it's February 29 and you move to a non-leap-year)
     * <br>then the day is changed to February 29. The date
     * <br>must be valid.
     * @param n_years number of years to move
    */
    public void subtractYears(int n_years)  {
        JnaDate.INST().g_date_subtract_years(asCPointer(), n_years);
    }

    /**
     * Returns %TRUE if the &#35;GDate represents an existing day. The date must not
     * <br>contain garbage; it should have been initialized with g_date_clear()
     * <br>if it wasn't allocated by one of the g_date_new() variants.
     * @return Whether the date is valid
    */
    public boolean valid()  {
        return JnaDate.INST().g_date_valid(asCPointer());
    }

    /**
     * Generates a printed representation of the date, in a
     * <br>[locale][setlocale]-specific way.
     * <br>Works just like the platform's C library strftime() function,
     * <br>but only accepts date-related formats; time-related formats
     * <br>give undefined results. Date must be valid. Unlike strftime()
     * <br>(which uses the locale encoding), works on a UTF-8 format
     * <br>string and stores a UTF-8 result.
     * <br>
     * <br>This function does not provide any conversion specifiers in
     * <br>addition to those implemented by the platform's C library.
     * <br>For example, don't expect that using g_date_strftime() would
     * <br>make the &#92;%F provided by the C99 strftime() work on Windows
     * <br>where the C library only complies to C89.
     * @param s destination buffer
     * @param slen buffer size
     * @param format format string
     * @param date valid &#35;GDate
     * @return number of characters written to the buffer, or 0 the buffer was too small
    */
    public static long strftime(@Nonnull ch.bailu.gtk.type.Str s, long slen, @Nonnull ch.bailu.gtk.type.Str format, @Nonnull Date date)  {
        return JnaDate.INST().g_date_strftime(asCPointerNotNull(s), slen, asCPointerNotNull(format), asCPointerNotNull(date));
    }

    /**
     * Returns %TRUE if the Julian day is valid. Anything greater than zero
     * <br>is basically a valid Julian, though there is a 32-bit limit.
     * @param julian_date Julian day to check
     * @return %TRUE if the Julian day is valid
    */
    public static boolean validJulian(int julian_date)  {
        return JnaDate.INST().g_date_valid_julian(julian_date);
    }

    /**
     * Returns %TRUE if the month value is valid. The 12 &#35;GDateMonth
     * <br>enumeration values are the only valid months.
     * @param month month
     * @return %TRUE if the month is valid
    */
    public static boolean validMonth(int month)  {
        return JnaDate.INST().g_date_valid_month(month);
    }

    /**
     * Returns %TRUE if the weekday is valid. The seven &#35;GDateWeekday enumeration
     * <br>values are the only valid weekdays.
     * @param weekday weekday
     * @return %TRUE if the weekday is valid
    */
    public static boolean validWeekday(int weekday)  {
        return JnaDate.INST().g_date_valid_weekday(weekday);
    }

    public static long getTypeID() { 
        return JnaDate.INST().g_date_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:newDmy:[ParameterModel:Supported:{Gg:Date:{c:GDate*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:cb-return-value-not-supported:getDay:[ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getYear:[ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]]

[MethodModel:java-type-not-supported:setDay:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:setDmy:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:setTime:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTime}}:{j:}]

[MethodModel:cb-deprecated:setTimeVal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:java-type-not-supported:setYear:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:toStructTm:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:tm*}}:{j:}]

[MethodModel:java-type-not-supported:getDaysInMonth:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:getMondayWeeksInYear:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:getSundayWeeksInYear:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:isLeapYear:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:validDay:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:validDmy:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:validYear:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]
*/
