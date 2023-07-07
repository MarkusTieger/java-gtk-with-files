/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSizeGroup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_size_group_new(int mode);
        void gtk_size_group_add_widget(long _self, long widget);
        int gtk_size_group_get_mode(long _self);
        long gtk_size_group_get_widgets(long _self);
        void gtk_size_group_remove_widget(long _self, long widget);
        void gtk_size_group_set_mode(long _self, int mode);
        long gtk_size_group_get_type();
    }

}
