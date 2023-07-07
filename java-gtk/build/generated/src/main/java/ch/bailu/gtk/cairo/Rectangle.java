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
     * 
    */
    public static final String X = "x";

    /**
     * 
    */
    public void setFieldX(double x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * 
    */
    public double getFieldX() {
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
    public void setFieldY(double y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * 
    */
    public double getFieldY() {
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
    public void setFieldWidth(double width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * 
    */
    public double getFieldWidth() {
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
    public void setFieldHeight(double height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * 
    */
    public double getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    public static long getTypeID() { 
        return JnaRectangle.INST().cairo_gobject_rectangle_get_type(); 
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
