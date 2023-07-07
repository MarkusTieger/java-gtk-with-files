/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.InetAddressClass.html">https://docs.gtk.org/gio/struct.InetAddressClass.html</a></p>
*/
public class InetAddressClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InetAddressClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToString {
        /**
         * 
         * @param address a &#35;GInetAddress
         * @return a representation of &#64;address as a string, which should be freed after use.
        */
        ch.bailu.gtk.type.Str onToString(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InetAddress address);
    }
    
    private static JnaInetAddressClass.OnToString toOnToString(ch.bailu.gtk.type.Pointer instance, String methodName, OnToString in) {
        JnaInetAddressClass.OnToString out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_address) -> in.onToString(__callback, new InetAddress(new PointerContainer(_address))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public InetAddressClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaInetAddressClass.Fields _fields;
    
    JnaInetAddressClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInetAddressClass.Fields(asCPointer());
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
    public JnaInetAddressClass.OnToString getFieldToString() {
       toFields().readField(TO_STRING);
       return toFields().to_string;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InetAddress.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InetAddress.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:to_bytes:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
