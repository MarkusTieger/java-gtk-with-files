/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDtlsConnectionInterface {

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
    public interface OnShutdown extends com.sun.jna.Callback {
        boolean invoke(long conn, boolean shutdown_read, boolean shutdown_write, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnShutdownAsync extends com.sun.jna.Callback {
        void invoke(long conn, boolean shutdown_read, boolean shutdown_write, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnShutdownFinish extends com.sun.jna.Callback {
        boolean invoke(long conn, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DtlsConnectionInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DtlsConnectionInterface.G_IFACE, DtlsConnectionInterface.ACCEPT_CERTIFICATE, DtlsConnectionInterface.HANDSHAKE, DtlsConnectionInterface.HANDSHAKE_ASYNC, DtlsConnectionInterface.HANDSHAKE_FINISH, DtlsConnectionInterface.SHUTDOWN, DtlsConnectionInterface.SHUTDOWN_ASYNC, DtlsConnectionInterface.SHUTDOWN_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnAcceptCertificate accept_certificate;
        public OnHandshake handshake;
        public OnHandshakeAsync handshake_async;
        public OnHandshakeFinish handshake_finish;
        public OnShutdown shutdown;
        public OnShutdownAsync shutdown_async;
        public OnShutdownFinish shutdown_finish;
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
