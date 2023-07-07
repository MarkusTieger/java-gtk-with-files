/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCustomSorter {

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_custom_sorter_new(com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback user_destroy);
        void gtk_custom_sorter_set_sort_func(long _self, com.sun.jna.Callback sort_func, long user_data, com.sun.jna.Callback user_destroy);
        long gtk_custom_sorter_get_type();
    }

}
