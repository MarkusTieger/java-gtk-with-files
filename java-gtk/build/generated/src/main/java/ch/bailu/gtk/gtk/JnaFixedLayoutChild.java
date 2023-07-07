/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFixedLayoutChild {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_fixed_layout_child_get_transform(long _self);
        void gtk_fixed_layout_child_set_transform(long _self, long transform);
        long gtk_fixed_layout_child_get_type();
    }

}
