/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.FilterOutputStreamClass.html">https://docs.gtk.org/gio/struct.FilterOutputStreamClass.html</a></p>
*/
public class FilterOutputStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FilterOutputStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterOutputStreamClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaFilterOutputStreamClass.OnGReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved2 {
        void onGReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterOutputStreamClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaFilterOutputStreamClass.OnGReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved3 {
        void onGReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterOutputStreamClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaFilterOutputStreamClass.OnGReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    public FilterOutputStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    public FilterOutputStreamClass() {
        super(cast(JnaFilterOutputStreamClass.allocateStructure()));
    }

    private JnaFilterOutputStreamClass.Fields _fields;
    
    JnaFilterOutputStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFilterOutputStreamClass.Fields(asCPointer());
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
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public static final String _G_RESERVED1 = "_g_reserved1";

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public void setFieldGReserved1(OnGReserved1 _g_reserved1) {
        toFields()._g_reserved1 = toOnGReserved1(this, _G_RESERVED1, _g_reserved1);
        toFields().writeField(_G_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public JnaFilterOutputStreamClass.OnGReserved1 getFieldGReserved1() {
       toFields().readField(_G_RESERVED1);
       return toFields()._g_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public static final String _G_RESERVED2 = "_g_reserved2";

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public void setFieldGReserved2(OnGReserved2 _g_reserved2) {
        toFields()._g_reserved2 = toOnGReserved2(this, _G_RESERVED2, _g_reserved2);
        toFields().writeField(_G_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public JnaFilterOutputStreamClass.OnGReserved2 getFieldGReserved2() {
       toFields().readField(_G_RESERVED2);
       return toFields()._g_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public static final String _G_RESERVED3 = "_g_reserved3";

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public void setFieldGReserved3(OnGReserved3 _g_reserved3) {
        toFields()._g_reserved3 = toOnGReserved3(this, _G_RESERVED3, _g_reserved3);
        toFields().writeField(_G_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public JnaFilterOutputStreamClass.OnGReserved3 getFieldGReserved3() {
       toFields().readField(_G_RESERVED3);
       return toFields()._g_reserved3;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FilterOutputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FilterOutputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
