/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GList struct is used for each element in a doubly-linked list.
 * <p><a href="https://docs.gtk.org/glib/struct.List.html">https://docs.gtk.org/glib/struct.List.html</a></p>
*/
public class List extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(List.class.getCanonicalName());
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
    
    private static JnaList.OnCopyFunc toOnCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyFunc in) {
        JnaList.OnCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src, _user_data) -> in.onCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_src)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaList.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaList.OnCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b) -> in.onCompareFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)));
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
    
    private static JnaList.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaList.OnFunc out = null;
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
    
    private static JnaList.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaList.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaList.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaList.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public List(PointerContainer pointer) {
        super(pointer);
    }

    public List() {
        super(cast(JnaList.allocateStructure()));
    }

    private JnaList.Fields _fields;
    
    JnaList.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaList.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * holds the element's data, which can be a pointer to any kind
     * <br>       of data, or any integer value using the
     * <br>       [Type Conversion Macros][glib-Type-Conversion-Macros]
    */
    public static final String DATA = "data";

    /**
     * holds the element's data, which can be a pointer to any kind
     * <br>       of data, or any integer value using the
     * <br>       [Type Conversion Macros][glib-Type-Conversion-Macros]
    */
    public void setFieldData(ch.bailu.gtk.type.Pointer data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * holds the element's data, which can be a pointer to any kind
     * <br>       of data, or any integer value using the
     * <br>       [Type Conversion Macros][glib-Type-Conversion-Macros]
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * contains the link to the next element in the list
    */
    public static final String NEXT = "next";

    /**
     * contains the link to the next element in the list
    */
    public void setFieldNext(List next) {
        toFields().next = next.asCPointer();
        toFields().writeField(NEXT);
    }

    /**
     * contains the link to the next element in the list
    */
    public List getFieldNext() {
       toFields().readField(NEXT);
       return new List(new PointerContainer(toFields().next));
    } 

    /**
     * contains the link to the previous element in the list
    */
    public static final String PREV = "prev";

    /**
     * contains the link to the previous element in the list
    */
    public void setFieldPrev(List prev) {
        toFields().prev = prev.asCPointer();
        toFields().writeField(PREV);
    }

    /**
     * contains the link to the previous element in the list
    */
    public List getFieldPrev() {
       toFields().readField(PREV);
       return new List(new PointerContainer(toFields().prev));
    } 

    /**
     * Allocates space for one &#35;GList element. It is called by
     * <br>g_list_append(), g_list_prepend(), g_list_insert() and
     * <br>g_list_insert_sorted() and so is rarely used on its own.
     * @return a pointer to the newly-allocated &#35;GList element
    */
    public static List alloc()  {
        return new List(new PointerContainer(JnaList.INST().g_list_alloc()));
    }

    /**
     * Adds a new element on to the end of the list.
     * <br>
     * <br>Note that the return value is the new start of the list,
     * <br>if &#64;list was empty; make sure you store the new value.
     * <br>
     * <br>g_list_append() has to traverse the entire list to find the end,
     * <br>which is inefficient when adding multiple elements. A common idiom
     * <br>to avoid the inefficiency is to use g_list_prepend() and reverse
     * <br>the list with g_list_reverse() when all elements have been added.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // Notice that these are initialized to the empty list.
     * GList *string_list = NULL, *number_list = NULL;
     * 
     * // This is a list of strings.
     * string_list = g_list_append (string_list, &quot;first&quot;);
     * string_list = g_list_append (string_list, &quot;second&quot;);
     * 
     * // This is a list of integers.
     * number_list = g_list_append (number_list, GINT_TO_POINTER (27));
     * number_list = g_list_append (number_list, GINT_TO_POINTER (14));
     * </pre>
     * @param list a pointer to a &#35;GList
     * @param data the data for the new element
     * @return either &#64;list or the new start of the &#35;GList if &#64;list was %NULL
    */
    public static List append(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_append(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Adds the second &#35;GList onto the end of the first &#35;GList.
     * <br>Note that the elements of the second &#35;GList are not copied.
     * <br>They are used directly.
     * <br>
     * <br>This function is for example used to move an element in the list.
     * <br>The following example moves an element to the top of the list:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * list = g_list_remove_link (list, llink);
     * list = g_list_concat (llink, list);
     * </pre>
     * @param list1 a &#35;GList, this must point to the top of the list
     * @param list2 the &#35;GList to add to the end of the first &#35;GList,     this must point  to the top of the list
     * @return the start of the new &#35;GList, which equals &#64;list1 if not %NULL
    */
    public static List concat(@Nonnull List list1, @Nonnull List list2)  {
        return new List(new PointerContainer(JnaList.INST().g_list_concat(asCPointerNotNull(list1), asCPointerNotNull(list2))));
    }

    /**
     * Copies a &#35;GList.
     * <br>
     * <br>Note that this is a &quot;shallow&quot; copy. If the list elements
     * <br>consist of pointers to data, the pointers are copied but
     * <br>the actual data is not. See g_list_copy_deep() if you need
     * <br>to copy the data as well.
     * @param list a &#35;GList, this must point to the top of the list
     * @return the start of the new list that holds the same data as &#64;list
    */
    public static List copy(@Nonnull List list)  {
        return new List(new PointerContainer(JnaList.INST().g_list_copy(asCPointerNotNull(list))));
    }

    /**
     * Makes a full (deep) copy of a &#35;GList.
     * <br>
     * <br>In contrast with g_list_copy(), this function uses &#64;func to make
     * <br>a copy of each list element, in addition to copying the list
     * <br>container itself.
     * <br>
     * <br>&#64;func, as a &#35;GCopyFunc, takes two arguments, the data to be copied
     * <br>and a &#64;user_data pointer. On common processor architectures, it's safe to
     * <br>pass %NULL as &#64;user_data if the copy function takes only one argument. You
     * <br>may get compiler warnings from this though if compiling with GCC’s
     * <br>`-Wcast-function-type` warning.
     * <br>
     * <br>For instance, if &#64;list holds a list of GObjects, you can do:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * another_list = g_list_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * </pre>
     * <br>
     * <br>And, to entirely free the new list, you could do:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_list_free_full (another_list, g_object_unref);
     * </pre>
     * @param list a &#35;GList, this must point to the top of the list
     * @param func a copy function used to copy every element in the list
     * @param user_data user data passed to the copy function &#64;func, or %NULL
     * @return the start of the new list that holds a full copy of &#64;list,     use g_list_free_full() to free it
    */
    public static List copyDeep(@Nonnull List list, OnCopyFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_copy_deep(asCPointerNotNull(list), toOnCopyFunc(getClassHandler().getInstance(), "copyDeep", func), asCPointer(user_data))));
    }

    /**
     * Removes the node link_ from the list and frees it.
     * <br>Compare this to g_list_remove_link() which removes the node
     * <br>without freeing it.
     * @param list a &#35;GList, this must point to the top of the list
     * @param link_ node to delete from &#64;list
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List deleteLink(@Nonnull List list, @Nonnull List link_)  {
        return new List(new PointerContainer(JnaList.INST().g_list_delete_link(asCPointerNotNull(list), asCPointerNotNull(link_))));
    }

    /**
     * Finds the element in a &#35;GList which contains the given data.
     * @param list a &#35;GList, this must point to the top of the list
     * @param data the element data to find
     * @return the found &#35;GList element, or %NULL if it is not found
    */
    public static List find(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_find(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Finds an element in a &#35;GList, using a supplied function to
     * <br>find the desired element. It iterates over the list, calling
     * <br>the given function which should return 0 when the desired
     * <br>element is found. The function takes two &#35;gconstpointer arguments,
     * <br>the &#35;GList element's data as the first argument and the
     * <br>given user data.
     * @param list a &#35;GList, this must point to the top of the list
     * @param data user data passed to the function
     * @param func the function to call for each element.     It should return 0 when the desired element is found
     * @return the found &#35;GList element, or %NULL if it is not found
    */
    public static List findCustom(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareFunc func)  {
        return new List(new PointerContainer(JnaList.INST().g_list_find_custom(asCPointerNotNull(list), asCPointer(data), toOnCompareFunc(getClassHandler().getInstance(), "findCustom", func))));
    }

    /**
     * Gets the first element in a &#35;GList.
     * @param list any &#35;GList element
     * @return the first element in the &#35;GList,     or %NULL if the &#35;GList has no elements
    */
    public static List first(@Nonnull List list)  {
        return new List(new PointerContainer(JnaList.INST().g_list_first(asCPointerNotNull(list))));
    }

    /**
     * Calls a function for each element of a &#35;GList.
     * <br>
     * <br>It is safe for &#64;func to remove the element from &#64;list, but it must
     * <br>not modify any part of the list after that element.
     * @param list a &#35;GList, this must point to the top of the list
     * @param func the function to call with each element's data
     * @param user_data user data to pass to the function
    */
    public static void foreach(@Nonnull List list, OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaList.INST().g_list_foreach(asCPointerNotNull(list), toOnFunc(getClassHandler().getInstance(), "foreach", func), asCPointer(user_data));
    }

    /**
     * Frees all of the memory used by a &#35;GList.
     * <br>The freed elements are returned to the slice allocator.
     * <br>
     * <br>If list elements contain dynamically-allocated memory, you should
     * <br>either use g_list_free_full() or free them manually first.
     * <br>
     * <br>It can be combined with g_steal_pointer() to ensure the list head pointer
     * <br>is not left dangling:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GList *list_of_borrowed_things = …;  /&lt;!-- --&gt;* (transfer container) *&lt;!-- --&gt;/
     * g_list_free (g_steal_pointer (&amp;list_of_borrowed_things));
     * </pre>
     * @param list the first link of a &#35;GList
    */
    public static void free(@Nonnull List list)  {
        JnaList.INST().g_list_free(asCPointerNotNull(list));
    }

    /**
     * Frees one &#35;GList element, but does not update links from the next and
     * <br>previous elements in the list, so you should not call this function on an
     * <br>element that is currently part of a list.
     * <br>
     * <br>It is usually used after g_list_remove_link().
     * @param list a &#35;GList element
    */
    public static void free1(@Nonnull List list)  {
        JnaList.INST().g_list_free_1(asCPointerNotNull(list));
    }

    /**
     * Convenience method, which frees all the memory used by a &#35;GList,
     * <br>and calls &#64;free_func on every element's data.
     * <br>
     * <br>&#64;free_func must not modify the list (eg, by removing the freed
     * <br>element from it).
     * <br>
     * <br>It can be combined with g_steal_pointer() to ensure the list head pointer
     * <br>is not left dangling ­— this also has the nice property that the head pointer
     * <br>is cleared before any of the list elements are freed, to prevent double frees
     * <br>from &#64;free_func:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GList *list_of_owned_things = …;  /&lt;!-- --&gt;* (transfer full) (element-type GObject) *&lt;!-- --&gt;/
     * g_list_free_full (g_steal_pointer (&amp;list_of_owned_things), g_object_unref);
     * </pre>
     * @param list the first link of a &#35;GList
     * @param free_func the function to be called to free each element's data
    */
    public static void freeFull(@Nonnull List list, OnDestroyNotify free_func)  {
        JnaList.INST().g_list_free_full(asCPointerNotNull(list), toOnDestroyNotify(getClassHandler().getInstance(), "freeFull", free_func));
    }

    /**
     * Gets the position of the element containing
     * <br>the given data (starting from 0).
     * @param list a &#35;GList, this must point to the top of the list
     * @param data the data to find
     * @return the index of the element containing the data,     or -1 if the data is not found
    */
    public static int index(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaList.INST().g_list_index(asCPointerNotNull(list), asCPointer(data));
    }

    /**
     * Inserts a new element into the list at the given position.
     * @param list a pointer to a &#35;GList, this must point to the top of the list
     * @param data the data for the new element
     * @param position the position to insert the element. If this is     negative, or is larger than the number of elements in the     list, the new element is added on to the end of the list.
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List insert(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data, int position)  {
        return new List(new PointerContainer(JnaList.INST().g_list_insert(asCPointerNotNull(list), asCPointer(data), position)));
    }

    /**
     * Inserts a new element into the list before the given position.
     * @param list a pointer to a &#35;GList, this must point to the top of the list
     * @param sibling the list element before which the new element     is inserted or %NULL to insert at the end of the list
     * @param data the data for the new element
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List insertBefore(@Nonnull List list, @Nonnull List sibling, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_insert_before(asCPointerNotNull(list), asCPointerNotNull(sibling), asCPointer(data))));
    }

    /**
     * Inserts &#64;link_ into the list before the given position.
     * @param list a pointer to a &#35;GList, this must point to the top of the list
     * @param sibling the list element before which the new element     is inserted or %NULL to insert at the end of the list
     * @param link_ the list element to be added, which must not be part of     any other list
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List insertBeforeLink(@Nonnull List list, @Nullable List sibling, @Nonnull List link_)  {
        return new List(new PointerContainer(JnaList.INST().g_list_insert_before_link(asCPointerNotNull(list), asCPointer(sibling), asCPointerNotNull(link_))));
    }

    /**
     * Inserts a new element into the list, using the given comparison
     * <br>function to determine its position.
     * <br>
     * <br>If you are adding many new elements to a list, and the number of
     * <br>new elements is much larger than the length of the list, use
     * <br>g_list_prepend() to add the new items and sort the list afterwards
     * <br>with g_list_sort().
     * @param list a pointer to a &#35;GList, this must point to the top of the     already sorted list
     * @param data the data for the new element
     * @param func the function to compare elements in the list. It should     return a number &gt; 0 if the first parameter comes after the     second parameter in the sort order.
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List insertSorted(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareFunc func)  {
        return new List(new PointerContainer(JnaList.INST().g_list_insert_sorted(asCPointerNotNull(list), asCPointer(data), toOnCompareFunc(getClassHandler().getInstance(), "insertSorted", func))));
    }

    /**
     * Inserts a new element into the list, using the given comparison
     * <br>function to determine its position.
     * <br>
     * <br>If you are adding many new elements to a list, and the number of
     * <br>new elements is much larger than the length of the list, use
     * <br>g_list_prepend() to add the new items and sort the list afterwards
     * <br>with g_list_sort().
     * @param list a pointer to a &#35;GList, this must point to the top of the     already sorted list
     * @param data the data for the new element
     * @param func the function to compare elements in the list. It should     return a number &gt; 0 if the first parameter  comes after the     second parameter in the sort order.
     * @param user_data user data to pass to comparison function
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List insertSortedWithData(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_insert_sorted_with_data(asCPointerNotNull(list), asCPointer(data), toOnCompareDataFunc(getClassHandler().getInstance(), "insertSortedWithData", func), asCPointer(user_data))));
    }

    /**
     * Gets the last element in a &#35;GList.
     * @param list any &#35;GList element
     * @return the last element in the &#35;GList,     or %NULL if the &#35;GList has no elements
    */
    public static List last(@Nonnull List list)  {
        return new List(new PointerContainer(JnaList.INST().g_list_last(asCPointerNotNull(list))));
    }

    /**
     * Gets the number of elements in a &#35;GList.
     * <br>
     * <br>This function iterates over the whole list to count its elements.
     * <br>Use a &#35;GQueue instead of a GList if you regularly need the number
     * <br>of items. To check whether the list is non-empty, it is faster to check
     * <br>&#64;list against %NULL.
     * @param list a &#35;GList, this must point to the top of the list
     * @return the number of elements in the &#35;GList
    */
    public static int length(@Nonnull List list)  {
        return JnaList.INST().g_list_length(asCPointerNotNull(list));
    }

    /**
     * Gets the element at the given position in a &#35;GList.
     * <br>
     * <br>This iterates over the list until it reaches the &#64;n-th position. If you
     * <br>intend to iterate over every element, it is better to use a for-loop as
     * <br>described in the &#35;GList introduction.
     * @param list a &#35;GList, this must point to the top of the list
     * @param n the position of the element, counting from 0
     * @return the element, or %NULL if the position is off     the end of the &#35;GList
    */
    public static List nth(@Nonnull List list, int n)  {
        return new List(new PointerContainer(JnaList.INST().g_list_nth(asCPointerNotNull(list), n)));
    }

    /**
     * Gets the data of the element at the given position.
     * <br>
     * <br>This iterates over the list until it reaches the &#64;n-th position. If you
     * <br>intend to iterate over every element, it is better to use a for-loop as
     * <br>described in the &#35;GList introduction.
     * @param list a &#35;GList, this must point to the top of the list
     * @param n the position of the element
     * @return the element's data, or %NULL if the position     is off the end of the &#35;GList
    */
    public static ch.bailu.gtk.type.Pointer nthData(@Nonnull List list, int n)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaList.INST().g_list_nth_data(asCPointerNotNull(list), n)));
    }

    /**
     * Gets the element &#64;n places before &#64;list.
     * @param list a &#35;GList
     * @param n the position of the element, counting from 0
     * @return the element, or %NULL if the position is     off the end of the &#35;GList
    */
    public static List nthPrev(@Nonnull List list, int n)  {
        return new List(new PointerContainer(JnaList.INST().g_list_nth_prev(asCPointerNotNull(list), n)));
    }

    /**
     * Gets the position of the given element
     * <br>in the &#35;GList (starting from 0).
     * @param list a &#35;GList, this must point to the top of the list
     * @param llink an element in the &#35;GList
     * @return the position of the element in the &#35;GList,     or -1 if the element is not found
    */
    public static int position(@Nonnull List list, @Nonnull List llink)  {
        return JnaList.INST().g_list_position(asCPointerNotNull(list), asCPointerNotNull(llink));
    }

    /**
     * Prepends a new element on to the start of the list.
     * <br>
     * <br>Note that the return value is the new start of the list,
     * <br>which will have changed, so make sure you store the new value.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // Notice that it is initialized to the empty list.
     * GList *list = NULL;
     * 
     * list = g_list_prepend (list, &quot;last&quot;);
     * list = g_list_prepend (list, &quot;first&quot;);
     * </pre>
     * <br>
     * <br>Do not use this function to prepend a new element to a different
     * <br>element than the start of the list. Use g_list_insert_before() instead.
     * @param list a pointer to a &#35;GList, this must point to the top of the list
     * @param data the data for the new element
     * @return a pointer to the newly prepended element, which is the new     start of the &#35;GList
    */
    public static List prepend(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_prepend(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes an element from a &#35;GList.
     * <br>If two elements contain the same data, only the first is removed.
     * <br>If none of the elements contain the data, the &#35;GList is unchanged.
     * @param list a &#35;GList, this must point to the top of the list
     * @param data the data of the element to remove
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List remove(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_remove(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes all list nodes with data equal to &#64;data.
     * <br>Returns the new head of the list. Contrast with
     * <br>g_list_remove() which removes only the first node
     * <br>matching the given data.
     * @param list a &#35;GList, this must point to the top of the list
     * @param data data to remove
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List removeAll(@Nonnull List list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_remove_all(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes an element from a &#35;GList, without freeing the element.
     * <br>The removed element's prev and next links are set to %NULL, so
     * <br>that it becomes a self-contained list with one element.
     * <br>
     * <br>This function is for example used to move an element in the list
     * <br>(see the example for g_list_concat()) or to remove an element in
     * <br>the list before freeing its data:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * list = g_list_remove_link (list, llink);
     * free_some_data_that_may_access_the_list_again (llink-&gt;data);
     * g_list_free (llink);
     * </pre>
     * @param list a &#35;GList, this must point to the top of the list
     * @param llink an element in the &#35;GList
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List removeLink(@Nonnull List list, @Nonnull List llink)  {
        return new List(new PointerContainer(JnaList.INST().g_list_remove_link(asCPointerNotNull(list), asCPointerNotNull(llink))));
    }

    /**
     * Reverses a &#35;GList.
     * <br>It simply switches the next and prev pointers of each element.
     * @param list a &#35;GList, this must point to the top of the list
     * @return the start of the reversed &#35;GList
    */
    public static List reverse(@Nonnull List list)  {
        return new List(new PointerContainer(JnaList.INST().g_list_reverse(asCPointerNotNull(list))));
    }

    /**
     * Sorts a &#35;GList using the given comparison function. The algorithm
     * <br>used is a stable sort.
     * @param list a &#35;GList, this must point to the top of the list
     * @param compare_func the comparison function used to sort the &#35;GList.     This function is passed the data from 2 elements of the &#35;GList     and should return 0 if they are equal, a negative value if the     first element comes before the second, or a positive value if     the first element comes after the second.
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List sort(@Nonnull List list, OnCompareFunc compare_func)  {
        return new List(new PointerContainer(JnaList.INST().g_list_sort(asCPointerNotNull(list), toOnCompareFunc(getClassHandler().getInstance(), "sort", compare_func))));
    }

    /**
     * Like g_list_sort(), but the comparison function accepts
     * <br>a user data argument.
     * @param list a &#35;GList, this must point to the top of the list
     * @param compare_func comparison function
     * @param user_data user data to pass to comparison function
     * @return the (possibly changed) start of the &#35;GList
    */
    public static List sortWithData(@Nonnull List list, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new List(new PointerContainer(JnaList.INST().g_list_sort_with_data(asCPointerNotNull(list), toOnCompareDataFunc(getClassHandler().getInstance(), "sortWithData", compare_func), asCPointer(user_data))));
    }

}

/*
record-type
all-fields-supported
*/
