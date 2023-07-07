/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/Pango/struct.FontClass.html">https://docs.gtk.org/Pango/struct.FontClass.html</a></p>
*/
public class FontClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDescribe {
        /**
         * 
         * @param font a `PangoFont`
         * @return a newly-allocated `PangoFontDescription` object.
        */
        FontDescription onDescribe(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Font font);
    }
    
    private static JnaFontClass.OnDescribe toOnDescribe(ch.bailu.gtk.type.Pointer instance, String methodName, OnDescribe in) {
        JnaFontClass.OnDescribe out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_font) -> in.onDescribe(__callback, new Font(new PointerContainer(_font))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCoverage {
        /**
         * 
         * @param font a `PangoFont`
         * @param language the language tag
         * @return a newly-allocated `PangoCoverage`   object.
        */
        Coverage onGetCoverage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Font font, @Nonnull Language language);
    }
    
    private static JnaFontClass.OnGetCoverage toOnGetCoverage(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCoverage in) {
        JnaFontClass.OnGetCoverage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_font, _language) -> in.onGetCoverage(__callback, new Font(new PointerContainer(_font)), new Language(new PointerContainer(_language))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public FontClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFontClass.Fields _fields;
    
    JnaFontClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontClass.Fields(asCPointer());
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
     * <br>See {@link OnDescribe#onDescribe}
    */
    public static final String DESCRIBE = "describe";

    /**
     * 
     * <br>See {@link OnDescribe#onDescribe}
    */
    public void setFieldDescribe(OnDescribe describe) {
        toFields().describe = toOnDescribe(this, DESCRIBE, describe);
        toFields().writeField(DESCRIBE);
    }

    /**
     * 
     * <br>See {@link OnDescribe#onDescribe}
    */
    public JnaFontClass.OnDescribe getFieldDescribe() {
       toFields().readField(DESCRIBE);
       return toFields().describe;
    } 

    /**
     * 
     * <br>See {@link OnGetCoverage#onGetCoverage}
    */
    public static final String GET_COVERAGE = "get_coverage";

    /**
     * 
     * <br>See {@link OnGetCoverage#onGetCoverage}
    */
    public void setFieldGetCoverage(OnGetCoverage get_coverage) {
        toFields().get_coverage = toOnGetCoverage(this, GET_COVERAGE, get_coverage);
        toFields().writeField(GET_COVERAGE);
    }

    /**
     * 
     * <br>See {@link OnGetCoverage#onGetCoverage}
    */
    public JnaFontClass.OnGetCoverage getFieldGetCoverage() {
       toFields().readField(GET_COVERAGE);
       return toFields().get_coverage;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Font.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Font.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_glyph_extents:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:get_metrics:previous-field-unsupported:[MethodModel:Supported:getMetrics:[ParameterModel:Supported:{Gg:FontMetrics:{c:PangoFontMetrics*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Language:{c:PangoLanguage*}}:{j:long}]]

[MethodModel:Supported:getMetrics:[ParameterModel:Supported:{Gg:FontMetrics:{c:PangoFontMetrics*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Language:{c:PangoLanguage*}}:{j:long}]

[FieldModel:get_font_map:previous-field-unsupported:[MethodModel:Supported:getFontMap:[ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]]

[MethodModel:Supported:getFontMap:[ParameterModel:Supported:{Gg:FontMap:{c:PangoFontMap*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]

[FieldModel:describe_absolute:previous-field-unsupported:[MethodModel:Supported:describeAbsolute:[ParameterModel:Supported:{Gg:FontDescription:{c:PangoFontDescription*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]]

[MethodModel:Supported:describeAbsolute:[ParameterModel:Supported:{Gg:FontDescription:{c:PangoFontDescription*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]

[FieldModel:get_features:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:create_hb_font:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
