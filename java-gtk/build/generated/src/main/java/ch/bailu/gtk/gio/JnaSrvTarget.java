/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSrvTarget {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_srv_target_new(long hostname, int port, int priority, int weight);
        long g_srv_target_new(String hostname, int port, int priority, int weight);
        long g_srv_target_copy(long _self);
        void g_srv_target_free(long _self);
        long g_srv_target_get_hostname(long _self);
        int g_srv_target_get_port(long _self);
        int g_srv_target_get_priority(long _self);
        int g_srv_target_get_weight(long _self);
        long g_srv_target_list_sort(long targets);
        long g_srv_target_get_type();
    }

}
