/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for returning a &#35;GSocketAddressEnumerator
 * <br>and &#35;GProxyAddressEnumerator
 * <p><a href="https://docs.gtk.org/gio/struct.SocketConnectableIface.html">https://docs.gtk.org/gio/struct.SocketConnectableIface.html</a></p>
*/
public class SocketConnectableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketConnectableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEnumerate {
        /**
         * 
         * @param connectable a &#35;GSocketConnectable
         * @return a new &#35;GSocketAddressEnumerator.
        */
        SocketAddressEnumerator onEnumerate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketConnectable connectable);
    }
    
    private static JnaSocketConnectableIface.OnEnumerate toOnEnumerate(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnumerate in) {
        JnaSocketConnectableIface.OnEnumerate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connectable) -> in.onEnumerate(__callback, new SocketConnectable(new PointerContainer(_connectable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnProxyEnumerate {
        /**
         * 
         * @param connectable a &#35;GSocketConnectable
         * @return a new &#35;GSocketAddressEnumerator.
        */
        SocketAddressEnumerator onProxyEnumerate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketConnectable connectable);
    }
    
    private static JnaSocketConnectableIface.OnProxyEnumerate toOnProxyEnumerate(ch.bailu.gtk.type.Pointer instance, String methodName, OnProxyEnumerate in) {
        JnaSocketConnectableIface.OnProxyEnumerate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connectable) -> in.onProxyEnumerate(__callback, new SocketConnectable(new PointerContainer(_connectable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnToString {
        /**
         * 
         * @param connectable a &#35;GSocketConnectable
         * @return the formatted string
        */
        ch.bailu.gtk.type.Str onToString(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketConnectable connectable);
    }
    
    private static JnaSocketConnectableIface.OnToString toOnToString(ch.bailu.gtk.type.Pointer instance, String methodName, OnToString in) {
        JnaSocketConnectableIface.OnToString out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_connectable) -> in.onToString(__callback, new SocketConnectable(new PointerContainer(_connectable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public SocketConnectableIface(PointerContainer pointer) {
        super(pointer);
    }

    public SocketConnectableIface() {
        super(cast(JnaSocketConnectableIface.allocateStructure()));
    }

    private JnaSocketConnectableIface.Fields _fields;
    
    JnaSocketConnectableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSocketConnectableIface.Fields(asCPointer());
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
     * <br>See {@link OnEnumerate#onEnumerate}
    */
    public static final String ENUMERATE = "enumerate";

    /**
     * 
     * <br>See {@link OnEnumerate#onEnumerate}
    */
    public void setFieldEnumerate(OnEnumerate enumerate) {
        toFields().enumerate = toOnEnumerate(this, ENUMERATE, enumerate);
        toFields().writeField(ENUMERATE);
    }

    /**
     * 
     * <br>See {@link OnEnumerate#onEnumerate}
    */
    public JnaSocketConnectableIface.OnEnumerate getFieldEnumerate() {
       toFields().readField(ENUMERATE);
       return toFields().enumerate;
    } 

    /**
     * 
     * <br>See {@link OnProxyEnumerate#onProxyEnumerate}
    */
    public static final String PROXY_ENUMERATE = "proxy_enumerate";

    /**
     * 
     * <br>See {@link OnProxyEnumerate#onProxyEnumerate}
    */
    public void setFieldProxyEnumerate(OnProxyEnumerate proxy_enumerate) {
        toFields().proxy_enumerate = toOnProxyEnumerate(this, PROXY_ENUMERATE, proxy_enumerate);
        toFields().writeField(PROXY_ENUMERATE);
    }

    /**
     * 
     * <br>See {@link OnProxyEnumerate#onProxyEnumerate}
    */
    public JnaSocketConnectableIface.OnProxyEnumerate getFieldProxyEnumerate() {
       toFields().readField(PROXY_ENUMERATE);
       return toFields().proxy_enumerate;
    } 

    /**
     * 
     * <br>See {@link OnToString#onToString}
    */
    public static final String TO_STRING = "to_string";

    /**
     * 
     * <br>See {@link OnToString#onToString}
    */
    public void setFieldToString(OnToString to_string) {
        toFields().to_string = toOnToString(this, TO_STRING, to_string);
        toFields().writeField(TO_STRING);
    }

    /**
     * 
     * <br>See {@link OnToString#onToString}
    */
    public JnaSocketConnectableIface.OnToString getFieldToString() {
       toFields().readField(TO_STRING);
       return toFields().to_string;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketConnectable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketConnectable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
