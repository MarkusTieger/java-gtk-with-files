/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure used to hold different types of values.
 * <br>
 * <br>The data within the structure has protected scope: it is accessible only
 * <br>to functions within a &#35;GTypeValueTable structure, or implementations of
 * <br>the g_value_*() API. That is, code portions which implement new fundamental
 * <br>types.
 * <br>
 * <br>&#35;GValue users cannot make any assumptions about how data is stored
 * <br>within the 2 element &#64;data union, and the &#64;g_type member should
 * <br>only be accessed through the G_VALUE_TYPE() macro.
 * <p><a href="https://docs.gtk.org/gobject/struct.Value.html">https://docs.gtk.org/gobject/struct.Value.html</a></p>
*/
public class Value extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Value.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnValueTransform {
        /**
         * The type of value transformation functions which can be registered with
         * <br>g_value_register_transform_func().
         * <br>
         * <br>&#64;dest_value will be initialized to the correct destination type.
         * @param src_value Source value.
         * @param dest_value Target value.
        */
        void onValueTransform(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value src_value, @Nonnull Value dest_value);
    }
    
    private static JnaValue.OnValueTransform toOnValueTransform(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueTransform in) {
        JnaValue.OnValueTransform out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src_value, _dest_value) -> in.onValueTransform(__callback, new Value(new PointerContainer(_src_value)), new Value(new PointerContainer(_dest_value)));
            __callback.register(out);
        }
        return out;
    }

    public Value(PointerContainer pointer) {
        super(pointer);
    }

    private JnaValue.Fields _fields;
    
    JnaValue.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaValue.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String G_TYPE = "g_type";

    /**
     * 
    */
    public long getFieldGType() {
       toFields().readField(G_TYPE);
       return toFields().g_type;
    } 

    /**
     * Copies the value of &#64;src_value into &#64;dest_value.
     * @param dest_value An initialized &#35;GValue structure of the same type as &#64;src_value.
    */
    public void copy(@Nonnull Value dest_value)  {
        JnaValue.INST().g_value_copy(asCPointer(), asCPointerNotNull(dest_value));
    }

    /**
     * Get the contents of a %G_TYPE_BOXED derived &#35;GValue.  Upon getting,
     * <br>the boxed value is duplicated and needs to be later freed with
     * <br>g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE (&#64;value),
     * <br>return_value);
     * @return boxed contents of &#64;value
    */
    public ch.bailu.gtk.type.Pointer dupBoxed()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_dup_boxed(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_OBJECT derived &#35;GValue, increasing
     * <br>its reference count. If the contents of the &#35;GValue are %NULL, then
     * <br>%NULL will be returned.
     * @return object content of &#64;value,          should be unreferenced when no longer needed.
    */
    public ch.bailu.gtk.type.Pointer dupObject()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_dup_object(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_PARAM &#35;GValue, increasing its
     * <br>reference count.
     * @return &#35;GParamSpec content of &#64;value, should be     unreferenced when no longer needed.
    */
    public ParamSpec dupParam()  {
        return new ParamSpec(new PointerContainer(JnaValue.INST().g_value_dup_param(asCPointer())));
    }

    /**
     * Get a copy the contents of a %G_TYPE_STRING &#35;GValue.
     * @return a newly allocated copy of the string content of &#64;value
    */
    public ch.bailu.gtk.type.Str dupString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaValue.INST().g_value_dup_string(asCPointer())));
    }

    /**
     * Get the contents of a variant &#35;GValue, increasing its refcount. The returned
     * <br>&#35;GVariant is never floating.
     * @return variant contents of &#64;value (may be %NULL);    should be unreffed using g_variant_unref() when no longer needed
    */
    public ch.bailu.gtk.glib.Variant dupVariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaValue.INST().g_value_dup_variant(asCPointer())));
    }

    /**
     * Determines if &#64;value will fit inside the size of a pointer value.
     * <br>This is an internal function introduced mainly for C marshallers.
     * @return %TRUE if &#64;value will fit inside a pointer value.
    */
    public boolean fitsPointer()  {
        return JnaValue.INST().g_value_fits_pointer(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_BOOLEAN &#35;GValue.
     * @return boolean contents of &#64;value
    */
    public boolean getBoolean()  {
        return JnaValue.INST().g_value_get_boolean(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_BOXED derived &#35;GValue.
     * @return boxed contents of &#64;value
    */
    public ch.bailu.gtk.type.Pointer getBoxed()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_get_boxed(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_DOUBLE &#35;GValue.
     * @return double contents of &#64;value
    */
    public double getDouble()  {
        return JnaValue.INST().g_value_get_double(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_ENUM &#35;GValue.
     * @return enum contents of &#64;value
    */
    public int getEnum()  {
        return JnaValue.INST().g_value_get_enum(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_FLAGS &#35;GValue.
     * @return flags contents of &#64;value
    */
    public int getFlags()  {
        return JnaValue.INST().g_value_get_flags(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_FLOAT &#35;GValue.
     * @return float contents of &#64;value
    */
    public float getFloat()  {
        return JnaValue.INST().g_value_get_float(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_GTYPE &#35;GValue.
     * @return the &#35;GType stored in &#64;value
    */
    public long getGtype()  {
        return JnaValue.INST().g_value_get_gtype(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_INT &#35;GValue.
     * @return integer contents of &#64;value
    */
    public int getInt()  {
        return JnaValue.INST().g_value_get_int(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_INT64 &#35;GValue.
     * @return 64bit integer contents of &#64;value
    */
    public long getInt64()  {
        return JnaValue.INST().g_value_get_int64(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_LONG &#35;GValue.
     * @return long integer contents of &#64;value
    */
    public long getLong()  {
        return JnaValue.INST().g_value_get_long(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_OBJECT derived &#35;GValue.
     * @return object contents of &#64;value
    */
    public ch.bailu.gtk.type.Pointer getObject()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_get_object(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_PARAM &#35;GValue.
     * @return &#35;GParamSpec content of &#64;value
    */
    public ParamSpec getParam()  {
        return new ParamSpec(new PointerContainer(JnaValue.INST().g_value_get_param(asCPointer())));
    }

    /**
     * Get the contents of a pointer &#35;GValue.
     * @return pointer contents of &#64;value
    */
    public ch.bailu.gtk.type.Pointer getPointer()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_get_pointer(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_CHAR &#35;GValue.
     * @return signed 8 bit integer contents of &#64;value
    */
    public int getSchar()  {
        return JnaValue.INST().g_value_get_schar(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_STRING &#35;GValue.
     * @return string content of &#64;value
    */
    public ch.bailu.gtk.type.Str getString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaValue.INST().g_value_get_string(asCPointer())));
    }

    /**
     * Get the contents of a %G_TYPE_UINT &#35;GValue.
     * @return unsigned integer contents of &#64;value
    */
    public int getUint()  {
        return JnaValue.INST().g_value_get_uint(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_UINT64 &#35;GValue.
     * @return unsigned 64bit integer contents of &#64;value
    */
    public long getUint64()  {
        return JnaValue.INST().g_value_get_uint64(asCPointer());
    }

    /**
     * Get the contents of a %G_TYPE_ULONG &#35;GValue.
     * @return unsigned long integer contents of &#64;value
    */
    public long getUlong()  {
        return JnaValue.INST().g_value_get_ulong(asCPointer());
    }

    /**
     * Get the contents of a variant &#35;GValue.
     * @return variant contents of &#64;value (may be %NULL)
    */
    public ch.bailu.gtk.glib.Variant getVariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaValue.INST().g_value_get_variant(asCPointer())));
    }

    /**
     * Initializes &#64;value with the default value of &#64;type.
     * @param g_type Type the &#35;GValue should hold values of.
     * @return the &#35;GValue structure that has been passed in
    */
    public Value init(long g_type)  {
        return new Value(new PointerContainer(JnaValue.INST().g_value_init(asCPointer(), g_type)));
    }

    /**
     * Initializes and sets &#64;value from an instantiatable type via the
     * <br>value_table's collect_value() function.
     * <br>
     * <br>Note: The &#64;value will be initialised with the exact type of
     * <br>&#64;instance.  If you wish to set the &#64;value's type to a different GType
     * <br>(such as a parent class GType), you need to manually call
     * <br>g_value_init() and g_value_set_instance().
     * @param instance the instance
    */
    public void initFromInstance(@Nonnull ch.bailu.gtk.type.Pointer instance)  {
        JnaValue.INST().g_value_init_from_instance(asCPointer(), asCPointerNotNull(instance));
    }

    /**
     * Returns the value contents as pointer. This function asserts that
     * <br>g_value_fits_pointer() returned %TRUE for the passed in value.
     * <br>This is an internal function introduced mainly for C marshallers.
     * @return the value contents as pointer
    */
    public ch.bailu.gtk.type.Pointer peekPointer()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaValue.INST().g_value_peek_pointer(asCPointer())));
    }

    /**
     * Clears the current value in &#64;value and resets it to the default value
     * <br>(as if the value had just been initialized).
     * @return the &#35;GValue structure that has been passed in
    */
    public Value reset()  {
        return new Value(new PointerContainer(JnaValue.INST().g_value_reset(asCPointer())));
    }

    /**
     * Set the contents of a %G_TYPE_BOOLEAN &#35;GValue to &#64;v_boolean.
     * @param v_boolean boolean value to be set
    */
    public void setBoolean(boolean v_boolean)  {
        JnaValue.INST().g_value_set_boolean(asCPointer(), v_boolean);
    }

    /**
     * Set the contents of a %G_TYPE_BOXED derived &#35;GValue to &#64;v_boxed.
     * @param v_boxed boxed value to be set
    */
    public void setBoxed(@Nullable ch.bailu.gtk.type.Pointer v_boxed)  {
        JnaValue.INST().g_value_set_boxed(asCPointer(), asCPointer(v_boxed));
    }

    /**
     * Set the contents of a %G_TYPE_DOUBLE &#35;GValue to &#64;v_double.
     * @param v_double double value to be set
    */
    public void setDouble(double v_double)  {
        JnaValue.INST().g_value_set_double(asCPointer(), v_double);
    }

    /**
     * Set the contents of a %G_TYPE_ENUM &#35;GValue to &#64;v_enum.
     * @param v_enum enum value to be set
    */
    public void setEnum(int v_enum)  {
        JnaValue.INST().g_value_set_enum(asCPointer(), v_enum);
    }

    /**
     * Set the contents of a %G_TYPE_FLAGS &#35;GValue to &#64;v_flags.
     * @param v_flags flags value to be set
    */
    public void setFlags(int v_flags)  {
        JnaValue.INST().g_value_set_flags(asCPointer(), v_flags);
    }

    /**
     * Set the contents of a %G_TYPE_FLOAT &#35;GValue to &#64;v_float.
     * @param v_float float value to be set
    */
    public void setFloat(float v_float)  {
        JnaValue.INST().g_value_set_float(asCPointer(), v_float);
    }

    /**
     * Set the contents of a %G_TYPE_GTYPE &#35;GValue to &#64;v_gtype.
     * @param v_gtype &#35;GType to be set
    */
    public void setGtype(long v_gtype)  {
        JnaValue.INST().g_value_set_gtype(asCPointer(), v_gtype);
    }

    /**
     * Sets &#64;value from an instantiatable type via the
     * <br>value_table's collect_value() function.
     * @param instance the instance
    */
    public void setInstance(@Nullable ch.bailu.gtk.type.Pointer instance)  {
        JnaValue.INST().g_value_set_instance(asCPointer(), asCPointer(instance));
    }

    /**
     * Set the contents of a %G_TYPE_INT &#35;GValue to &#64;v_int.
     * @param v_int integer value to be set
    */
    public void setInt(int v_int)  {
        JnaValue.INST().g_value_set_int(asCPointer(), v_int);
    }

    /**
     * Set the contents of a %G_TYPE_INT64 &#35;GValue to &#64;v_int64.
     * @param v_int64 64bit integer value to be set
    */
    public void setInt64(long v_int64)  {
        JnaValue.INST().g_value_set_int64(asCPointer(), v_int64);
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to &#64;v_string.  The string is
     * <br>assumed to be static and interned (canonical, for example from
     * <br>g_intern_string()), and is thus not duplicated when setting the &#35;GValue.
     * @param v_string static string to be set
    */
    public void setInternedString(@Nullable ch.bailu.gtk.type.Str v_string)  {
        JnaValue.INST().g_value_set_interned_string(asCPointer(), asCPointer(v_string));
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to &#64;v_string.  The string is
     * <br>assumed to be static and interned (canonical, for example from
     * <br>g_intern_string()), and is thus not duplicated when setting the &#35;GValue.
     * @param v_string static string to be set
    */
    public void setInternedString(String v_string)  {
        JnaValue.INST().g_value_set_interned_string(asCPointer(), v_string);
    }

    /**
     * Set the contents of a %G_TYPE_LONG &#35;GValue to &#64;v_long.
     * @param v_long long integer value to be set
    */
    public void setLong(long v_long)  {
        JnaValue.INST().g_value_set_long(asCPointer(), v_long);
    }

    /**
     * Set the contents of a %G_TYPE_OBJECT derived &#35;GValue to &#64;v_object.
     * <br>
     * <br>g_value_set_object() increases the reference count of &#64;v_object
     * <br>(the &#35;GValue holds a reference to &#64;v_object).  If you do not wish
     * <br>to increase the reference count of the object (i.e. you wish to
     * <br>pass your current reference to the &#35;GValue because you no longer
     * <br>need it), use g_value_take_object() instead.
     * <br>
     * <br>It is important that your &#35;GValue holds a reference to &#64;v_object (either its
     * <br>own, or one it has taken) to ensure that the object won't be destroyed while
     * <br>the &#35;GValue still exists).
     * @param v_object object value to be set
    */
    public void setObject(@Nullable ch.bailu.gtk.type.Pointer v_object)  {
        JnaValue.INST().g_value_set_object(asCPointer(), asCPointer(v_object));
    }

    /**
     * Set the contents of a %G_TYPE_PARAM &#35;GValue to &#64;param.
     * @param param the &#35;GParamSpec to be set
    */
    public void setParam(@Nullable ParamSpec param)  {
        JnaValue.INST().g_value_set_param(asCPointer(), asCPointer(param));
    }

    /**
     * Set the contents of a pointer &#35;GValue to &#64;v_pointer.
     * @param v_pointer pointer value to be set
    */
    public void setPointer(@Nullable ch.bailu.gtk.type.Pointer v_pointer)  {
        JnaValue.INST().g_value_set_pointer(asCPointer(), asCPointer(v_pointer));
    }

    /**
     * Set the contents of a %G_TYPE_CHAR &#35;GValue to &#64;v_char.
     * @param v_char signed 8 bit integer to be set
    */
    public void setSchar(int v_char)  {
        JnaValue.INST().g_value_set_schar(asCPointer(), v_char);
    }

    /**
     * Set the contents of a %G_TYPE_BOXED derived &#35;GValue to &#64;v_boxed.
     * <br>
     * <br>The boxed value is assumed to be static, and is thus not duplicated
     * <br>when setting the &#35;GValue.
     * @param v_boxed static boxed value to be set
    */
    public void setStaticBoxed(@Nullable ch.bailu.gtk.type.Pointer v_boxed)  {
        JnaValue.INST().g_value_set_static_boxed(asCPointer(), asCPointer(v_boxed));
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to &#64;v_string.
     * <br>The string is assumed to be static, and is thus not duplicated
     * <br>when setting the &#35;GValue.
     * <br>
     * <br>If the the string is a canonical string, using g_value_set_interned_string()
     * <br>is more appropriate.
     * @param v_string static string to be set
    */
    public void setStaticString(@Nullable ch.bailu.gtk.type.Str v_string)  {
        JnaValue.INST().g_value_set_static_string(asCPointer(), asCPointer(v_string));
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to &#64;v_string.
     * <br>The string is assumed to be static, and is thus not duplicated
     * <br>when setting the &#35;GValue.
     * <br>
     * <br>If the the string is a canonical string, using g_value_set_interned_string()
     * <br>is more appropriate.
     * @param v_string static string to be set
    */
    public void setStaticString(String v_string)  {
        JnaValue.INST().g_value_set_static_string(asCPointer(), v_string);
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to a copy of &#64;v_string.
     * @param v_string caller-owned string to be duplicated for the &#35;GValue
    */
    public void setString(@Nullable ch.bailu.gtk.type.Str v_string)  {
        JnaValue.INST().g_value_set_string(asCPointer(), asCPointer(v_string));
    }

    /**
     * Set the contents of a %G_TYPE_STRING &#35;GValue to a copy of &#64;v_string.
     * @param v_string caller-owned string to be duplicated for the &#35;GValue
    */
    public void setString(String v_string)  {
        JnaValue.INST().g_value_set_string(asCPointer(), v_string);
    }

    /**
     * Set the contents of a %G_TYPE_UINT &#35;GValue to &#64;v_uint.
     * @param v_uint unsigned integer value to be set
    */
    public void setUint(int v_uint)  {
        JnaValue.INST().g_value_set_uint(asCPointer(), v_uint);
    }

    /**
     * Set the contents of a %G_TYPE_UINT64 &#35;GValue to &#64;v_uint64.
     * @param v_uint64 unsigned 64bit integer value to be set
    */
    public void setUint64(long v_uint64)  {
        JnaValue.INST().g_value_set_uint64(asCPointer(), v_uint64);
    }

    /**
     * Set the contents of a %G_TYPE_ULONG &#35;GValue to &#64;v_ulong.
     * @param v_ulong unsigned long integer value to be set
    */
    public void setUlong(long v_ulong)  {
        JnaValue.INST().g_value_set_ulong(asCPointer(), v_ulong);
    }

    /**
     * Set the contents of a variant &#35;GValue to &#64;variant.
     * <br>If the variant is floating, it is consumed.
     * @param variant a &#35;GVariant, or %NULL
    */
    public void setVariant(@Nullable ch.bailu.gtk.glib.Variant variant)  {
        JnaValue.INST().g_value_set_variant(asCPointer(), asCPointer(variant));
    }

    /**
     * Sets the contents of a %G_TYPE_BOXED derived &#35;GValue to &#64;v_boxed
     * <br>and takes over the ownership of the caller’s reference to &#64;v_boxed;
     * <br>the caller doesn’t have to unref it any more.
     * @param v_boxed duplicated unowned boxed value to be set
    */
    public void takeBoxed(@Nullable ch.bailu.gtk.type.Pointer v_boxed)  {
        JnaValue.INST().g_value_take_boxed(asCPointer(), asCPointer(v_boxed));
    }

    /**
     * Sets the contents of a %G_TYPE_OBJECT derived &#35;GValue to &#64;v_object
     * <br>and takes over the ownership of the caller’s reference to &#64;v_object;
     * <br>the caller doesn’t have to unref it any more (i.e. the reference
     * <br>count of the object is not increased).
     * <br>
     * <br>If you want the &#35;GValue to hold its own reference to &#64;v_object, use
     * <br>g_value_set_object() instead.
     * @param v_object object value to be set
    */
    public void takeObject(@Nullable ch.bailu.gtk.type.Pointer v_object)  {
        JnaValue.INST().g_value_take_object(asCPointer(), asCPointer(v_object));
    }

    /**
     * Sets the contents of a %G_TYPE_PARAM &#35;GValue to &#64;param and takes
     * <br>over the ownership of the caller’s reference to &#64;param; the caller
     * <br>doesn’t have to unref it any more.
     * @param param the &#35;GParamSpec to be set
    */
    public void takeParam(@Nullable ParamSpec param)  {
        JnaValue.INST().g_value_take_param(asCPointer(), asCPointer(param));
    }

    /**
     * Sets the contents of a %G_TYPE_STRING &#35;GValue to &#64;v_string.
     * @param v_string string to take ownership of
    */
    public void takeString(@Nullable ch.bailu.gtk.type.Str v_string)  {
        JnaValue.INST().g_value_take_string(asCPointer(), asCPointer(v_string));
    }

    /**
     * Set the contents of a variant &#35;GValue to &#64;variant, and takes over
     * <br>the ownership of the caller's reference to &#64;variant;
     * <br>the caller doesn't have to unref it any more (i.e. the reference
     * <br>count of the variant is not increased).
     * <br>
     * <br>If &#64;variant was floating then its floating reference is converted to
     * <br>a hard reference.
     * <br>
     * <br>If you want the &#35;GValue to hold its own reference to &#64;variant, use
     * <br>g_value_set_variant() instead.
     * <br>
     * <br>This is an internal function introduced mainly for C marshallers.
     * @param variant a &#35;GVariant, or %NULL
    */
    public void takeVariant(@Nullable ch.bailu.gtk.glib.Variant variant)  {
        JnaValue.INST().g_value_take_variant(asCPointer(), asCPointer(variant));
    }

    /**
     * Tries to cast the contents of &#64;src_value into a type appropriate
     * <br>to store in &#64;dest_value, e.g. to transform a %G_TYPE_INT value
     * <br>into a %G_TYPE_FLOAT value. Performing transformations between
     * <br>value types might incur precision lossage. Especially
     * <br>transformations into strings might reveal seemingly arbitrary
     * <br>results and shouldn't be relied upon for production code (such
     * <br>as rcfile value or object property serialization).
     * @param dest_value Target value.
     * @return Whether a transformation rule was found and could be applied.  Upon failing transformations, &#64;dest_value is left untouched.
    */
    public boolean transform(@Nonnull Value dest_value)  {
        return JnaValue.INST().g_value_transform(asCPointer(), asCPointerNotNull(dest_value));
    }

    /**
     * Clears the current value in &#64;value (if any) and &quot;unsets&quot; the type,
     * <br>this releases all resources associated with this GValue. An unset
     * <br>value is the same as an uninitialized (zero-filled) &#35;GValue
     * <br>structure.
    */
    public void unset()  {
        JnaValue.INST().g_value_unset(asCPointer());
    }

    /**
     * Registers a value transformation function for use in g_value_transform().
     * <br>A previously registered transformation function for &#64;src_type and &#64;dest_type
     * <br>will be replaced.
     * @param src_type Source type.
     * @param dest_type Target type.
     * @param transform_func a function which transforms values of type &#64;src_type  into value of type &#64;dest_type
    */
    public static void registerTransformFunc(long src_type, long dest_type, OnValueTransform transform_func)  {
        JnaValue.INST().g_value_register_transform_func(src_type, dest_type, toOnValueTransform(getClassHandler().getInstance(), "registerTransformFunc", transform_func));
    }

    /**
     * Returns whether a &#35;GValue of type &#64;src_type can be copied into
     * <br>a &#35;GValue of type &#64;dest_type.
     * @param src_type source type to be copied.
     * @param dest_type destination type for copying.
     * @return %TRUE if g_value_copy() is possible with &#64;src_type and &#64;dest_type.
    */
    public static boolean typeCompatible(long src_type, long dest_type)  {
        return JnaValue.INST().g_value_type_compatible(src_type, dest_type);
    }

    /**
     * Check whether g_value_transform() is able to transform values
     * <br>of type &#64;src_type into values of type &#64;dest_type. Note that for
     * <br>the types to be transformable, they must be compatible or a
     * <br>transformation function must be registered.
     * @param src_type Source type.
     * @param dest_type Target type.
     * @return %TRUE if the transformation is possible, %FALSE otherwise.
    */
    public static boolean typeTransformable(long src_type, long dest_type)  {
        return JnaValue.INST().g_value_type_transformable(src_type, dest_type);
    }

    public static long getTypeID() { 
        return JnaValue.INST().g_value_get_type(); 
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
some-fields-unsupported

[MethodModel:cb-deprecated:getChar:[ParameterModel:Supported:{G_::{c:gchar}}:{j:byte}]]

[MethodModel:cb-return-value-not-supported:getUchar:[ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]]

[MethodModel:cb-deprecated:setBoxedTakeOwnership:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]

[MethodModel:cb-deprecated:setChar:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gchar}}:{j:byte}]

[MethodModel:cb-deprecated:setObjectTakeOwnership:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:setParamTakeOwnership:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ParamSpec:{c:GParamSpec*}}:{j:long}]

[MethodModel:cb-deprecated:setStringTakeOwnership:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:setUchar:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]

[FieldModel:data:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
