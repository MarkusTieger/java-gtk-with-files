/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaSurface {

    @FunctionalInterface
    public interface OnEnterMonitor extends com.sun.jna.Callback {
        void invoke(long _self, long monitor, long _data);
    }

    @FunctionalInterface
    public interface OnEvent extends com.sun.jna.Callback {
        boolean invoke(long _self, long event, long _data);
    }

    @FunctionalInterface
    public interface OnLayout extends com.sun.jna.Callback {
        void invoke(long _self, int width, int height, long _data);
    }

    @FunctionalInterface
    public interface OnLeaveMonitor extends com.sun.jna.Callback {
        void invoke(long _self, long monitor, long _data);
    }

    @FunctionalInterface
    public interface OnRender extends com.sun.jna.Callback {
        boolean invoke(long _self, long region, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_surface_new_popup(long parent, boolean autohide);
        long gdk_surface_new_toplevel(long display);
        void gdk_surface_beep(long _self);
        long gdk_surface_create_cairo_context(long _self);
        long gdk_surface_create_gl_context(long _self, long _error);
        long gdk_surface_create_similar_surface(long _self, int content, int width, int height);
        long gdk_surface_create_vulkan_context(long _self, long _error);
        void gdk_surface_destroy(long _self);
        long gdk_surface_get_cursor(long _self);
        long gdk_surface_get_device_cursor(long _self, long device);
        long gdk_surface_get_display(long _self);
        long gdk_surface_get_frame_clock(long _self);
        int gdk_surface_get_height(long _self);
        boolean gdk_surface_get_mapped(long _self);
        int gdk_surface_get_scale_factor(long _self);
        int gdk_surface_get_width(long _self);
        void gdk_surface_hide(long _self);
        boolean gdk_surface_is_destroyed(long _self);
        void gdk_surface_queue_render(long _self);
        void gdk_surface_request_layout(long _self);
        void gdk_surface_set_cursor(long _self, long cursor);
        void gdk_surface_set_device_cursor(long _self, long device, long cursor);
        void gdk_surface_set_input_region(long _self, long region);
        void gdk_surface_set_opaque_region(long _self, long region);
        long gdk_surface_get_type();
    }

}
