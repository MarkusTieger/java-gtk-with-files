/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsConnectionClass {

    @FunctionalInterface
    public interface OnAcceptCertificate extends com.sun.jna.Callback {
        boolean invoke(long connection, long peer_cert, int errors);
    }

    @FunctionalInterface
    public interface OnHandshake extends com.sun.jna.Callback {
        boolean invoke(long conn, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnHandshakeAsync extends com.sun.jna.Callback {
        void invoke(long conn, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnHandshakeFinish extends com.sun.jna.Callback {
        boolean invoke(long conn, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetBindingData extends com.sun.jna.Callback {
        boolean invoke(long conn, int type, long data, long _error);
    }

    @FunctionalInterface
    public interface OnGetNegotiatedProtocol extends com.sun.jna.Callback {
        long invoke(long conn);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TlsConnectionClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TlsConnectionClass.PARENT_CLASS, TlsConnectionClass.ACCEPT_CERTIFICATE, TlsConnectionClass.HANDSHAKE, TlsConnectionClass.HANDSHAKE_ASYNC, TlsConnectionClass.HANDSHAKE_FINISH, TlsConnectionClass.GET_BINDING_DATA, TlsConnectionClass.GET_NEGOTIATED_PROTOCOL})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[IOStreamClass.getInstanceSize()];
        public OnAcceptCertificate accept_certificate;
        public OnHandshake handshake;
        public OnHandshakeAsync handshake_async;
        public OnHandshakeFinish handshake_finish;
        public OnGetBindingData get_binding_data;
        public OnGetNegotiatedProtocol get_negotiated_protocol;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
