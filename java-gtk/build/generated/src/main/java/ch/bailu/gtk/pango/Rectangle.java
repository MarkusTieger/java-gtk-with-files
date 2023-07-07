/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoRectangle` structure represents a rectangle.
 * <br>
 * <br>`PangoRectangle` is frequently used to represent the logical or ink
 * <br>extents of a single glyph or section of text. (See, for instance,
 * <br>[method&#64;Pango.Font.get_glyph_extents].)
 * <p><a href="https://docs.gtk.org/Pango/struct.Rectangle.html">https://docs.gtk.org/Pango/struct.Rectangle.html</a></p>
*/
public class Rectangle extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Rectangle.class.getCanonicalName());
    }

    public Rectangle(PointerContainer pointer) {
        super(pointer);
    }

    public Rectangle() {
        super(cast(JnaRectangle.allocateStructure()));
    }

    private JnaRectangle.Fields _fields;
    
    JnaRectangle.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRectangle.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * X coordinate of the left side of the rectangle.
    */
    public static final String X = "x";

    /**
     * X coordinate of the left side of the rectangle.
    */
    public void setFieldX(int x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * X coordinate of the left side of the rectangle.
    */
    public int getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * Y coordinate of the the top side of the rectangle.
    */
    public static final String Y = "y";

    /**
     * Y coordinate of the the top side of the rectangle.
    */
    public void setFieldY(int y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * Y coordinate of the the top side of the rectangle.
    */
    public int getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * width of the rectangle.
    */
    public static final String WIDTH = "width";

    /**
     * width of the rectangle.
    */
    public void setFieldWidth(int width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * width of the rectangle.
    */
    public int getFieldWidth() {
       toFields().readField(WIDTH);
       return toFields().width;
    } 

    /**
     * height of the rectangle.
    */
    public static final String HEIGHT = "height";

    /**
     * height of the rectangle.
    */
    public void setFieldHeight(int height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * height of the rectangle.
    */
    public int getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

}

/*
record-type
all-fields-supported
*/
