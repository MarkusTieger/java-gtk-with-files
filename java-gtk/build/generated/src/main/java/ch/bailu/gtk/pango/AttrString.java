/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrString` structure is used to represent attributes with
 * <br>a string value.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrString.html">https://docs.gtk.org/Pango/struct.AttrString.html</a></p>
*/
public class AttrString extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrString.class.getCanonicalName());
    }

    public AttrString(PointerContainer pointer) {
        super(pointer);
    }

    public AttrString() {
        super(cast(JnaAttrString.allocateStructure()));
    }

    private JnaAttrString.Fields _fields;
    
    JnaAttrString.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrString.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the string which is the value of the attribute
    */
    public static final String VALUE = "value";

    /**
     * the string which is the value of the attribute
    */
    public void setFieldValue(ch.bailu.gtk.type.Str value) {
        toFields().value = value.asCPointer();
        toFields().writeField(VALUE);
    }

    /**
     * the string which is the value of the attribute
    */
    public ch.bailu.gtk.type.Str getFieldValue() {
       toFields().readField(VALUE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().value));
    } 

}

/*
record-type
all-fields-supported
*/
