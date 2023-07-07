/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMediaFile {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_media_file_new();
        long gtk_media_file_new_for_file(long file);
        long gtk_media_file_new_for_filename(long filename);
        long gtk_media_file_new_for_filename(String filename);
        long gtk_media_file_new_for_input_stream(long stream);
        long gtk_media_file_new_for_resource(long resource_path);
        long gtk_media_file_new_for_resource(String resource_path);
        void gtk_media_file_clear(long _self);
        long gtk_media_file_get_file(long _self);
        long gtk_media_file_get_input_stream(long _self);
        void gtk_media_file_set_file(long _self, long file);
        void gtk_media_file_set_filename(long _self, long filename);
        void gtk_media_file_set_filename(long _self, String filename);
        void gtk_media_file_set_input_stream(long _self, long stream);
        void gtk_media_file_set_resource(long _self, long resource_path);
        void gtk_media_file_set_resource(long _self, String resource_path);
        long gtk_media_file_get_type();
    }

}
