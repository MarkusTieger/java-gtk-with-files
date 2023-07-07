/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaParamSpecPool {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_param_spec_pool_insert(long _self, long pspec, long owner_type);
        long g_param_spec_pool_list_owned(long _self, long owner_type);
        long g_param_spec_pool_lookup(long _self, long param_name, long owner_type, boolean walk_ancestors);
        long g_param_spec_pool_lookup(long _self, String param_name, long owner_type, boolean walk_ancestors);
        void g_param_spec_pool_remove(long _self, long pspec);
        long g_param_spec_pool_new(boolean type_prefixing);
    }

}
