/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaClientSkeleton {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gclue_client_skeleton_new();
        long gclue_client_skeleton_get_type();
    }

}
