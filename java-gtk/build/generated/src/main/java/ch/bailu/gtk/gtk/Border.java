/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A struct that specifies a border around a rectangular area.
 * <br>
 * <br>Each side can have different width.
 * <p><a href="https://docs.gtk.org/gtk4/struct.Border.html">https://docs.gtk.org/gtk4/struct.Border.html</a></p>
*/
public class Border extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Border.class.getCanonicalName());
    }

    public Border(PointerContainer pointer) {
        super(pointer);
    }

    private JnaBorder.Fields _fields;
    
    JnaBorder.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBorder.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The width of the left border
    */
    public static final String LEFT = "left";

    /**
     * The width of the left border
    */
    public void setFieldLeft(int left) {
        toFields().left = left;
        toFields().writeField(LEFT);
    }

    /**
     * The width of the left border
    */
    public int getFieldLeft() {
       toFields().readField(LEFT);
       return toFields().left;
    } 

    /**
     * The width of the right border
    */
    public static final String RIGHT = "right";

    /**
     * The width of the right border
    */
    public void setFieldRight(int right) {
        toFields().right = right;
        toFields().writeField(RIGHT);
    }

    /**
     * The width of the right border
    */
    public int getFieldRight() {
       toFields().readField(RIGHT);
       return toFields().right;
    } 

    /**
     * The width of the top border
    */
    public static final String TOP = "top";

    /**
     * The width of the top border
    */
    public void setFieldTop(int top) {
        toFields().top = top;
        toFields().writeField(TOP);
    }

    /**
     * The width of the top border
    */
    public int getFieldTop() {
       toFields().readField(TOP);
       return toFields().top;
    } 

    /**
     * The width of the bottom border
    */
    public static final String BOTTOM = "bottom";

    /**
     * The width of the bottom border
    */
    public void setFieldBottom(int bottom) {
        toFields().bottom = bottom;
        toFields().writeField(BOTTOM);
    }

    /**
     * The width of the bottom border
    */
    public int getFieldBottom() {
       toFields().readField(BOTTOM);
       return toFields().bottom;
    } 

    /**
     * Allocates a new `GtkBorder` struct and initializes its elements to zero.
    */
    public Border() {
        super(cast(JnaBorder.INST().gtk_border_new()));
    }

    /**
     * Copies a `GtkBorder`.
     * @return a copy of &#64;border_.
    */
    public Border copy()  {
        return new Border(new PointerContainer(JnaBorder.INST().gtk_border_copy(asCPointer())));
    }

    /**
     * Frees a `GtkBorder`.
    */
    public void free()  {
        JnaBorder.INST().gtk_border_free(asCPointer());
    }

    public static long getTypeID() { 
        return JnaBorder.INST().gtk_border_get_type(); 
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
*/
