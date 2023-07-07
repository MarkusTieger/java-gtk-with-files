/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketClient {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnEvent extends com.sun.jna.Callback {
        void invoke(long _self, int event, long connectable, long connection, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_socket_client_new();
        void g_socket_client_add_application_proxy(long _self, long protocol);
        void g_socket_client_add_application_proxy(long _self, String protocol);
        long g_socket_client_connect(long _self, long connectable, long cancellable, long _error);
        void g_socket_client_connect_async(long _self, long connectable, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_socket_client_connect_finish(long _self, long result, long _error);
        long g_socket_client_connect_to_host(long _self, long host_and_port, int default_port, long cancellable, long _error);
        long g_socket_client_connect_to_host(long _self, String host_and_port, int default_port, long cancellable, long _error);
        void g_socket_client_connect_to_host_async(long _self, long host_and_port, int default_port, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_socket_client_connect_to_host_async(long _self, String host_and_port, int default_port, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_socket_client_connect_to_host_finish(long _self, long result, long _error);
        long g_socket_client_connect_to_service(long _self, long domain, long service, long cancellable, long _error);
        long g_socket_client_connect_to_service(long _self, String domain, String service, long cancellable, long _error);
        void g_socket_client_connect_to_service_async(long _self, long domain, long service, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_socket_client_connect_to_service_async(long _self, String domain, String service, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_socket_client_connect_to_service_finish(long _self, long result, long _error);
        long g_socket_client_connect_to_uri(long _self, long uri, int default_port, long cancellable, long _error);
        long g_socket_client_connect_to_uri(long _self, String uri, int default_port, long cancellable, long _error);
        void g_socket_client_connect_to_uri_async(long _self, long uri, int default_port, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_socket_client_connect_to_uri_async(long _self, String uri, int default_port, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_socket_client_connect_to_uri_finish(long _self, long result, long _error);
        boolean g_socket_client_get_enable_proxy(long _self);
        int g_socket_client_get_family(long _self);
        long g_socket_client_get_local_address(long _self);
        int g_socket_client_get_protocol(long _self);
        long g_socket_client_get_proxy_resolver(long _self);
        int g_socket_client_get_socket_type(long _self);
        int g_socket_client_get_timeout(long _self);
        boolean g_socket_client_get_tls(long _self);
        void g_socket_client_set_enable_proxy(long _self, boolean enable);
        void g_socket_client_set_family(long _self, int family);
        void g_socket_client_set_local_address(long _self, long address);
        void g_socket_client_set_protocol(long _self, int protocol);
        void g_socket_client_set_proxy_resolver(long _self, long proxy_resolver);
        void g_socket_client_set_socket_type(long _self, int type);
        void g_socket_client_set_timeout(long _self, int timeout);
        void g_socket_client_set_tls(long _self, boolean tls);
        long g_socket_client_get_type();
    }

}
