/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCalendar` is a widget that displays a Gregorian calendar, one month
 * <br>at a time.
 * <br>
 * <br>![An example GtkCalendar](calendar.png)
 * <br>
 * <br>A `GtkCalendar` can be created with [ctor&#64;Gtk.Calendar.new].
 * <br>
 * <br>The date that is currently displayed can be altered with
 * <br>[method&#64;Gtk.Calendar.select_day].
 * <br>
 * <br>To place a visual marker on a particular day, use
 * <br>[method&#64;Gtk.Calendar.mark_day] and to remove the marker,
 * <br>[method&#64;Gtk.Calendar.unmark_day]. Alternative, all
 * <br>marks can be cleared with [method&#64;Gtk.Calendar.clear_marks].
 * <br>
 * <br>The selected date can be retrieved from a `GtkCalendar` using
 * <br>[method&#64;Gtk.Calendar.get_date].
 * <br>
 * <br>Users should be aware that, although the Gregorian calendar is the
 * <br>legal calendar in most countries, it was adopted progressively
 * <br>between 1582 and 1929. Display before these dates is likely to be
 * <br>historically incorrect.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>calendar.view
 * <br>├── header
 * <br>│   ├── button
 * <br>│   ├── stack.month
 * <br>│   ├── button
 * <br>│   ├── button
 * <br>│   ├── label.year
 * <br>│   ╰── button
 * <br>╰── grid
 * <br>    ╰── label[.day-name][.week-number][.day-number][.other-month][.today]
 * <br>```
 * <br>
 * <br>`GtkCalendar` has a main node with name calendar. It contains a subnode
 * <br>called header containing the widgets for switching between years and months.
 * <br>
 * <br>The grid subnode contains all day labels, including week numbers on the left
 * <br>(marked with the .week-number css class) and day names on top (marked with the
 * <br>.day-name css class).
 * <br>
 * <br>Day labels that belong to the previous or next month get the .other-month
 * <br>style class. The label of the current day get the .today style class.
 * <br>
 * <br>Marked day labels get the :selected state assigned.
 * <p><a href="https://docs.gtk.org/gtk4/class.Calendar.html">https://docs.gtk.org/gtk4/class.Calendar.html</a></p>
