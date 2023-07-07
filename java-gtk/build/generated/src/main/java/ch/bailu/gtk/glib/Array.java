/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Contains the public fields of a GArray.
 * <p><a href="https://docs.gtk.org/glib/struct.Array.html">https://docs.gtk.org/glib/struct.Array.html</a></p>
*/
public class Array extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Array.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaArray.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaArray.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaArray.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaArray.OnCompareFunc out = null;
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
    
    private static JnaArray.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaArray.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Array(PointerContainer pointer) {
        super(pointer);
    }

    public Array() {
        super(cast(JnaArray.allocateStructure()));
    }

    private JnaArray.Fields _fields;
    
    JnaArray.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaArray.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * a pointer to the element data. The data may be moved as
     * <br>    elements are added to the &#35;GArray.
    */
    public static final String DATA = "data";

    /**
     * a pointer to the element data. The data may be moved as
     * <br>    elements are added to the &#35;GArray.
    */
    public void setFieldData(ch.bailu.gtk.type.Str data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * a pointer to the element data. The data may be moved as
     * <br>    elements are added to the &#35;GArray.
    */
    public ch.bailu.gtk.type.Str getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().data));
    } 

    /**
     * the number of elements in the &#35;GArray not including the
     * <br>    possible terminating zero element.
    */
    public static final String LEN = "len";

    /**
     * the number of elements in the &#35;GArray not including the
     * <br>    possible terminating zero element.
    */
    public void setFieldLen(int len) {
        toFields().len = len;
        toFields().writeField(LEN);
    }

    /**
     * the number of elements in the &#35;GArray not including the
     * <br>    possible terminating zero element.
    */
    public int getFieldLen() {
       toFields().readField(LEN);
       return toFields().len;
    } 

    /**
     * Adds &#64;len elements onto the end of the array.
     * @param array a &#35;GArray
     * @param data a pointer to the elements to append to the end of the array
     * @param len the number of elements to append
     * @return the &#35;GArray
    */
    public static Array appendVals(@Nonnull Array array, @Nonnull ch.bailu.gtk.type.Pointer data, int len)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_append_vals(asCPointerNotNull(array), asCPointerNotNull(data), len)));
    }

    /**
     * Create a shallow copy of a &#35;GArray. If the array elements consist of
     * <br>pointers to data, the pointers are copied but the actual data is not.
     * @param array A &#35;GArray.
     * @return A copy of &#64;array.
    */
    public static Array copy(@Nonnull Array array)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_copy(asCPointerNotNull(array))));
    }

    /**
     * Frees the memory allocated for the &#35;GArray. If &#64;free_segment is
     * <br>%TRUE it frees the memory block holding the elements as well. Pass
     * <br>%FALSE if you want to free the &#35;GArray wrapper but preserve the
     * <br>underlying array for use elsewhere. If the reference count of
     * <br>&#64;array is greater than one, the &#35;GArray wrapper is preserved but
     * <br>the size of  &#64;array will be set to zero.
     * <br>
     * <br>If array contents point to dynamically-allocated memory, they should
     * <br>be freed separately if &#64;free_seg is %TRUE and no &#64;clear_func
     * <br>function has been set for &#64;array.
     * <br>
     * <br>This function is not thread-safe. If using a &#35;GArray from multiple
     * <br>threads, use only the atomic g_array_ref() and g_array_unref()
     * <br>functions.
     * @param array a &#35;GArray
     * @param free_segment if %TRUE the actual element data is freed as well
     * @return the element data if &#64;free_segment is %FALSE, otherwise     %NULL. The element data should be freed using g_free().
    */
    public static ch.bailu.gtk.type.Str free(@Nonnull Array array, boolean free_segment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaArray.INST().g_array_free(asCPointerNotNull(array), free_segment)));
    }

    /**
     * Gets the size of the elements in &#64;array.
     * @param array A &#35;GArray
     * @return Size of each element, in bytes
    */
    public static int getElementSize(@Nonnull Array array)  {
        return JnaArray.INST().g_array_get_element_size(asCPointerNotNull(array));
    }

    /**
     * Inserts &#64;len elements into a &#35;GArray at the given index.
     * <br>
     * <br>If &#64;index_ is greater than the array’s current length, the array is expanded.
     * <br>The elements between the old end of the array and the newly inserted elements
     * <br>will be initialised to zero if the array was configured to clear elements;
     * <br>otherwise their values will be undefined.
     * <br>
     * <br>If &#64;index_ is less than the array’s current length, new entries will be
     * <br>inserted into the array, and the existing entries above &#64;index_ will be moved
     * <br>upwards.
     * <br>
     * <br>&#64;data may be %NULL if (and only if) &#64;len is zero. If &#64;len is zero, this
     * <br>function is a no-op.
     * @param array a &#35;GArray
     * @param index_ the index to place the elements at
     * @param data a pointer to the elements to insert
     * @param len the number of elements to insert
     * @return the &#35;GArray
    */
    public static Array insertVals(@Nonnull Array array, int index_, @Nullable ch.bailu.gtk.type.Pointer data, int len)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_insert_vals(asCPointerNotNull(array), index_, asCPointer(data), len)));
    }

    /**
     * Creates a new &#35;GArray with a reference count of 1.
     * @param zero_terminated %TRUE if the array should have an extra element at     the end which is set to 0
     * @param clear_ %TRUE if &#35;GArray elements should be automatically cleared     to 0 when they are allocated
     * @param element_size the size of each element in bytes
     * @return the new &#35;GArray
    */
    public static Array _new(boolean zero_terminated, boolean clear_, int element_size)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_new(zero_terminated, clear_, element_size)));
    }

    /**
     * Adds &#64;len elements onto the start of the array.
     * <br>
     * <br>&#64;data may be %NULL if (and only if) &#64;len is zero. If &#64;len is zero, this
     * <br>function is a no-op.
     * <br>
     * <br>This operation is slower than g_array_append_vals() since the
     * <br>existing elements in the array have to be moved to make space for
     * <br>the new elements.
     * @param array a &#35;GArray
     * @param data a pointer to the elements to prepend to the start of the array
     * @param len the number of elements to prepend, which may be zero
     * @return the &#35;GArray
    */
    public static Array prependVals(@Nonnull Array array, @Nullable ch.bailu.gtk.type.Pointer data, int len)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_prepend_vals(asCPointerNotNull(array), asCPointer(data), len)));
    }

    /**
     * Atomically increments the reference count of &#64;array by one.
     * <br>This function is thread-safe and may be called from any thread.
     * @param array A &#35;GArray
     * @return The passed in &#35;GArray
    */
    public static Array ref(@Nonnull Array array)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_ref(asCPointerNotNull(array))));
    }

    /**
     * Removes the element at the given index from a &#35;GArray. The following
     * <br>elements are moved down one place.
     * @param array a &#35;GArray
     * @param index_ the index of the element to remove
     * @return the &#35;GArray
    */
    public static Array removeIndex(@Nonnull Array array, int index_)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_remove_index(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the element at the given index from a &#35;GArray. The last
     * <br>element in the array is used to fill in the space, so this function
     * <br>does not preserve the order of the &#35;GArray. But it is faster than
     * <br>g_array_remove_index().
     * @param array a &#64;GArray
     * @param index_ the index of the element to remove
     * @return the &#35;GArray
    */
    public static Array removeIndexFast(@Nonnull Array array, int index_)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_remove_index_fast(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the given number of elements starting at the given index
     * <br>from a &#35;GArray.  The following elements are moved to close the gap.
     * @param array a &#64;GArray
     * @param index_ the index of the first element to remove
     * @param length the number of elements to remove
     * @return the &#35;GArray
    */
    public static Array removeRange(@Nonnull Array array, int index_, int length)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_remove_range(asCPointerNotNull(array), index_, length)));
    }

    /**
     * Sets a function to clear an element of &#64;array.
     * <br>
     * <br>The &#64;clear_func will be called when an element in the array
     * <br>data segment is removed and when the array is freed and data
     * <br>segment is deallocated as well. &#64;clear_func will be passed a
     * <br>pointer to the element to clear, rather than the element itself.
     * <br>
     * <br>Note that in contrast with other uses of &#35;GDestroyNotify
     * <br>functions, &#64;clear_func is expected to clear the contents of
     * <br>the array element it is given, but not free the element itself.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * typedef struct
     * {
     *   gchar *str;
     *   GObject *obj;
     * } ArrayElement;
     * 
     * static void
     * array_element_clear (ArrayElement *element)
     * {
     *   g_clear_pointer (&amp;element-&gt;str, g_free);
     *   g_clear_object (&amp;element-&gt;obj);
     * }
     * 
     * // main code
     * GArray *garray = g_array_new (FALSE, FALSE, sizeof (ArrayElement));
     * g_array_set_clear_func (garray, (GDestroyNotify) array_element_clear);
     * // assign data to the structure
     * g_array_free (garray, TRUE);
     * </pre>
     * @param array A &#35;GArray
     * @param clear_func a function to clear an element of &#64;array
    */
    public static void setClearFunc(@Nonnull Array array, OnDestroyNotify clear_func)  {
        JnaArray.INST().g_array_set_clear_func(asCPointerNotNull(array), toOnDestroyNotify(getClassHandler().getInstance(), "setClearFunc", clear_func));
    }

    /**
     * Sets the size of the array, expanding it if necessary. If the array
     * <br>was created with &#64;clear_ set to %TRUE, the new elements are set to 0.
     * @param array a &#35;GArray
     * @param length the new size of the &#35;GArray
     * @return the &#35;GArray
    */
    public static Array setSize(@Nonnull Array array, int length)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_set_size(asCPointerNotNull(array), length)));
    }

    /**
     * Creates a new &#35;GArray with &#64;reserved_size elements preallocated and
     * <br>a reference count of 1. This avoids frequent reallocation, if you
     * <br>are going to add many elements to the array. Note however that the
     * <br>size of the array is still 0.
     * @param zero_terminated %TRUE if the array should have an extra element at     the end with all bits cleared
     * @param clear_ %TRUE if all bits in the array should be cleared to 0 on     allocation
     * @param element_size size of each element in the array
     * @param reserved_size number of elements preallocated
     * @return the new &#35;GArray
    */
    public static Array sizedNew(boolean zero_terminated, boolean clear_, int element_size, int reserved_size)  {
        return new Array(new PointerContainer(JnaArray.INST().g_array_sized_new(zero_terminated, clear_, element_size, reserved_size)));
    }

    /**
     * Sorts a &#35;GArray using &#64;compare_func which should be a qsort()-style
     * <br>comparison function (returns less than zero for first arg is less
     * <br>than second arg, zero for equal, greater zero if first arg is
     * <br>greater than second arg).
     * <br>
     * <br>This is guaranteed to be a stable sort since version 2.32.
     * @param array a &#35;GArray
     * @param compare_func comparison function
    */
    public static void sort(@Nonnull Array array, OnCompareFunc compare_func)  {
        JnaArray.INST().g_array_sort(asCPointerNotNull(array), toOnCompareFunc(getClassHandler().getInstance(), "sort", compare_func));
    }

    /**
     * Like g_array_sort(), but the comparison function receives an extra
     * <br>user data argument.
     * <br>
     * <br>This is guaranteed to be a stable sort since version 2.32.
     * <br>
     * <br>There used to be a comment here about making the sort stable by
     * <br>using the addresses of the elements in the comparison function.
     * <br>This did not actually work, so any such code should be removed.
     * @param array a &#35;GArray
     * @param compare_func comparison function
     * @param user_data data to pass to &#64;compare_func
    */
    public static void sortWithData(@Nonnull Array array, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaArray.INST().g_array_sort_with_data(asCPointerNotNull(array), toOnCompareDataFunc(getClassHandler().getInstance(), "sortWithData", compare_func), asCPointer(user_data));
    }

    /**
     * Frees the data in the array and resets the size to zero, while
     * <br>the underlying array is preserved for use elsewhere and returned
     * <br>to the caller.
     * <br>
     * <br>If the array was created with the &#64;zero_terminate property
     * <br>set to %TRUE, the returned data is zero terminated too.
     * <br>
     * <br>If array elements contain dynamically-allocated memory,
     * <br>the array elements should also be freed by the caller.
     * <br>
     * <br>A short example of use:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * ...
     * gpointer data;
     * gsize data_len;
     * data = g_array_steal (some_array, &amp;data_len);
     * ...
     * </pre>
     * @param array a &#35;GArray.
     * @param len pointer to retrieve the number of    elements of the original array
     * @return the element data, which should be     freed using g_free().
    */
    public static ch.bailu.gtk.type.Pointer steal(@Nonnull Array array, @Nullable ch.bailu.gtk.type.Int64 len)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaArray.INST().g_array_steal(asCPointerNotNull(array), asCPointer(len))));
    }

    /**
     * Atomically decrements the reference count of &#64;array by one. If the
     * <br>reference count drops to 0, all memory allocated by the array is
     * <br>released. This function is thread-safe and may be called from any
     * <br>thread.
     * @param array A &#35;GArray
    */
    public static void unref(@Nonnull Array array)  {
        JnaArray.INST().g_array_unref(asCPointerNotNull(array));
    }

    public static long getTypeID() { 
        return JnaArray.INST().g_array_get_type(); 
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

[MethodModel:java-type-not-supported:binarySearch:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Array:{c:GArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:CompareFunc:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
