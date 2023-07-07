/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCalendar {

    @FunctionalInterface
    public interface OnDaySelected extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnNextMonth extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnNextYear extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPrevMonth extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPrevYear extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_calendar_new();
        void gtk_calendar_clear_marks(long _self);
        long gtk_calendar_get_date(long _self);
        boolean gtk_calendar_get_day_is_marked(long _self, int day);
        boolean gtk_calendar_get_show_day_names(long _self);
        boolean gtk_calendar_get_show_heading(long _self);
        boolean gtk_calendar_get_show_week_numbers(long _self);
        void gtk_calendar_mark_day(long _self, int day);
        void gtk_calendar_select_day(long _self, long date);
        void gtk_calendar_set_show_day_names(long _self, boolean value);
        void gtk_calendar_set_show_heading(long _self, boolean value);
        void gtk_calendar_set_show_week_numbers(long _self, boolean value);
        void gtk_calendar_unmark_day(long _self, int day);
        long gtk_calendar_get_type();
    }

}
