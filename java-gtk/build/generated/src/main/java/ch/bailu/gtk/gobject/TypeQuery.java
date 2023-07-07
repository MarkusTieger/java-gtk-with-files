/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure holding information for a specific type.
 * <br>
 * <br>See also: g_type_query()
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeQuery.html">https://docs.gtk.org/gobject/struct.TypeQuery.html</a></p>
*/
public class TypeQuery extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeQuery.class.getCanonicalName());
    }

    public TypeQuery(PointerContainer pointer) {
        super(pointer);
    }

    public TypeQuery() {
        super(cast(JnaTypeQuery.allocateStructure()));
    }

    private JnaTypeQuery.Fields _fields;
    
    JnaTypeQuery.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeQuery.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the &#35;GType value of the type
    */
    public static final String TYPE = "type";

    /**
     * the &#35;GType value of the type
    */
    public void setFieldType(long type) {
        toFields().type = type;
        toFields().writeField(TYPE);
    }

    /**
     * the &#35;GType value of the type
    */
    public long getFieldType() {
       toFields().readField(TYPE);
       return toFields().type;
    } 

    /**
     * the name of the type
    */
    public static final String TYPE_NAME = "type_name";

    /**
     * the name of the type
    */
    public void setFieldTypeName(ch.bailu.gtk.type.Str type_name) {
        toFields().type_name = type_name.asCPointer();
        toFields().writeField(TYPE_NAME);
    }

    /**
     * the name of the type
    */
    public ch.bailu.gtk.type.Str getFieldTypeName() {
       toFields().readField(TYPE_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().type_name));
    } 

    /**
     * the size of the class structure
    */
    public static final String CLASS_SIZE = "class_size";

    /**
     * the size of the class structure
    */
    public void setFieldClassSize(int class_size) {
        toFields().class_size = class_size;
        toFields().writeField(CLASS_SIZE);
    }

    /**
     * the size of the class structure
    */
    public int getFieldClassSize() {
       toFields().readField(CLASS_SIZE);
       return toFields().class_size;
    } 

    /**
     * the size of the instance structure
    */
    public static final String INSTANCE_SIZE = "instance_size";

    /**
     * the size of the instance structure
    */
    public void setFieldInstanceSize(int instance_size) {
        toFields().instance_size = instance_size;
        toFields().writeField(INSTANCE_SIZE);
    }

    /**
     * the size of the instance structure
    */
    public int getFieldInstanceSize() {
       toFields().readField(INSTANCE_SIZE);
       return toFields().instance_size;
    } 

}

/*
record-type
all-fields-supported
*/
