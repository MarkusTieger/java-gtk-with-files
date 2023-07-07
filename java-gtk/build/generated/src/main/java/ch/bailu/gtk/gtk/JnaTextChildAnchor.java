/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextChildAnchor {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_text_child_anchor_new();
        long gtk_text_child_anchor_new_with_replacement(long character);
        long gtk_text_child_anchor_new_with_replacement(String character);
        boolean gtk_text_child_anchor_get_deleted(long _self);
        long gtk_text_child_anchor_get_type();
    }

}
