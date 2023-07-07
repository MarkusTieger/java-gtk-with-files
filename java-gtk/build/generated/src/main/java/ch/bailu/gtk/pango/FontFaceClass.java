/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/Pango/struct.FontFaceClass.html">https://docs.gtk.org/Pango/struct.FontFaceClass.html</a></p>
*/
public class FontFaceClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontFaceClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetFaceName {
        /**
         * 
         * @param face a `PangoFontFace`.
         * @return the face name for the face. This string is   owned by the face object and must not be modified or freed.
        */
        ch.bailu.gtk.type.Str onGetFaceName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontFace face);
    }
    
    private static JnaFontFaceClass.OnGetFaceName toOnGetFaceName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFaceName in) {
        JnaFontFaceClass.OnGetFaceName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_face) -> in.onGetFaceName(__callback, new FontFace(new PointerContainer(_face))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDescribe {
        /**
         * 
         * @param face a `PangoFontFace`
         * @return a newly-created `PangoFontDescription` structure   holding the description of the face. Use [method&#64;Pango.FontDescription.free]   to free the result.
        */
        FontDescription onDescribe(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FontFace face);
    }
    
    private static JnaFontFaceClass.OnDescribe toOnDescribe(ch.bailu.gtk.type.Pointer instance, String methodName, OnDescribe in) {
        JnaFontFaceClass.OnDescribe out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_face) -> in.onDescribe(__callback, new FontFace(new PointerContainer(_face))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public FontFaceClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFontFaceClass.Fields _fields;
    
    JnaFontFaceClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontFaceClass.Fields(asCPointer());
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
     * <br>See {@link OnGetFaceName#onGetFaceName}
    */
    public static final String GET_FACE_NAME = "get_face_name";

    /**
     * 
     * <br>See {@link OnGetFaceName#onGetFaceName}
    */
    public void setFieldGetFaceName(OnGetFaceName get_face_name) {
        toFields().get_face_name = toOnGetFaceName(this, GET_FACE_NAME, get_face_name);
        toFields().writeField(GET_FACE_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetFaceName#onGetFaceName}
    */
    public JnaFontFaceClass.OnGetFaceName getFieldGetFaceName() {
       toFields().readField(GET_FACE_NAME);
       return toFields().get_face_name;
    } 

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
    public JnaFontFaceClass.OnDescribe getFieldDescribe() {
       toFields().readField(DESCRIBE);
       return toFields().describe;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontFace.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FontFace.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:list_sizes:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:is_synthesized:previous-field-unsupported:[MethodModel:Supported:isSynthesized:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]

[MethodModel:Supported:isSynthesized:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]

[FieldModel:get_family:previous-field-unsupported:[MethodModel:Supported:getFamily:[ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]]

[MethodModel:Supported:getFamily:[ParameterModel:Supported:{Gg:FontFamily:{c:PangoFontFamily*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FontFace:{c:PangoFontFace*}}:{j:long}]

[FieldModel:_pango_reserved3:previous-field-unsupported:[MethodModel:Supported:pangoReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_pango_reserved4:previous-field-unsupported:[MethodModel:Supported:pangoReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
