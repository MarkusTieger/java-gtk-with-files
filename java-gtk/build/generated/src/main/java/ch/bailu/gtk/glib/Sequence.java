/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSequence struct is an opaque data type representing a
 * <br>[sequence][glib-Sequences] data type.
 * <p><a href="https://docs.gtk.org/glib/struct.Sequence.html">https://docs.gtk.org/glib/struct.Sequence.html</a></p>
*/
class Sequence extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Sequence.class.getCanonicalName());
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
    
    private static JnaSequence.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaSequence.OnFunc out = null;
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
    
    private static JnaSequence.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaSequence.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSequenceIterCompareFunc {
        /**
         * A &#35;GSequenceIterCompareFunc is a function used to compare iterators.
         * <br>It must return zero if the iterators compare equal, a negative value
         * <br>if &#64;a comes before &#64;b, and a positive value if &#64;b comes before &#64;a.
         * @param a a &#35;GSequenceIter
         * @param b a &#35;GSequenceIter
         * @param user_data user data
         * @return zero if the iterators are equal, a negative value if &#64;a     comes before &#64;b, and a positive value if &#64;b comes before &#64;a.
        */
        int onSequenceIterCompareFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SequenceIter a, @Nonnull SequenceIter b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSequence.OnSequenceIterCompareFunc toOnSequenceIterCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSequenceIterCompareFunc in) {
        JnaSequence.OnSequenceIterCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onSequenceIterCompareFunc(__callback, new SequenceIter(new PointerContainer(_a)), new SequenceIter(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaSequence.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaSequence.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Sequence(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a new item to the end of &#64;seq.
     * @param data the data for the new item
     * @return an iterator pointing to the new item
    */
    public SequenceIter append(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_append(asCPointer(), asCPointer(data))));
    }

    /**
     * Calls &#64;func for each item in the sequence passing &#64;user_data
     * <br>to the function. &#64;func must not modify the sequence itself.
     * @param func the function to call for each item in &#64;seq
     * @param user_data user data passed to &#64;func
    */
    public void foreach(OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSequence.INST().g_sequence_foreach(asCPointer(), toOnFunc(this, "foreach", func), asCPointer(user_data));
    }

    /**
     * Frees the memory allocated for &#64;seq. If &#64;seq has a data destroy
     * <br>function associated with it, that function is called on all items
     * <br>in &#64;seq.
    */
    public void free()  {
        JnaSequence.INST().g_sequence_free(asCPointer());
    }

    /**
     * Returns the begin iterator for &#64;seq.
     * @return the begin iterator for &#64;seq.
    */
    public SequenceIter getBeginIter()  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_get_begin_iter(asCPointer())));
    }

    /**
     * Returns the end iterator for &#64;seg
     * @return the end iterator for &#64;seq
    */
    public SequenceIter getEndIter()  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_get_end_iter(asCPointer())));
    }

    /**
     * Returns the iterator at position &#64;pos. If &#64;pos is negative or larger
     * <br>than the number of items in &#64;seq, the end iterator is returned.
     * @param pos a position in &#64;seq, or -1 for the end
     * @return The &#35;GSequenceIter at position &#64;pos
    */
    public SequenceIter getIterAtPos(int pos)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_get_iter_at_pos(asCPointer(), pos)));
    }

    /**
     * Returns the positive length (&gt;= 0) of &#64;seq. Note that this method is
     * <br>O(h) where `h' is the height of the tree. It is thus more efficient
     * <br>to use g_sequence_is_empty() when comparing the length to zero.
     * @return the length of &#64;seq
    */
    public int getLength()  {
        return JnaSequence.INST().g_sequence_get_length(asCPointer());
    }

    /**
     * Inserts &#64;data into &#64;seq using &#64;cmp_func to determine the new
     * <br>position. The sequence must already be sorted according to &#64;cmp_func;
     * <br>otherwise the new position of &#64;data is undefined.
     * <br>
     * <br>&#64;cmp_func is called with two items of the &#64;seq, and &#64;cmp_data.
     * <br>It should return 0 if the items are equal, a negative value
     * <br>if the first item comes before the second, and a positive value
     * <br>if the second item comes before the first.
     * <br>
     * <br>Note that when adding a large amount of data to a &#35;GSequence,
     * <br>it is more efficient to do unsorted insertions and then call
     * <br>g_sequence_sort() or g_sequence_sort_iter().
     * @param data the data to insert
     * @param cmp_func the function used to compare items in the sequence
     * @param cmp_data user data passed to &#64;cmp_func.
     * @return a &#35;GSequenceIter pointing to the new item.
    */
    public SequenceIter insertSorted(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_insert_sorted(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "insertSorted", cmp_func), asCPointer(cmp_data))));
    }

    /**
     * Like g_sequence_insert_sorted(), but uses
     * <br>a &#35;GSequenceIterCompareFunc instead of a &#35;GCompareDataFunc as
     * <br>the compare function.
     * <br>
     * <br>&#64;iter_cmp is called with two iterators pointing into &#64;seq.
     * <br>It should return 0 if the iterators are equal, a negative
     * <br>value if the first iterator comes before the second, and a
     * <br>positive value if the second iterator comes before the first.
     * <br>
     * <br>Note that when adding a large amount of data to a &#35;GSequence,
     * <br>it is more efficient to do unsorted insertions and then call
     * <br>g_sequence_sort() or g_sequence_sort_iter().
     * @param data data for the new item
     * @param iter_cmp the function used to compare iterators in the sequence
     * @param cmp_data user data passed to &#64;iter_cmp
     * @return a &#35;GSequenceIter pointing to the new item
    */
    public SequenceIter insertSortedIter(@Nullable ch.bailu.gtk.type.Pointer data, OnSequenceIterCompareFunc iter_cmp, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_insert_sorted_iter(asCPointer(), asCPointer(data), toOnSequenceIterCompareFunc(this, "insertSortedIter", iter_cmp), asCPointer(cmp_data))));
    }

    /**
     * Returns %TRUE if the sequence contains zero items.
     * <br>
     * <br>This function is functionally identical to checking the result of
     * <br>g_sequence_get_length() being equal to zero. However this function is
     * <br>implemented in O(1) running time.
     * @return %TRUE if the sequence is empty, otherwise %FALSE.
    */
    public boolean isEmpty()  {
        return JnaSequence.INST().g_sequence_is_empty(asCPointer());
    }

    /**
     * Returns an iterator pointing to the position of the first item found
     * <br>equal to &#64;data according to &#64;cmp_func and &#64;cmp_data. If more than one
     * <br>item is equal, it is not guaranteed that it is the first which is
     * <br>returned. In that case, you can use g_sequence_iter_next() and
     * <br>g_sequence_iter_prev() to get others.
     * <br>
     * <br>&#64;cmp_func is called with two items of the &#64;seq, and &#64;cmp_data.
     * <br>It should return 0 if the items are equal, a negative value if
     * <br>the first item comes before the second, and a positive value if
     * <br>the second item comes before the first.
     * <br>
     * <br>This function will fail if the data contained in the sequence is
     * <br>unsorted.
     * @param data data to look up
     * @param cmp_func the function used to compare items in the sequence
     * @param cmp_data user data passed to &#64;cmp_func
     * @return an &#35;GSequenceIter pointing to the position of the     first item found equal to &#64;data according to &#64;cmp_func and     &#64;cmp_data, or %NULL if no such item exists
    */
    public SequenceIter lookup(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_lookup(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "lookup", cmp_func), asCPointer(cmp_data))));
    }

    /**
     * Like g_sequence_lookup(), but uses a &#35;GSequenceIterCompareFunc
     * <br>instead of a &#35;GCompareDataFunc as the compare function.
     * <br>
     * <br>&#64;iter_cmp is called with two iterators pointing into &#64;seq.
     * <br>It should return 0 if the iterators are equal, a negative value
     * <br>if the first iterator comes before the second, and a positive
     * <br>value if the second iterator comes before the first.
     * <br>
     * <br>This function will fail if the data contained in the sequence is
     * <br>unsorted.
     * @param data data to look up
     * @param iter_cmp the function used to compare iterators in the sequence
     * @param cmp_data user data passed to &#64;iter_cmp
     * @return an &#35;GSequenceIter pointing to the position of     the first item found equal to &#64;data according to &#64;iter_cmp     and &#64;cmp_data, or %NULL if no such item exists
    */
    public SequenceIter lookupIter(@Nullable ch.bailu.gtk.type.Pointer data, OnSequenceIterCompareFunc iter_cmp, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_lookup_iter(asCPointer(), asCPointer(data), toOnSequenceIterCompareFunc(this, "lookupIter", iter_cmp), asCPointer(cmp_data))));
    }

    /**
     * Adds a new item to the front of &#64;seq
     * @param data the data for the new item
     * @return an iterator pointing to the new item
    */
    public SequenceIter prepend(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_prepend(asCPointer(), asCPointer(data))));
    }

    /**
     * Returns an iterator pointing to the position where &#64;data would
     * <br>be inserted according to &#64;cmp_func and &#64;cmp_data.
     * <br>
     * <br>&#64;cmp_func is called with two items of the &#64;seq, and &#64;cmp_data.
     * <br>It should return 0 if the items are equal, a negative value if
     * <br>the first item comes before the second, and a positive value if
     * <br>the second item comes before the first.
     * <br>
     * <br>If you are simply searching for an existing element of the sequence,
     * <br>consider using g_sequence_lookup().
     * <br>
     * <br>This function will fail if the data contained in the sequence is
     * <br>unsorted.
     * @param data data for the new item
     * @param cmp_func the function used to compare items in the sequence
     * @param cmp_data user data passed to &#64;cmp_func
     * @return an &#35;GSequenceIter pointing to the position where &#64;data     would have been inserted according to &#64;cmp_func and &#64;cmp_data
    */
    public SequenceIter search(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_search(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "search", cmp_func), asCPointer(cmp_data))));
    }

    /**
     * Like g_sequence_search(), but uses a &#35;GSequenceIterCompareFunc
     * <br>instead of a &#35;GCompareDataFunc as the compare function.
     * <br>
     * <br>&#64;iter_cmp is called with two iterators pointing into &#64;seq.
     * <br>It should return 0 if the iterators are equal, a negative value
     * <br>if the first iterator comes before the second, and a positive
     * <br>value if the second iterator comes before the first.
     * <br>
     * <br>If you are simply searching for an existing element of the sequence,
     * <br>consider using g_sequence_lookup_iter().
     * <br>
     * <br>This function will fail if the data contained in the sequence is
     * <br>unsorted.
     * @param data data for the new item
     * @param iter_cmp the function used to compare iterators in the sequence
     * @param cmp_data user data passed to &#64;iter_cmp
     * @return a &#35;GSequenceIter pointing to the position in &#64;seq     where &#64;data would have been inserted according to &#64;iter_cmp     and &#64;cmp_data
    */
    public SequenceIter searchIter(@Nullable ch.bailu.gtk.type.Pointer data, OnSequenceIterCompareFunc iter_cmp, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_search_iter(asCPointer(), asCPointer(data), toOnSequenceIterCompareFunc(this, "searchIter", iter_cmp), asCPointer(cmp_data))));
    }

    /**
     * Sorts &#64;seq using &#64;cmp_func.
     * <br>
     * <br>&#64;cmp_func is passed two items of &#64;seq and should
     * <br>return 0 if they are equal, a negative value if the
     * <br>first comes before the second, and a positive value
     * <br>if the second comes before the first.
     * @param cmp_func the function used to sort the sequence
     * @param cmp_data user data passed to &#64;cmp_func
    */
    public void sort(OnCompareDataFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        JnaSequence.INST().g_sequence_sort(asCPointer(), toOnCompareDataFunc(this, "sort", cmp_func), asCPointer(cmp_data));
    }

    /**
     * Like g_sequence_sort(), but uses a &#35;GSequenceIterCompareFunc instead
     * <br>of a &#35;GCompareDataFunc as the compare function
     * <br>
     * <br>&#64;cmp_func is called with two iterators pointing into &#64;seq. It should
     * <br>return 0 if the iterators are equal, a negative value if the first
     * <br>iterator comes before the second, and a positive value if the second
     * <br>iterator comes before the first.
     * @param cmp_func the function used to compare iterators in the sequence
     * @param cmp_data user data passed to &#64;cmp_func
    */
    public void sortIter(OnSequenceIterCompareFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        JnaSequence.INST().g_sequence_sort_iter(asCPointer(), toOnSequenceIterCompareFunc(this, "sortIter", cmp_func), asCPointer(cmp_data));
    }

    /**
     * Calls &#64;func for each item in the range (&#64;begin, &#64;end) passing
     * <br>&#64;user_data to the function. &#64;func must not modify the sequence
     * <br>itself.
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
     * @param func a &#35;GFunc
     * @param user_data user data passed to &#64;func
    */
    public static void foreachRange(@Nonnull SequenceIter begin, @Nonnull SequenceIter end, OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSequence.INST().g_sequence_foreach_range(asCPointerNotNull(begin), asCPointerNotNull(end), toOnFunc(getClassHandler().getInstance(), "foreachRange", func), asCPointer(user_data));
    }

    /**
     * Returns the data that &#64;iter points to.
     * @param iter a &#35;GSequenceIter
     * @return the data that &#64;iter points to
    */
    public static ch.bailu.gtk.type.Pointer get(@Nonnull SequenceIter iter)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaSequence.INST().g_sequence_get(asCPointerNotNull(iter))));
    }

    /**
     * Inserts a new item just before the item pointed to by &#64;iter.
     * @param iter a &#35;GSequenceIter
     * @param data the data for the new item
     * @return an iterator pointing to the new item
    */
    public static SequenceIter insertBefore(@Nonnull SequenceIter iter, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_insert_before(asCPointerNotNull(iter), asCPointer(data))));
    }

    /**
     * Moves the item pointed to by &#64;src to the position indicated by &#64;dest.
     * <br>After calling this function &#64;dest will point to the position immediately
     * <br>after &#64;src. It is allowed for &#64;src and &#64;dest to point into different
     * <br>sequences.
     * @param src a &#35;GSequenceIter pointing to the item to move
     * @param dest a &#35;GSequenceIter pointing to the position to which     the item is moved
    */
    public static void move(@Nonnull SequenceIter src, @Nonnull SequenceIter dest)  {
        JnaSequence.INST().g_sequence_move(asCPointerNotNull(src), asCPointerNotNull(dest));
    }

    /**
     * Inserts the (&#64;begin, &#64;end) range at the destination pointed to by &#64;dest.
     * <br>The &#64;begin and &#64;end iters must point into the same sequence. It is
     * <br>allowed for &#64;dest to point to a different sequence than the one pointed
     * <br>into by &#64;begin and &#64;end.
     * <br>
     * <br>If &#64;dest is %NULL, the range indicated by &#64;begin and &#64;end is
     * <br>removed from the sequence. If &#64;dest points to a place within
     * <br>the (&#64;begin, &#64;end) range, the range does not move.
     * @param dest a &#35;GSequenceIter
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
    */
    public static void moveRange(@Nonnull SequenceIter dest, @Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        JnaSequence.INST().g_sequence_move_range(asCPointerNotNull(dest), asCPointerNotNull(begin), asCPointerNotNull(end));
    }

    /**
     * Creates a new GSequence. The &#64;data_destroy function, if non-%NULL will
     * <br>be called on all items when the sequence is destroyed and on items that
     * <br>are removed from the sequence.
     * @param data_destroy a &#35;GDestroyNotify function, or %NULL
     * @return a new &#35;GSequence
    */
    public static Sequence _new(OnDestroyNotify data_destroy)  {
        return new Sequence(new PointerContainer(JnaSequence.INST().g_sequence_new(toOnDestroyNotify(getClassHandler().getInstance(), "_new", data_destroy))));
    }

    /**
     * Finds an iterator somewhere in the range (&#64;begin, &#64;end). This
     * <br>iterator will be close to the middle of the range, but is not
     * <br>guaranteed to be exactly in the middle.
     * <br>
     * <br>The &#64;begin and &#64;end iterators must both point to the same sequence
     * <br>and &#64;begin must come before or be equal to &#64;end in the sequence.
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
     * @return a &#35;GSequenceIter pointing somewhere in the    (&#64;begin, &#64;end) range
    */
    public static SequenceIter rangeGetMidpoint(@Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        return new SequenceIter(new PointerContainer(JnaSequence.INST().g_sequence_range_get_midpoint(asCPointerNotNull(begin), asCPointerNotNull(end))));
    }

    /**
     * Removes the item pointed to by &#64;iter. It is an error to pass the
     * <br>end iterator to this function.
     * <br>
     * <br>If the sequence has a data destroy function associated with it, this
     * <br>function is called on the data for the removed item.
     * @param iter a &#35;GSequenceIter
    */
    public static void remove(@Nonnull SequenceIter iter)  {
        JnaSequence.INST().g_sequence_remove(asCPointerNotNull(iter));
    }

    /**
     * Removes all items in the (&#64;begin, &#64;end) range.
     * <br>
     * <br>If the sequence has a data destroy function associated with it, this
     * <br>function is called on the data for the removed items.
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
    */
    public static void removeRange(@Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        JnaSequence.INST().g_sequence_remove_range(asCPointerNotNull(begin), asCPointerNotNull(end));
    }

    /**
     * Changes the data for the item pointed to by &#64;iter to be &#64;data. If
     * <br>the sequence has a data destroy function associated with it, that
     * <br>function is called on the existing data that &#64;iter pointed to.
     * @param iter a &#35;GSequenceIter
     * @param data new data for the item
    */
    public static void set(@Nonnull SequenceIter iter, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSequence.INST().g_sequence_set(asCPointerNotNull(iter), asCPointer(data));
    }

    /**
     * Moves the data pointed to by &#64;iter to a new position as indicated by
     * <br>&#64;cmp_func. This
     * <br>function should be called for items in a sequence already sorted according
     * <br>to &#64;cmp_func whenever some aspect of an item changes so that &#64;cmp_func
     * <br>may return different values for that item.
     * <br>
     * <br>&#64;cmp_func is called with two items of the &#64;seq, and &#64;cmp_data.
     * <br>It should return 0 if the items are equal, a negative value if
     * <br>the first item comes before the second, and a positive value if
     * <br>the second item comes before the first.
     * @param iter A &#35;GSequenceIter
     * @param cmp_func the function used to compare items in the sequence
     * @param cmp_data user data passed to &#64;cmp_func.
    */
    public static void sortChanged(@Nonnull SequenceIter iter, OnCompareDataFunc cmp_func, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        JnaSequence.INST().g_sequence_sort_changed(asCPointerNotNull(iter), toOnCompareDataFunc(getClassHandler().getInstance(), "sortChanged", cmp_func), asCPointer(cmp_data));
    }

    /**
     * Like g_sequence_sort_changed(), but uses
     * <br>a &#35;GSequenceIterCompareFunc instead of a &#35;GCompareDataFunc as
     * <br>the compare function.
     * <br>
     * <br>&#64;iter_cmp is called with two iterators pointing into the &#35;GSequence that
     * <br>&#64;iter points into. It should
     * <br>return 0 if the iterators are equal, a negative value if the first
     * <br>iterator comes before the second, and a positive value if the second
     * <br>iterator comes before the first.
     * @param iter a &#35;GSequenceIter
     * @param iter_cmp the function used to compare iterators in the sequence
     * @param cmp_data user data passed to &#64;cmp_func
    */
    public static void sortChangedIter(@Nonnull SequenceIter iter, OnSequenceIterCompareFunc iter_cmp, @Nullable ch.bailu.gtk.type.Pointer cmp_data)  {
        JnaSequence.INST().g_sequence_sort_changed_iter(asCPointerNotNull(iter), toOnSequenceIterCompareFunc(getClassHandler().getInstance(), "sortChangedIter", iter_cmp), asCPointer(cmp_data));
    }

    /**
     * Swaps the items pointed to by &#64;a and &#64;b. It is allowed for &#64;a and &#64;b
     * <br>to point into difference sequences.
     * @param a a &#35;GSequenceIter
     * @param b a &#35;GSequenceIter
    */
    public static void swap(@Nonnull SequenceIter a, @Nonnull SequenceIter b)  {
        JnaSequence.INST().g_sequence_swap(asCPointerNotNull(a), asCPointerNotNull(b));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
