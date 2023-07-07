/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaContentProvider {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnContentChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_content_provider_new_for_bytes(long mime_type, long bytes);
        long gdk_content_provider_new_for_bytes(String mime_type, long bytes);
        long gdk_content_provider_new_for_value(long value);
        long gdk_content_provider_new_typed(long type, java.lang.Object... _elipse);
        void gdk_content_provider_content_changed(long _self);
        boolean gdk_content_provider_get_value(long _self, long value, long _error);
        long gdk_content_provider_ref_formats(long _self);
        long gdk_content_provider_ref_storable_formats(long _self);
        void gdk_content_provider_write_mime_type_async(long _self, long mime_type, long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gdk_content_provider_write_mime_type_async(long _self, String mime_type, long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gdk_content_provider_write_mime_type_finish(long _self, long result, long _error);
        long gdk_content_provider_get_type();
    }

}
