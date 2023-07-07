/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLayoutChild {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_layout_child_get_child_widget(long _self);
        long gtk_layout_child_get_layout_manager(long _self);
        long gtk_layout_child_get_type();
    }

}
