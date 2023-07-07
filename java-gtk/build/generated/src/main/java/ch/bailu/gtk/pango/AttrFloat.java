/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrFloat` structure is used to represent attributes with
 * <br>a float or double value.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrFloat.html">https://docs.gtk.org/Pango/struct.AttrFloat.html</a></p>
*/
public class AttrFloat extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrFloat.class.getCanonicalName());
    }

    public AttrFloat(PointerContainer pointer) {
        super(pointer);
    }

    public AttrFloat() {
        super(cast(JnaAttrFloat.allocateStructure()));
    }

    private JnaAttrFloat.Fields _fields;
    
    JnaAttrFloat.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrFloat.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the value of the attribute
    */
    public static final String VALUE = "value";

    /**
     * the value of the attribute
    */
    public void setFieldValue(double value) {
        toFields().value = value;
        toFields().writeField(VALUE);
    }

    /**
     * the value of the attribute
    */
    public double getFieldValue() {
       toFields().readField(VALUE);
       return toFields().value;
    } 

}

/*
record-type
all-fields-supported
*/
