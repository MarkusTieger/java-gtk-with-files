/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixFDMessage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_fd_message_new();
        long g_unix_fd_message_new_with_fd_list(long fd_list);
        boolean g_unix_fd_message_append_fd(long _self, int fd, long _error);
        long g_unix_fd_message_get_fd_list(long _self);
        long g_unix_fd_message_steal_fds(long _self, long length);
        long g_unix_fd_message_get_type();
    }

}
