/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBookmarkList {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_bookmark_list_new(long filename, long attributes);
        long gtk_bookmark_list_new(String filename, String attributes);
        long gtk_bookmark_list_get_attributes(long _self);
        long gtk_bookmark_list_get_filename(long _self);
        int gtk_bookmark_list_get_io_priority(long _self);
        boolean gtk_bookmark_list_is_loading(long _self);
        void gtk_bookmark_list_set_attributes(long _self, long attributes);
        void gtk_bookmark_list_set_attributes(long _self, String attributes);
        void gtk_bookmark_list_set_io_priority(long _self, int io_priority);
        long gtk_bookmark_list_get_type();
    }

}
