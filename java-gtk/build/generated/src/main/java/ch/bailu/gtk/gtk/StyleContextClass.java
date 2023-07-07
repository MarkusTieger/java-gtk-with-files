/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.StyleContextClass.html">https://docs.gtk.org/gtk4/struct.StyleContextClass.html</a></p>
*/
public class StyleContextClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StyleContextClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param context 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull StyleContext context);
    }
    
    private static JnaStyleContextClass.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaStyleContextClass.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onChanged(__callback, new StyleContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaStyleContextClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaStyleContextClass.OnGtkReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved2 {
        void onGtkReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaStyleContextClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaStyleContextClass.OnGtkReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved3 {
        void onGtkReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaStyleContextClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaStyleContextClass.OnGtkReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved4 {
        void onGtkReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaStyleContextClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaStyleContextClass.OnGtkReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public StyleContextClass(PointerContainer pointer) {
        super(pointer);
    }

    public StyleContextClass() {
        super(cast(JnaStyleContextClass.allocateStructure()));
    }

    private JnaStyleContextClass.Fields _fields;
    
    JnaStyleContextClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaStyleContextClass.Fields(asCPointer());
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
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaStyleContextClass.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public static final String _GTK_RESERVED1 = "_gtk_reserved1";

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public void setFieldGtkReserved1(OnGtkReserved1 _gtk_reserved1) {
        toFields()._gtk_reserved1 = toOnGtkReserved1(this, _GTK_RESERVED1, _gtk_reserved1);
        toFields().writeField(_GTK_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public JnaStyleContextClass.OnGtkReserved1 getFieldGtkReserved1() {
       toFields().readField(_GTK_RESERVED1);
       return toFields()._gtk_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public static final String _GTK_RESERVED2 = "_gtk_reserved2";

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public void setFieldGtkReserved2(OnGtkReserved2 _gtk_reserved2) {
        toFields()._gtk_reserved2 = toOnGtkReserved2(this, _GTK_RESERVED2, _gtk_reserved2);
        toFields().writeField(_GTK_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public JnaStyleContextClass.OnGtkReserved2 getFieldGtkReserved2() {
       toFields().readField(_GTK_RESERVED2);
       return toFields()._gtk_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public static final String _GTK_RESERVED3 = "_gtk_reserved3";

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public void setFieldGtkReserved3(OnGtkReserved3 _gtk_reserved3) {
        toFields()._gtk_reserved3 = toOnGtkReserved3(this, _GTK_RESERVED3, _gtk_reserved3);
        toFields().writeField(_GTK_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public JnaStyleContextClass.OnGtkReserved3 getFieldGtkReserved3() {
       toFields().readField(_GTK_RESERVED3);
       return toFields()._gtk_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public static final String _GTK_RESERVED4 = "_gtk_reserved4";

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public void setFieldGtkReserved4(OnGtkReserved4 _gtk_reserved4) {
        toFields()._gtk_reserved4 = toOnGtkReserved4(this, _GTK_RESERVED4, _gtk_reserved4);
        toFields().writeField(_GTK_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public JnaStyleContextClass.OnGtkReserved4 getFieldGtkReserved4() {
       toFields().readField(_GTK_RESERVED4);
       return toFields()._gtk_reserved4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(StyleContext.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(StyleContext.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
