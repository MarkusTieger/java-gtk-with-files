/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class _Value__data__union extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(_Value__data__union.class.getCanonicalName());
    }

    public _Value__data__union(PointerContainer pointer) {
        super(pointer);
    }

    public _Value__data__union() {
        super(cast(Jna_Value__data__union.allocateStructure()));
    }

    private Jna_Value__data__union.Fields _fields;
    
    Jna_Value__data__union.Fields toFields() {
        if (_fields == null) {
            _fields = new Jna_Value__data__union.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String V_INT = "v_int";

    /**
     * 
    */
    public void setFieldVInt(int v_int) {
        toFields().v_int = v_int;
        toFields().writeField(V_INT);
    }

    /**
     * 
    */
    public int getFieldVInt() {
       toFields().readField(V_INT);
       return toFields().v_int;
    } 

    /**
     * 
    */
    public static final String V_UINT = "v_uint";

    /**
     * 
    */
    public void setFieldVUint(int v_uint) {
        toFields().v_uint = v_uint;
        toFields().writeField(V_UINT);
    }

    /**
     * 
    */
    public int getFieldVUint() {
       toFields().readField(V_UINT);
       return toFields().v_uint;
    } 

    /**
     * 
    */
    public static final String V_LONG = "v_long";

    /**
     * 
    */
    public void setFieldVLong(long v_long) {
        toFields().v_long = v_long;
        toFields().writeField(V_LONG);
    }

    /**
     * 
    */
    public long getFieldVLong() {
       toFields().readField(V_LONG);
       return toFields().v_long;
    } 

    /**
     * 
    */
    public static final String V_ULONG = "v_ulong";

    /**
     * 
    */
    public void setFieldVUlong(long v_ulong) {
        toFields().v_ulong = v_ulong;
        toFields().writeField(V_ULONG);
    }

    /**
     * 
    */
    public long getFieldVUlong() {
       toFields().readField(V_ULONG);
       return toFields().v_ulong;
    } 

    /**
     * 
    */
    public static final String V_INT64 = "v_int64";

    /**
     * 
    */
    public void setFieldVInt64(long v_int64) {
        toFields().v_int64 = v_int64;
        toFields().writeField(V_INT64);
    }

    /**
     * 
    */
    public long getFieldVInt64() {
       toFields().readField(V_INT64);
       return toFields().v_int64;
    } 

    /**
     * 
    */
    public static final String V_UINT64 = "v_uint64";

    /**
     * 
    */
    public void setFieldVUint64(long v_uint64) {
        toFields().v_uint64 = v_uint64;
        toFields().writeField(V_UINT64);
    }

    /**
     * 
    */
    public long getFieldVUint64() {
       toFields().readField(V_UINT64);
       return toFields().v_uint64;
    } 

    /**
     * 
    */
    public static final String V_FLOAT = "v_float";

    /**
     * 
    */
    public void setFieldVFloat(float v_float) {
        toFields().v_float = v_float;
        toFields().writeField(V_FLOAT);
    }

    /**
     * 
    */
    public float getFieldVFloat() {
       toFields().readField(V_FLOAT);
       return toFields().v_float;
    } 

    /**
     * 
    */
    public static final String V_DOUBLE = "v_double";

    /**
     * 
    */
    public void setFieldVDouble(double v_double) {
        toFields().v_double = v_double;
        toFields().writeField(V_DOUBLE);
    }

    /**
     * 
    */
    public double getFieldVDouble() {
       toFields().readField(V_DOUBLE);
       return toFields().v_double;
    } 

    /**
     * 
    */
    public static final String V_POINTER = "v_pointer";

    /**
     * 
    */
    public void setFieldVPointer(ch.bailu.gtk.type.Pointer v_pointer) {
        toFields().v_pointer = v_pointer.asCPointer();
        toFields().writeField(V_POINTER);
    }

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldVPointer() {
       toFields().readField(V_POINTER);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().v_pointer));
    } 

}

/*
union-type
all-fields-supported
*/
