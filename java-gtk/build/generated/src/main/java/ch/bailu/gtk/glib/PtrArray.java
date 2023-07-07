/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Contains the public fields of a pointer array.
 * <p><a href="https://docs.gtk.org/glib/struct.PtrArray.html">https://docs.gtk.org/glib/struct.PtrArray.html</a></p>
*/
public class PtrArray extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PtrArray.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCopyFunc {
        /**
         * A function of this signature is used to copy the node data
         * <br>when doing a deep-copy of a tree.
         * @param src A pointer to the data which should be copied
         * @param user_data Additional data
         * @return A pointer to the copy
        */
        ch.bailu.gtk.type.Pointer onCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer src, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaPtrArray.OnCopyFunc toOnCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyFunc in) {
        JnaPtrArray.OnCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src, _user_data) -> in.onCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_src)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFunc {
        /**
         * Specifies the type of functions passed to g_list_foreach() and
         * <br>g_slist_foreach().
         * @param data the element's data
         * @param user_data user data passed to g_list_foreach() or g_slist_foreach()
        */
        void onFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaPtrArray.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaPtrArray.OnFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _user_data) -> in.onFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaPtrArray.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaPtrArray.OnDestroyNotify out = null;
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
    
    private static JnaPtrArray.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaPtrArray.OnCompareFunc out = null;
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
    
    private static JnaPtrArray.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaPtrArray.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public PtrArray(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a pointer to the end of the pointer array. The array will grow
     * <br>in size automatically if necessary.
     * @param array a &#35;GPtrArray
     * @param data the pointer to add
    */
    public static void add(@Nonnull PtrArray array, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaPtrArray.INST().g_ptr_array_add(asCPointerNotNull(array), asCPointer(data));
    }

    /**
     * Makes a full (deep) copy of a &#35;GPtrArray.
     * <br>
     * <br>&#64;func, as a &#35;GCopyFunc, takes two arguments, the data to be copied
     * <br>and a &#64;user_data pointer. On common processor architectures, it's safe to
     * <br>pass %NULL as &#64;user_data if the copy function takes only one argument. You
     * <br>may get compiler warnings from this though if compiling with GCC’s
     * <br>`-Wcast-function-type` warning.
     * <br>
     * <br>If &#64;func is %NULL, then only the pointers (and not what they are
     * <br>pointing to) are copied to the new &#35;GPtrArray.
     * <br>
     * <br>The copy of &#64;array will have the same &#35;GDestroyNotify for its elements as
     * <br>&#64;array. The copy will also be %NULL terminated if (and only if) the source
     * <br>array is.
     * @param array &#35;GPtrArray to duplicate
     * @param func a copy function used to copy every element in the array
     * @param user_data user data passed to the copy function &#64;func, or %NULL
     * @return a deep copy of the initial &#35;GPtrArray.
    */
    public static PtrArray copy(@Nonnull PtrArray array, OnCopyFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_copy(asCPointerNotNull(array), toOnCopyFunc(getClassHandler().getInstance(), "copy", func), asCPointer(user_data))));
    }

    /**
     * Adds all pointers of &#64;array to the end of the array &#64;array_to_extend.
     * <br>The array will grow in size automatically if needed. &#64;array_to_extend is
     * <br>modified in-place.
     * <br>
     * <br>&#64;func, as a &#35;GCopyFunc, takes two arguments, the data to be copied
     * <br>and a &#64;user_data pointer. On common processor architectures, it's safe to
     * <br>pass %NULL as &#64;user_data if the copy function takes only one argument. You
     * <br>may get compiler warnings from this though if compiling with GCC’s
     * <br>`-Wcast-function-type` warning.
     * <br>
     * <br>If &#64;func is %NULL, then only the pointers (and not what they are
     * <br>pointing to) are copied to the new &#35;GPtrArray.
     * <br>
     * <br>Whether &#64;array_to_extend is %NULL terminated stays unchanged by this function.
     * @param array_to_extend a &#35;GPtrArray.
     * @param array a &#35;GPtrArray to add to the end of &#64;array_to_extend.
     * @param func a copy function used to copy every element in the array
     * @param user_data user data passed to the copy function &#64;func, or %NULL
    */
    public static void extend(@Nonnull PtrArray array_to_extend, @Nonnull PtrArray array, OnCopyFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPtrArray.INST().g_ptr_array_extend(asCPointerNotNull(array_to_extend), asCPointerNotNull(array), toOnCopyFunc(getClassHandler().getInstance(), "extend", func), asCPointer(user_data));
    }

    /**
     * Adds all the pointers in &#64;array to the end of &#64;array_to_extend, transferring
     * <br>ownership of each element from &#64;array to &#64;array_to_extend and modifying
     * <br>&#64;array_to_extend in-place. &#64;array is then freed.
     * <br>
     * <br>As with g_ptr_array_free(), &#64;array will be destroyed if its reference count
     * <br>is 1. If its reference count is higher, it will be decremented and the
     * <br>length of &#64;array set to zero.
     * @param array_to_extend a &#35;GPtrArray.
     * @param array a &#35;GPtrArray to add to the end of     &#64;array_to_extend.
    */
    public static void extendAndSteal(@Nonnull PtrArray array_to_extend, @Nonnull PtrArray array)  {
        JnaPtrArray.INST().g_ptr_array_extend_and_steal(asCPointerNotNull(array_to_extend), asCPointerNotNull(array));
    }

    /**
     * Calls a function for each element of a &#35;GPtrArray. &#64;func must not
     * <br>add elements to or remove elements from the array.
     * @param array a &#35;GPtrArray
     * @param func the function to call for each array element
     * @param user_data user data to pass to the function
    */
    public static void foreach(@Nonnull PtrArray array, OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPtrArray.INST().g_ptr_array_foreach(asCPointerNotNull(array), toOnFunc(getClassHandler().getInstance(), "foreach", func), asCPointer(user_data));
    }

    /**
     * Inserts an element into the pointer array at the given index. The
     * <br>array will grow in size automatically if necessary.
     * @param array a &#35;GPtrArray
     * @param index_ the index to place the new element at, or -1 to append
     * @param data the pointer to add.
    */
    public static void insert(@Nonnull PtrArray array, int index_, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaPtrArray.INST().g_ptr_array_insert(asCPointerNotNull(array), index_, asCPointer(data));
    }

    /**
     * Gets whether the &#64;array was constructed as %NULL-terminated.
     * <br>
     * <br>This will only return %TRUE for arrays constructed by passing %TRUE to the
     * <br>`null_terminated` argument of g_ptr_array_new_null_terminated(). It will not
     * <br>return %TRUE for normal arrays which have had a %NULL element appended to
     * <br>them.
     * @param array the &#35;GPtrArray
     * @return %TRUE if the array is made to be %NULL terminated.
    */
    public static boolean isNullTerminated(@Nonnull PtrArray array)  {
        return JnaPtrArray.INST().g_ptr_array_is_null_terminated(asCPointerNotNull(array));
    }

    /**
     * Creates a new &#35;GPtrArray with a reference count of 1.
     * @return the new &#35;GPtrArray
    */
    public static PtrArray _new()  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_new()));
    }

    /**
     * Creates a new &#35;GPtrArray with &#64;reserved_size pointers preallocated
     * <br>and a reference count of 1. This avoids frequent reallocation, if
     * <br>you are going to add many pointers to the array. Note however that
     * <br>the size of the array is still 0. It also set &#64;element_free_func
     * <br>for freeing each element when the array is destroyed either via
     * <br>g_ptr_array_unref(), when g_ptr_array_free() is called with
     * <br>&#64;free_segment set to %TRUE or when removing elements.
     * @param reserved_size number of pointers preallocated
     * @param element_free_func A function to free elements with     destroy &#64;array or %NULL
     * @return A new &#35;GPtrArray
    */
    public static PtrArray newFull(int reserved_size, OnDestroyNotify element_free_func)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_new_full(reserved_size, toOnDestroyNotify(getClassHandler().getInstance(), "newFull", element_free_func))));
    }

    /**
     * Like g_ptr_array_new_full() but also allows to set the array to
     * <br>be %NULL terminated. A %NULL terminated pointer array has an
     * <br>additional %NULL pointer after the last element, beyond the
     * <br>current length.
     * <br>
     * <br>&#35;GPtrArray created by other constructors are not automatically %NULL
     * <br>terminated.
     * <br>
     * <br>Note that if the &#64;array's length is zero and currently no
     * <br>data array is allocated, then pdata will still be %NULL.
     * <br>%GPtrArray will only %NULL terminate pdata, if an actual
     * <br>array is allocated. It does not guarantee that an array
     * <br>is always allocated. In other words, if the length is zero,
     * <br>then pdata may either point to a %NULL terminated array of length
     * <br>zero or be %NULL.
     * @param reserved_size number of pointers preallocated.     If &#64;null_terminated is %TRUE, the actually allocated     buffer size is &#64;reserved_size plus 1, unless &#64;reserved_size     is zero, in which case no initial buffer gets allocated.
     * @param element_free_func A function to free elements with     destroy &#64;array or %NULL
     * @param null_terminated whether to make the array as %NULL terminated.
     * @return A new &#35;GPtrArray
    */
    public static PtrArray newNullTerminated(int reserved_size, OnDestroyNotify element_free_func, boolean null_terminated)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_new_null_terminated(reserved_size, toOnDestroyNotify(getClassHandler().getInstance(), "newNullTerminated", element_free_func), null_terminated)));
    }

    /**
     * Creates a new &#35;GPtrArray with a reference count of 1 and use
     * <br>&#64;element_free_func for freeing each element when the array is destroyed
     * <br>either via g_ptr_array_unref(), when g_ptr_array_free() is called with
     * <br>&#64;free_segment set to %TRUE or when removing elements.
     * @param element_free_func A function to free elements with     destroy &#64;array or %NULL
     * @return A new &#35;GPtrArray
    */
    public static PtrArray newWithFreeFunc(OnDestroyNotify element_free_func)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_new_with_free_func(toOnDestroyNotify(getClassHandler().getInstance(), "newWithFreeFunc", element_free_func))));
    }

    /**
     * Atomically increments the reference count of &#64;array by one.
     * <br>This function is thread-safe and may be called from any thread.
     * @param array a &#35;GPtrArray
     * @return The passed in &#35;GPtrArray
    */
    public static PtrArray ref(@Nonnull PtrArray array)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_ref(asCPointerNotNull(array))));
    }

    /**
     * Removes the first occurrence of the given pointer from the pointer
     * <br>array. The following elements are moved down one place. If &#64;array
     * <br>has a non-%NULL &#35;GDestroyNotify function it is called for the
     * <br>removed element.
     * <br>
     * <br>It returns %TRUE if the pointer was removed, or %FALSE if the
     * <br>pointer was not found.
     * @param array a &#35;GPtrArray
     * @param data the pointer to remove
     * @return %TRUE if the pointer is removed, %FALSE if the pointer     is not found in the array
    */
    public static boolean remove(@Nonnull PtrArray array, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaPtrArray.INST().g_ptr_array_remove(asCPointerNotNull(array), asCPointer(data));
    }

    /**
     * Removes the first occurrence of the given pointer from the pointer
     * <br>array. The last element in the array is used to fill in the space,
     * <br>so this function does not preserve the order of the array. But it
     * <br>is faster than g_ptr_array_remove(). If &#64;array has a non-%NULL
     * <br>&#35;GDestroyNotify function it is called for the removed element.
     * <br>
     * <br>It returns %TRUE if the pointer was removed, or %FALSE if the
     * <br>pointer was not found.
     * @param array a &#35;GPtrArray
     * @param data the pointer to remove
     * @return %TRUE if the pointer was found in the array
    */
    public static boolean removeFast(@Nonnull PtrArray array, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaPtrArray.INST().g_ptr_array_remove_fast(asCPointerNotNull(array), asCPointer(data));
    }

    /**
     * Removes the pointer at the given index from the pointer array.
     * <br>The following elements are moved down one place. If &#64;array has
     * <br>a non-%NULL &#35;GDestroyNotify function it is called for the removed
     * <br>element. If so, the return value from this function will potentially point
     * <br>to freed memory (depending on the &#35;GDestroyNotify implementation).
     * @param array a &#35;GPtrArray
     * @param index_ the index of the pointer to remove
     * @return the pointer which was removed
    */
    public static ch.bailu.gtk.type.Pointer removeIndex(@Nonnull PtrArray array, int index_)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaPtrArray.INST().g_ptr_array_remove_index(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the pointer at the given index from the pointer array.
     * <br>The last element in the array is used to fill in the space, so
     * <br>this function does not preserve the order of the array. But it
     * <br>is faster than g_ptr_array_remove_index(). If &#64;array has a non-%NULL
     * <br>&#35;GDestroyNotify function it is called for the removed element. If so, the
     * <br>return value from this function will potentially point to freed memory
     * <br>(depending on the &#35;GDestroyNotify implementation).
     * @param array a &#35;GPtrArray
     * @param index_ the index of the pointer to remove
     * @return the pointer which was removed
    */
    public static ch.bailu.gtk.type.Pointer removeIndexFast(@Nonnull PtrArray array, int index_)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaPtrArray.INST().g_ptr_array_remove_index_fast(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the given number of pointers starting at the given index
     * <br>from a &#35;GPtrArray. The following elements are moved to close the
     * <br>gap. If &#64;array has a non-%NULL &#35;GDestroyNotify function it is
     * <br>called for the removed elements.
     * @param array a &#64;GPtrArray
     * @param index_ the index of the first pointer to remove
     * @param length the number of pointers to remove
     * @return the &#64;array
    */
    public static PtrArray removeRange(@Nonnull PtrArray array, int index_, int length)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_remove_range(asCPointerNotNull(array), index_, length)));
    }

    /**
     * Sets a function for freeing each element when &#64;array is destroyed
     * <br>either via g_ptr_array_unref(), when g_ptr_array_free() is called
     * <br>with &#64;free_segment set to %TRUE or when removing elements.
     * @param array A &#35;GPtrArray
     * @param element_free_func A function to free elements with     destroy &#64;array or %NULL
    */
    public static void setFreeFunc(@Nonnull PtrArray array, OnDestroyNotify element_free_func)  {
        JnaPtrArray.INST().g_ptr_array_set_free_func(asCPointerNotNull(array), toOnDestroyNotify(getClassHandler().getInstance(), "setFreeFunc", element_free_func));
    }

    /**
     * Sets the size of the array. When making the array larger,
     * <br>newly-added elements will be set to %NULL. When making it smaller,
     * <br>if &#64;array has a non-%NULL &#35;GDestroyNotify function then it will be
     * <br>called for the removed elements.
     * @param array a &#35;GPtrArray
     * @param length the new length of the pointer array
    */
    public static void setSize(@Nonnull PtrArray array, int length)  {
        JnaPtrArray.INST().g_ptr_array_set_size(asCPointerNotNull(array), length);
    }

    /**
     * Creates a new &#35;GPtrArray with &#64;reserved_size pointers preallocated
     * <br>and a reference count of 1. This avoids frequent reallocation, if
     * <br>you are going to add many pointers to the array. Note however that
     * <br>the size of the array is still 0.
     * @param reserved_size number of pointers preallocated
     * @return the new &#35;GPtrArray
    */
    public static PtrArray sizedNew(int reserved_size)  {
        return new PtrArray(new PointerContainer(JnaPtrArray.INST().g_ptr_array_sized_new(reserved_size)));
    }

    /**
     * Sorts the array, using &#64;compare_func which should be a qsort()-style
     * <br>comparison function (returns less than zero for first arg is less
     * <br>than second arg, zero for equal, greater than zero if irst arg is
     * <br>greater than second arg).
     * <br>
     * <br>Note that the comparison function for g_ptr_array_sort() doesn't
     * <br>take the pointers from the array as arguments, it takes pointers to
     * <br>the pointers in the array. Here is a full example of usage:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * typedef struct
     * {
     *   gchar *name;
     *   gint size;
     * } FileListEntry;
     * 
     * static gint
     * sort_filelist (gconstpointer a, gconstpointer b)
     * {
     *   const FileListEntry *entry1 = *((FileListEntry **) a);
     *   const FileListEntry *entry2 = *((FileListEntry **) b);
     * 
     *   return g_ascii_strcasecmp (entry1-&gt;name, entry2-&gt;name);
     * }
     * 
     * …
     * g_autoptr (GPtrArray) file_list = NULL;
     * 
     * // initialize file_list array and load with many FileListEntry entries
     * ...
     * // now sort it with
     * g_ptr_array_sort (file_list, sort_filelist);
     * </pre>
     * <br>
     * <br>This is guaranteed to be a stable sort since version 2.32.
     * @param array a &#35;GPtrArray
     * @param compare_func comparison function
    */
    public static void sort(@Nonnull PtrArray array, OnCompareFunc compare_func)  {
        JnaPtrArray.INST().g_ptr_array_sort(asCPointerNotNull(array), toOnCompareFunc(getClassHandler().getInstance(), "sort", compare_func));
    }

    /**
     * Like g_ptr_array_sort(), but the comparison function has an extra
     * <br>user data argument.
     * <br>
     * <br>Note that the comparison function for g_ptr_array_sort_with_data()
     * <br>doesn't take the pointers from the array as arguments, it takes
     * <br>pointers to the pointers in the array. Here is a full example of use:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * typedef enum { SORT_NAME, SORT_SIZE } SortMode;
     * 
     * typedef struct
     * {
     *   gchar *name;
     *   gint size;
     * } FileListEntry;
     * 
     * static gint
     * sort_filelist (gconstpointer a, gconstpointer b, gpointer user_data)
     * {
     *   gint order;
     *   const SortMode sort_mode = GPOINTER_TO_INT (user_data);
     *   const FileListEntry *entry1 = *((FileListEntry **) a);
     *   const FileListEntry *entry2 = *((FileListEntry **) b);
     * 
     *   switch (sort_mode)
     *     {
     *     case SORT_NAME:
     *       order = g_ascii_strcasecmp (entry1-&gt;name, entry2-&gt;name);
     *       break;
     *     case SORT_SIZE:
     *       order = entry1-&gt;size - entry2-&gt;size;
     *       break;
     *     default:
     *       order = 0;
     *       break;
     *     }
     *   return order;
     * }
     * 
     * ...
     * g_autoptr (GPtrArray) file_list = NULL;
     * SortMode sort_mode;
     * 
     * // initialize file_list array and load with many FileListEntry entries
     * ...
     * // now sort it with
     * sort_mode = SORT_NAME;
     * g_ptr_array_sort_with_data (file_list,
     *                             sort_filelist,
     *                             GINT_TO_POINTER (sort_mode));
     * </pre>
     * <br>
     * <br>This is guaranteed to be a stable sort since version 2.32.
     * @param array a &#35;GPtrArray
     * @param compare_func comparison function
     * @param user_data data to pass to &#64;compare_func
    */
    public static void sortWithData(@Nonnull PtrArray array, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPtrArray.INST().g_ptr_array_sort_with_data(asCPointerNotNull(array), toOnCompareDataFunc(getClassHandler().getInstance(), "sortWithData", compare_func), asCPointer(user_data));
    }

    /**
     * Removes the pointer at the given index from the pointer array.
     * <br>The following elements are moved down one place. The &#35;GDestroyNotify for
     * <br>&#64;array is *not* called on the removed element; ownership is transferred to
     * <br>the caller of this function.
     * @param array a &#35;GPtrArray
     * @param index_ the index of the pointer to steal
     * @return the pointer which was removed
    */
    public static ch.bailu.gtk.type.Pointer stealIndex(@Nonnull PtrArray array, int index_)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaPtrArray.INST().g_ptr_array_steal_index(asCPointerNotNull(array), index_)));
    }

    /**
     * Removes the pointer at the given index from the pointer array.
     * <br>The last element in the array is used to fill in the space, so
     * <br>this function does not preserve the order of the array. But it
     * <br>is faster than g_ptr_array_steal_index(). The &#35;GDestroyNotify for &#64;array is
     * <br>*not* called on the removed element; ownership is transferred to the caller
     * <br>of this function.
     * @param array a &#35;GPtrArray
     * @param index_ the index of the pointer to steal
     * @return the pointer which was removed
    */
    public static ch.bailu.gtk.type.Pointer stealIndexFast(@Nonnull PtrArray array, int index_)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaPtrArray.INST().g_ptr_array_steal_index_fast(asCPointerNotNull(array), index_)));
    }

    /**
     * Atomically decrements the reference count of &#64;array by one. If the
     * <br>reference count drops to 0, the effect is the same as calling
     * <br>g_ptr_array_free() with &#64;free_segment set to %TRUE. This function
     * <br>is thread-safe and may be called from any thread.
     * @param array A &#35;GPtrArray
    */
    public static void unref(@Nonnull PtrArray array)  {
        JnaPtrArray.INST().g_ptr_array_unref(asCPointerNotNull(array));
    }

    public static long getTypeID() { 
        return JnaPtrArray.INST().g_ptr_array_get_type(); 
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

[FieldModel:pdata:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[FieldModel:len:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:find:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:findWithEqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:EqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:cb-return-value-not-supported:free:[ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-return-value-not-supported:steal:[ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
