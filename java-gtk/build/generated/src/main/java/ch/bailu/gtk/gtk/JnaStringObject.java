/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStringObject {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_string_object_new(long string);
        long gtk_string_object_new(String string);
        long gtk_string_object_get_string(long _self);
        long gtk_string_object_get_type();
    }

}
