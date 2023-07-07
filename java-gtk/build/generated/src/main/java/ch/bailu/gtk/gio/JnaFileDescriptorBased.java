/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileDescriptorBased {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_file_descriptor_based_get_fd(long _self);
        long g_file_descriptor_based_get_type();
    }

}
