/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTooltip {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_tooltip_set_custom(long _self, long custom_widget);
        void gtk_tooltip_set_icon(long _self, long paintable);
        void gtk_tooltip_set_icon_from_gicon(long _self, long gicon);
        void gtk_tooltip_set_icon_from_icon_name(long _self, long icon_name);
        void gtk_tooltip_set_icon_from_icon_name(long _self, String icon_name);
        void gtk_tooltip_set_markup(long _self, long markup);
        void gtk_tooltip_set_markup(long _self, String markup);
        void gtk_tooltip_set_text(long _self, long text);
        void gtk_tooltip_set_text(long _self, String text);
        void gtk_tooltip_set_tip_area(long _self, long rect);
        long gtk_tooltip_get_type();
    }

}
