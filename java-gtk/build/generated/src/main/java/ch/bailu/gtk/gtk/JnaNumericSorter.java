/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaNumericSorter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_numeric_sorter_new(long expression);
        long gtk_numeric_sorter_get_expression(long _self);
        int gtk_numeric_sorter_get_sort_order(long _self);
        void gtk_numeric_sorter_set_expression(long _self, long expression);
        void gtk_numeric_sorter_set_sort_order(long _self, int sort_order);
        long gtk_numeric_sorter_get_type();
    }

}
