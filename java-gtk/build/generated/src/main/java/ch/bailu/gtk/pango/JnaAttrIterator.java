/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaAttrIterator {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_attr_iterator_copy(long _self);
        void pango_attr_iterator_destroy(long _self);
        long pango_attr_iterator_get(long _self, int type);
        long pango_attr_iterator_get_attrs(long _self);
        boolean pango_attr_iterator_next(long _self);
        void pango_attr_iterator_range(long _self, long start, long end);
        long pango_attr_iterator_get_type();
    }

}
