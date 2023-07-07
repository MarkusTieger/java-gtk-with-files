/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaRand {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_rand_copy(long _self);
        double g_rand_double(long _self);
        double g_rand_double_range(long _self, double begin, double end);
        void g_rand_free(long _self);
        int g_rand_int(long _self);
        int g_rand_int_range(long _self, int begin, int end);
        void g_rand_set_seed(long _self, int seed);
        long g_rand_new();
        long g_rand_new_with_seed(int seed);
    }

}
