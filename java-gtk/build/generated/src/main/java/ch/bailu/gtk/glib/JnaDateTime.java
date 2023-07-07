/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaDateTime {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_date_time_new(long tz, int year, int month, int day, int hour, int minute, double seconds);
        long g_date_time_new_from_iso8601(long text, long default_tz);
        long g_date_time_new_from_iso8601(String text, long default_tz);
        long g_date_time_new_from_unix_local(long t);
        long g_date_time_new_from_unix_utc(long t);
        long g_date_time_new_local(int year, int month, int day, int hour, int minute, double seconds);
        long g_date_time_new_now(long tz);
        long g_date_time_new_now_local();
        long g_date_time_new_now_utc();
        long g_date_time_new_utc(int year, int month, int day, int hour, int minute, double seconds);
        long g_date_time_add_days(long _self, int days);
        long g_date_time_add_full(long _self, int years, int months, int days, int hours, int minutes, double seconds);
        long g_date_time_add_hours(long _self, int hours);
        long g_date_time_add_minutes(long _self, int minutes);
        long g_date_time_add_months(long _self, int months);
        long g_date_time_add_seconds(long _self, double seconds);
        long g_date_time_add_weeks(long _self, int weeks);
        long g_date_time_add_years(long _self, int years);
        int g_date_time_compare(long _self, long dt2);
        boolean g_date_time_equal(long _self, long dt2);
        long g_date_time_format(long _self, long format);
        long g_date_time_format(long _self, String format);
        long g_date_time_format_iso8601(long _self);
        int g_date_time_get_day_of_month(long _self);
        int g_date_time_get_day_of_week(long _self);
        int g_date_time_get_day_of_year(long _self);
        int g_date_time_get_hour(long _self);
        int g_date_time_get_microsecond(long _self);
        int g_date_time_get_minute(long _self);
        int g_date_time_get_month(long _self);
        int g_date_time_get_second(long _self);
        double g_date_time_get_seconds(long _self);
        long g_date_time_get_timezone(long _self);
        long g_date_time_get_timezone_abbreviation(long _self);
        int g_date_time_get_week_numbering_year(long _self);
        int g_date_time_get_week_of_year(long _self);
        int g_date_time_get_year(long _self);
        void g_date_time_get_ymd(long _self, long year, long month, long day);
        int g_date_time_hash(long _self);
        boolean g_date_time_is_daylight_savings(long _self);
        long g_date_time_ref(long _self);
        long g_date_time_to_local(long _self);
        long g_date_time_to_timezone(long _self, long tz);
        long g_date_time_to_unix(long _self);
        long g_date_time_to_utc(long _self);
        void g_date_time_unref(long _self);
        long g_date_time_get_type();
    }

}
