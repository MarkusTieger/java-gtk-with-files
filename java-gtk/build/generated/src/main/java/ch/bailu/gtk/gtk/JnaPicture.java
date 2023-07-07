/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPicture {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_picture_new();
        long gtk_picture_new_for_file(long file);
        long gtk_picture_new_for_filename(long filename);
        long gtk_picture_new_for_filename(String filename);
        long gtk_picture_new_for_paintable(long paintable);
        long gtk_picture_new_for_pixbuf(long pixbuf);
        long gtk_picture_new_for_resource(long resource_path);
        long gtk_picture_new_for_resource(String resource_path);
        long gtk_picture_get_alternative_text(long _self);
        boolean gtk_picture_get_can_shrink(long _self);
        int gtk_picture_get_content_fit(long _self);
        long gtk_picture_get_file(long _self);
        long gtk_picture_get_paintable(long _self);
        void gtk_picture_set_alternative_text(long _self, long alternative_text);
        void gtk_picture_set_alternative_text(long _self, String alternative_text);
        void gtk_picture_set_can_shrink(long _self, boolean can_shrink);
        void gtk_picture_set_content_fit(long _self, int content_fit);
        void gtk_picture_set_file(long _self, long file);
        void gtk_picture_set_filename(long _self, long filename);
        void gtk_picture_set_filename(long _self, String filename);
        void gtk_picture_set_paintable(long _self, long paintable);
        void gtk_picture_set_pixbuf(long _self, long pixbuf);
        void gtk_picture_set_resource(long _self, long resource_path);
        void gtk_picture_set_resource(long _self, String resource_path);
        long gtk_picture_get_type();
    }

}
