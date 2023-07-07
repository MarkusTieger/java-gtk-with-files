/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class of an enumeration type holds information about its
 * <br>possible values.
 * <p><a href="https://docs.gtk.org/gobject/struct.EnumClass.html">https://docs.gtk.org/gobject/struct.EnumClass.html</a></p>
*/
public class EnumClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EnumClass.class.getCanonicalName());
    }

    public EnumClass(PointerContainer pointer) {
        super(pointer);
    }

    public EnumClass() {
        super(cast(JnaEnumClass.allocateStructure()));
    }

    private JnaEnumClass.Fields _fields;
    
    JnaEnumClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEnumClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String G_TYPE_CLASS = "g_type_class";

    /**
     * the smallest possible value.
    */
    public static final String MINIMUM = "minimum";

    /**
     * the smallest possible value.
    */
    public void setFieldMinimum(int minimum) {
        toFields().minimum = minimum;
        toFields().writeField(MINIMUM);
    }

    /**
     * the smallest possible value.
    */
    public int getFieldMinimum() {
       toFields().readField(MINIMUM);
       return toFields().minimum;
    } 

    /**
     * the largest possible value.
    */
    public static final String MAXIMUM = "maximum";

    /**
     * the largest possible value.
    */
    public void setFieldMaximum(int maximum) {
        toFields().maximum = maximum;
        toFields().writeField(MAXIMUM);
    }

    /**
     * the largest possible value.
    */
    public int getFieldMaximum() {
       toFields().readField(MAXIMUM);
       return toFields().maximum;
    } 

    /**
     * the number of possible values.
    */
    public static final String N_VALUES = "n_values";

    /**
     * the number of possible values.
    */
    public void setFieldNValues(int n_values) {
        toFields().n_values = n_values;
        toFields().writeField(N_VALUES);
    }

    /**
     * the number of possible values.
    */
    public int getFieldNValues() {
       toFields().readField(N_VALUES);
       return toFields().n_values;
    } 

    /**
     * an array of &#35;GEnumValue structs describing the
     * <br> individual values.
    */
    public static final String VALUES = "values";

    /**
     * an array of &#35;GEnumValue structs describing the
     * <br> individual values.
    */
    public void setFieldValues(EnumValue values) {
        toFields().values = values.asCPointer();
        toFields().writeField(VALUES);
    }

    /**
     * an array of &#35;GEnumValue structs describing the
     * <br> individual values.
    */
    public EnumValue getFieldValues() {
       toFields().readField(VALUES);
       return new EnumValue(new PointerContainer(toFields().values));
    } 

}

/*
record-type
all-fields-supported
*/
