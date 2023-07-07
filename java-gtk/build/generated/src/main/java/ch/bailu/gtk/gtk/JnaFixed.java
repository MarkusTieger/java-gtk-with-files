/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFixed {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_fixed_new();
        long gtk_fixed_get_child_transform(long _self, long widget);
        void gtk_fixed_move(long _self, long widget, double x, double y);
        void gtk_fixed_put(long _self, long widget, double x, double y);
        void gtk_fixed_remove(long _self, long widget);
        void gtk_fixed_set_child_transform(long _self, long widget, long transform);
        long gtk_fixed_get_type();
    }

}
