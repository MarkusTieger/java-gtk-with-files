/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSorter {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, int change, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_sorter_changed(long _self, int change);
        int gtk_sorter_compare(long _self, long item1, long item2);
        int gtk_sorter_get_order(long _self);
        long gtk_sorter_get_type();
    }

}
