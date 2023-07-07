/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocket {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_new(int family, int type, int protocol, long _error);
        long g_socket_new_from_fd(int fd, long _error);
        long g_socket_accept(long _self, long cancellable, long _error);
        boolean g_socket_bind(long _self, long address, boolean allow_reuse, long _error);
        boolean g_socket_check_connect_result(long _self, long _error);
        boolean g_socket_close(long _self, long _error);
        int g_socket_condition_check(long _self, int condition);
        boolean g_socket_condition_timed_wait(long _self, int condition, long timeout_us, long cancellable, long _error);
        boolean g_socket_condition_wait(long _self, int condition, long cancellable, long _error);
        boolean g_socket_connect(long _self, long address, long cancellable, long _error);
        long g_socket_connection_factory_create_connection(long _self);
        long g_socket_create_source(long _self, int condition, long cancellable);
        long g_socket_get_available_bytes(long _self);
        boolean g_socket_get_blocking(long _self);
        boolean g_socket_get_broadcast(long _self);
        long g_socket_get_credentials(long _self, long _error);
        int g_socket_get_family(long _self);
        int g_socket_get_fd(long _self);
        boolean g_socket_get_keepalive(long _self);
        int g_socket_get_listen_backlog(long _self);
        long g_socket_get_local_address(long _self, long _error);
        boolean g_socket_get_multicast_loopback(long _self);
        int g_socket_get_multicast_ttl(long _self);
        boolean g_socket_get_option(long _self, int level, int optname, long value, long _error);
        int g_socket_get_protocol(long _self);
        long g_socket_get_remote_address(long _self, long _error);
        int g_socket_get_socket_type(long _self);
        int g_socket_get_timeout(long _self);
        int g_socket_get_ttl(long _self);
        boolean g_socket_is_closed(long _self);
        boolean g_socket_is_connected(long _self);
        boolean g_socket_join_multicast_group(long _self, long group, boolean source_specific, long iface, long _error);
        boolean g_socket_join_multicast_group(long _self, long group, boolean source_specific, String iface, long _error);
        boolean g_socket_join_multicast_group_ssm(long _self, long group, long source_specific, long iface, long _error);
        boolean g_socket_join_multicast_group_ssm(long _self, long group, long source_specific, String iface, long _error);
        boolean g_socket_leave_multicast_group(long _self, long group, boolean source_specific, long iface, long _error);
        boolean g_socket_leave_multicast_group(long _self, long group, boolean source_specific, String iface, long _error);
        boolean g_socket_leave_multicast_group_ssm(long _self, long group, long source_specific, long iface, long _error);
        boolean g_socket_leave_multicast_group_ssm(long _self, long group, long source_specific, String iface, long _error);
        boolean g_socket_listen(long _self, long _error);
        long g_socket_receive(long _self, long buffer, long size, long cancellable, long _error);
        long g_socket_receive_with_blocking(long _self, long buffer, long size, boolean blocking, long cancellable, long _error);
        long g_socket_send(long _self, long buffer, long size, long cancellable, long _error);
        long g_socket_send(long _self, String buffer, long size, long cancellable, long _error);
        long g_socket_send_to(long _self, long address, long buffer, long size, long cancellable, long _error);
        long g_socket_send_to(long _self, long address, String buffer, long size, long cancellable, long _error);
        long g_socket_send_with_blocking(long _self, long buffer, long size, boolean blocking, long cancellable, long _error);
        long g_socket_send_with_blocking(long _self, String buffer, long size, boolean blocking, long cancellable, long _error);
        void g_socket_set_blocking(long _self, boolean blocking);
        void g_socket_set_broadcast(long _self, boolean broadcast);
        void g_socket_set_keepalive(long _self, boolean keepalive);
        void g_socket_set_listen_backlog(long _self, int backlog);
        void g_socket_set_multicast_loopback(long _self, boolean loopback);
        void g_socket_set_multicast_ttl(long _self, int ttl);
        boolean g_socket_set_option(long _self, int level, int optname, int value, long _error);
        void g_socket_set_timeout(long _self, int timeout);
        void g_socket_set_ttl(long _self, int ttl);
        boolean g_socket_shutdown(long _self, boolean shutdown_read, boolean shutdown_write, long _error);
        boolean g_socket_speaks_ipv4(long _self);
        long g_socket_get_type();
    }

}
