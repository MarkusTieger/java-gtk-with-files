/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTestSuite {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_test_suite_add(long _self, long test_case);
        void g_test_suite_add_suite(long _self, long nestedsuite);
        void g_test_suite_free(long _self);
    }

}
