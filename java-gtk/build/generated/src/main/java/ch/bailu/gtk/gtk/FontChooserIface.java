/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.FontChooserIface.html">https://docs.gtk.org/gtk4/struct.FontChooserIface.html</a></p>
*/
public class FontChooserIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontChooserIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetFontFamily {
        /**
         * 
         * @param fontchooser a `GtkFontChooser`
         * @return A `PangoFontFamily` representing the   selected font family
        */
        ch.bailu.gtk.pango.FontFamily onGetFontFamily(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser fontchooser);
    }
    
    private static JnaFontChooserIface.OnGetFontFamily toOnGetFontFamily(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFontFamily in) {
        JnaFontChooserIface.OnGetFontFamily out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontchooser) -> in.onGetFontFamily(__callback, new FontChooser(new PointerContainer(_fontchooser))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFontFace {
        /**
         * 
         * @param fontchooser a `GtkFontChooser`
         * @return A `PangoFontFace` representing the   selected font group details
        */
        ch.bailu.gtk.pango.FontFace onGetFontFace(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser fontchooser);
    }
    
    private static JnaFontChooserIface.OnGetFontFace toOnGetFontFace(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFontFace in) {
        JnaFontChooserIface.OnGetFontFace out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontchooser) -> in.onGetFontFace(__callback, new FontChooser(new PointerContainer(_fontchooser))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFontSize {
        /**
         * 
         * @param fontchooser a `GtkFontChooser`
         * @return A n integer representing the selected font size,   or -1 if no font size is selected.
        */
        int onGetFontSize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser fontchooser);
    }
    
    private static JnaFontChooserIface.OnGetFontSize toOnGetFontSize(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFontSize in) {
        JnaFontChooserIface.OnGetFontSize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontchooser) -> in.onGetFontSize(__callback, new FontChooser(new PointerContainer(_fontchooser)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFontActivated {
        /**
         * 
         * @param chooser 
         * @param fontname 
        */
        void onFontActivated(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser chooser, @Nonnull ch.bailu.gtk.type.Str fontname);
    }
    
    private static JnaFontChooserIface.OnFontActivated toOnFontActivated(ch.bailu.gtk.type.Pointer instance, String methodName, OnFontActivated in) {
        JnaFontChooserIface.OnFontActivated out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_chooser, _fontname) -> in.onFontActivated(__callback, new FontChooser(new PointerContainer(_chooser)), new ch.bailu.gtk.type.Str(new PointerContainer(_fontname)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetFontMap {
        /**
         * 
         * @param fontchooser a `GtkFontChooser`
         * @param fontmap a `PangoFontMap`
        */
        void onSetFontMap(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser fontchooser, @Nullable ch.bailu.gtk.pango.FontMap fontmap);
    }
    
    private static JnaFontChooserIface.OnSetFontMap toOnSetFontMap(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetFontMap in) {
        JnaFontChooserIface.OnSetFontMap out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontchooser, _fontmap) -> in.onSetFontMap(__callback, new FontChooser(new PointerContainer(_fontchooser)), new ch.bailu.gtk.pango.FontMap(new PointerContainer(_fontmap)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFontMap {
        /**
         * 
         * @param fontchooser a `GtkFontChooser`
         * @return a `PangoFontMap`
        */
        ch.bailu.gtk.pango.FontMap onGetFontMap(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontChooser fontchooser);
    }
    
    private static JnaFontChooserIface.OnGetFontMap toOnGetFontMap(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFontMap in) {
        JnaFontChooserIface.OnGetFontMap out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontchooser) -> in.onGetFontMap(__callback, new FontChooser(new PointerContainer(_fontchooser))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public FontChooserIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFontChooserIface.Fields _fields;
    
    JnaFontChooserIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontChooserIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_IFACE = "base_iface";

    /**
     * 
     * <br>See {@link OnGetFontFamily#onGetFontFamily}
    */
    public static final String GET_FONT_FAMILY = "get_font_family";

    /**
     * 
     * <br>See {@link OnGetFontFamily#onGetFontFamily}
    */
    public void setFieldGetFontFamily(OnGetFontFamily get_font_family) {
        toFields().get_font_family = toOnGetFontFamily(this, GET_FONT_FAMILY, get_font_family);
        toFields().writeField(GET_FONT_FAMILY);
    }

    /**
     * 
     * <br>See {@link OnGetFontFamily#onGetFontFamily}
    */
    public JnaFontChooserIface.OnGetFontFamily getFieldGetFontFamily() {
       toFields().readField(GET_FONT_FAMILY);
       return toFields().get_font_family;
    } 

    /**
     * 
     * <br>See {@link OnGetFontFace#onGetFontFace}
    */
    public static final String GET_FONT_FACE = "get_font_face";

    /**
     * 
     * <br>See {@link OnGetFontFace#onGetFontFace}
    */
    public void setFieldGetFontFace(OnGetFontFace get_font_face) {
        toFields().get_font_face = toOnGetFontFace(this, GET_FONT_FACE, get_font_face);
        toFields().writeField(GET_FONT_FACE);
    }

    /**
     * 
     * <br>See {@link OnGetFontFace#onGetFontFace}
    */
    public JnaFontChooserIface.OnGetFontFace getFieldGetFontFace() {
       toFields().readField(GET_FONT_FACE);
       return toFields().get_font_face;
    } 

    /**
     * 
     * <br>See {@link OnGetFontSize#onGetFontSize}
    */
    public static final String GET_FONT_SIZE = "get_font_size";

    /**
     * 
     * <br>See {@link OnGetFontSize#onGetFontSize}
    */
    public void setFieldGetFontSize(OnGetFontSize get_font_size) {
        toFields().get_font_size = toOnGetFontSize(this, GET_FONT_SIZE, get_font_size);
        toFields().writeField(GET_FONT_SIZE);
    }

    /**
     * 
     * <br>See {@link OnGetFontSize#onGetFontSize}
    */
    public JnaFontChooserIface.OnGetFontSize getFieldGetFontSize() {
       toFields().readField(GET_FONT_SIZE);
       return toFields().get_font_size;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_FILTER_FUNC = "set_filter_func";

    /**
     * 
     * <br>See {@link OnFontActivated#onFontActivated}
    */
    public static final String FONT_ACTIVATED = "font_activated";

    /**
     * 
     * <br>See {@link OnFontActivated#onFontActivated}
    */
    public void setFieldFontActivated(OnFontActivated font_activated) {
        toFields().font_activated = toOnFontActivated(this, FONT_ACTIVATED, font_activated);
        toFields().writeField(FONT_ACTIVATED);
    }

    /**
     * 
     * <br>See {@link OnFontActivated#onFontActivated}
    */
    public JnaFontChooserIface.OnFontActivated getFieldFontActivated() {
       toFields().readField(FONT_ACTIVATED);
       return toFields().font_activated;
    } 

    /**
     * 
     * <br>See {@link OnSetFontMap#onSetFontMap}
    */
    public static final String SET_FONT_MAP = "set_font_map";

    /**
     * 
     * <br>See {@link OnSetFontMap#onSetFontMap}
    */
    public void setFieldSetFontMap(OnSetFontMap set_font_map) {
        toFields().set_font_map = toOnSetFontMap(this, SET_FONT_MAP, set_font_map);
        toFields().writeField(SET_FONT_MAP);
    }

    /**
     * 
     * <br>See {@link OnSetFontMap#onSetFontMap}
    */
    public JnaFontChooserIface.OnSetFontMap getFieldSetFontMap() {
       toFields().readField(SET_FONT_MAP);
       return toFields().set_font_map;
    } 

    /**
     * 
     * <br>See {@link OnGetFontMap#onGetFontMap}
    */
    public static final String GET_FONT_MAP = "get_font_map";

    /**
     * 
     * <br>See {@link OnGetFontMap#onGetFontMap}
    */
    public void setFieldGetFontMap(OnGetFontMap get_font_map) {
        toFields().get_font_map = toOnGetFontMap(this, GET_FONT_MAP, get_font_map);
        toFields().writeField(GET_FONT_MAP);
    }

    /**
     * 
     * <br>See {@link OnGetFontMap#onGetFontMap}
    */
    public JnaFontChooserIface.OnGetFontMap getFieldGetFontMap() {
       toFields().readField(GET_FONT_MAP);
       return toFields().get_font_map;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontChooser.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontChooser.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
