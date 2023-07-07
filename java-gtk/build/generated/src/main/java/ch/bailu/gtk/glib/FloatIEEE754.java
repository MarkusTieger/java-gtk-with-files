/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GFloatIEEE754 and &#35;GDoubleIEEE754 unions are used to access the sign,
 * <br>mantissa and exponent of IEEE floats and doubles. These unions are defined
 * <br>as appropriate for a given platform. IEEE floats and doubles are supported
 * <br>(used for storage) by at least Intel, PPC and Sparc.
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class FloatIEEE754 extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FloatIEEE754.class.getCanonicalName());
    }

    public FloatIEEE754(PointerContainer pointer) {
        super(pointer);
    }

    public FloatIEEE754() {
        super(cast(JnaFloatIEEE754.allocateStructure()));
    }

    private JnaFloatIEEE754.Fields _fields;
    
    JnaFloatIEEE754.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFloatIEEE754.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the double value
    */
    public static final String V_FLOAT = "v_float";

    /**
     * the double value
    */
    public void setFieldVFloat(float v_float) {
        toFields().v_float = v_float;
        toFields().writeField(V_FLOAT);
    }

    /**
     * the double value
    */
    public float getFieldVFloat() {
       toFields().readField(V_FLOAT);
       return toFields().v_float;
    } 

}

/*
union-type
all-fields-supported
*/
