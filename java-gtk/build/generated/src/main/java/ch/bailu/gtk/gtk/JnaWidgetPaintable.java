/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWidgetPaintable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_widget_paintable_new(long widget);
        long gtk_widget_paintable_get_widget(long _self);
        void gtk_widget_paintable_set_widget(long _self, long widget);
        long gtk_widget_paintable_get_type();
    }

}
