/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufLoader {

    @FunctionalInterface
    public interface OnAreaPrepared extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnAreaUpdated extends com.sun.jna.Callback {
        void invoke(long _self, int x, int y, int width, int height, long _data);
    }

    @FunctionalInterface
    public interface OnClosed extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSizePrepared extends com.sun.jna.Callback {
        void invoke(long _self, int width, int height, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_pixbuf_loader_new();
        long gdk_pixbuf_loader_new_with_mime_type(long mime_type, long _error);
        long gdk_pixbuf_loader_new_with_mime_type(String mime_type, long _error);
        long gdk_pixbuf_loader_new_with_type(long image_type, long _error);
        long gdk_pixbuf_loader_new_with_type(String image_type, long _error);
        boolean gdk_pixbuf_loader_close(long _self, long _error);
        long gdk_pixbuf_loader_get_animation(long _self);
        long gdk_pixbuf_loader_get_format(long _self);
        long gdk_pixbuf_loader_get_pixbuf(long _self);
        void gdk_pixbuf_loader_set_size(long _self, int width, int height);
        boolean gdk_pixbuf_loader_write_bytes(long _self, long buffer, long _error);
        long gdk_pixbuf_loader_get_type();
    }

}
