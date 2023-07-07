/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoFontsetClass` structure holds the virtual functions for
 * <br>a particular `PangoFontset` implementation.
 * <p><a href="https://docs.gtk.org/Pango/struct.FontsetClass.html">https://docs.gtk.org/Pango/struct.FontsetClass.html</a></p>
*/
public class FontsetClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontsetClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetFont {
        /**
         * 
         * @param fontset a `PangoFontset`
         * @param wc a Unicode character
         * @return a `PangoFont`
        */
        Font onGetFont(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Fontset fontset, int wc);
    }
    
    private static JnaFontsetClass.OnGetFont toOnGetFont(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFont in) {
        JnaFontsetClass.OnGetFont out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontset, _wc) -> in.onGetFont(__callback, new Fontset(new PointerContainer(_fontset)), _wc).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetMetrics {
        /**
         * 
         * @param fontset a `PangoFontset`
         * @return a `PangoFontMetrics` object
        */
        FontMetrics onGetMetrics(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Fontset fontset);
    }
    
    private static JnaFontsetClass.OnGetMetrics toOnGetMetrics(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetMetrics in) {
        JnaFontsetClass.OnGetMetrics out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontset) -> in.onGetMetrics(__callback, new Fontset(new PointerContainer(_fontset))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLanguage {
        /**
         * 
         * @param fontset 
         * @return 
        */
        Language onGetLanguage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Fontset fontset);
    }
    
    private static JnaFontsetClass.OnGetLanguage toOnGetLanguage(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLanguage in) {
        JnaFontsetClass.OnGetLanguage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontset) -> in.onGetLanguage(__callback, new Fontset(new PointerContainer(_fontset))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPangoReserved1 {
        void onPangoReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFontsetClass.OnPangoReserved1 toOnPangoReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnPangoReserved1 in) {
        JnaFontsetClass.OnPangoReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onPangoReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPangoReserved2 {
        void onPangoReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFontsetClass.OnPangoReserved2 toOnPangoReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnPangoReserved2 in) {
        JnaFontsetClass.OnPangoReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onPangoReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPangoReserved3 {
        void onPangoReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFontsetClass.OnPangoReserved3 toOnPangoReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnPangoReserved3 in) {
        JnaFontsetClass.OnPangoReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onPangoReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPangoReserved4 {
        void onPangoReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFontsetClass.OnPangoReserved4 toOnPangoReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnPangoReserved4 in) {
        JnaFontsetClass.OnPangoReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onPangoReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public FontsetClass(PointerContainer pointer) {
        super(pointer);
    }

    public FontsetClass() {
        super(cast(JnaFontsetClass.allocateStructure()));
    }

    private JnaFontsetClass.Fields _fields;
    
    JnaFontsetClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontsetClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * parent `GObjectClass`
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnGetFont#onGetFont}
    */
    public static final String GET_FONT = "get_font";

    /**
     * 
     * <br>See {@link OnGetFont#onGetFont}
    */
    public void setFieldGetFont(OnGetFont get_font) {
        toFields().get_font = toOnGetFont(this, GET_FONT, get_font);
        toFields().writeField(GET_FONT);
    }

    /**
     * 
     * <br>See {@link OnGetFont#onGetFont}
    */
    public JnaFontsetClass.OnGetFont getFieldGetFont() {
       toFields().readField(GET_FONT);
       return toFields().get_font;
    } 

    /**
     * 
     * <br>See {@link OnGetMetrics#onGetMetrics}
    */
    public static final String GET_METRICS = "get_metrics";

    /**
     * 
     * <br>See {@link OnGetMetrics#onGetMetrics}
    */
    public void setFieldGetMetrics(OnGetMetrics get_metrics) {
        toFields().get_metrics = toOnGetMetrics(this, GET_METRICS, get_metrics);
        toFields().writeField(GET_METRICS);
    }

    /**
     * 
     * <br>See {@link OnGetMetrics#onGetMetrics}
    */
    public JnaFontsetClass.OnGetMetrics getFieldGetMetrics() {
       toFields().readField(GET_METRICS);
       return toFields().get_metrics;
    } 

    /**
     * 
     * <br>See {@link OnGetLanguage#onGetLanguage}
    */
    public static final String GET_LANGUAGE = "get_language";

    /**
     * 
     * <br>See {@link OnGetLanguage#onGetLanguage}
    */
    public void setFieldGetLanguage(OnGetLanguage get_language) {
        toFields().get_language = toOnGetLanguage(this, GET_LANGUAGE, get_language);
        toFields().writeField(GET_LANGUAGE);
    }

    /**
     * 
     * <br>See {@link OnGetLanguage#onGetLanguage}
    */
    public JnaFontsetClass.OnGetLanguage getFieldGetLanguage() {
       toFields().readField(GET_LANGUAGE);
       return toFields().get_language;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FOREACH = "foreach";

    /**
     * 
     * <br>See {@link OnPangoReserved1#onPangoReserved1}
    */
    public static final String _PANGO_RESERVED1 = "_pango_reserved1";

    /**
     * 
     * <br>See {@link OnPangoReserved1#onPangoReserved1}
    */
    public void setFieldPangoReserved1(OnPangoReserved1 _pango_reserved1) {
        toFields()._pango_reserved1 = toOnPangoReserved1(this, _PANGO_RESERVED1, _pango_reserved1);
        toFields().writeField(_PANGO_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnPangoReserved1#onPangoReserved1}
    */
    public JnaFontsetClass.OnPangoReserved1 getFieldPangoReserved1() {
       toFields().readField(_PANGO_RESERVED1);
       return toFields()._pango_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnPangoReserved2#onPangoReserved2}
    */
    public static final String _PANGO_RESERVED2 = "_pango_reserved2";

    /**
     * 
     * <br>See {@link OnPangoReserved2#onPangoReserved2}
    */
    public void setFieldPangoReserved2(OnPangoReserved2 _pango_reserved2) {
        toFields()._pango_reserved2 = toOnPangoReserved2(this, _PANGO_RESERVED2, _pango_reserved2);
        toFields().writeField(_PANGO_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnPangoReserved2#onPangoReserved2}
    */
    public JnaFontsetClass.OnPangoReserved2 getFieldPangoReserved2() {
       toFields().readField(_PANGO_RESERVED2);
       return toFields()._pango_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnPangoReserved3#onPangoReserved3}
    */
    public static final String _PANGO_RESERVED3 = "_pango_reserved3";

    /**
     * 
     * <br>See {@link OnPangoReserved3#onPangoReserved3}
    */
    public void setFieldPangoReserved3(OnPangoReserved3 _pango_reserved3) {
        toFields()._pango_reserved3 = toOnPangoReserved3(this, _PANGO_RESERVED3, _pango_reserved3);
        toFields().writeField(_PANGO_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnPangoReserved3#onPangoReserved3}
    */
    public JnaFontsetClass.OnPangoReserved3 getFieldPangoReserved3() {
       toFields().readField(_PANGO_RESERVED3);
       return toFields()._pango_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnPangoReserved4#onPangoReserved4}
    */
    public static final String _PANGO_RESERVED4 = "_pango_reserved4";

    /**
     * 
     * <br>See {@link OnPangoReserved4#onPangoReserved4}
    */
    public void setFieldPangoReserved4(OnPangoReserved4 _pango_reserved4) {
        toFields()._pango_reserved4 = toOnPangoReserved4(this, _PANGO_RESERVED4, _pango_reserved4);
        toFields().writeField(_PANGO_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnPangoReserved4#onPangoReserved4}
    */
    public JnaFontsetClass.OnPangoReserved4 getFieldPangoReserved4() {
       toFields().readField(_PANGO_RESERVED4);
       return toFields()._pango_reserved4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Fontset.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Fontset.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
