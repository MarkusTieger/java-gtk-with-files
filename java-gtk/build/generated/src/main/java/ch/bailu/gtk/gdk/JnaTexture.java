/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaTexture {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_texture_new_for_pixbuf(long pixbuf);
        long gdk_texture_new_from_bytes(long bytes, long _error);
        long gdk_texture_new_from_file(long file, long _error);
        long gdk_texture_new_from_filename(long path, long _error);
        long gdk_texture_new_from_filename(String path, long _error);
        long gdk_texture_new_from_resource(long resource_path);
        long gdk_texture_new_from_resource(String resource_path);
        int gdk_texture_get_height(long _self);
        int gdk_texture_get_width(long _self);
        boolean gdk_texture_save_to_png(long _self, long filename);
        boolean gdk_texture_save_to_png(long _self, String filename);
        long gdk_texture_save_to_png_bytes(long _self);
        boolean gdk_texture_save_to_tiff(long _self, long filename);
        boolean gdk_texture_save_to_tiff(long _self, String filename);
        long gdk_texture_save_to_tiff_bytes(long _self);
        long gdk_texture_get_type();
    }

}
