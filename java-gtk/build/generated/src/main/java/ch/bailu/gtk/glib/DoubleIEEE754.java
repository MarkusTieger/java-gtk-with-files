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
public class DoubleIEEE754 extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DoubleIEEE754.class.getCanonicalName());
    }

    public DoubleIEEE754(PointerContainer pointer) {
        super(pointer);
    }

    public DoubleIEEE754() {
        super(cast(JnaDoubleIEEE754.allocateStructure()));
    }

    private JnaDoubleIEEE754.Fields _fields;
    
    JnaDoubleIEEE754.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDoubleIEEE754.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the double value
    */
    public static final String V_DOUBLE = "v_double";

    /**
     * the double value
    */
    public void setFieldVDouble(double v_double) {
        toFields().v_double = v_double;
        toFields().writeField(V_DOUBLE);
    }

    /**
     * the double value
    */
    public double getFieldVDouble() {
       toFields().readField(V_DOUBLE);
       return toFields().v_double;
    } 

}

/*
union-type
all-fields-supported
*/
