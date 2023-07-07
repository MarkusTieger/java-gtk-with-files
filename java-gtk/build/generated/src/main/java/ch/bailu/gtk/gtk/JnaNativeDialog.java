/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaNativeDialog {

    @FunctionalInterface
    public interface OnResponse extends com.sun.jna.Callback {
        void invoke(long _self, int response_id, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_native_dialog_destroy(long _self);
        boolean gtk_native_dialog_get_modal(long _self);
        long gtk_native_dialog_get_title(long _self);
        long gtk_native_dialog_get_transient_for(long _self);
        boolean gtk_native_dialog_get_visible(long _self);
        void gtk_native_dialog_hide(long _self);
        void gtk_native_dialog_set_modal(long _self, boolean modal);
        void gtk_native_dialog_set_title(long _self, long title);
        void gtk_native_dialog_set_title(long _self, String title);
        void gtk_native_dialog_set_transient_for(long _self, long parent);
        void gtk_native_dialog_show(long _self);
        long gtk_native_dialog_get_type();
    }

}
