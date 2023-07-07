/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaClipboard {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
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
        long gdk_clipboard_get_content(long _self);
        long gdk_clipboard_get_display(long _self);
        long gdk_clipboard_get_formats(long _self);
        boolean gdk_clipboard_is_local(long _self);
        void gdk_clipboard_read_async(long _self, long mime_types, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_clipboard_read_finish(long _self, long result, long out_mime_type, long _error);
        void gdk_clipboard_read_text_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_clipboard_read_text_finish(long _self, long result, long _error);
        void gdk_clipboard_read_texture_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_clipboard_read_texture_finish(long _self, long result, long _error);
        void gdk_clipboard_read_value_async(long _self, long type, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gdk_clipboard_read_value_finish(long _self, long result, long _error);
        void gdk_clipboard_set(long _self, long type, java.lang.Object... _elipse);
        boolean gdk_clipboard_set_content(long _self, long provider);
        void gdk_clipboard_set_text(long _self, long text);
        void gdk_clipboard_set_text(long _self, String text);
        void gdk_clipboard_set_texture(long _self, long texture);
        void gdk_clipboard_set_value(long _self, long value);
        void gdk_clipboard_store_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gdk_clipboard_store_finish(long _self, long result, long _error);
        long gdk_clipboard_get_type();
    }

}
