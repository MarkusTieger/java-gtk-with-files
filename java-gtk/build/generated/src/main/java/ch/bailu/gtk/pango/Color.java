/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoColor` structure is used to
 * <br>represent a color in an uncalibrated RGB color-space.
 * <p><a href="https://docs.gtk.org/Pango/struct.Color.html">https://docs.gtk.org/Pango/struct.Color.html</a></p>
*/
public class Color extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Color.class.getCanonicalName());
    }

    public Color(PointerContainer pointer) {
        super(pointer);
    }

    public Color() {
        super(cast(JnaColor.allocateStructure()));
    }

    private JnaColor.Fields _fields;
    
    JnaColor.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaColor.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * value of red component
    */
    public static final String RED = "red";

    /**
     * value of red component
    */
    public void setFieldRed(int red) {
        toFields().red = red;
        toFields().writeField(RED);
    }

    /**
     * value of red component
    */
    public int getFieldRed() {
       toFields().readField(RED);
       return toFields().red;
    } 

    /**
     * value of green component
    */
    public static final String GREEN = "green";

    /**
     * value of green component
    */
    public void setFieldGreen(int green) {
        toFields().green = green;
        toFields().writeField(GREEN);
    }

    /**
     * value of green component
    */
    public int getFieldGreen() {
       toFields().readField(GREEN);
       return toFields().green;
    } 

    /**
     * value of blue component
    */
    public static final String BLUE = "blue";

    /**
     * value of blue component
    */
    public void setFieldBlue(int blue) {
        toFields().blue = blue;
        toFields().writeField(BLUE);
    }

    /**
     * value of blue component
    */
    public int getFieldBlue() {
       toFields().readField(BLUE);
       return toFields().blue;
    } 

    /**
     * Creates a copy of &#64;src.
     * <br>
     * <br>The copy should be freed with [method&#64;Pango.Color.free].
     * <br>Primarily used by language bindings, not that useful
     * <br>otherwise (since colors can just be copied by assignment
     * <br>in C).
     * @return the newly allocated `PangoColor`,   which should be freed with [method&#64;Pango.Color.free]
    */
    public Color copy()  {
        return new Color(new PointerContainer(JnaColor.INST().pango_color_copy(asCPointer())));
    }

    /**
     * Frees a color allocated by [method&#64;Pango.Color.copy].
    */
    public void free()  {
        JnaColor.INST().pango_color_free(asCPointer());
    }

    /**
     * Fill in the fields of a color from a string specification.
     * <br>
     * <br>The string can either one of a large set of standard names.
     * <br>(Taken from the CSS Color [specification](https://www.w3.org/TR/css-color-4/&#35;named-colors),
     * <br>or it can be a value in the form `&#35;rgb`, `&#35;rrggbb`,
     * <br>`&#35;rrrgggbbb` or `&#35;rrrrggggbbbb`, where `r`, `g` and `b`
     * <br>are hex digits of the red, green, and blue components
     * <br>of the color, respectively. (White in the four forms is
     * <br>`&#35;fff`, `&#35;ffffff`, `&#35;fffffffff` and `&#35;ffffffffffff`.)
     * @param spec a string specifying the new color
     * @return %TRUE if parsing of the specifier succeeded,   otherwise %FALSE
    */
    public boolean parse(@Nonnull ch.bailu.gtk.type.Str spec)  {
        return JnaColor.INST().pango_color_parse(asCPointer(), asCPointerNotNull(spec));
    }

    /**
     * Fill in the fields of a color from a string specification.
     * <br>
     * <br>The string can either one of a large set of standard names.
     * <br>(Taken from the CSS Color [specification](https://www.w3.org/TR/css-color-4/&#35;named-colors),
     * <br>or it can be a value in the form `&#35;rgb`, `&#35;rrggbb`,
     * <br>`&#35;rrrgggbbb` or `&#35;rrrrggggbbbb`, where `r`, `g` and `b`
     * <br>are hex digits of the red, green, and blue components
     * <br>of the color, respectively. (White in the four forms is
     * <br>`&#35;fff`, `&#35;ffffff`, `&#35;fffffffff` and `&#35;ffffffffffff`.)
     * @param spec a string specifying the new color
     * @return %TRUE if parsing of the specifier succeeded,   otherwise %FALSE
    */
    public boolean parse(String spec)  {
        return JnaColor.INST().pango_color_parse(asCPointer(), spec);
    }

    /**
     * Returns a textual specification of &#64;color.
     * <br>
     * <br>The string is in the hexadecimal form `&#35;rrrrggggbbbb`,
     * <br>where `r`, `g` and `b` are hex digits representing the
     * <br>red, green, and blue components respectively.
     * @return a newly-allocated text string that must   be freed with g_free().
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaColor.INST().pango_color_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaColor.INST().pango_color_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:parseWithAlpha:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint16*}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
