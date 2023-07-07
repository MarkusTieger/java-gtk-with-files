/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaInscription {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_inscription_new(long text);
        long gtk_inscription_new(String text);
        long gtk_inscription_get_attributes(long _self);
        int gtk_inscription_get_min_chars(long _self);
        int gtk_inscription_get_min_lines(long _self);
        int gtk_inscription_get_nat_chars(long _self);
        int gtk_inscription_get_nat_lines(long _self);
        long gtk_inscription_get_text(long _self);
        int gtk_inscription_get_text_overflow(long _self);
        int gtk_inscription_get_wrap_mode(long _self);
        float gtk_inscription_get_xalign(long _self);
        float gtk_inscription_get_yalign(long _self);
        void gtk_inscription_set_attributes(long _self, long attrs);
        void gtk_inscription_set_markup(long _self, long markup);
        void gtk_inscription_set_markup(long _self, String markup);
        void gtk_inscription_set_min_chars(long _self, int min_chars);
        void gtk_inscription_set_min_lines(long _self, int min_lines);
        void gtk_inscription_set_nat_chars(long _self, int nat_chars);
        void gtk_inscription_set_nat_lines(long _self, int nat_lines);
        void gtk_inscription_set_text(long _self, long text);
        void gtk_inscription_set_text(long _self, String text);
        void gtk_inscription_set_text_overflow(long _self, int overflow);
        void gtk_inscription_set_wrap_mode(long _self, int wrap_mode);
        void gtk_inscription_set_xalign(long _self, float xalign);
        void gtk_inscription_set_yalign(long _self, float yalign);
        long gtk_inscription_get_type();
    }

}
