/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrInt` structure is used to represent attributes with
 * <br>an integer or enumeration value.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrInt.html">https://docs.gtk.org/Pango/struct.AttrInt.html</a></p>
*/
public class AttrInt extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrInt.class.getCanonicalName());
    }

    public AttrInt(PointerContainer pointer) {
        super(pointer);
    }

    public AttrInt() {
        super(cast(JnaAttrInt.allocateStructure()));
    }

    private JnaAttrInt.Fields _fields;
    
    JnaAttrInt.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrInt.Fields(asCPointer());
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
    public void setFieldValue(int value) {
        toFields().value = value;
        toFields().writeField(VALUE);
    }

    /**
     * the value of the attribute
    */
    public int getFieldValue() {
       toFields().readField(VALUE);
       return toFields().value;
    } 

}

/*
record-type
all-fields-supported
*/
