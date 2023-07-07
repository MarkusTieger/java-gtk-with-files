/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/Pango/struct.FontFamilyClass.html">https://docs.gtk.org/Pango/struct.FontFamilyClass.html</a></p>
*/
public class FontFamilyClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontFamilyClass.class.getCanonicalName());
    }

    public FontFamilyClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFontFamilyClass.Fields _fields;
    
    JnaFontFamilyClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontFamilyClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontFamily.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontFamily.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:list_faces:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:get_name:previous-field-unsupported:[MethodModel:Supported:getName:[ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]

[MethodModel:Supported:getName:[ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]

[FieldModel:is_monospace:previous-field-unsupported:[MethodModel:Supported:isMonospace:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]

[MethodModel:Supported:isMonospace:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]

[FieldModel:is_variable:previous-field-unsupported:[MethodModel:Supported:isVariable:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]

[MethodModel:Supported:isVariable:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]

[FieldModel:get_face:previous-field-unsupported:[MethodModel:Supported:getFace:[ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:getFace:[ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:_pango_reserved2:previous-field-unsupported:[MethodModel:Supported:pangoReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
