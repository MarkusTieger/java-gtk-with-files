/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GValueArray contains an array of &#35;GValue elements.
 * <p><a href="https://docs.gtk.org/gobject/struct.ValueArray.html">https://docs.gtk.org/gobject/struct.ValueArray.html</a></p>
*/
public class ValueArray extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ValueArray.class.getCanonicalName());
    }

    public ValueArray(PointerContainer pointer) {
        super(pointer);
    }

    public ValueArray() {
        super(cast(JnaValueArray.allocateStructure()));
    }

    private JnaValueArray.Fields _fields;
    
    JnaValueArray.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaValueArray.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * number of values contained in the array
    */
    public static final String N_VALUES = "n_values";

    /**
     * number of values contained in the array
    */
    public void setFieldNValues(int n_values) {
        toFields().n_values = n_values;
        toFields().writeField(N_VALUES);
    }

    /**
     * number of values contained in the array
    */
    public int getFieldNValues() {
       toFields().readField(N_VALUES);
       return toFields().n_values;
    } 

    /**
     * array of values
    */
    public static final String VALUES = "values";

    /**
     * array of values
    */
    public void setFieldValues(Value values) {
        toFields().values = values.asCPointer();
        toFields().writeField(VALUES);
    }

    /**
     * array of values
    */
    public Value getFieldValues() {
       toFields().readField(VALUES);
       return new Value(new PointerContainer(toFields().values));
    } 

    /**
     * 
    */
    public static final String N_PREALLOCED = "n_prealloced";

    /**
     * 
    */
    public int getFieldNPrealloced() {
       toFields().readField(N_PREALLOCED);
       return toFields().n_prealloced;
    } 

    public static long getTypeID() { 
        return JnaValueArray.INST().g_value_array_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
record-type
all-fields-supported

[MethodModel:cb-deprecated:_new:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-deprecated:append:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]

[MethodModel:cb-deprecated:copy:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]

[MethodModel:cb-deprecated:free:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:getNth:[ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-deprecated:insert:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]

[MethodModel:cb-deprecated:prepend:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]

[MethodModel:cb-deprecated:remove:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-deprecated:sort:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:CompareFunc:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]

[MethodModel:cb-deprecated:sortWithData:[ParameterModel:Supported:{Gg:ValueArray:{c:GValueArray*}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:CompareDataFunc:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
