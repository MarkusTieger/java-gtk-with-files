/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoFontMapClass` structure holds the virtual functions for
 * <br>a particular `PangoFontMap` implementation.
 * <p><a href="https://docs.gtk.org/Pango/struct.FontMapClass.html">https://docs.gtk.org/Pango/struct.FontMapClass.html</a></p>
*/
public class FontMapClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontMapClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLoadFont {
        /**
         * 
         * @param fontmap a `PangoFontMap`
         * @param context the `PangoContext` the font will be used with
         * @param desc a `PangoFontDescription` describing the font to load
         * @return the newly allocated `PangoFont`   loaded, or %NULL if no font matched.
        */
        Font onLoadFont(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontMap fontmap, @Nonnull Context context, @Nonnull FontDescription desc);
    }
    
    private static JnaFontMapClass.OnLoadFont toOnLoadFont(ch.bailu.gtk.type.Pointer instance, String methodName, OnLoadFont in) {
        JnaFontMapClass.OnLoadFont out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontmap, _context, _desc) -> in.onLoadFont(__callback, new FontMap(new PointerContainer(_fontmap)), new Context(new PointerContainer(_context)), new FontDescription(new PointerContainer(_desc))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public FontMapClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFontMapClass.Fields _fields;
    
    JnaFontMapClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontMapClass.Fields(asCPointer());
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
     * <br>See {@link OnLoadFont#onLoadFont}
    */
    public static final String LOAD_FONT = "load_font";

    /**
     * 
     * <br>See {@link OnLoadFont#onLoadFont}
    */
    public void setFieldLoadFont(OnLoadFont load_font) {
        toFields().load_font = toOnLoadFont(this, LOAD_FONT, load_font);
        toFields().writeField(LOAD_FONT);
    }

    /**
     * 
     * <br>See {@link OnLoadFont#onLoadFont}
    */
    public JnaFontMapClass.OnLoadFont getFieldLoadFont() {
       toFields().readField(LOAD_FONT);
       return toFields().load_font;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontMap.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontMap.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:list_families:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:load_fontset:previous-field-unsupported:[MethodModel:Supported:loadFontset:[ParameterModel:Supported:{Gg:Fontset:{c:PangoFontset*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Context:{c:PangoContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FontDescription:{c:const PangoFontDescription*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Language:{c:PangoLanguage*}}:{j:long}]]

[MethodModel:Supported:loadFontset:[ParameterModel:Supported:{Gg:Fontset:{c:PangoFontset*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Context:{c:PangoContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FontDescription:{c:const PangoFontDescription*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Language:{c:PangoLanguage*}}:{j:long}]

[FieldModel:shape_engine_type:previous-field-unsupported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:get_serial:previous-field-unsupported:[MethodModel:Supported:getSerial:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]]

[MethodModel:Supported:getSerial:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]

[FieldModel:changed:previous-field-unsupported:[MethodModel:Supported:changed:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]]

[MethodModel:Supported:changed:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]

[FieldModel:get_family:previous-field-unsupported:[MethodModel:Supported:getFamily:[ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:getFamily:[ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:get_face:previous-field-unsupported:[MethodModel:Supported:getFace:[ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]]

[MethodModel:Supported:getFace:[ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]
*/
