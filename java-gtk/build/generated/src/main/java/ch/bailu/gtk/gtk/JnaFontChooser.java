/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFontChooser {

    @FunctionalInterface
    public interface OnFontFilterFunc extends com.sun.jna.Callback {
        boolean invoke(long family, long face, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnFontActivated extends com.sun.jna.Callback {
        void invoke(long _self, long fontname, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_font_chooser_get_font(long _self);
        long gtk_font_chooser_get_font_desc(long _self);
        long gtk_font_chooser_get_font_face(long _self);
        long gtk_font_chooser_get_font_family(long _self);
        long gtk_font_chooser_get_font_features(long _self);
        long gtk_font_chooser_get_font_map(long _self);
        int gtk_font_chooser_get_font_size(long _self);
        long gtk_font_chooser_get_language(long _self);
        int gtk_font_chooser_get_level(long _self);
        long gtk_font_chooser_get_preview_text(long _self);
        boolean gtk_font_chooser_get_show_preview_entry(long _self);
        void gtk_font_chooser_set_filter_func(long _self, com.sun.jna.Callback filter, long user_data, com.sun.jna.Callback destroy);
        void gtk_font_chooser_set_font(long _self, long fontname);
        void gtk_font_chooser_set_font(long _self, String fontname);
        void gtk_font_chooser_set_font_desc(long _self, long font_desc);
        void gtk_font_chooser_set_font_map(long _self, long fontmap);
        void gtk_font_chooser_set_language(long _self, long language);
        void gtk_font_chooser_set_language(long _self, String language);
        void gtk_font_chooser_set_level(long _self, int level);
        void gtk_font_chooser_set_preview_text(long _self, long text);
        void gtk_font_chooser_set_preview_text(long _self, String text);
        void gtk_font_chooser_set_show_preview_entry(long _self, boolean show_preview_entry);
        long gtk_font_chooser_get_type();
    }

}
