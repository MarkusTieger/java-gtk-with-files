/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaVideo {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_video_new();
        long gtk_video_new_for_file(long file);
        long gtk_video_new_for_filename(long filename);
        long gtk_video_new_for_filename(String filename);
        long gtk_video_new_for_media_stream(long stream);
        long gtk_video_new_for_resource(long resource_path);
        long gtk_video_new_for_resource(String resource_path);
        boolean gtk_video_get_autoplay(long _self);
        long gtk_video_get_file(long _self);
        boolean gtk_video_get_loop(long _self);
        long gtk_video_get_media_stream(long _self);
        void gtk_video_set_autoplay(long _self, boolean autoplay);
        void gtk_video_set_file(long _self, long file);
        void gtk_video_set_filename(long _self, long filename);
        void gtk_video_set_filename(long _self, String filename);
        void gtk_video_set_loop(long _self, boolean loop);
        void gtk_video_set_media_stream(long _self, long stream);
        void gtk_video_set_resource(long _self, long resource_path);
        void gtk_video_set_resource(long _self, String resource_path);
        long gtk_video_get_type();
    }

}
