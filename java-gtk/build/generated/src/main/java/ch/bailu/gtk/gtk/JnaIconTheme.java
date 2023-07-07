/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIconTheme {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
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
        long gtk_icon_theme_new();
        void gtk_icon_theme_add_resource_path(long _self, long path);
        void gtk_icon_theme_add_resource_path(long _self, String path);
        void gtk_icon_theme_add_search_path(long _self, long path);
        void gtk_icon_theme_add_search_path(long _self, String path);
        long gtk_icon_theme_get_display(long _self);
        long gtk_icon_theme_get_icon_names(long _self);
        long gtk_icon_theme_get_icon_sizes(long _self, long icon_name);
        long gtk_icon_theme_get_icon_sizes(long _self, String icon_name);
        long gtk_icon_theme_get_resource_path(long _self);
        long gtk_icon_theme_get_search_path(long _self);
        long gtk_icon_theme_get_theme_name(long _self);
        boolean gtk_icon_theme_has_gicon(long _self, long gicon);
        boolean gtk_icon_theme_has_icon(long _self, long icon_name);
        boolean gtk_icon_theme_has_icon(long _self, String icon_name);
        long gtk_icon_theme_lookup_by_gicon(long _self, long icon, int size, int scale, int direction, int flags);
        long gtk_icon_theme_lookup_icon(long _self, long icon_name, long fallbacks, int size, int scale, int direction, int flags);
        long gtk_icon_theme_lookup_icon(long _self, String icon_name, long fallbacks, int size, int scale, int direction, int flags);
        void gtk_icon_theme_set_resource_path(long _self, long path);
        void gtk_icon_theme_set_search_path(long _self, long path);
        void gtk_icon_theme_set_theme_name(long _self, long theme_name);
        void gtk_icon_theme_set_theme_name(long _self, String theme_name);
        long gtk_icon_theme_get_for_display(long display);
        long gtk_icon_theme_get_type();
    }

}
