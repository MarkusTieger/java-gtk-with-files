/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaPaintable {

    @FunctionalInterface
    public interface OnInvalidateContents extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnInvalidateSize extends com.sun.jna.Callback {
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
        long gdk_paintable_get_current_image(long _self);
        int gdk_paintable_get_flags(long _self);
        double gdk_paintable_get_intrinsic_aspect_ratio(long _self);
        int gdk_paintable_get_intrinsic_height(long _self);
        int gdk_paintable_get_intrinsic_width(long _self);
        void gdk_paintable_invalidate_contents(long _self);
        void gdk_paintable_invalidate_size(long _self);
        void gdk_paintable_snapshot(long _self, long snapshot, double width, double height);
        long gdk_paintable_new_empty(int intrinsic_width, int intrinsic_height);
        long gdk_paintable_get_type();
    }

}
