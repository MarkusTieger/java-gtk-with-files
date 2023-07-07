/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A color stop in a gradient node.
 * <p><a href="https://docs.gtk.org/gsk4/struct.ColorStop.html">https://docs.gtk.org/gsk4/struct.ColorStop.html</a></p>
*/
public class ColorStop extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorStop.class.getCanonicalName());
    }

    public ColorStop(PointerContainer pointer) {
        super(pointer);
    }

    public ColorStop() {
        super(cast(JnaColorStop.allocateStructure()));
    }

    private JnaColorStop.Fields _fields;
    
    JnaColorStop.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaColorStop.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the offset of the color stop
    */
    public static final String OFFSET = "offset";

    /**
     * the offset of the color stop
    */
    public void setFieldOffset(float offset) {
        toFields().offset = offset;
        toFields().writeField(OFFSET);
    }

    /**
     * the offset of the color stop
    */
    public float getFieldOffset() {
       toFields().readField(OFFSET);
       return toFields().offset;
    } 

    /**
     * the color at the given offset
     * <br>Private field: direct-type
    */
    public static final String COLOR = "color";

}

/*
record-type
all-fields-supported
*/
