/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextMark {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_text_mark_new(long name, boolean left_gravity);
        long gtk_text_mark_new(String name, boolean left_gravity);
        long gtk_text_mark_get_buffer(long _self);
        boolean gtk_text_mark_get_deleted(long _self);
        boolean gtk_text_mark_get_left_gravity(long _self);
        long gtk_text_mark_get_name(long _self);
        boolean gtk_text_mark_get_visible(long _self);
        void gtk_text_mark_set_visible(long _self, boolean setting);
        long gtk_text_mark_get_type();
    }

}
