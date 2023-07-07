/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaProgressBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_progress_bar_new();
        int gtk_progress_bar_get_ellipsize(long _self);
        double gtk_progress_bar_get_fraction(long _self);
        boolean gtk_progress_bar_get_inverted(long _self);
        double gtk_progress_bar_get_pulse_step(long _self);
        boolean gtk_progress_bar_get_show_text(long _self);
        long gtk_progress_bar_get_text(long _self);
        void gtk_progress_bar_pulse(long _self);
        void gtk_progress_bar_set_ellipsize(long _self, int mode);
        void gtk_progress_bar_set_fraction(long _self, double fraction);
        void gtk_progress_bar_set_inverted(long _self, boolean inverted);
        void gtk_progress_bar_set_pulse_step(long _self, double fraction);
        void gtk_progress_bar_set_show_text(long _self, boolean show_text);
        void gtk_progress_bar_set_text(long _self, long text);
        void gtk_progress_bar_set_text(long _self, String text);
        long gtk_progress_bar_get_type();
    }

}
