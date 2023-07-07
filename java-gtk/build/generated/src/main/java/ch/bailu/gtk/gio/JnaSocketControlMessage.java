/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSocketControlMessage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_socket_control_message_get_level(long _self);
        int g_socket_control_message_get_msg_type(long _self);
        long g_socket_control_message_get_size(long _self);
        void g_socket_control_message_serialize(long _self, long data);
        long g_socket_control_message_deserialize(int level, int type, long size, long data);
        long g_socket_control_message_get_type();
    }

}
