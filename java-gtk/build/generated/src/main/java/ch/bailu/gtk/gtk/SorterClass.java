/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual table for `GtkSorter`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.SorterClass.html">https://docs.gtk.org/gtk4/struct.SorterClass.html</a></p>
*/
public class SorterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SorterClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompare {
        /**
         * 
         * @param self a `GtkSorter`
         * @param item1 first item to compare
         * @param item2 second item to compare
         * @return %GTK_ORDERING_EQUAL if &#64;item1 == &#64;item2,   %GTK_ORDERING_SMALLER if &#64;item1 &lt; &#64;item2,   %GTK_ORDERING_LARGER if &#64;item1 &gt; &#64;item2
        */
        int onCompare(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Sorter self, @Nullable ch.bailu.gtk.type.Pointer item1, @Nullable ch.bailu.gtk.type.Pointer item2);
    }
    
    private static JnaSorterClass.OnCompare toOnCompare(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompare in) {
        JnaSorterClass.OnCompare out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _item1, _item2) -> in.onCompare(__callback, new Sorter(new PointerContainer(_self)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_item1)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_item2)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetOrder {
        /**
         * 
         * @param self a `GtkSorter`
         * @return The order
        */
        int onGetOrder(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Sorter self);
    }
    
    private static JnaSorterClass.OnGetOrder toOnGetOrder(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetOrder in) {
        JnaSorterClass.OnGetOrder out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onGetOrder(__callback, new Sorter(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSorterClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaSorterClass.OnGtkReserved1 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaSorterClass.OnGtkReserved2 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaSorterClass.OnGtkReserved3 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaSorterClass.OnGtkReserved4 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved5 toOnGtkReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved5 in) {
        JnaSorterClass.OnGtkReserved5 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved6 toOnGtkReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved6 in) {
        JnaSorterClass.OnGtkReserved6 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved7 toOnGtkReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved7 in) {
        JnaSorterClass.OnGtkReserved7 out = null;
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
    
    private static JnaSorterClass.OnGtkReserved8 toOnGtkReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved8 in) {
        JnaSorterClass.OnGtkReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    public SorterClass(PointerContainer pointer) {
        super(pointer);
    }

    public SorterClass() {
        super(cast(JnaSorterClass.allocateStructure()));
    }

    private JnaSorterClass.Fields _fields;
    
    JnaSorterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSorterClass.Fields(asCPointer());
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
     * <br>See {@link OnCompare#onCompare}
    */
    public static final String COMPARE = "compare";

    /**
     * 
     * <br>See {@link OnCompare#onCompare}
    */
    public void setFieldCompare(OnCompare compare) {
        toFields().compare = toOnCompare(this, COMPARE, compare);
        toFields().writeField(COMPARE);
    }

    /**
     * 
     * <br>See {@link OnCompare#onCompare}
    */
    public JnaSorterClass.OnCompare getFieldCompare() {
       toFields().readField(COMPARE);
       return toFields().compare;
    } 

    /**
     * 
     * <br>See {@link OnGetOrder#onGetOrder}
    */
    public static final String GET_ORDER = "get_order";

    /**
     * 
     * <br>See {@link OnGetOrder#onGetOrder}
    */
    public void setFieldGetOrder(OnGetOrder get_order) {
        toFields().get_order = toOnGetOrder(this, GET_ORDER, get_order);
        toFields().writeField(GET_ORDER);
    }

    /**
     * 
     * <br>See {@link OnGetOrder#onGetOrder}
    */
    public JnaSorterClass.OnGetOrder getFieldGetOrder() {
       toFields().readField(GET_ORDER);
       return toFields().get_order;
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
    public JnaSorterClass.OnGtkReserved1 getFieldGtkReserved1() {
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
    public JnaSorterClass.OnGtkReserved2 getFieldGtkReserved2() {
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
    public JnaSorterClass.OnGtkReserved3 getFieldGtkReserved3() {
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
    public JnaSorterClass.OnGtkReserved4 getFieldGtkReserved4() {
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
    public JnaSorterClass.OnGtkReserved5 getFieldGtkReserved5() {
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
    public JnaSorterClass.OnGtkReserved6 getFieldGtkReserved6() {
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
    public JnaSorterClass.OnGtkReserved7 getFieldGtkReserved7() {
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
    public JnaSorterClass.OnGtkReserved8 getFieldGtkReserved8() {
       toFields().readField(_GTK_RESERVED8);
       return toFields()._gtk_reserved8;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Sorter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Sorter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
