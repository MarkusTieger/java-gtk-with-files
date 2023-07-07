/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GTypeValueTable provides the functions required by the &#35;GValue
 * <br>implementation, to serve as a container for values of a type.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeValueTable.html">https://docs.gtk.org/gobject/struct.TypeValueTable.html</a></p>
*/
public class TypeValueTable extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeValueTable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnValueInit {
        /**
         * 
         * @param value 
        */
        void onValueInit(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value value);
    }
    
    private static JnaTypeValueTable.OnValueInit toOnValueInit(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueInit in) {
        JnaTypeValueTable.OnValueInit out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value) -> in.onValueInit(__callback, new Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueFree {
        /**
         * 
         * @param value 
        */
        void onValueFree(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value value);
    }
    
    private static JnaTypeValueTable.OnValueFree toOnValueFree(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueFree in) {
        JnaTypeValueTable.OnValueFree out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value) -> in.onValueFree(__callback, new Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueCopy {
        /**
         * 
         * @param src_value 
         * @param dest_value 
        */
        void onValueCopy(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value src_value, @Nonnull Value dest_value);
    }
    
    private static JnaTypeValueTable.OnValueCopy toOnValueCopy(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueCopy in) {
        JnaTypeValueTable.OnValueCopy out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src_value, _dest_value) -> in.onValueCopy(__callback, new Value(new PointerContainer(_src_value)), new Value(new PointerContainer(_dest_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValuePeekPointer {
        /**
         * 
         * @param value 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onValuePeekPointer(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value value);
    }
    
    private static JnaTypeValueTable.OnValuePeekPointer toOnValuePeekPointer(ch.bailu.gtk.type.Pointer instance, String methodName, OnValuePeekPointer in) {
        JnaTypeValueTable.OnValuePeekPointer out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value) -> in.onValuePeekPointer(__callback, new Value(new PointerContainer(_value))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCollectValue {
        /**
         * 
         * @param value 
         * @param n_collect_values 
         * @param collect_values 
         * @param collect_flags 
         * @return 
        */
        ch.bailu.gtk.type.Str onCollectValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value value, int n_collect_values, @Nonnull TypeCValue collect_values, int collect_flags);
    }
    
    private static JnaTypeValueTable.OnCollectValue toOnCollectValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnCollectValue in) {
        JnaTypeValueTable.OnCollectValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value, _n_collect_values, _collect_values, _collect_flags) -> in.onCollectValue(__callback, new Value(new PointerContainer(_value)), _n_collect_values, new TypeCValue(new PointerContainer(_collect_values)), _collect_flags).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLcopyValue {
        /**
         * 
         * @param value 
         * @param n_collect_values 
         * @param collect_values 
         * @param collect_flags 
         * @return 
        */
        ch.bailu.gtk.type.Str onLcopyValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value value, int n_collect_values, @Nonnull TypeCValue collect_values, int collect_flags);
    }
    
    private static JnaTypeValueTable.OnLcopyValue toOnLcopyValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnLcopyValue in) {
        JnaTypeValueTable.OnLcopyValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value, _n_collect_values, _collect_values, _collect_flags) -> in.onLcopyValue(__callback, new Value(new PointerContainer(_value)), _n_collect_values, new TypeCValue(new PointerContainer(_collect_values)), _collect_flags).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public TypeValueTable(PointerContainer pointer) {
        super(pointer);
    }

    public TypeValueTable() {
        super(cast(JnaTypeValueTable.allocateStructure()));
    }

    private JnaTypeValueTable.Fields _fields;
    
    JnaTypeValueTable.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeValueTable.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnValueInit#onValueInit}
    */
    public static final String VALUE_INIT = "value_init";

    /**
     * 
     * <br>See {@link OnValueInit#onValueInit}
    */
    public void setFieldValueInit(OnValueInit value_init) {
        toFields().value_init = toOnValueInit(this, VALUE_INIT, value_init);
        toFields().writeField(VALUE_INIT);
    }

    /**
     * 
     * <br>See {@link OnValueInit#onValueInit}
    */
    public JnaTypeValueTable.OnValueInit getFieldValueInit() {
       toFields().readField(VALUE_INIT);
       return toFields().value_init;
    } 

    /**
     * 
     * <br>See {@link OnValueFree#onValueFree}
    */
    public static final String VALUE_FREE = "value_free";

    /**
     * 
     * <br>See {@link OnValueFree#onValueFree}
    */
    public void setFieldValueFree(OnValueFree value_free) {
        toFields().value_free = toOnValueFree(this, VALUE_FREE, value_free);
        toFields().writeField(VALUE_FREE);
    }

    /**
     * 
     * <br>See {@link OnValueFree#onValueFree}
    */
    public JnaTypeValueTable.OnValueFree getFieldValueFree() {
       toFields().readField(VALUE_FREE);
       return toFields().value_free;
    } 

    /**
     * 
     * <br>See {@link OnValueCopy#onValueCopy}
    */
    public static final String VALUE_COPY = "value_copy";

    /**
     * 
     * <br>See {@link OnValueCopy#onValueCopy}
    */
    public void setFieldValueCopy(OnValueCopy value_copy) {
        toFields().value_copy = toOnValueCopy(this, VALUE_COPY, value_copy);
        toFields().writeField(VALUE_COPY);
    }

    /**
     * 
     * <br>See {@link OnValueCopy#onValueCopy}
    */
    public JnaTypeValueTable.OnValueCopy getFieldValueCopy() {
       toFields().readField(VALUE_COPY);
       return toFields().value_copy;
    } 

    /**
     * 
     * <br>See {@link OnValuePeekPointer#onValuePeekPointer}
    */
    public static final String VALUE_PEEK_POINTER = "value_peek_pointer";

    /**
     * 
     * <br>See {@link OnValuePeekPointer#onValuePeekPointer}
    */
    public void setFieldValuePeekPointer(OnValuePeekPointer value_peek_pointer) {
        toFields().value_peek_pointer = toOnValuePeekPointer(this, VALUE_PEEK_POINTER, value_peek_pointer);
        toFields().writeField(VALUE_PEEK_POINTER);
    }

    /**
     * 
     * <br>See {@link OnValuePeekPointer#onValuePeekPointer}
    */
    public JnaTypeValueTable.OnValuePeekPointer getFieldValuePeekPointer() {
       toFields().readField(VALUE_PEEK_POINTER);
       return toFields().value_peek_pointer;
    } 

    /**
     * A string format describing how to collect the contents of
     * <br> this value bit-by-bit. Each character in the format represents
     * <br> an argument to be collected, and the characters themselves indicate
     * <br> the type of the argument. Currently supported arguments are:
     * <br> - 'i' - Integers. passed as collect_values[].v_int.
     * <br> - 'l' - Longs. passed as collect_values[].v_long.
     * <br> - 'd' - Doubles. passed as collect_values[].v_double.
     * <br> - 'p' - Pointers. passed as collect_values[].v_pointer.
     * <br> It should be noted that for variable argument list construction,
     * <br> ANSI C promotes every type smaller than an integer to an int, and
     * <br> floats to doubles. So for collection of short int or char, 'i'
     * <br> needs to be used, and for collection of floats 'd'.
    */
    public static final String COLLECT_FORMAT = "collect_format";

    /**
     * A string format describing how to collect the contents of
     * <br> this value bit-by-bit. Each character in the format represents
     * <br> an argument to be collected, and the characters themselves indicate
     * <br> the type of the argument. Currently supported arguments are:
     * <br> - 'i' - Integers. passed as collect_values[].v_int.
     * <br> - 'l' - Longs. passed as collect_values[].v_long.
     * <br> - 'd' - Doubles. passed as collect_values[].v_double.
     * <br> - 'p' - Pointers. passed as collect_values[].v_pointer.
     * <br> It should be noted that for variable argument list construction,
     * <br> ANSI C promotes every type smaller than an integer to an int, and
     * <br> floats to doubles. So for collection of short int or char, 'i'
     * <br> needs to be used, and for collection of floats 'd'.
    */
    public void setFieldCollectFormat(ch.bailu.gtk.type.Str collect_format) {
        toFields().collect_format = collect_format.asCPointer();
        toFields().writeField(COLLECT_FORMAT);
    }

    /**
     * A string format describing how to collect the contents of
     * <br> this value bit-by-bit. Each character in the format represents
     * <br> an argument to be collected, and the characters themselves indicate
     * <br> the type of the argument. Currently supported arguments are:
     * <br> - 'i' - Integers. passed as collect_values[].v_int.
     * <br> - 'l' - Longs. passed as collect_values[].v_long.
     * <br> - 'd' - Doubles. passed as collect_values[].v_double.
     * <br> - 'p' - Pointers. passed as collect_values[].v_pointer.
     * <br> It should be noted that for variable argument list construction,
     * <br> ANSI C promotes every type smaller than an integer to an int, and
     * <br> floats to doubles. So for collection of short int or char, 'i'
     * <br> needs to be used, and for collection of floats 'd'.
    */
    public ch.bailu.gtk.type.Str getFieldCollectFormat() {
       toFields().readField(COLLECT_FORMAT);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().collect_format));
    } 

    /**
     * 
     * <br>See {@link OnCollectValue#onCollectValue}
    */
    public static final String COLLECT_VALUE = "collect_value";

    /**
     * 
     * <br>See {@link OnCollectValue#onCollectValue}
    */
    public void setFieldCollectValue(OnCollectValue collect_value) {
        toFields().collect_value = toOnCollectValue(this, COLLECT_VALUE, collect_value);
        toFields().writeField(COLLECT_VALUE);
    }

    /**
     * 
     * <br>See {@link OnCollectValue#onCollectValue}
    */
    public JnaTypeValueTable.OnCollectValue getFieldCollectValue() {
       toFields().readField(COLLECT_VALUE);
       return toFields().collect_value;
    } 

    /**
     * Format description of the arguments to collect for &#64;lcopy_value,
     * <br> analogous to &#64;collect_format. Usually, &#64;lcopy_format string consists
     * <br> only of 'p's to provide lcopy_value() with pointers to storage locations.
    */
    public static final String LCOPY_FORMAT = "lcopy_format";

    /**
     * Format description of the arguments to collect for &#64;lcopy_value,
     * <br> analogous to &#64;collect_format. Usually, &#64;lcopy_format string consists
     * <br> only of 'p's to provide lcopy_value() with pointers to storage locations.
    */
    public void setFieldLcopyFormat(ch.bailu.gtk.type.Str lcopy_format) {
        toFields().lcopy_format = lcopy_format.asCPointer();
        toFields().writeField(LCOPY_FORMAT);
    }

    /**
     * Format description of the arguments to collect for &#64;lcopy_value,
     * <br> analogous to &#64;collect_format. Usually, &#64;lcopy_format string consists
     * <br> only of 'p's to provide lcopy_value() with pointers to storage locations.
    */
    public ch.bailu.gtk.type.Str getFieldLcopyFormat() {
       toFields().readField(LCOPY_FORMAT);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().lcopy_format));
    } 

    /**
     * 
     * <br>See {@link OnLcopyValue#onLcopyValue}
    */
    public static final String LCOPY_VALUE = "lcopy_value";

    /**
     * 
     * <br>See {@link OnLcopyValue#onLcopyValue}
    */
    public void setFieldLcopyValue(OnLcopyValue lcopy_value) {
        toFields().lcopy_value = toOnLcopyValue(this, LCOPY_VALUE, lcopy_value);
        toFields().writeField(LCOPY_VALUE);
    }

    /**
     * 
     * <br>See {@link OnLcopyValue#onLcopyValue}
    */
    public JnaTypeValueTable.OnLcopyValue getFieldLcopyValue() {
       toFields().readField(LCOPY_VALUE);
       return toFields().lcopy_value;
    } 

    /**
     * Returns the location of the &#35;GTypeValueTable associated with &#64;type.
     * <br>
     * <br>Note that this function should only be used from source code
     * <br>that implements or has internal knowledge of the implementation of
     * <br>&#64;type.
     * @param type a &#35;GType
     * @return location of the &#35;GTypeValueTable associated with &#64;type or     %NULL if there is no &#35;GTypeValueTable associated with &#64;type
    */
    public static TypeValueTable peek(long type)  {
        return new TypeValueTable(new PointerContainer(JnaTypeValueTable.INST().g_type_value_table_peek(type)));
    }

}

/*
record-type
all-fields-supported
*/
