/* this file is machine generated */
package ch.bailu.gtk.cairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.cairographics.org/manual/">https://www.cairographics.org/manual/</a></p>
*/
public class RectangleInt extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RectangleInt.class.getCanonicalName());
    }

    public RectangleInt(PointerContainer pointer) {
        super(pointer);
    }

    public RectangleInt() {
        super(cast(JnaRectangleInt.allocateStructure()));
    }

    private JnaRectangleInt.Fields _fields;
    
    JnaRectangleInt.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRectangleInt.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String X = "x";

    /**
     * 
    */
    public void setFieldX(int x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * 
    */
    public int getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * 
    */
    public static final String Y = "y";

    /**
     * 
    */
    public void setFieldY(int y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * 
    */
    public int getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * 
    */
    public static final String WIDTH = "width";

    /**
     * 
    */
    public void setFieldWidth(int width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * 
    */
    public int getFieldWidth() {
       toFields().readField(WIDTH);
       return toFields().width;
    } 

    /**
     * 
    */
    public static final String HEIGHT = "height";

    /**
     * 
    */
    public void setFieldHeight(int height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * 
    */
    public int getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    public static long getTypeID() { 
        return JnaRectangleInt.INST().cairo_gobject_rectangle_int_get_type(); 
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
