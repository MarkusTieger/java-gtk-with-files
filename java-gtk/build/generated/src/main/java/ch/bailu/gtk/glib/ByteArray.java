/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Contains the public fields of a GByteArray.
 * <p><a href="https://docs.gtk.org/glib/struct.ByteArray.html">https://docs.gtk.org/glib/struct.ByteArray.html</a></p>
*/
public class ByteArray extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ByteArray.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompareFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b);
    }
    
    private static JnaByteArray.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaByteArray.OnCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b) -> in.onCompareFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaByteArray.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaByteArray.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public ByteArray(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Transfers the data from the &#35;GByteArray into a new immutable &#35;GBytes.
     * <br>
     * <br>The &#35;GByteArray is freed unless the reference count of &#64;array is greater
     * <br>than one, the &#35;GByteArray wrapper is preserved but the size of &#64;array
     * <br>will be set to zero.
     * <br>
     * <br>This is identical to using g_bytes_new_take() and g_byte_array_free()
     * <br>together.
     * @param array a &#35;GByteArray
     * @return a new immutable &#35;GBytes representing same     byte data that was in the array
    */
    public static Bytes freeToBytes(@Nonnull ByteArray array)  {
        return new Bytes(new PointerContainer(JnaByteArray.INST().g_byte_array_free_to_bytes(asCPointerNotNull(array))));
    }

    /**
     * Creates a new &#35;GByteArray with a reference count of 1.
     * @return the new &#35;GByteArray
    */
    public static ByteArray _new()  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_new()));
    }

    /**
     * Atomically increments the reference count of &#64;array by one.
     * <br>This function is thread-safe and may be called from any thread.
     * @param array A &#35;GByteArray
     * @return The passed in &#35;GByteArray
    */
    public static ByteArray ref(@Nonnull ByteArray array)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_ref(asCPointerNotNull(array))));
    }

    /**
     * Removes the byte at the given index from a &#35;GByteArray.
     * <br>The following bytes are moved down one place.
     * @param array a &#35;GByteArray
     * @param index_ the index of the byte to remove
     * @return the &#35;GByteArray
    */
    public static ByteArray removeIndex(@Nonnull ByteArray array, int index_)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_remove_index(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the byte at the given index from a &#35;GByteArray. The last
     * <br>element in the array is used to fill in the space, so this function
     * <br>does not preserve the order of the &#35;GByteArray. But it is faster
     * <br>than g_byte_array_remove_index().
     * @param array a &#35;GByteArray
     * @param index_ the index of the byte to remove
     * @return the &#35;GByteArray
    */
    public static ByteArray removeIndexFast(@Nonnull ByteArray array, int index_)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_remove_index_fast(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the given number of bytes starting at the given index from a
     * <br>&#35;GByteArray.  The following elements are moved to close the gap.
     * @param array a &#64;GByteArray
     * @param index_ the index of the first byte to remove
     * @param length the number of bytes to remove
     * @return the &#35;GByteArray
    */
    public static ByteArray removeRange(@Nonnull ByteArray array, int index_, int length)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_remove_range(asCPointerNotNull(array), index_, length)));
    }

    /**
     * Sets the size of the &#35;GByteArray, expanding it if necessary.
     * @param array a &#35;GByteArray
     * @param length the new size of the &#35;GByteArray
     * @return the &#35;GByteArray
    */
    public static ByteArray setSize(@Nonnull ByteArray array, int length)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_set_size(asCPointerNotNull(array), length)));
    }

    /**
     * Creates a new &#35;GByteArray with &#64;reserved_size bytes preallocated.
     * <br>This avoids frequent reallocation, if you are going to add many
     * <br>bytes to the array. Note however that the size of the array is still
     * <br>0.
     * @param reserved_size number of bytes preallocated
     * @return the new &#35;GByteArray
    */
    public static ByteArray sizedNew(int reserved_size)  {
        return new ByteArray(new PointerContainer(JnaByteArray.INST().g_byte_array_sized_new(reserved_size)));
    }

    /**
     * Sorts a byte array, using &#64;compare_func which should be a
     * <br>qsort()-style comparison function (returns less than zero for first
     * <br>arg is less than second arg, zero for equal, greater than zero if
     * <br>first arg is greater than second arg).
     * <br>
     * <br>If two array elements compare equal, their order in the sorted array
     * <br>is undefined. If you want equal elements to keep their order (i.e.
     * <br>you want a stable sort) you can write a comparison function that,
     * <br>if two elements would otherwise compare equal, compares them by
     * <br>their addresses.
     * @param array a &#35;GByteArray
     * @param compare_func comparison function
    */
    public static void sort(@Nonnull ByteArray array, OnCompareFunc compare_func)  {
        JnaByteArray.INST().g_byte_array_sort(asCPointerNotNull(array), toOnCompareFunc(getClassHandler().getInstance(), "sort", compare_func));
    }

    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * <br>user data argument.
     * @param array a &#35;GByteArray
     * @param compare_func comparison function
     * @param user_data data to pass to &#64;compare_func
    */
    public static void sortWithData(@Nonnull ByteArray array, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaByteArray.INST().g_byte_array_sort_with_data(asCPointerNotNull(array), toOnCompareDataFunc(getClassHandler().getInstance(), "sortWithData", compare_func), asCPointer(user_data));
    }

    /**
     * Atomically decrements the reference count of &#64;array by one. If the
     * <br>reference count drops to 0, all memory allocated by the array is
     * <br>released. This function is thread-safe and may be called from any
     * <br>thread.
     * @param array A &#35;GByteArray
    */
    public static void unref(@Nonnull ByteArray array)  {
        JnaByteArray.INST().g_byte_array_unref(asCPointerNotNull(array));
    }

    public static long getTypeID() { 
        return JnaByteArray.INST().g_byte_array_get_type(); 
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

[FieldModel:data:java-type-not-supported:{G_::{c:guint8*}}:{j:}]

[FieldModel:len:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:append:[ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:free:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:java-type-not-supported:newTake:[ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:prepend:[ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:steal:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
