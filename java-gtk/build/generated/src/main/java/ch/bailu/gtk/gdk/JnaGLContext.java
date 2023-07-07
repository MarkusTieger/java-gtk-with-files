/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaGLContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_gl_context_get_allowed_apis(long _self);
        int gdk_gl_context_get_api(long _self);
        boolean gdk_gl_context_get_debug_enabled(long _self);
        long gdk_gl_context_get_display(long _self);
        boolean gdk_gl_context_get_forward_compatible(long _self);
        void gdk_gl_context_get_required_version(long _self, long major, long minor);
        long gdk_gl_context_get_surface(long _self);
        boolean gdk_gl_context_get_use_es(long _self);
        void gdk_gl_context_get_version(long _self, long major, long minor);
        boolean gdk_gl_context_is_legacy(long _self);
        boolean gdk_gl_context_is_shared(long _self, long other);
        void gdk_gl_context_make_current(long _self);
        boolean gdk_gl_context_realize(long _self, long _error);
        void gdk_gl_context_set_allowed_apis(long _self, int apis);
        void gdk_gl_context_set_debug_enabled(long _self, boolean enabled);
        void gdk_gl_context_set_forward_compatible(long _self, boolean compatible);
        void gdk_gl_context_set_required_version(long _self, int major, int minor);
        void gdk_gl_context_set_use_es(long _self, int use_es);
        void gdk_gl_context_clear_current();
        long gdk_gl_context_get_current();
        long gdk_gl_context_get_type();
    }

}
