/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontsetSimple {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_fontset_simple_new(long language);
        void pango_fontset_simple_append(long _self, long font);
        int pango_fontset_simple_size(long _self);
        long pango_fontset_simple_get_type();
    }

}
