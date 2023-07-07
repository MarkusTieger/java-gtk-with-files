/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixCredentialsMessage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_credentials_message_new();
        long g_unix_credentials_message_new_with_credentials(long credentials);
        long g_unix_credentials_message_get_credentials(long _self);
        boolean g_unix_credentials_message_is_supported();
        long g_unix_credentials_message_get_type();
    }

}
