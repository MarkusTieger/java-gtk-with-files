/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIMContextSimple {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_im_context_simple_new();
        void gtk_im_context_simple_add_compose_file(long _self, long compose_file);
        void gtk_im_context_simple_add_compose_file(long _self, String compose_file);
        long gtk_im_context_simple_get_type();
    }

}
