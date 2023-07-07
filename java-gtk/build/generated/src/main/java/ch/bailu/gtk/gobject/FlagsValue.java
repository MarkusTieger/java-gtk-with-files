/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure which contains a single flags value, its name, and its
 * <br>nickname.
 * <p><a href="https://docs.gtk.org/gobject/struct.FlagsValue.html">https://docs.gtk.org/gobject/struct.FlagsValue.html</a></p>
*/
public class FlagsValue extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlagsValue.class.getCanonicalName());
    }

    public FlagsValue(PointerContainer pointer) {
        super(pointer);
    }

    public FlagsValue() {
        super(cast(JnaFlagsValue.allocateStructure()));
    }

    private JnaFlagsValue.Fields _fields;
    
    JnaFlagsValue.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFlagsValue.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the flags value
    */
    public static final String VALUE = "value";

    /**
     * the flags value
    */
    public void setFieldValue(int value) {
        toFields().value = value;
        toFields().writeField(VALUE);
    }

    /**
     * the flags value
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
