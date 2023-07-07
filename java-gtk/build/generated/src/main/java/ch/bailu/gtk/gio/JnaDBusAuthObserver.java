/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusAuthObserver {

    @FunctionalInterface
    public interface OnAllowMechanism extends com.sun.jna.Callback {
        boolean invoke(long _self, long mechanism, long _data);
    }

    @FunctionalInterface
    public interface OnAuthorizeAuthenticatedPeer extends com.sun.jna.Callback {
        boolean invoke(long _self, long stream, long credentials, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_auth_observer_new();
        boolean g_dbus_auth_observer_allow_mechanism(long _self, long mechanism);
        boolean g_dbus_auth_observer_allow_mechanism(long _self, String mechanism);
        boolean g_dbus_auth_observer_authorize_authenticated_peer(long _self, long stream, long credentials);
        long g_dbus_auth_observer_get_type();
    }

}
