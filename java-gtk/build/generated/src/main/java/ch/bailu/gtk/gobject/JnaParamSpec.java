/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaParamSpec {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_param_spec_get_blurb(long _self);
        long g_param_spec_get_default_value(long _self);
        long g_param_spec_get_name(long _self);
        int g_param_spec_get_name_quark(long _self);
        long g_param_spec_get_nick(long _self);
        long g_param_spec_get_qdata(long _self, int quark);
        long g_param_spec_get_redirect_target(long _self);
        long g_param_spec_ref(long _self);
        long g_param_spec_ref_sink(long _self);
        void g_param_spec_set_qdata(long _self, int quark, long data);
        void g_param_spec_set_qdata_full(long _self, int quark, long data, com.sun.jna.Callback destroy);
        void g_param_spec_sink(long _self);
        long g_param_spec_steal_qdata(long _self, int quark);
        void g_param_spec_unref(long _self);
        long g_param_spec_internal(long param_type, long name, long nick, long blurb, int flags);
        boolean g_param_spec_is_valid_name(long name);
        long intern();
    }

}
