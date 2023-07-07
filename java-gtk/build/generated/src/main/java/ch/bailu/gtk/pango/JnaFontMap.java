/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontMap {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void pango_font_map_changed(long _self);
        long pango_font_map_create_context(long _self);
        long pango_font_map_get_family(long _self, long name);
        long pango_font_map_get_family(long _self, String name);
        int pango_font_map_get_serial(long _self);
        long pango_font_map_load_font(long _self, long context, long desc);
        long pango_font_map_load_fontset(long _self, long context, long desc, long language);
        long pango_font_map_get_type();
    }

}
