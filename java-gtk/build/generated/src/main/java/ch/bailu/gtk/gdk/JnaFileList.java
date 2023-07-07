/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaFileList {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_file_list_new_from_list(long files);
        long gdk_file_list_get_files(long _self);
        long gdk_file_list_get_type();
    }

}
