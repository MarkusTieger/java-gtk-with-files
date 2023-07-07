/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_context_new();
        void pango_context_changed(long _self);
        int pango_context_get_base_dir(long _self);
        int pango_context_get_base_gravity(long _self);
        long pango_context_get_font_description(long _self);
        long pango_context_get_font_map(long _self);
        int pango_context_get_gravity(long _self);
        int pango_context_get_gravity_hint(long _self);
        long pango_context_get_language(long _self);
        long pango_context_get_matrix(long _self);
        long pango_context_get_metrics(long _self, long desc, long language);
        boolean pango_context_get_round_glyph_positions(long _self);
        int pango_context_get_serial(long _self);
        long pango_context_load_font(long _self, long desc);
        long pango_context_load_fontset(long _self, long desc, long language);
        void pango_context_set_base_dir(long _self, int direction);
        void pango_context_set_base_gravity(long _self, int gravity);
        void pango_context_set_font_description(long _self, long desc);
        void pango_context_set_font_map(long _self, long font_map);
        void pango_context_set_gravity_hint(long _self, int hint);
        void pango_context_set_language(long _self, long language);
        void pango_context_set_matrix(long _self, long matrix);
        void pango_context_set_round_glyph_positions(long _self, boolean round_positions);
        long pango_context_get_type();
    }

}
