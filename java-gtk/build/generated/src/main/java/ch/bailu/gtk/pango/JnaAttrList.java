/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaAttrList {

    @FunctionalInterface
    public interface OnAttrFilterFunc extends com.sun.jna.Callback {
        boolean invoke(long attribute, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_attr_list_new();
        void pango_attr_list_change(long _self, long attr);
        long pango_attr_list_copy(long _self);
        boolean pango_attr_list_equal(long _self, long other_list);
        long pango_attr_list_filter(long _self, com.sun.jna.Callback func, long data);
        long pango_attr_list_get_attributes(long _self);
        long pango_attr_list_get_iterator(long _self);
        void pango_attr_list_insert(long _self, long attr);
        void pango_attr_list_insert_before(long _self, long attr);
        long pango_attr_list_ref(long _self);
        void pango_attr_list_splice(long _self, long other, int pos, int len);
        long pango_attr_list_to_string(long _self);
        void pango_attr_list_unref(long _self);
        void pango_attr_list_update(long _self, int pos, int remove, int add);
        long pango_attr_list_from_string(long text);
        long pango_attr_list_get_type();
    }

}
