/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure that provides information to the type system which is
 * <br>used specifically for managing fundamental types.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeFundamentalInfo.html">https://docs.gtk.org/gobject/struct.TypeFundamentalInfo.html</a></p>
*/
public class TypeFundamentalInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeFundamentalInfo.class.getCanonicalName());
    }

    public TypeFundamentalInfo(PointerContainer pointer) {
        super(pointer);
    }

    public TypeFundamentalInfo() {
        super(cast(JnaTypeFundamentalInfo.allocateStructure()));
    }

    private JnaTypeFundamentalInfo.Fields _fields;
    
    JnaTypeFundamentalInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeFundamentalInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * &#35;GTypeFundamentalFlags describing the characteristics of the fundamental type
    */
    public static final String TYPE_FLAGS = "type_flags";

    /**
     * &#35;GTypeFundamentalFlags describing the characteristics of the fundamental type
    */
    public void setFieldTypeFlags(int type_flags) {
        toFields().type_flags = type_flags;
        toFields().writeField(TYPE_FLAGS);
    }

    /**
     * &#35;GTypeFundamentalFlags describing the characteristics of the fundamental type
    */
    public int getFieldTypeFlags() {
       toFields().readField(TYPE_FLAGS);
       return toFields().type_flags;
    } 

}

/*
record-type
all-fields-supported
*/
