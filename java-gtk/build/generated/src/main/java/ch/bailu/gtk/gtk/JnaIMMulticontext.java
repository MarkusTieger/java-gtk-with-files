/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIMMulticontext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_im_multicontext_new();
        long gtk_im_multicontext_get_context_id(long _self);
        void gtk_im_multicontext_set_context_id(long _self, long context_id);
        void gtk_im_multicontext_set_context_id(long _self, String context_id);
        long gtk_im_multicontext_get_type();
    }

}
