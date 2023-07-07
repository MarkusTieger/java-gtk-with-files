/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMediaStream {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_media_stream_error(long _self, int domain, int code, long format, java.lang.Object... _elipse);
        void gtk_media_stream_error(long _self, int domain, int code, String format, java.lang.Object... _elipse);
        void gtk_media_stream_gerror(long _self, long error);
        long gtk_media_stream_get_duration(long _self);
        boolean gtk_media_stream_get_ended(long _self);
        long gtk_media_stream_get_error(long _self);
        boolean gtk_media_stream_get_loop(long _self);
        boolean gtk_media_stream_get_muted(long _self);
        boolean gtk_media_stream_get_playing(long _self);
        long gtk_media_stream_get_timestamp(long _self);
        double gtk_media_stream_get_volume(long _self);
        boolean gtk_media_stream_has_audio(long _self);
        boolean gtk_media_stream_has_video(long _self);
        boolean gtk_media_stream_is_prepared(long _self);
        boolean gtk_media_stream_is_seekable(long _self);
        boolean gtk_media_stream_is_seeking(long _self);
        void gtk_media_stream_pause(long _self);
        void gtk_media_stream_play(long _self);
        void gtk_media_stream_realize(long _self, long surface);
        void gtk_media_stream_seek(long _self, long timestamp);
        void gtk_media_stream_seek_failed(long _self);
        void gtk_media_stream_seek_success(long _self);
        void gtk_media_stream_set_loop(long _self, boolean loop);
        void gtk_media_stream_set_muted(long _self, boolean muted);
        void gtk_media_stream_set_playing(long _self, boolean playing);
        void gtk_media_stream_set_volume(long _self, double volume);
        void gtk_media_stream_stream_ended(long _self);
        void gtk_media_stream_stream_prepared(long _self, boolean has_audio, boolean has_video, boolean seekable, long duration);
        void gtk_media_stream_stream_unprepared(long _self);
        void gtk_media_stream_unrealize(long _self, long surface);
        void gtk_media_stream_update(long _self, long timestamp);
        long gtk_media_stream_get_type();
    }

}
