/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.FilterClass.html">https://docs.gtk.org/gtk4/struct.FilterClass.html</a></p>
*/
public class FilterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FilterClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMatch {
        /**
         * 
         * @param self a `GtkFilter`
         * @param item The item to check
         * @return %TRUE if the filter matches the item and a filter model should   keep it, %FALSE if not.
        */
        boolean onMatch(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Filter self, @Nullable ch.bailu.gtk.type.Pointer item);
    }
    
    private static JnaFilterClass.OnMatch toOnMatch(ch.bailu.gtk.type.Pointer instance, String methodName, OnMatch in) {
        JnaFilterClass.OnMatch out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _item) -> in.onMatch(__callback, new Filter(new PointerContainer(_self)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStrictness {
        /**
         * 
         * @param self a `GtkFilter`
         * @return the strictness of &#64;self
        */
        int onGetStrictness(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Filter self);
    }
    
    private static JnaFilterClass.OnGetStrictness toOnGetStrictness(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStrictness in) {
        JnaFilterClass.OnGetStrictness out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onGetStrictness(__callback, new Filter(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaFilterClass.OnGtkReserved1 out = null;
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
    
    private static JnaFilterClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaFilterClass.OnGtkReserved2 out = null;
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
    
    private static JnaFilterClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaFilterClass.OnGtkReserved3 out = null;
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
    
    private static JnaFilterClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaFilterClass.OnGtkReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved5 {
        void onGtkReserved5(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterClass.OnGtkReserved5 toOnGtkReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved5 in) {
        JnaFilterClass.OnGtkReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved6 {
        void onGtkReserved6(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterClass.OnGtkReserved6 toOnGtkReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved6 in) {
        JnaFilterClass.OnGtkReserved6 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved6(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved7 {
        void onGtkReserved7(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterClass.OnGtkReserved7 toOnGtkReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved7 in) {
        JnaFilterClass.OnGtkReserved7 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved7(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved8 {
        void onGtkReserved8(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFilterClass.OnGtkReserved8 toOnGtkReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved8 in) {
        JnaFilterClass.OnGtkReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    public FilterClass(PointerContainer pointer) {
        super(pointer);
    }

    public FilterClass() {
        super(cast(JnaFilterClass.allocateStructure()));
    }

    private JnaFilterClass.Fields _fields;
    
    JnaFilterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFilterClass.Fields(asCPointer());
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
     * <br>See {@link OnMatch#onMatch}
    */
    public static final String MATCH = "match";

    /**
     * 
     * <br>See {@link OnMatch#onMatch}
    */
    public void setFieldMatch(OnMatch match) {
        toFields().match = toOnMatch(this, MATCH, match);
        toFields().writeField(MATCH);
    }

    /**
     * 
     * <br>See {@link OnMatch#onMatch}
    */
    public JnaFilterClass.OnMatch getFieldMatch() {
       toFields().readField(MATCH);
       return toFields().match;
    } 

    /**
     * 
     * <br>See {@link OnGetStrictness#onGetStrictness}
    */
    public static final String GET_STRICTNESS = "get_strictness";

    /**
     * 
     * <br>See {@link OnGetStrictness#onGetStrictness}
    */
    public void setFieldGetStrictness(OnGetStrictness get_strictness) {
        toFields().get_strictness = toOnGetStrictness(this, GET_STRICTNESS, get_strictness);
        toFields().writeField(GET_STRICTNESS);
    }

    /**
     * 
     * <br>See {@link OnGetStrictness#onGetStrictness}
    */
    public JnaFilterClass.OnGetStrictness getFieldGetStrictness() {
       toFields().readField(GET_STRICTNESS);
       return toFields().get_strictness;
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
    public JnaFilterClass.OnGtkReserved1 getFieldGtkReserved1() {
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
    public JnaFilterClass.OnGtkReserved2 getFieldGtkReserved2() {
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
    public JnaFilterClass.OnGtkReserved3 getFieldGtkReserved3() {
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
    public JnaFilterClass.OnGtkReserved4 getFieldGtkReserved4() {
       toFields().readField(_GTK_RESERVED4);
       return toFields()._gtk_reserved4;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public static final String _GTK_RESERVED5 = "_gtk_reserved5";

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public void setFieldGtkReserved5(OnGtkReserved5 _gtk_reserved5) {
        toFields()._gtk_reserved5 = toOnGtkReserved5(this, _GTK_RESERVED5, _gtk_reserved5);
        toFields().writeField(_GTK_RESERVED5);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public JnaFilterClass.OnGtkReserved5 getFieldGtkReserved5() {
       toFields().readField(_GTK_RESERVED5);
       return toFields()._gtk_reserved5;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public static final String _GTK_RESERVED6 = "_gtk_reserved6";

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public void setFieldGtkReserved6(OnGtkReserved6 _gtk_reserved6) {
        toFields()._gtk_reserved6 = toOnGtkReserved6(this, _GTK_RESERVED6, _gtk_reserved6);
        toFields().writeField(_GTK_RESERVED6);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public JnaFilterClass.OnGtkReserved6 getFieldGtkReserved6() {
       toFields().readField(_GTK_RESERVED6);
       return toFields()._gtk_reserved6;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public static final String _GTK_RESERVED7 = "_gtk_reserved7";

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public void setFieldGtkReserved7(OnGtkReserved7 _gtk_reserved7) {
        toFields()._gtk_reserved7 = toOnGtkReserved7(this, _GTK_RESERVED7, _gtk_reserved7);
        toFields().writeField(_GTK_RESERVED7);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public JnaFilterClass.OnGtkReserved7 getFieldGtkReserved7() {
       toFields().readField(_GTK_RESERVED7);
       return toFields()._gtk_reserved7;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public static final String _GTK_RESERVED8 = "_gtk_reserved8";

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public void setFieldGtkReserved8(OnGtkReserved8 _gtk_reserved8) {
        toFields()._gtk_reserved8 = toOnGtkReserved8(this, _GTK_RESERVED8, _gtk_reserved8);
        toFields().writeField(_GTK_RESERVED8);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public JnaFilterClass.OnGtkReserved8 getFieldGtkReserved8() {
       toFields().readField(_GTK_RESERVED8);
       return toFields()._gtk_reserved8;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Filter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Filter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
