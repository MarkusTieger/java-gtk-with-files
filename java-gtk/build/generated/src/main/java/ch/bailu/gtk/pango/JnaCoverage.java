/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaCoverage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_coverage_new();
        long pango_coverage_copy(long _self);
        int pango_coverage_get(long _self, int index_);
        void pango_coverage_set(long _self, int index_, int level);
        long pango_coverage_get_type();
    }

}
