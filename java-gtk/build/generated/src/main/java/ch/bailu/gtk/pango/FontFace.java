/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontFace` is used to represent a group of fonts with
 * <br>the same family, slant, weight, and width, but varying sizes.
 * <p><a href="https://docs.gtk.org/Pango/class.FontFace.html">https://docs.gtk.org/Pango/class.FontFace.html</a></p>
*/
public class FontFace extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontFace.class.getCanonicalName());
    }

    public FontFace(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a font description that matches the face.
     * <br>
     * <br>The resulting font description will have the family, style,
     * <br>variant, weight and stretch of the face, but its size field
     * <br>will be unset.
     * @return a newly-created `PangoFontDescription` structure   holding the description of the face. Use [method&#64;Pango.FontDescription.free]   to free the result.
    */
    public FontDescription describe()  {
        return new FontDescription(new PointerContainer(JnaFontFace.INST().pango_font_face_describe(asCPointer())));
    }

    /**
     * Gets a name representing the style of this face.
     * <br>
     * <br>Note that a font family may contain multiple faces
     * <br>with the same name (e.g. a variable and a non-variable
     * <br>face for the same style).
     * @return the face name for the face. This string is   owned by the face object and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getFaceName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontFace.INST().pango_font_face_get_face_name(asCPointer())));
    }

    /**
     * Gets the `PangoFontFamily` that &#64;face belongs to.
     * @return the `PangoFontFamily`
    */
    public FontFamily getFamily()  {
        return new FontFamily(new PointerContainer(JnaFontFace.INST().pango_font_face_get_family(asCPointer())));
    }

    /**
     * Returns whether a `PangoFontFace` is synthesized.
     * <br>
     * <br>This will be the case if the underlying font rendering engine
     * <br>creates this face from another face, by shearing, emboldening,
     * <br>lightening or modifying it in some other way.
     * @return whether &#64;face is synthesized
    */
    public boolean isSynthesized()  {
        return JnaFontFace.INST().pango_font_face_is_synthesized(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFontFace.INST().pango_font_face_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type

[MethodModel:java-type-not-supported:listSizes:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:int**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
