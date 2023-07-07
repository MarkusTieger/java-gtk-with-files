/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMessageDialog {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_message_dialog_new(long parent, int flags, int type, int buttons, long message_format, java.lang.Object... _elipse);
        long gtk_message_dialog_new(long parent, int flags, int type, int buttons, String message_format, java.lang.Object... _elipse);
        long gtk_message_dialog_new_with_markup(long parent, int flags, int type, int buttons, long message_format, java.lang.Object... _elipse);
        long gtk_message_dialog_new_with_markup(long parent, int flags, int type, int buttons, String message_format, java.lang.Object... _elipse);
        void gtk_message_dialog_format_secondary_markup(long _self, long message_format, java.lang.Object... _elipse);
        void gtk_message_dialog_format_secondary_markup(long _self, String message_format, java.lang.Object... _elipse);
        void gtk_message_dialog_format_secondary_text(long _self, long message_format, java.lang.Object... _elipse);
        void gtk_message_dialog_format_secondary_text(long _self, String message_format, java.lang.Object... _elipse);
        long gtk_message_dialog_get_message_area(long _self);
        void gtk_message_dialog_set_markup(long _self, long str);
        void gtk_message_dialog_set_markup(long _self, String str);
        long gtk_message_dialog_get_type();
    }

}
