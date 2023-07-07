/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class of a flags type holds information about its
 * <br>possible values.
 * <p><a href="https://docs.gtk.org/gobject/struct.FlagsClass.html">https://docs.gtk.org/gobject/struct.FlagsClass.html</a></p>
*/
public class FlagsClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlagsClass.class.getCanonicalName());
    }

    public FlagsClass(PointerContainer pointer) {
        super(pointer);
    }

    public FlagsClass() {
        super(cast(JnaFlagsClass.allocateStructure()));
    }

    private JnaFlagsClass.Fields _fields;
    
    JnaFlagsClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFlagsClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String G_TYPE_CLASS = "g_type_class";

    /**
     * a mask covering all possible values.
    */
    public static final String MASK = "mask";

    /**
     * a mask covering all possible values.
    */
    public void setFieldMask(int mask) {
        toFields().mask = mask;
        toFields().writeField(MASK);
    }

    /**
     * a mask covering all possible values.
    */
    public int getFieldMask() {
       toFields().readField(MASK);
       return toFields().mask;
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
     * an array of &#35;GFlagsValue structs describing the
     * <br> individual values.
    */
    public static final String VALUES = "values";

    /**
     * an array of &#35;GFlagsValue structs describing the
     * <br> individual values.
    */
    public void setFieldValues(FlagsValue values) {
        toFields().values = values.asCPointer();
        toFields().writeField(VALUES);
    }

    /**
     * an array of &#35;GFlagsValue structs describing the
     * <br> individual values.
    */
    public FlagsValue getFieldValues() {
       toFields().readField(VALUES);
       return new FlagsValue(new PointerContainer(toFields().values));
    } 

}

/*
record-type
all-fields-supported
*/
