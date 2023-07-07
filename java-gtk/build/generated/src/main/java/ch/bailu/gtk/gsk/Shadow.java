/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The shadow parameters in a shadow node.
 * <p><a href="https://docs.gtk.org/gsk4/struct.Shadow.html">https://docs.gtk.org/gsk4/struct.Shadow.html</a></p>
*/
public class Shadow extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Shadow.class.getCanonicalName());
    }

    public Shadow(PointerContainer pointer) {
        super(pointer);
    }

    public Shadow() {
        super(cast(JnaShadow.allocateStructure()));
    }

    private JnaShadow.Fields _fields;
    
    JnaShadow.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaShadow.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the color of the shadow
     * <br>Private field: direct-type
    */
    public static final String COLOR = "color";

    /**
     * the horizontal offset of the shadow
    */
    public static final String DX = "dx";

    /**
     * the horizontal offset of the shadow
    */
    public void setFieldDx(float dx) {
        toFields().dx = dx;
        toFields().writeField(DX);
    }

    /**
     * the horizontal offset of the shadow
    */
    public float getFieldDx() {
       toFields().readField(DX);
       return toFields().dx;
    } 

    /**
     * the vertical offset of the shadow
    */
    public static final String DY = "dy";

    /**
     * the vertical offset of the shadow
    */
    public void setFieldDy(float dy) {
        toFields().dy = dy;
        toFields().writeField(DY);
    }

    /**
     * the vertical offset of the shadow
    */
    public float getFieldDy() {
       toFields().readField(DY);
       return toFields().dy;
    } 

    /**
     * the radius of the shadow
    */
    public static final String RADIUS = "radius";

    /**
     * the radius of the shadow
    */
    public void setFieldRadius(float radius) {
        toFields().radius = radius;
        toFields().writeField(RADIUS);
    }

    /**
     * the radius of the shadow
    */
    public float getFieldRadius() {
       toFields().readField(RADIUS);
       return toFields().radius;
    } 

}

/*
record-type
all-fields-supported
*/
