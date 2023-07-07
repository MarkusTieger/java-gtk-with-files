/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaDate {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Date size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Date.JULIAN_DAYS, Date.JULIAN, Date.DMY, Date.DAY, Date.MONTH, Date.YEAR})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int julian_days;
        public int julian;
        public int dmy;
        public int day;
        public int month;
        public int year;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_date_new();
        long g_date_new_julian(int julian_day);
        void g_date_add_days(long _self, int n_days);
        void g_date_add_months(long _self, int n_months);
        void g_date_add_years(long _self, int n_years);
        void g_date_clamp(long _self, long min_date, long max_date);
        void g_date_clear(long _self, int n_dates);
        int g_date_compare(long _self, long rhs);
        long g_date_copy(long _self);
        int g_date_days_between(long _self, long date2);
        void g_date_free(long _self);
        int g_date_get_day_of_year(long _self);
        int g_date_get_iso8601_week_of_year(long _self);
        int g_date_get_julian(long _self);
        int g_date_get_monday_week_of_year(long _self);
        int g_date_get_month(long _self);
        int g_date_get_sunday_week_of_year(long _self);
        int g_date_get_weekday(long _self);
        boolean g_date_is_first_of_month(long _self);
        boolean g_date_is_last_of_month(long _self);
        void g_date_order(long _self, long date2);
        void g_date_set_julian(long _self, int julian_date);
        void g_date_set_month(long _self, int month);
        void g_date_set_parse(long _self, long str);
        void g_date_set_parse(long _self, String str);
        void g_date_set_time_t(long _self, long timet);
        void g_date_subtract_days(long _self, int n_days);
        void g_date_subtract_months(long _self, int n_months);
        void g_date_subtract_years(long _self, int n_years);
        boolean g_date_valid(long _self);
        long g_date_strftime(long s, long slen, long format, long date);
        boolean g_date_valid_julian(int julian_date);
        boolean g_date_valid_month(int month);
        boolean g_date_valid_weekday(int weekday);
        long g_date_get_type();
    }

}
