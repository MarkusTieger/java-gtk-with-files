/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class structure for the &#35;GTlsConnection type.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsConnectionClass.html">https://docs.gtk.org/gio/struct.TlsConnectionClass.html</a></p>
*/
public class TlsConnectionClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsConnectionClass.class.getCanonicalName());
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
        boolean onAcceptCertificate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsConnection connection, @Nonnull TlsCertificate peer_cert, int errors);
    }
    
    private static JnaTlsConnectionClass.OnAcceptCertificate toOnAcceptCertificate(ch.bailu.gtk.type.Pointer instance, String methodName, OnAcceptCertificate in) {
        JnaTlsConnectionClass.OnAcceptCertificate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connection, _peer_cert, _errors) -> in.onAcceptCertificate(__callback, new TlsConnection(new PointerContainer(_connection)), new TlsCertificate(new PointerContainer(_peer_cert)), _errors);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandshake {
        /**
         * 
         * @param conn a &#35;GTlsConnection
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return success or failure
        */
        boolean onHandshake(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsConnection conn, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsConnectionClass.OnHandshake toOnHandshake(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandshake in) {
        JnaTlsConnectionClass.OnHandshake out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _cancellable, _error) -> in.onHandshake(__callback, new TlsConnection(new PointerContainer(_conn)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandshakeFinish {
        /**
         * 
         * @param conn a &#35;GTlsConnection
         * @param result a &#35;GAsyncResult.
         * @return %TRUE on success, %FALSE on failure, in which case &#64;error will be set.
        */
        boolean onHandshakeFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsConnection conn, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsConnectionClass.OnHandshakeFinish toOnHandshakeFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandshakeFinish in) {
        JnaTlsConnectionClass.OnHandshakeFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _result, _error) -> in.onHandshakeFinish(__callback, new TlsConnection(new PointerContainer(_conn)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetBindingData {
        /**
         * 
         * @param conn 
         * @param type 
         * @param data 
         * @return 
        */
        boolean onGetBindingData(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsConnection conn, int type, @Nonnull ch.bailu.gtk.glib.ByteArray data);
    }
    
    private static JnaTlsConnectionClass.OnGetBindingData toOnGetBindingData(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetBindingData in) {
        JnaTlsConnectionClass.OnGetBindingData out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _type, _data, _error) -> in.onGetBindingData(__callback, new TlsConnection(new PointerContainer(_conn)), _type, new ch.bailu.gtk.glib.ByteArray(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetNegotiatedProtocol {
        /**
         * 
         * @param conn a &#35;GTlsConnection
         * @return the negotiated protocol, or %NULL
        */
        ch.bailu.gtk.type.Str onGetNegotiatedProtocol(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsConnection conn);
    }
    
    private static JnaTlsConnectionClass.OnGetNegotiatedProtocol toOnGetNegotiatedProtocol(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetNegotiatedProtocol in) {
        JnaTlsConnectionClass.OnGetNegotiatedProtocol out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn) -> in.onGetNegotiatedProtocol(__callback, new TlsConnection(new PointerContainer(_conn))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public TlsConnectionClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsConnectionClass.Fields _fields;
    
    JnaTlsConnectionClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsConnectionClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

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
    public JnaTlsConnectionClass.OnAcceptCertificate getFieldAcceptCertificate() {
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
    public JnaTlsConnectionClass.OnHandshake getFieldHandshake() {
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
    public JnaTlsConnectionClass.OnHandshakeFinish getFieldHandshakeFinish() {
       toFields().readField(HANDSHAKE_FINISH);
       return toFields().handshake_finish;
    } 

    /**
     * 
     * <br>See {@link OnGetBindingData#onGetBindingData}
    */
    public static final String GET_BINDING_DATA = "get_binding_data";

    /**
     * 
     * <br>See {@link OnGetBindingData#onGetBindingData}
    */
    public void setFieldGetBindingData(OnGetBindingData get_binding_data) {
        toFields().get_binding_data = toOnGetBindingData(this, GET_BINDING_DATA, get_binding_data);
        toFields().writeField(GET_BINDING_DATA);
    }

    /**
     * 
     * <br>See {@link OnGetBindingData#onGetBindingData}
    */
    public JnaTlsConnectionClass.OnGetBindingData getFieldGetBindingData() {
       toFields().readField(GET_BINDING_DATA);
       return toFields().get_binding_data;
    } 

    /**
     * 
     * <br>See {@link OnGetNegotiatedProtocol#onGetNegotiatedProtocol}
    */
    public static final String GET_NEGOTIATED_PROTOCOL = "get_negotiated_protocol";

    /**
     * 
     * <br>See {@link OnGetNegotiatedProtocol#onGetNegotiatedProtocol}
    */
    public void setFieldGetNegotiatedProtocol(OnGetNegotiatedProtocol get_negotiated_protocol) {
        toFields().get_negotiated_protocol = toOnGetNegotiatedProtocol(this, GET_NEGOTIATED_PROTOCOL, get_negotiated_protocol);
        toFields().writeField(GET_NEGOTIATED_PROTOCOL);
    }

    /**
     * 
     * <br>See {@link OnGetNegotiatedProtocol#onGetNegotiatedProtocol}
    */
    public JnaTlsConnectionClass.OnGetNegotiatedProtocol getFieldGetNegotiatedProtocol() {
       toFields().readField(GET_NEGOTIATED_PROTOCOL);
       return toFields().get_negotiated_protocol;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
