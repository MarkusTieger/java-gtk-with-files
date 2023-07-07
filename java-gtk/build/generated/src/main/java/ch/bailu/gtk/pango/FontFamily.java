/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontFamily` is used to represent a family of related
 * <br>font faces.
 * <br>
 * <br>The font faces in a family share a common design, but differ in
 * <br>slant, weight, width or other aspects.
 * <p><a href="https://docs.gtk.org/Pango/class.FontFamily.html">https://docs.gtk.org/Pango/class.FontFamily.html</a></p>
*/
public class FontFamily extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontFamily.class.getCanonicalName());
    }

    public FontFamily(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the `PangoFontFace` of &#64;family with the given name.
     * @param name the name of a face. If the name is %NULL,   the family's default face (fontconfig calls it &quot;Regular&quot;)   will be returned.
     * @return the `PangoFontFace`,   or %NULL if no face with the given name exists.
    */
    public FontFace getFace(@Nullable ch.bailu.gtk.type.Str name)  {
        return new FontFace(new PointerContainer(JnaFontFamily.INST().pango_font_family_get_face(asCPointer(), asCPointer(name))));
    }

    /**
     * Gets the `PangoFontFace` of &#64;family with the given name.
     * @param name the name of a face. If the name is %NULL,   the family's default face (fontconfig calls it &quot;Regular&quot;)   will be returned.
     * @return the `PangoFontFace`,   or %NULL if no face with the given name exists.
    */
    public FontFace getFace(String name)  {
        return new FontFace(new PointerContainer(JnaFontFamily.INST().pango_font_family_get_face(asCPointer(), name)));
    }

    /**
     * Gets the name of the family.
     * <br>
     * <br>The name is unique among all fonts for the font backend and can
     * <br>be used in a `PangoFontDescription` to specify that a face from
     * <br>this family is desired.
     * @return the name of the family. This string is owned   by the family object and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontFamily.INST().pango_font_family_get_name(asCPointer())));
    }

    /**
     * A monospace font is a font designed for text display where the the
     * <br>characters form a regular grid.
     * <br>
     * <br>For Western languages this would
     * <br>mean that the advance width of all characters are the same, but
     * <br>this categorization also includes Asian fonts which include
     * <br>double-width characters: characters that occupy two grid cells.
     * <br>g_unichar_iswide() returns a result that indicates whether a
     * <br>character is typically double-width in a monospace font.
     * <br>
     * <br>The best way to find out the grid-cell size is to call
     * <br>[method&#64;Pango.FontMetrics.get_approximate_digit_width], since the
     * <br>results of [method&#64;Pango.FontMetrics.get_approximate_char_width] may
     * <br>be affected by double-width characters.
     * @return %TRUE if the family is monospace.
    */
    public boolean isMonospace()  {
        return JnaFontFamily.INST().pango_font_family_is_monospace(asCPointer());
    }

    /**
     * A variable font is a font which has axes that can be modified to
     * <br>produce different faces.
     * <br>
     * <br>Such axes are also known as _variations_; see
     * <br>[method&#64;Pango.FontDescription.set_variations] for more information.
     * @return %TRUE if the family is variable
    */
    public boolean isVariable()  {
        return JnaFontFamily.INST().pango_font_family_is_variable(asCPointer());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaFontFamily.INST().pango_font_family_get_type(); 
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

[MethodModel:java-type-not-supported:listFaces:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoFontFace***}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
