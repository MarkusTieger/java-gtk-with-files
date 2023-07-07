/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaImage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_image_new();
        long gtk_image_new_from_file(long filename);
        long gtk_image_new_from_file(String filename);
        long gtk_image_new_from_gicon(long icon);
        long gtk_image_new_from_icon_name(long icon_name);
        long gtk_image_new_from_icon_name(String icon_name);
        long gtk_image_new_from_paintable(long paintable);
        long gtk_image_new_from_pixbuf(long pixbuf);
        long gtk_image_new_from_resource(long resource_path);
        long gtk_image_new_from_resource(String resource_path);
        void gtk_image_clear(long _self);
        long gtk_image_get_gicon(long _self);
        long gtk_image_get_icon_name(long _self);
        int gtk_image_get_icon_size(long _self);
        long gtk_image_get_paintable(long _self);
        int gtk_image_get_pixel_size(long _self);
        int gtk_image_get_storage_type(long _self);
        void gtk_image_set_from_file(long _self, long filename);
        void gtk_image_set_from_file(long _self, String filename);
        void gtk_image_set_from_gicon(long _self, long icon);
        void gtk_image_set_from_icon_name(long _self, long icon_name);
        void gtk_image_set_from_icon_name(long _self, String icon_name);
        void gtk_image_set_from_paintable(long _self, long paintable);
        void gtk_image_set_from_pixbuf(long _self, long pixbuf);
        void gtk_image_set_from_resource(long _self, long resource_path);
        void gtk_image_set_from_resource(long _self, String resource_path);
        void gtk_image_set_icon_size(long _self, int icon_size);
        void gtk_image_set_pixel_size(long _self, int pixel_size);
        long gtk_image_get_type();
    }

}
