/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.SocketAddressClass.html">https://docs.gtk.org/gio/struct.SocketAddressClass.html</a></p>
*/
public class SocketAddressClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketAddressClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetFamily {
        /**
         * 
         * @param address a &#35;GSocketAddress
         * @return the socket family type of &#64;address
        */
        int onGetFamily(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketAddress address);
    }
    
    private static JnaSocketAddressClass.OnGetFamily toOnGetFamily(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFamily in) {
        JnaSocketAddressClass.OnGetFamily out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_address) -> in.onGetFamily(__callback, new SocketAddress(new PointerContainer(_address)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetNativeSize {
        /**
         * 
         * @param address a &#35;GSocketAddress
         * @return the size of the native struct sockaddr that     &#64;address represents
        */
        long onGetNativeSize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketAddress address);
    }
    
    private static JnaSocketAddressClass.OnGetNativeSize toOnGetNativeSize(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetNativeSize in) {
        JnaSocketAddressClass.OnGetNativeSize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_address) -> in.onGetNativeSize(__callback, new SocketAddress(new PointerContainer(_address)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnToNative {
        /**
         * 
         * @param address a &#35;GSocketAddress
         * @param dest a pointer to a memory location that will contain the native struct sockaddr
         * @param destlen the size of &#64;dest. Must be at least as large as     g_socket_address_get_native_size()
         * @return %TRUE if &#64;dest was filled in, %FALSE on error
        */
        boolean onToNative(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketAddress address, @Nullable ch.bailu.gtk.type.Pointer dest, long destlen);
    }
    
    private static JnaSocketAddressClass.OnToNative toOnToNative(ch.bailu.gtk.type.Pointer instance, String methodName, OnToNative in) {
        JnaSocketAddressClass.OnToNative out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_address, _dest, _destlen, _error) -> in.onToNative(__callback, new SocketAddress(new PointerContainer(_address)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_dest)), _destlen);
            __callback.register(out);
        }
        return out;
    }

    public SocketAddressClass(PointerContainer pointer) {
        super(pointer);
    }

    public SocketAddressClass() {
        super(cast(JnaSocketAddressClass.allocateStructure()));
    }

    private JnaSocketAddressClass.Fields _fields;
    
    JnaSocketAddressClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSocketAddressClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnGetFamily#onGetFamily}
    */
    public static final String GET_FAMILY = "get_family";

    /**
     * 
     * <br>See {@link OnGetFamily#onGetFamily}
    */
    public void setFieldGetFamily(OnGetFamily get_family) {
        toFields().get_family = toOnGetFamily(this, GET_FAMILY, get_family);
        toFields().writeField(GET_FAMILY);
    }

    /**
     * 
     * <br>See {@link OnGetFamily#onGetFamily}
    */
    public JnaSocketAddressClass.OnGetFamily getFieldGetFamily() {
       toFields().readField(GET_FAMILY);
       return toFields().get_family;
    } 

    /**
     * 
     * <br>See {@link OnGetNativeSize#onGetNativeSize}
    */
    public static final String GET_NATIVE_SIZE = "get_native_size";

    /**
     * 
     * <br>See {@link OnGetNativeSize#onGetNativeSize}
    */
    public void setFieldGetNativeSize(OnGetNativeSize get_native_size) {
        toFields().get_native_size = toOnGetNativeSize(this, GET_NATIVE_SIZE, get_native_size);
        toFields().writeField(GET_NATIVE_SIZE);
    }

    /**
     * 
     * <br>See {@link OnGetNativeSize#onGetNativeSize}
    */
    public JnaSocketAddressClass.OnGetNativeSize getFieldGetNativeSize() {
       toFields().readField(GET_NATIVE_SIZE);
       return toFields().get_native_size;
    } 

    /**
     * 
     * <br>See {@link OnToNative#onToNative}
    */
    public static final String TO_NATIVE = "to_native";

    /**
     * 
     * <br>See {@link OnToNative#onToNative}
    */
    public void setFieldToNative(OnToNative to_native) {
        toFields().to_native = toOnToNative(this, TO_NATIVE, to_native);
        toFields().writeField(TO_NATIVE);
    }

    /**
     * 
     * <br>See {@link OnToNative#onToNative}
    */
    public JnaSocketAddressClass.OnToNative getFieldToNative() {
       toFields().readField(TO_NATIVE);
       return toFields().to_native;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketAddress.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketAddress.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
