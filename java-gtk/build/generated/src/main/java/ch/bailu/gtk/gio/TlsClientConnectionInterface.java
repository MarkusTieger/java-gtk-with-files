/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * vtable for a &#35;GTlsClientConnection implementation.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsClientConnectionInterface.html">https://docs.gtk.org/gio/struct.TlsClientConnectionInterface.html</a></p>
*/
public class TlsClientConnectionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsClientConnectionInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCopySessionState {
        /**
         * 
         * @param conn a &#35;GTlsClientConnection
         * @param source a &#35;GTlsClientConnection
        */
        void onCopySessionState(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsClientConnection conn, @Nonnull TlsClientConnection source);
    }
    
    private static JnaTlsClientConnectionInterface.OnCopySessionState toOnCopySessionState(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopySessionState in) {
        JnaTlsClientConnectionInterface.OnCopySessionState out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_conn, _source) -> in.onCopySessionState(__callback, new TlsClientConnection(new PointerContainer(_conn)), new TlsClientConnection(new PointerContainer(_source)));
            __callback.register(out);
        }
        return out;
    }

    public TlsClientConnectionInterface(PointerContainer pointer) {
        super(pointer);
    }

    public TlsClientConnectionInterface() {
        super(cast(JnaTlsClientConnectionInterface.allocateStructure()));
    }

    private JnaTlsClientConnectionInterface.Fields _fields;
    
    JnaTlsClientConnectionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsClientConnectionInterface.Fields(asCPointer());
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
     * <br>See {@link OnCopySessionState#onCopySessionState}
    */
    public static final String COPY_SESSION_STATE = "copy_session_state";

    /**
     * 
     * <br>See {@link OnCopySessionState#onCopySessionState}
    */
    public void setFieldCopySessionState(OnCopySessionState copy_session_state) {
        toFields().copy_session_state = toOnCopySessionState(this, COPY_SESSION_STATE, copy_session_state);
        toFields().writeField(COPY_SESSION_STATE);
    }

    /**
     * 
     * <br>See {@link OnCopySessionState#onCopySessionState}
    */
    public JnaTlsClientConnectionInterface.OnCopySessionState getFieldCopySessionState() {
       toFields().readField(COPY_SESSION_STATE);
       return toFields().copy_session_state;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsClientConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsClientConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
