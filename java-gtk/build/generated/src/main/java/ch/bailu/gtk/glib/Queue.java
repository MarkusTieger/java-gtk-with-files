/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Contains the public fields of a
 * <br>[Queue][glib-Double-ended-Queues].
 * <p><a href="https://docs.gtk.org/glib/struct.Queue.html">https://docs.gtk.org/glib/struct.Queue.html</a></p>
*/
public class Queue extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Queue.class.getCanonicalName());
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
    
    private static JnaQueue.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaQueue.OnDestroyNotify out = null;
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
    
    private static JnaQueue.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaQueue.OnCompareFunc out = null;
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
    
    private static JnaQueue.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaQueue.OnFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _user_data) -> in.onFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaQueue.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaQueue.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Queue(PointerContainer pointer) {
        super(pointer);
    }

    public Queue() {
        super(cast(JnaQueue.allocateStructure()));
    }

    private JnaQueue.Fields _fields;
    
    JnaQueue.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaQueue.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * a pointer to the first element of the queue
    */
    public static final String HEAD = "head";

    /**
     * a pointer to the first element of the queue
    */
    public void setFieldHead(List head) {
        toFields().head = head.asCPointer();
        toFields().writeField(HEAD);
    }

    /**
     * a pointer to the first element of the queue
    */
    public List getFieldHead() {
       toFields().readField(HEAD);
       return new List(new PointerContainer(toFields().head));
    } 

    /**
     * a pointer to the last element of the queue
    */
    public static final String TAIL = "tail";

    /**
     * a pointer to the last element of the queue
    */
    public void setFieldTail(List tail) {
        toFields().tail = tail.asCPointer();
        toFields().writeField(TAIL);
    }

    /**
     * a pointer to the last element of the queue
    */
    public List getFieldTail() {
       toFields().readField(TAIL);
       return new List(new PointerContainer(toFields().tail));
    } 

    /**
     * the number of elements in the queue
    */
    public static final String LENGTH = "length";

    /**
     * the number of elements in the queue
    */
    public void setFieldLength(int length) {
        toFields().length = length;
        toFields().writeField(LENGTH);
    }

    /**
     * the number of elements in the queue
    */
    public int getFieldLength() {
       toFields().readField(LENGTH);
       return toFields().length;
    } 

    /**
     * Removes all the elements in &#64;queue. If queue elements contain
     * <br>dynamically-allocated memory, they should be freed first.
    */
    public void clear()  {
        JnaQueue.INST().g_queue_clear(asCPointer());
    }

    /**
     * Convenience method, which frees all the memory used by a &#35;GQueue,
     * <br>and calls the provided &#64;free_func on each item in the &#35;GQueue.
     * @param free_func the function to be called to free memory allocated
    */
    public void clearFull(OnDestroyNotify free_func)  {
        JnaQueue.INST().g_queue_clear_full(asCPointer(), toOnDestroyNotify(this, "clearFull", free_func));
    }

    /**
     * Copies a &#64;queue. Note that is a shallow copy. If the elements in the
     * <br>queue consist of pointers to data, the pointers are copied, but the
     * <br>actual data is not.
     * @return a copy of &#64;queue
    */
    public Queue copy()  {
        return new Queue(new PointerContainer(JnaQueue.INST().g_queue_copy(asCPointer())));
    }

    /**
     * Removes &#64;link_ from &#64;queue and frees it.
     * <br>
     * <br>&#64;link_ must be part of &#64;queue.
     * @param link_ a &#35;GList link that must be part of &#64;queue
    */
    public void deleteLink(@Nonnull List link_)  {
        JnaQueue.INST().g_queue_delete_link(asCPointer(), asCPointerNotNull(link_));
    }

    /**
     * Finds the first link in &#64;queue which contains &#64;data.
     * @param data data to find
     * @return the first link in &#64;queue which contains &#64;data
    */
    public List find(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_find(asCPointer(), asCPointer(data))));
    }

    /**
     * Finds an element in a &#35;GQueue, using a supplied function to find the
     * <br>desired element. It iterates over the queue, calling the given function
     * <br>which should return 0 when the desired element is found. The function
     * <br>takes two gconstpointer arguments, the &#35;GQueue element's data as the
     * <br>first argument and the given user data as the second argument.
     * @param data user data passed to &#64;func
     * @param func a &#35;GCompareFunc to call for each element. It should return 0     when the desired element is found
     * @return the found link, or %NULL if it wasn't found
    */
    public List findCustom(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareFunc func)  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_find_custom(asCPointer(), asCPointer(data), toOnCompareFunc(this, "findCustom", func))));
    }

    /**
     * Calls &#64;func for each element in the queue passing &#64;user_data to the
     * <br>function.
     * <br>
     * <br>It is safe for &#64;func to remove the element from &#64;queue, but it must
     * <br>not modify any part of the queue after that element.
     * @param func the function to call for each element's data
     * @param user_data user data to pass to &#64;func
    */
    public void foreach(OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaQueue.INST().g_queue_foreach(asCPointer(), toOnFunc(this, "foreach", func), asCPointer(user_data));
    }

    /**
     * Frees the memory allocated for the &#35;GQueue. Only call this function
     * <br>if &#64;queue was created with g_queue_new(). If queue elements contain
     * <br>dynamically-allocated memory, they should be freed first.
     * <br>
     * <br>If queue elements contain dynamically-allocated memory, you should
     * <br>either use g_queue_free_full() or free them manually first.
    */
    public void free()  {
        JnaQueue.INST().g_queue_free(asCPointer());
    }

    /**
     * Convenience method, which frees all the memory used by a &#35;GQueue,
     * <br>and calls the specified destroy function on every element's data.
     * <br>
     * <br>&#64;free_func should not modify the queue (eg, by removing the freed
     * <br>element from it).
     * @param free_func the function to be called to free each element's data
    */
    public void freeFull(OnDestroyNotify free_func)  {
        JnaQueue.INST().g_queue_free_full(asCPointer(), toOnDestroyNotify(this, "freeFull", free_func));
    }

    /**
     * Returns the number of items in &#64;queue.
     * @return the number of items in &#64;queue
    */
    public int getLength()  {
        return JnaQueue.INST().g_queue_get_length(asCPointer());
    }

    /**
     * Returns the position of the first element in &#64;queue which contains &#64;data.
     * @param data the data to find
     * @return the position of the first element in &#64;queue which     contains &#64;data, or -1 if no element in &#64;queue contains &#64;data
    */
    public int index(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaQueue.INST().g_queue_index(asCPointer(), asCPointer(data));
    }

    /**
     * A statically-allocated &#35;GQueue must be initialized with this function
     * <br>before it can be used. Alternatively you can initialize it with
     * <br>%G_QUEUE_INIT. It is not necessary to initialize queues created with
     * <br>g_queue_new().
    */
    public void init()  {
        JnaQueue.INST().g_queue_init(asCPointer());
    }

    /**
     * Inserts &#64;data into &#64;queue after &#64;sibling.
     * <br>
     * <br>&#64;sibling must be part of &#64;queue. Since GLib 2.44 a %NULL sibling pushes the
     * <br>data at the head of the queue.
     * @param sibling a &#35;GList link that must be part of &#64;queue, or %NULL to   push at the head of the queue.
     * @param data the data to insert
    */
    public void insertAfter(@Nullable List sibling, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaQueue.INST().g_queue_insert_after(asCPointer(), asCPointer(sibling), asCPointer(data));
    }

    /**
     * Inserts &#64;link_ into &#64;queue after &#64;sibling.
     * <br>
     * <br>&#64;sibling must be part of &#64;queue.
     * @param sibling a &#35;GList link that must be part of &#64;queue, or %NULL to   push at the head of the queue.
     * @param link_ a &#35;GList link to insert which must not be part of any other list.
    */
    public void insertAfterLink(@Nullable List sibling, @Nonnull List link_)  {
        JnaQueue.INST().g_queue_insert_after_link(asCPointer(), asCPointer(sibling), asCPointerNotNull(link_));
    }

    /**
     * Inserts &#64;data into &#64;queue before &#64;sibling.
     * <br>
     * <br>&#64;sibling must be part of &#64;queue. Since GLib 2.44 a %NULL sibling pushes the
     * <br>data at the tail of the queue.
     * @param sibling a &#35;GList link that must be part of &#64;queue, or %NULL to   push at the tail of the queue.
     * @param data the data to insert
    */
    public void insertBefore(@Nullable List sibling, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaQueue.INST().g_queue_insert_before(asCPointer(), asCPointer(sibling), asCPointer(data));
    }

    /**
     * Inserts &#64;link_ into &#64;queue before &#64;sibling.
     * <br>
     * <br>&#64;sibling must be part of &#64;queue.
     * @param sibling a &#35;GList link that must be part of &#64;queue, or %NULL to   push at the tail of the queue.
     * @param link_ a &#35;GList link to insert which must not be part of any other list.
    */
    public void insertBeforeLink(@Nullable List sibling, @Nonnull List link_)  {
        JnaQueue.INST().g_queue_insert_before_link(asCPointer(), asCPointer(sibling), asCPointerNotNull(link_));
    }

    /**
     * Inserts &#64;data into &#64;queue using &#64;func to determine the new position.
     * @param data the data to insert
     * @param func the &#35;GCompareDataFunc used to compare elements in the queue. It is     called with two elements of the &#64;queue and &#64;user_data. It should     return 0 if the elements are equal, a negative value if the first     element comes before the second, and a positive value if the second     element comes before the first.
     * @param user_data user data passed to &#64;func
    */
    public void insertSorted(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaQueue.INST().g_queue_insert_sorted(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "insertSorted", func), asCPointer(user_data));
    }

    /**
     * Returns %TRUE if the queue is empty.
     * @return %TRUE if the queue is empty
    */
    public boolean isEmpty()  {
        return JnaQueue.INST().g_queue_is_empty(asCPointer());
    }

    /**
     * Returns the position of &#64;link_ in &#64;queue.
     * @param link_ a &#35;GList link
     * @return the position of &#64;link_, or -1 if the link is     not part of &#64;queue
    */
    public int linkIndex(@Nonnull List link_)  {
        return JnaQueue.INST().g_queue_link_index(asCPointer(), asCPointerNotNull(link_));
    }

    /**
     * Returns the first element of the queue.
     * @return the data of the first element in the queue, or %NULL     if the queue is empty
    */
    public ch.bailu.gtk.type.Pointer peekHead()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_peek_head(asCPointer())));
    }

    /**
     * Returns the first link in &#64;queue.
     * @return the first link in &#64;queue, or %NULL if &#64;queue is empty
    */
    public List peekHeadLink()  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_peek_head_link(asCPointer())));
    }

    /**
     * Returns the &#64;n'th element of &#64;queue.
     * @param n the position of the element
     * @return the data for the &#64;n'th element of &#64;queue,     or %NULL if &#64;n is off the end of &#64;queue
    */
    public ch.bailu.gtk.type.Pointer peekNth(int n)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_peek_nth(asCPointer(), n)));
    }

    /**
     * Returns the link at the given position
     * @param n the position of the link
     * @return the link at the &#64;n'th position, or %NULL     if &#64;n is off the end of the list
    */
    public List peekNthLink(int n)  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_peek_nth_link(asCPointer(), n)));
    }

    /**
     * Returns the last element of the queue.
     * @return the data of the last element in the queue, or %NULL     if the queue is empty
    */
    public ch.bailu.gtk.type.Pointer peekTail()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_peek_tail(asCPointer())));
    }

    /**
     * Returns the last link in &#64;queue.
     * @return the last link in &#64;queue, or %NULL if &#64;queue is empty
    */
    public List peekTailLink()  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_peek_tail_link(asCPointer())));
    }

    /**
     * Removes the first element of the queue and returns its data.
     * @return the data of the first element in the queue, or %NULL     if the queue is empty
    */
    public ch.bailu.gtk.type.Pointer popHead()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_pop_head(asCPointer())));
    }

    /**
     * Removes and returns the first element of the queue.
     * @return the &#35;GList element at the head of the queue, or %NULL     if the queue is empty
    */
    public List popHeadLink()  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_pop_head_link(asCPointer())));
    }

    /**
     * Removes the &#64;n'th element of &#64;queue and returns its data.
     * @param n the position of the element
     * @return the element's data, or %NULL if &#64;n is off the end of &#64;queue
    */
    public ch.bailu.gtk.type.Pointer popNth(int n)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_pop_nth(asCPointer(), n)));
    }

    /**
     * Removes and returns the link at the given position.
     * @param n the link's position
     * @return the &#64;n'th link, or %NULL if &#64;n is off the end of &#64;queue
    */
    public List popNthLink(int n)  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_pop_nth_link(asCPointer(), n)));
    }

    /**
     * Removes the last element of the queue and returns its data.
     * @return the data of the last element in the queue, or %NULL     if the queue is empty
    */
    public ch.bailu.gtk.type.Pointer popTail()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaQueue.INST().g_queue_pop_tail(asCPointer())));
    }

    /**
     * Removes and returns the last element of the queue.
     * @return the &#35;GList element at the tail of the queue, or %NULL     if the queue is empty
    */
    public List popTailLink()  {
        return new List(new PointerContainer(JnaQueue.INST().g_queue_pop_tail_link(asCPointer())));
    }

    /**
     * Adds a new element at the head of the queue.
     * @param data the data for the new element.
    */
    public void pushHead(@Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaQueue.INST().g_queue_push_head(asCPointer(), asCPointer(data));
    }

    /**
     * Adds a new element at the head of the queue.
     * @param link_ a single &#35;GList element, not a list with more than one element
    */
    public void pushHeadLink(@Nonnull List link_)  {
        JnaQueue.INST().g_queue_push_head_link(asCPointer(), asCPointerNotNull(link_));
    }

    /**
     * Inserts a new element into &#64;queue at the given position.
     * @param data the data for the new element
     * @param n the position to insert the new element. If &#64;n is negative or     larger than the number of elements in the &#64;queue, the element is     added to the end of the queue.
    */
    public void pushNth(@Nullable ch.bailu.gtk.type.Pointer data, int n)  {
        JnaQueue.INST().g_queue_push_nth(asCPointer(), asCPointer(data), n);
    }

    /**
     * Inserts &#64;link into &#64;queue at the given position.
     * @param n the position to insert the link. If this is negative or larger than     the number of elements in &#64;queue, the link is added to the end of     &#64;queue.
     * @param link_ the link to add to &#64;queue
    */
    public void pushNthLink(int n, @Nonnull List link_)  {
        JnaQueue.INST().g_queue_push_nth_link(asCPointer(), n, asCPointerNotNull(link_));
    }

    /**
     * Adds a new element at the tail of the queue.
     * @param data the data for the new element
    */
    public void pushTail(@Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaQueue.INST().g_queue_push_tail(asCPointer(), asCPointer(data));
    }

    /**
     * Adds a new element at the tail of the queue.
     * @param link_ a single &#35;GList element, not a list with more than one element
    */
    public void pushTailLink(@Nonnull List link_)  {
        JnaQueue.INST().g_queue_push_tail_link(asCPointer(), asCPointerNotNull(link_));
    }

    /**
     * Removes the first element in &#64;queue that contains &#64;data.
     * @param data the data to remove
     * @return %TRUE if &#64;data was found and removed from &#64;queue
    */
    public boolean remove(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaQueue.INST().g_queue_remove(asCPointer(), asCPointer(data));
    }

    /**
     * Remove all elements whose data equals &#64;data from &#64;queue.
     * @param data the data to remove
     * @return the number of elements removed from &#64;queue
    */
    public int removeAll(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaQueue.INST().g_queue_remove_all(asCPointer(), asCPointer(data));
    }

    /**
     * Reverses the order of the items in &#64;queue.
    */
    public void reverse()  {
        JnaQueue.INST().g_queue_reverse(asCPointer());
    }

    /**
     * Sorts &#64;queue using &#64;compare_func.
     * @param compare_func the &#35;GCompareDataFunc used to sort &#64;queue. This function     is passed two elements of the queue and should return 0 if they are     equal, a negative value if the first comes before the second, and     a positive value if the second comes before the first.
     * @param user_data user data passed to &#64;compare_func
    */
    public void sort(OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaQueue.INST().g_queue_sort(asCPointer(), toOnCompareDataFunc(this, "sort", compare_func), asCPointer(user_data));
    }

    /**
     * Unlinks &#64;link_ so that it will no longer be part of &#64;queue.
     * <br>The link is not freed.
     * <br>
     * <br>&#64;link_ must be part of &#64;queue.
     * @param link_ a &#35;GList link that must be part of &#64;queue
    */
    public void unlink(@Nonnull List link_)  {
        JnaQueue.INST().g_queue_unlink(asCPointer(), asCPointerNotNull(link_));
    }

    /**
     * Creates a new &#35;GQueue.
     * @return a newly allocated &#35;GQueue
    */
    public static Queue _new()  {
        return new Queue(new PointerContainer(JnaQueue.INST().g_queue_new()));
    }

}

/*
record-type
all-fields-supported
*/
