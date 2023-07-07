/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSList struct is used for each element in the singly-linked
 * <br>list.
 * <p><a href="https://docs.gtk.org/glib/struct.SList.html">https://docs.gtk.org/glib/struct.SList.html</a></p>
*/
public class SList extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SList.class.getCanonicalName());
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
    
    private static JnaSList.OnCopyFunc toOnCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyFunc in) {
        JnaSList.OnCopyFunc out = null;
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
    
    private static JnaSList.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaSList.OnCompareFunc out = null;
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
    
    private static JnaSList.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaSList.OnFunc out = null;
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
    
    private static JnaSList.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaSList.OnDestroyNotify out = null;
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
    
    private static JnaSList.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaSList.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public SList(PointerContainer pointer) {
        super(pointer);
    }

    public SList() {
        super(cast(JnaSList.allocateStructure()));
    }

    private JnaSList.Fields _fields;
    
    JnaSList.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSList.Fields(asCPointer());
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
     * contains the link to the next element in the list.
    */
    public static final String NEXT = "next";

    /**
     * contains the link to the next element in the list.
    */
    public void setFieldNext(SList next) {
        toFields().next = next.asCPointer();
        toFields().writeField(NEXT);
    }

    /**
     * contains the link to the next element in the list.
    */
    public SList getFieldNext() {
       toFields().readField(NEXT);
       return new SList(new PointerContainer(toFields().next));
    } 

    /**
     * Allocates space for one &#35;GSList element. It is called by the
     * <br>g_slist_append(), g_slist_prepend(), g_slist_insert() and
     * <br>g_slist_insert_sorted() functions and so is rarely used on its own.
     * @return a pointer to the newly-allocated &#35;GSList element.
    */
    public static SList alloc()  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_alloc()));
    }

    /**
     * Adds a new element on to the end of the list.
     * <br>
     * <br>The return value is the new start of the list, which may
     * <br>have changed, so make sure you store the new value.
     * <br>
     * <br>Note that g_slist_append() has to traverse the entire list
     * <br>to find the end, which is inefficient when adding multiple
     * <br>elements. A common idiom to avoid the inefficiency is to prepend
     * <br>the elements and reverse the list when all elements have been added.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // Notice that these are initialized to the empty list.
     * GSList *list = NULL, *number_list = NULL;
     * 
     * // This is a list of strings.
     * list = g_slist_append (list, &quot;first&quot;);
     * list = g_slist_append (list, &quot;second&quot;);
     * 
     * // This is a list of integers.
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (27));
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (14));
     * </pre>
     * @param list a &#35;GSList
     * @param data the data for the new element
     * @return the new start of the &#35;GSList
    */
    public static SList append(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_append(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Adds the second &#35;GSList onto the end of the first &#35;GSList.
     * <br>Note that the elements of the second &#35;GSList are not copied.
     * <br>They are used directly.
     * @param list1 a &#35;GSList
     * @param list2 the &#35;GSList to add to the end of the first &#35;GSList
     * @return the start of the new &#35;GSList
    */
    public static SList concat(@Nonnull SList list1, @Nonnull SList list2)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_concat(asCPointerNotNull(list1), asCPointerNotNull(list2))));
    }

    /**
     * Copies a &#35;GSList.
     * <br>
     * <br>Note that this is a &quot;shallow&quot; copy. If the list elements
     * <br>consist of pointers to data, the pointers are copied but
     * <br>the actual data isn't. See g_slist_copy_deep() if you need
     * <br>to copy the data as well.
     * @param list a &#35;GSList
     * @return a copy of &#64;list
    */
    public static SList copy(@Nonnull SList list)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_copy(asCPointerNotNull(list))));
    }

    /**
     * Makes a full (deep) copy of a &#35;GSList.
     * <br>
     * <br>In contrast with g_slist_copy(), this function uses &#64;func to make a copy of
     * <br>each list element, in addition to copying the list container itself.
     * <br>
     * <br>&#64;func, as a &#35;GCopyFunc, takes two arguments, the data to be copied
     * <br>and a &#64;user_data pointer. On common processor architectures, it's safe to
     * <br>pass %NULL as &#64;user_data if the copy function takes only one argument. You
     * <br>may get compiler warnings from this though if compiling with GCC’s
     * <br>`-Wcast-function-type` warning.
     * <br>
     * <br>For instance, if &#64;list holds a list of GObjects, you can do:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * another_list = g_slist_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * </pre>
     * <br>
     * <br>And, to entirely free the new list, you could do:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_slist_free_full (another_list, g_object_unref);
     * </pre>
     * @param list a &#35;GSList
     * @param func a copy function used to copy every element in the list
     * @param user_data user data passed to the copy function &#64;func, or &#35;NULL
     * @return a full copy of &#64;list, use g_slist_free_full() to free it
    */
    public static SList copyDeep(@Nonnull SList list, OnCopyFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_copy_deep(asCPointerNotNull(list), toOnCopyFunc(getClassHandler().getInstance(), "copyDeep", func), asCPointer(user_data))));
    }

    /**
     * Removes the node link_ from the list and frees it.
     * <br>Compare this to g_slist_remove_link() which removes the node
     * <br>without freeing it.
     * <br>
     * <br>Removing arbitrary nodes from a singly-linked list requires time
     * <br>that is proportional to the length of the list (ie. O(n)). If you
     * <br>find yourself using g_slist_delete_link() frequently, you should
     * <br>consider a different data structure, such as the doubly-linked
     * <br>&#35;GList.
     * @param list a &#35;GSList
     * @param link_ node to delete
     * @return the new head of &#64;list
    */
    public static SList deleteLink(@Nonnull SList list, @Nonnull SList link_)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_delete_link(asCPointerNotNull(list), asCPointerNotNull(link_))));
    }

    /**
     * Finds the element in a &#35;GSList which
     * <br>contains the given data.
     * @param list a &#35;GSList
     * @param data the element data to find
     * @return the found &#35;GSList element,     or %NULL if it is not found
    */
    public static SList find(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_find(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Finds an element in a &#35;GSList, using a supplied function to
     * <br>find the desired element. It iterates over the list, calling
     * <br>the given function which should return 0 when the desired
     * <br>element is found. The function takes two &#35;gconstpointer arguments,
     * <br>the &#35;GSList element's data as the first argument and the
     * <br>given user data.
     * @param list a &#35;GSList
     * @param data user data passed to the function
     * @param func the function to call for each element.     It should return 0 when the desired element is found
     * @return the found &#35;GSList element, or %NULL if it is not found
    */
    public static SList findCustom(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareFunc func)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_find_custom(asCPointerNotNull(list), asCPointer(data), toOnCompareFunc(getClassHandler().getInstance(), "findCustom", func))));
    }

    /**
     * Calls a function for each element of a &#35;GSList.
     * <br>
     * <br>It is safe for &#64;func to remove the element from &#64;list, but it must
     * <br>not modify any part of the list after that element.
     * @param list a &#35;GSList
     * @param func the function to call with each element's data
     * @param user_data user data to pass to the function
    */
    public static void foreach(@Nonnull SList list, OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSList.INST().g_slist_foreach(asCPointerNotNull(list), toOnFunc(getClassHandler().getInstance(), "foreach", func), asCPointer(user_data));
    }

    /**
     * Frees all of the memory used by a &#35;GSList.
     * <br>The freed elements are returned to the slice allocator.
     * <br>
     * <br>If list elements contain dynamically-allocated memory,
     * <br>you should either use g_slist_free_full() or free them manually
     * <br>first.
     * <br>
     * <br>It can be combined with g_steal_pointer() to ensure the list head pointer
     * <br>is not left dangling:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GSList *list_of_borrowed_things = …;  /&lt;!-- --&gt;* (transfer container) *&lt;!-- --&gt;/
     * g_slist_free (g_steal_pointer (&amp;list_of_borrowed_things));
     * </pre>
     * @param list the first link of a &#35;GSList
    */
    public static void free(@Nonnull SList list)  {
        JnaSList.INST().g_slist_free(asCPointerNotNull(list));
    }

    /**
     * Frees one &#35;GSList element.
     * <br>It is usually used after g_slist_remove_link().
     * @param list a &#35;GSList element
    */
    public static void free1(@Nonnull SList list)  {
        JnaSList.INST().g_slist_free_1(asCPointerNotNull(list));
    }

    /**
     * Convenience method, which frees all the memory used by a &#35;GSList, and
     * <br>calls the specified destroy function on every element's data.
     * <br>
     * <br>&#64;free_func must not modify the list (eg, by removing the freed
     * <br>element from it).
     * <br>
     * <br>It can be combined with g_steal_pointer() to ensure the list head pointer
     * <br>is not left dangling ­— this also has the nice property that the head pointer
     * <br>is cleared before any of the list elements are freed, to prevent double frees
     * <br>from &#64;free_func:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GSList *list_of_owned_things = …;  /&lt;!-- --&gt;* (transfer full) (element-type GObject) *&lt;!-- --&gt;/
     * g_slist_free_full (g_steal_pointer (&amp;list_of_owned_things), g_object_unref);
     * </pre>
     * @param list the first link of a &#35;GSList
     * @param free_func the function to be called to free each element's data
    */
    public static void freeFull(@Nonnull SList list, OnDestroyNotify free_func)  {
        JnaSList.INST().g_slist_free_full(asCPointerNotNull(list), toOnDestroyNotify(getClassHandler().getInstance(), "freeFull", free_func));
    }

    /**
     * Gets the position of the element containing
     * <br>the given data (starting from 0).
     * @param list a &#35;GSList
     * @param data the data to find
     * @return the index of the element containing the data,     or -1 if the data is not found
    */
    public static int index(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaSList.INST().g_slist_index(asCPointerNotNull(list), asCPointer(data));
    }

    /**
     * Inserts a new element into the list at the given position.
     * @param list a &#35;GSList
     * @param data the data for the new element
     * @param position the position to insert the element.     If this is negative, or is larger than the number     of elements in the list, the new element is added on     to the end of the list.
     * @return the new start of the &#35;GSList
    */
    public static SList insert(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data, int position)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_insert(asCPointerNotNull(list), asCPointer(data), position)));
    }

    /**
     * Inserts a node before &#64;sibling containing &#64;data.
     * @param slist a &#35;GSList
     * @param sibling node to insert &#64;data before
     * @param data data to put in the newly-inserted node
     * @return the new head of the list.
    */
    public static SList insertBefore(@Nonnull SList slist, @Nonnull SList sibling, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_insert_before(asCPointerNotNull(slist), asCPointerNotNull(sibling), asCPointer(data))));
    }

    /**
     * Inserts a new element into the list, using the given
     * <br>comparison function to determine its position.
     * @param list a &#35;GSList
     * @param data the data for the new element
     * @param func the function to compare elements in the list.     It should return a number &gt; 0 if the first parameter     comes after the second parameter in the sort order.
     * @return the new start of the &#35;GSList
    */
    public static SList insertSorted(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareFunc func)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_insert_sorted(asCPointerNotNull(list), asCPointer(data), toOnCompareFunc(getClassHandler().getInstance(), "insertSorted", func))));
    }

    /**
     * Inserts a new element into the list, using the given
     * <br>comparison function to determine its position.
     * @param list a &#35;GSList
     * @param data the data for the new element
     * @param func the function to compare elements in the list.     It should return a number &gt; 0 if the first parameter     comes after the second parameter in the sort order.
     * @param user_data data to pass to comparison function
     * @return the new start of the &#35;GSList
    */
    public static SList insertSortedWithData(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_insert_sorted_with_data(asCPointerNotNull(list), asCPointer(data), toOnCompareDataFunc(getClassHandler().getInstance(), "insertSortedWithData", func), asCPointer(user_data))));
    }

    /**
     * Gets the last element in a &#35;GSList.
     * <br>
     * <br>This function iterates over the whole list.
     * @param list a &#35;GSList
     * @return the last element in the &#35;GSList,     or %NULL if the &#35;GSList has no elements
    */
    public static SList last(@Nonnull SList list)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_last(asCPointerNotNull(list))));
    }

    /**
     * Gets the number of elements in a &#35;GSList.
     * <br>
     * <br>This function iterates over the whole list to
     * <br>count its elements. To check whether the list is non-empty, it is faster to
     * <br>check &#64;list against %NULL.
     * @param list a &#35;GSList
     * @return the number of elements in the &#35;GSList
    */
    public static int length(@Nonnull SList list)  {
        return JnaSList.INST().g_slist_length(asCPointerNotNull(list));
    }

    /**
     * Gets the element at the given position in a &#35;GSList.
     * @param list a &#35;GSList
     * @param n the position of the element, counting from 0
     * @return the element, or %NULL if the position is off     the end of the &#35;GSList
    */
    public static SList nth(@Nonnull SList list, int n)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_nth(asCPointerNotNull(list), n)));
    }

    /**
     * Gets the data of the element at the given position.
     * @param list a &#35;GSList
     * @param n the position of the element
     * @return the element's data, or %NULL if the position     is off the end of the &#35;GSList
    */
    public static ch.bailu.gtk.type.Pointer nthData(@Nonnull SList list, int n)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaSList.INST().g_slist_nth_data(asCPointerNotNull(list), n)));
    }

    /**
     * Gets the position of the given element
     * <br>in the &#35;GSList (starting from 0).
     * @param list a &#35;GSList
     * @param llink an element in the &#35;GSList
     * @return the position of the element in the &#35;GSList,     or -1 if the element is not found
    */
    public static int position(@Nonnull SList list, @Nonnull SList llink)  {
        return JnaSList.INST().g_slist_position(asCPointerNotNull(list), asCPointerNotNull(llink));
    }

    /**
     * Adds a new element on to the start of the list.
     * <br>
     * <br>The return value is the new start of the list, which
     * <br>may have changed, so make sure you store the new value.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // Notice that it is initialized to the empty list.
     * GSList *list = NULL;
     * list = g_slist_prepend (list, &quot;last&quot;);
     * list = g_slist_prepend (list, &quot;first&quot;);
     * </pre>
     * @param list a &#35;GSList
     * @param data the data for the new element
     * @return the new start of the &#35;GSList
    */
    public static SList prepend(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_prepend(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes an element from a &#35;GSList.
     * <br>If two elements contain the same data, only the first is removed.
     * <br>If none of the elements contain the data, the &#35;GSList is unchanged.
     * @param list a &#35;GSList
     * @param data the data of the element to remove
     * @return the new start of the &#35;GSList
    */
    public static SList remove(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_remove(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes all list nodes with data equal to &#64;data.
     * <br>Returns the new head of the list. Contrast with
     * <br>g_slist_remove() which removes only the first node
     * <br>matching the given data.
     * @param list a &#35;GSList
     * @param data data to remove
     * @return new head of &#64;list
    */
    public static SList removeAll(@Nonnull SList list, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_remove_all(asCPointerNotNull(list), asCPointer(data))));
    }

    /**
     * Removes an element from a &#35;GSList, without
     * <br>freeing the element. The removed element's next
     * <br>link is set to %NULL, so that it becomes a
     * <br>self-contained list with one element.
     * <br>
     * <br>Removing arbitrary nodes from a singly-linked list
     * <br>requires time that is proportional to the length of the list
     * <br>(ie. O(n)). If you find yourself using g_slist_remove_link()
     * <br>frequently, you should consider a different data structure,
     * <br>such as the doubly-linked &#35;GList.
     * @param list a &#35;GSList
     * @param link_ an element in the &#35;GSList
     * @return the new start of the &#35;GSList, without the element
    */
    public static SList removeLink(@Nonnull SList list, @Nonnull SList link_)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_remove_link(asCPointerNotNull(list), asCPointerNotNull(link_))));
    }

    /**
     * Reverses a &#35;GSList.
     * @param list a &#35;GSList
     * @return the start of the reversed &#35;GSList
    */
    public static SList reverse(@Nonnull SList list)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_reverse(asCPointerNotNull(list))));
    }

    /**
     * Sorts a &#35;GSList using the given comparison function. The algorithm
     * <br>used is a stable sort.
     * @param list a &#35;GSList
     * @param compare_func the comparison function used to sort the &#35;GSList.     This function is passed the data from 2 elements of the &#35;GSList     and should return 0 if they are equal, a negative value if the     first element comes before the second, or a positive value if     the first element comes after the second.
     * @return the start of the sorted &#35;GSList
    */
    public static SList sort(@Nonnull SList list, OnCompareFunc compare_func)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_sort(asCPointerNotNull(list), toOnCompareFunc(getClassHandler().getInstance(), "sort", compare_func))));
    }

    /**
     * Like g_slist_sort(), but the sort function accepts a user data argument.
     * @param list a &#35;GSList
     * @param compare_func comparison function
     * @param user_data data to pass to comparison function
     * @return new head of the list
    */
    public static SList sortWithData(@Nonnull SList list, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new SList(new PointerContainer(JnaSList.INST().g_slist_sort_with_data(asCPointerNotNull(list), toOnCompareDataFunc(getClassHandler().getInstance(), "sortWithData", compare_func), asCPointer(user_data))));
    }

}

/*
record-type
all-fields-supported
*/
