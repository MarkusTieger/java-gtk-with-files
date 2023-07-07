/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaUnixFDList {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_unix_fd_list_new();
        int g_unix_fd_list_append(long _self, int fd, long _error);
        int g_unix_fd_list_get(long _self, int index_, long _error);
        int g_unix_fd_list_get_length(long _self);
        long g_unix_fd_list_steal_fds(long _self, long length);
        long g_unix_fd_list_get_type();
    }

}