*/
public class Calendar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Calendar.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDaySelected {
        /**
         * Emitted when the user selects a day.
        */
        void onDaySelected();
    }
    
    private static com.sun.jna.Callback toOnDaySelected(OnDaySelected in) {
        return (in == null) ? null: (JnaCalendar.OnDaySelected) (__self, __data) -> in.onDaySelected();
    }

    @FunctionalInterface
    public interface OnNextMonth {
        /**
         * Emitted when the user switched to the next month.
        */
        void onNextMonth();
    }
    
    private static com.sun.jna.Callback toOnNextMonth(OnNextMonth in) {
        return (in == null) ? null: (JnaCalendar.OnNextMonth) (__self, __data) -> in.onNextMonth();
    }

    @FunctionalInterface
    public interface OnNextYear {
        /**
         * Emitted when user switched to the next year.
        */
        void onNextYear();
    }
    
    private static com.sun.jna.Callback toOnNextYear(OnNextYear in) {
        return (in == null) ? null: (JnaCalendar.OnNextYear) (__self, __data) -> in.onNextYear();
    }

    @FunctionalInterface
    public interface OnPrevMonth {
        /**
         * Emitted when the user switched to the previous month.
        */
        void onPrevMonth();
    }
    
    private static com.sun.jna.Callback toOnPrevMonth(OnPrevMonth in) {
        return (in == null) ? null: (JnaCalendar.OnPrevMonth) (__self, __data) -> in.onPrevMonth();
    }

    @FunctionalInterface
    public interface OnPrevYear {
        /**
         * Emitted when user switched to the previous year.
        */
        void onPrevYear();
    }
    
    private static com.sun.jna.Callback toOnPrevYear(OnPrevYear in) {
        return (in == null) ? null: (JnaCalendar.OnPrevYear) (__self, __data) -> in.onPrevYear();
    }

    public Calendar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new calendar, with the current date being selected.
    */
    public Calendar() {
        super(cast(JnaCalendar.INST().gtk_calendar_new()));
    }

    /**
     * Remove all visual markers.
    */
    public void clearMarks()  {
        JnaCalendar.INST().gtk_calendar_clear_marks(asCPointer());
    }

    /**
     * Returns a `GDateTime` representing the shown
     * <br>year, month and the selected day.
     * <br>
     * <br>The returned date is in the local time zone.
     * @return the `GDate` representing the shown date
    */
    public ch.bailu.gtk.glib.DateTime getDate()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaCalendar.INST().gtk_calendar_get_date(asCPointer())));
    }

    /**
     * Returns if the &#64;day of the &#64;calendar is already marked.
     * @param day the day number between 1 and 31.
     * @return whether the day is marked.
    */
    public boolean getDayIsMarked(int day)  {
        return JnaCalendar.INST().gtk_calendar_get_day_is_marked(asCPointer(), day);
    }

    /**
     * Returns whether &#64;self is currently showing the names
     * <br>of the week days.
     * <br>
     * <br>This is the value of the [property&#64;Gtk.Calendar:show-day-names]
     * <br>property.
     * @return Whether the calendar shows day names.
    */
    public boolean getShowDayNames()  {
        return JnaCalendar.INST().gtk_calendar_get_show_day_names(asCPointer());
    }

    /**
     * Returns whether &#64;self is currently showing the heading.
     * <br>
     * <br>This is the value of the [property&#64;Gtk.Calendar:show-heading]
     * <br>property.
     * @return Whether the calendar is showing a heading.
    */
    public boolean getShowHeading()  {
        return JnaCalendar.INST().gtk_calendar_get_show_heading(asCPointer());
    }

    /**
     * Returns whether &#64;self is showing week numbers right
     * <br>now.
     * <br>
     * <br>This is the value of the [property&#64;Gtk.Calendar:show-week-numbers]
     * <br>property.
     * @return Whether the calendar is showing week numbers.
    */
    public boolean getShowWeekNumbers()  {
        return JnaCalendar.INST().gtk_calendar_get_show_week_numbers(asCPointer());
    }

    /**
     * Places a visual marker on a particular day.
     * @param day the day number to mark between 1 and 31.
    */
    public void markDay(int day)  {
        JnaCalendar.INST().gtk_calendar_mark_day(asCPointer(), day);
    }

    /**
     * Switches to &#64;date's year and month and select its day.
     * @param date a `GDateTime` representing the day to select
    */
    public void selectDay(@Nonnull ch.bailu.gtk.glib.DateTime date)  {
        JnaCalendar.INST().gtk_calendar_select_day(asCPointer(), asCPointerNotNull(date));
    }

    /**
     * Sets whether the calendar shows day names.
     * @param value Whether to show day names above the day numbers
    */
    public void setShowDayNames(boolean value)  {
        JnaCalendar.INST().gtk_calendar_set_show_day_names(asCPointer(), value);
    }

    /**
     * Sets whether the calendar should show a heading.
     * <br>
     * <br>The heading contains the current year and month as well as
     * <br>buttons for changing both.
     * @param value Whether to show the heading in the calendar
    */
    public void setShowHeading(boolean value)  {
        JnaCalendar.INST().gtk_calendar_set_show_heading(asCPointer(), value);
    }

    /**
     * Sets whether week numbers are shown in the calendar.
     * @param value whether to show week numbers on the left of the days
    */
    public void setShowWeekNumbers(boolean value)  {
        JnaCalendar.INST().gtk_calendar_set_show_week_numbers(asCPointer(), value);
    }

    /**
     * Removes the visual marker from a particular day.
     * @param day the day number to unmark between 1 and 31.
    */
    public void unmarkDay(int day)  {
        JnaCalendar.INST().gtk_calendar_unmark_day(asCPointer(), day);
    }

    public final static String SIGNAL_ON_DAY_SELECTED = "day-selected";
    
    /**
     * Connect to signal "day-selected".
     * <br>See {@link OnDaySelected#onDaySelected} for signal description.
     * <br>Field {@link #SIGNAL_ON_DAY_SELECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDaySelected(OnDaySelected signal) {
        return connectSignal(SIGNAL_ON_DAY_SELECTED, toOnDaySelected(signal));
    }

    public final static String SIGNAL_ON_NEXT_MONTH = "next-month";
    
    /**
     * Connect to signal "next-month".
     * <br>See {@link OnNextMonth#onNextMonth} for signal description.
     * <br>Field {@link #SIGNAL_ON_NEXT_MONTH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNextMonth(OnNextMonth signal) {
        return connectSignal(SIGNAL_ON_NEXT_MONTH, toOnNextMonth(signal));
    }

    public final static String SIGNAL_ON_NEXT_YEAR = "next-year";
    
    /**
     * Connect to signal "next-year".
     * <br>See {@link OnNextYear#onNextYear} for signal description.
     * <br>Field {@link #SIGNAL_ON_NEXT_YEAR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNextYear(OnNextYear signal) {
        return connectSignal(SIGNAL_ON_NEXT_YEAR, toOnNextYear(signal));
    }

    public final static String SIGNAL_ON_PREV_MONTH = "prev-month";
    
    /**
     * Connect to signal "prev-month".
     * <br>See {@link OnPrevMonth#onPrevMonth} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREV_MONTH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPrevMonth(OnPrevMonth signal) {
        return connectSignal(SIGNAL_ON_PREV_MONTH, toOnPrevMonth(signal));
    }

    public final static String SIGNAL_ON_PREV_YEAR = "prev-year";
    
    /**
     * Connect to signal "prev-year".
     * <br>See {@link OnPrevYear#onPrevYear} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREV_YEAR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPrevYear(OnPrevYear signal) {
        return connectSignal(SIGNAL_ON_PREV_YEAR, toOnPrevYear(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaCalendar.INST().gtk_calendar_get_type(); 
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
class-type
*/
