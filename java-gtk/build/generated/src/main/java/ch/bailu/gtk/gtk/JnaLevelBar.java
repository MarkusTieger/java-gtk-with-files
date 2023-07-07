/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLevelBar {

    @FunctionalInterface
    public interface OnOffsetChanged extends com.sun.jna.Callback {
        void invoke(long _self, long name, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_level_bar_new();
        long gtk_level_bar_new_for_interval(double min_value, double max_value);
        void gtk_level_bar_add_offset_value(long _self, long name, double value);
        void gtk_level_bar_add_offset_value(long _self, String name, double value);
        boolean gtk_level_bar_get_inverted(long _self);
        double gtk_level_bar_get_max_value(long _self);
        double gtk_level_bar_get_min_value(long _self);
        int gtk_level_bar_get_mode(long _self);
        double gtk_level_bar_get_value(long _self);
        void gtk_level_bar_remove_offset_value(long _self, long name);
        void gtk_level_bar_remove_offset_value(long _self, String name);
        void gtk_level_bar_set_inverted(long _self, boolean inverted);
        void gtk_level_bar_set_max_value(long _self, double value);
        void gtk_level_bar_set_min_value(long _self, double value);
        void gtk_level_bar_set_mode(long _self, int mode);
        void gtk_level_bar_set_value(long _self, double value);
        long gtk_level_bar_get_type();
    }

}
