/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure which contains a single enum value, its name, and its
 * <br>nickname.
 * <p><a href="https://docs.gtk.org/gobject/struct.EnumValue.html">https://docs.gtk.org/gobject/struct.EnumValue.html</a></p>
*/
public class EnumValue extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EnumValue.class.getCanonicalName());
    }

    public EnumValue(PointerContainer pointer) {
        super(pointer);
    }

    public EnumValue() {
        super(cast(JnaEnumValue.allocateStructure()));
    }

    private JnaEnumValue.Fields _fields;
    
    JnaEnumValue.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEnumValue.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the enum value
    */
    public static final String VALUE = "value";

    /**
     * the enum value
    */
    public void setFieldValue(int value) {
        toFields().value = value;
        toFields().writeField(VALUE);
    }

    /**
     * the enum value
    */
    public int getFieldValue() {
       toFields().readField(VALUE);
       return toFields().value;
    } 

    /**
     * the name of the value
    */
    public static final String VALUE_NAME = "value_name";

    /**
     * the name of the value
    */
    public void setFieldValueName(ch.bailu.gtk.type.Str value_name) {
        toFields().value_name = value_name.asCPointer();
        toFields().writeField(VALUE_NAME);
    }

    /**
     * the name of the value
    */
    public ch.bailu.gtk.type.Str getFieldValueName() {
       toFields().readField(VALUE_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().value_name));
    } 

    /**
     * the nickname of the value
    */
    public static final String VALUE_NICK = "value_nick";

    /**
     * the nickname of the value
    */
    public void setFieldValueNick(ch.bailu.gtk.type.Str value_nick) {
        toFields().value_nick = value_nick.asCPointer();
        toFields().writeField(VALUE_NICK);
    }

    /**
     * the nickname of the value
    */
    public ch.bailu.gtk.type.Str getFieldValueNick() {
       toFields().readField(VALUE_NICK);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().value_nick));
    } 

}

/*
record-type
all-fields-supported
*/
