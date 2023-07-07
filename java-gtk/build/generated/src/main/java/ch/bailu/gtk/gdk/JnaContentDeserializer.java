/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaContentDeserializer {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_content_deserializer_get_cancellable(long _self);
        long gdk_content_deserializer_get_gtype(long _self);
        long gdk_content_deserializer_get_input_stream(long _self);
        long gdk_content_deserializer_get_mime_type(long _self);
        int gdk_content_deserializer_get_priority(long _self);
        long gdk_content_deserializer_get_task_data(long _self);
        long gdk_content_deserializer_get_user_data(long _self);
        long gdk_content_deserializer_get_value(long _self);
        void gdk_content_deserializer_return_error(long _self, long error);
        void gdk_content_deserializer_return_success(long _self);
        void gdk_content_deserializer_set_task_data(long _self, long data, com.sun.jna.Callback notify);
        long gdk_content_deserializer_get_type();
    }

}
