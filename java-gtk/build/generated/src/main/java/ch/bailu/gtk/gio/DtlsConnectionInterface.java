/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual method table for a &#35;GDtlsConnection implementation.
 * <p><a href="https://docs.gtk.org/gio/struct.DtlsConnectionInterface.html">https://docs.gtk.org/gio/struct.DtlsConnectionInterface.html</a></p>
*/
public class DtlsConnectionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsConnectionInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAcceptCertificate {
        /**
         * 
         * @param connection 
         * @param peer_cert 
         * @param errors 
         * @return 
        */
        boolean onAcceptCertificate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DtlsConnection connection, @Nonnull TlsCertificate peer_cert, int errors);
    }
    
    private static JnaDtlsConnectionInterface.OnAcceptCertificate toOnAcceptCertificate(ch.bailu.gtk.type.Pointer instance, String methodName, OnAcceptCertificate in) {
        JnaDtlsConnectionInterface.OnAcceptCertificate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _peer_cert, _errors) -> in.onAcceptCertificate(__callback, new DtlsConnection(new PointerContainer(_connection)), new TlsCertificate(new PointerContainer(_peer_cert)), _errors);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandshake {
        /**
         * 
         * @param conn a &#35;GDtlsConnection
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return success or failure
        */
        boolean onHandshake(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DtlsConnection conn, @Nullable Cancellable cancellable);
    }
    
    private static JnaDtlsConnectionInterface.OnHandshake toOnHandshake(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandshake in) {
        JnaDtlsConnectionInterface.OnHandshake out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _cancellable, _error) -> in.onHandshake(__callback, new DtlsConnection(new PointerContainer(_conn)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandshakeFinish {
        /**
         * 
         * @param conn a &#35;GDtlsConnection
         * @param result a &#35;GAsyncResult.
         * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set.
        */
        boolean onHandshakeFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DtlsConnection conn, @Nonnull AsyncResult result);
    }
    
    private static JnaDtlsConnectionInterface.OnHandshakeFinish toOnHandshakeFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandshakeFinish in) {
        JnaDtlsConnectionInterface.OnHandshakeFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _result, _error) -> in.onHandshakeFinish(__callback, new DtlsConnection(new PointerContainer(_conn)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShutdown {
        /**
         * 
         * @param conn a &#35;GDtlsConnection
         * @param shutdown_read %TRUE to stop reception of incoming datagrams
         * @param shutdown_write %TRUE to stop sending outgoing datagrams
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return %TRUE on success, %FALSE otherwise
        */
        boolean onShutdown(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DtlsConnection conn, boolean shutdown_read, boolean shutdown_write, @Nullable Cancellable cancellable);
    }
    
    private static JnaDtlsConnectionInterface.OnShutdown toOnShutdown(ch.bailu.gtk.type.Pointer instance, String methodName, OnShutdown in) {
        JnaDtlsConnectionInterface.OnShutdown out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _shutdown_read, _shutdown_write, _cancellable, _error) -> in.onShutdown(__callback, new DtlsConnection(new PointerContainer(_conn)), _shutdown_read, _shutdown_write, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShutdownFinish {
        /**
         * 
         * @param conn a &#35;GDtlsConnection
         * @param result a &#35;GAsyncResult
         * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set
        */
        boolean onShutdownFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DtlsConnection conn, @Nonnull AsyncResult result);
    }
    
    private static JnaDtlsConnectionInterface.OnShutdownFinish toOnShutdownFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnShutdownFinish in) {
        JnaDtlsConnectionInterface.OnShutdownFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _result, _error) -> in.onShutdownFinish(__callback, new DtlsConnection(new PointerContainer(_conn)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public DtlsConnectionInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDtlsConnectionInterface.Fields _fields;
    
    JnaDtlsConnectionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDtlsConnectionInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnAcceptCertificate#onAcceptCertificate}
    */
    public static final String ACCEPT_CERTIFICATE = "accept_certificate";

    /**
     * 
     * <br>See {@link OnAcceptCertificate#onAcceptCertificate}
    */
    public void setFieldAcceptCertificate(OnAcceptCertificate accept_certificate) {
        toFields().accept_certificate = toOnAcceptCertificate(this, ACCEPT_CERTIFICATE, accept_certificate);
        toFields().writeField(ACCEPT_CERTIFICATE);
    }

    /**
     * 
     * <br>See {@link OnAcceptCertificate#onAcceptCertificate}
    */
    public JnaDtlsConnectionInterface.OnAcceptCertificate getFieldAcceptCertificate() {
       toFields().readField(ACCEPT_CERTIFICATE);
       return toFields().accept_certificate;
    } 

    /**
     * 
     * <br>See {@link OnHandshake#onHandshake}
    */
    public static final String HANDSHAKE = "handshake";

    /**
     * 
     * <br>See {@link OnHandshake#onHandshake}
    */
    public void setFieldHandshake(OnHandshake handshake) {
        toFields().handshake = toOnHandshake(this, HANDSHAKE, handshake);
        toFields().writeField(HANDSHAKE);
    }

    /**
     * 
     * <br>See {@link OnHandshake#onHandshake}
    */
    public JnaDtlsConnectionInterface.OnHandshake getFieldHandshake() {
       toFields().readField(HANDSHAKE);
       return toFields().handshake;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String HANDSHAKE_ASYNC = "handshake_async";

    /**
     * 
     * <br>See {@link OnHandshakeFinish#onHandshakeFinish}
    */
    public static final String HANDSHAKE_FINISH = "handshake_finish";

    /**
     * 
     * <br>See {@link OnHandshakeFinish#onHandshakeFinish}
    */
    public void setFieldHandshakeFinish(OnHandshakeFinish handshake_finish) {
        toFields().handshake_finish = toOnHandshakeFinish(this, HANDSHAKE_FINISH, handshake_finish);
        toFields().writeField(HANDSHAKE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnHandshakeFinish#onHandshakeFinish}
    */
    public JnaDtlsConnectionInterface.OnHandshakeFinish getFieldHandshakeFinish() {
       toFields().readField(HANDSHAKE_FINISH);
       return toFields().handshake_finish;
    } 

    /**
     * 
     * <br>See {@link OnShutdown#onShutdown}
    */
    public static final String SHUTDOWN = "shutdown";

    /**
     * 
     * <br>See {@link OnShutdown#onShutdown}
    */
    public void setFieldShutdown(OnShutdown shutdown) {
        toFields().shutdown = toOnShutdown(this, SHUTDOWN, shutdown);
        toFields().writeField(SHUTDOWN);
    }

    /**
     * 
     * <br>See {@link OnShutdown#onShutdown}
    */
    public JnaDtlsConnectionInterface.OnShutdown getFieldShutdown() {
       toFields().readField(SHUTDOWN);
       return toFields().shutdown;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SHUTDOWN_ASYNC = "shutdown_async";

    /**
     * 
     * <br>See {@link OnShutdownFinish#onShutdownFinish}
    */
    public static final String SHUTDOWN_FINISH = "shutdown_finish";

    /**
     * 
     * <br>See {@link OnShutdownFinish#onShutdownFinish}
    */
    public void setFieldShutdownFinish(OnShutdownFinish shutdown_finish) {
        toFields().shutdown_finish = toOnShutdownFinish(this, SHUTDOWN_FINISH, shutdown_finish);
        toFields().writeField(SHUTDOWN_FINISH);
    }

    /**
     * 
     * <br>See {@link OnShutdownFinish#onShutdownFinish}
    */
    public JnaDtlsConnectionInterface.OnShutdownFinish getFieldShutdownFinish() {
       toFields().readField(SHUTDOWN_FINISH);
       return toFields().shutdown_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:set_advertised_protocols:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:get_negotiated_protocol:previous-field-unsupported:[MethodModel:Supported:getNegotiatedProtocol:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:DtlsConnection:{c:GDtlsConnection*}}:{j:long}]]

[MethodModel:Supported:getNegotiatedProtocol:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:DtlsConnection:{c:GDtlsConnection*}}:{j:long}]

[FieldModel:get_binding_data:previous-field-unsupported:[MethodModel:Supported:getBindingData:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DtlsConnection:{c:GDtlsConnection*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GTlsChannelBindingType}}:{j:int}]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]]

[MethodModel:Supported:getBindingData:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DtlsConnection:{c:GDtlsConnection*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GTlsChannelBindingType}}:{j:int}]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
*/
