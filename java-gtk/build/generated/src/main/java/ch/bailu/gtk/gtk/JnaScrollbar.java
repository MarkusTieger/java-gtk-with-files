/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaScrollbar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_scrollbar_new(int orientation, long adjustment);
        long gtk_scrollbar_get_adjustment(long _self);
        void gtk_scrollbar_set_adjustment(long _self, long adjustment);
        long gtk_scrollbar_get_type();
    }

}
