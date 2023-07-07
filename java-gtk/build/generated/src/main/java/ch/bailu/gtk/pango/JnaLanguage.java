/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaLanguage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_language_get_sample_string(long _self);
        boolean pango_language_includes_script(long _self, int script);
        boolean pango_language_matches(long _self, long range_list);
        boolean pango_language_matches(long _self, String range_list);
        long pango_language_to_string(long _self);
        long pango_language_from_string(long language);
        long pango_language_get_default();
        long pango_language_get_type();
    }

}
