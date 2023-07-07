/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextTag {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_text_tag_new(long name);
        long gtk_text_tag_new(String name);
        void gtk_text_tag_changed(long _self, boolean size_changed);
        int gtk_text_tag_get_priority(long _self);
        void gtk_text_tag_set_priority(long _self, int priority);
        long gtk_text_tag_get_type();
    }

}
