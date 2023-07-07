/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDirectoryList {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_directory_list_new(long attributes, long file);
        long gtk_directory_list_new(String attributes, long file);
        long gtk_directory_list_get_attributes(long _self);
        long gtk_directory_list_get_error(long _self);
        long gtk_directory_list_get_file(long _self);
        int gtk_directory_list_get_io_priority(long _self);
        boolean gtk_directory_list_get_monitored(long _self);
        boolean gtk_directory_list_is_loading(long _self);
        void gtk_directory_list_set_attributes(long _self, long attributes);
        void gtk_directory_list_set_attributes(long _self, String attributes);
        void gtk_directory_list_set_file(long _self, long file);
        void gtk_directory_list_set_io_priority(long _self, int io_priority);
        void gtk_directory_list_set_monitored(long _self, boolean monitored);
        long gtk_directory_list_get_type();
    }

}
