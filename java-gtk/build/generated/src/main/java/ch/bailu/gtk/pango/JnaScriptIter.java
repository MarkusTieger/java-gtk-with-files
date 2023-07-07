/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaScriptIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_script_iter_new(long text, int length);
        long pango_script_iter_new(String text, int length);
        void pango_script_iter_free(long _self);
        void pango_script_iter_get_range(long _self, long start, long end, long script);
        boolean pango_script_iter_next(long _self);
        long pango_script_iter_get_type();
    }

}
