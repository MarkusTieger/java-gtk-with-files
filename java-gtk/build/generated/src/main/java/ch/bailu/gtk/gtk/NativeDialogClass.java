/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for `GtkNativeDialog`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.NativeDialogClass.html">https://docs.gtk.org/gtk4/struct.NativeDialogClass.html</a></p>
*/
public class NativeDialogClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NativeDialogClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * 
         * @param self 
         * @param response_id 
        */
        void onResponse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NativeDialog self, int response_id);
    }
    
    private static JnaNativeDialogClass.OnResponse toOnResponse(ch.bailu.gtk.type.Pointer instance, String methodName, OnResponse in) {
        JnaNativeDialogClass.OnResponse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _response_id) -> in.onResponse(__callback, new NativeDialog(new PointerContainer(_self)), _response_id);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShow {
        /**
         * 
         * @param self a `GtkNativeDialog`
        */
        void onShow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NativeDialog self);
    }
    
    private static JnaNativeDialogClass.OnShow toOnShow(ch.bailu.gtk.type.Pointer instance, String methodName, OnShow in) {
        JnaNativeDialogClass.OnShow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onShow(__callback, new NativeDialog(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHide {
        /**
         * 
         * @param self a `GtkNativeDialog`
        */
        void onHide(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NativeDialog self);
    }
    
    private static JnaNativeDialogClass.OnHide toOnHide(ch.bailu.gtk.type.Pointer instance, String methodName, OnHide in) {
        JnaNativeDialogClass.OnHide out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onHide(__callback, new NativeDialog(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaNativeDialogClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaNativeDialogClass.OnGtkReserved1 out = null;
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
    
    private static JnaNativeDialogClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaNativeDialogClass.OnGtkReserved2 out = null;
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
    
    private static JnaNativeDialogClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaNativeDialogClass.OnGtkReserved3 out = null;
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
    
    private static JnaNativeDialogClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaNativeDialogClass.OnGtkReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public NativeDialogClass(PointerContainer pointer) {
        super(pointer);
    }

    public NativeDialogClass() {
        super(cast(JnaNativeDialogClass.allocateStructure()));
    }

    private JnaNativeDialogClass.Fields _fields;
    
    JnaNativeDialogClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaNativeDialogClass.Fields(asCPointer());
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
     * <br>See {@link OnResponse#onResponse}
    */
    public static final String RESPONSE = "response";

    /**
     * 
     * <br>See {@link OnResponse#onResponse}
    */
    public void setFieldResponse(OnResponse response) {
        toFields().response = toOnResponse(this, RESPONSE, response);
        toFields().writeField(RESPONSE);
    }

    /**
     * 
     * <br>See {@link OnResponse#onResponse}
    */
    public JnaNativeDialogClass.OnResponse getFieldResponse() {
       toFields().readField(RESPONSE);
       return toFields().response;
    } 

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public static final String SHOW = "show";

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public void setFieldShow(OnShow show) {
        toFields().show = toOnShow(this, SHOW, show);
        toFields().writeField(SHOW);
    }

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public JnaNativeDialogClass.OnShow getFieldShow() {
       toFields().readField(SHOW);
       return toFields().show;
    } 

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public static final String HIDE = "hide";

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public void setFieldHide(OnHide hide) {
        toFields().hide = toOnHide(this, HIDE, hide);
        toFields().writeField(HIDE);
    }

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public JnaNativeDialogClass.OnHide getFieldHide() {
       toFields().readField(HIDE);
       return toFields().hide;
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
    public JnaNativeDialogClass.OnGtkReserved1 getFieldGtkReserved1() {
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
    public JnaNativeDialogClass.OnGtkReserved2 getFieldGtkReserved2() {
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
    public JnaNativeDialogClass.OnGtkReserved3 getFieldGtkReserved3() {
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
    public JnaNativeDialogClass.OnGtkReserved4 getFieldGtkReserved4() {
       toFields().readField(_GTK_RESERVED4);
       return toFields()._gtk_reserved4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeDialog.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeDialog.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
