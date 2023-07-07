/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEditableLabel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_editable_label_new(long str);
        long gtk_editable_label_new(String str);
        boolean gtk_editable_label_get_editing(long _self);
        void gtk_editable_label_start_editing(long _self);
        void gtk_editable_label_stop_editing(long _self, boolean commit);
        long gtk_editable_label_get_type();
    }

}
