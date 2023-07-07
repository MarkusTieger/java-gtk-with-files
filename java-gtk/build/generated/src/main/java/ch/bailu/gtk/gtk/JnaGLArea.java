/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGLArea {

    @FunctionalInterface
    public interface OnCreateContext extends com.sun.jna.Callback {
        long invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnRender extends com.sun.jna.Callback {
        boolean invoke(long _self, long context, long _data);
    }

    @FunctionalInterface
    public interface OnResize extends com.sun.jna.Callback {
        void invoke(long _self, int width, int height, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_gl_area_new();
        void gtk_gl_area_attach_buffers(long _self);
        boolean gtk_gl_area_get_auto_render(long _self);
        long gtk_gl_area_get_context(long _self);
        long gtk_gl_area_get_error(long _self);
        boolean gtk_gl_area_get_has_depth_buffer(long _self);
        boolean gtk_gl_area_get_has_stencil_buffer(long _self);
        void gtk_gl_area_get_required_version(long _self, long major, long minor);
        boolean gtk_gl_area_get_use_es(long _self);
        void gtk_gl_area_make_current(long _self);
        void gtk_gl_area_queue_render(long _self);
        void gtk_gl_area_set_auto_render(long _self, boolean auto_render);
        void gtk_gl_area_set_error(long _self, long error);
        void gtk_gl_area_set_has_depth_buffer(long _self, boolean has_depth_buffer);
        void gtk_gl_area_set_has_stencil_buffer(long _self, boolean has_stencil_buffer);
        void gtk_gl_area_set_required_version(long _self, int major, int minor);
        void gtk_gl_area_set_use_es(long _self, boolean use_es);
        long gtk_gl_area_get_type();
    }

}
