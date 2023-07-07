/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaScrollable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_scrollable_get_border(long _self, long border);
        long gtk_scrollable_get_hadjustment(long _self);
        int gtk_scrollable_get_hscroll_policy(long _self);
        long gtk_scrollable_get_vadjustment(long _self);
        int gtk_scrollable_get_vscroll_policy(long _self);
        void gtk_scrollable_set_hadjustment(long _self, long hadjustment);
        void gtk_scrollable_set_hscroll_policy(long _self, int policy);
        void gtk_scrollable_set_vadjustment(long _self, long vadjustment);
        void gtk_scrollable_set_vscroll_policy(long _self, int policy);
        long gtk_scrollable_get_type();
    }

}
