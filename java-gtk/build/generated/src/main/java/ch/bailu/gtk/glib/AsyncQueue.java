/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque data structure which represents an asynchronous queue.
 * <br>
 * <br>It should only be accessed through the `g_async_queue_*` functions.
 * <p><a href="https://docs.gtk.org/glib/struct.AsyncQueue.html">https://docs.gtk.org/glib/struct.AsyncQueue.html</a></p>
*/
class AsyncQueue extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AsyncQueue.class.getCanonicalName());
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
    
    private static JnaAsyncQueue.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaAsyncQueue.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaAsyncQueue.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaAsyncQueue.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public AsyncQueue(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the length of the queue.
     * <br>
     * <br>Actually this function returns the number of data items in
     * <br>the queue minus the number of waiting threads, so a negative
     * <br>value means waiting threads, and a positive value means available
     * <br>entries in the &#64;queue. A return value of 0 could mean n entries
     * <br>in the queue and n threads waiting. This can happen due to locking
     * <br>of the queue or due to scheduling.
     * @return the length of the &#64;queue
    */
    public int length()  {
        return JnaAsyncQueue.INST().g_async_queue_length(asCPointer());
    }

    /**
     * Returns the length of the queue.
     * <br>
     * <br>Actually this function returns the number of data items in
     * <br>the queue minus the number of waiting threads, so a negative
     * <br>value means waiting threads, and a positive value means available
     * <br>entries in the &#64;queue. A return value of 0 could mean n entries
     * <br>in the queue and n threads waiting. This can happen due to locking
     * <br>of the queue or due to scheduling.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @return the length of the &#64;queue.
    */
    public int lengthUnlocked()  {
        return JnaAsyncQueue.INST().g_async_queue_length_unlocked(asCPointer());
    }

    /**
     * Acquires the &#64;queue's lock. If another thread is already
     * <br>holding the lock, this call will block until the lock
     * <br>becomes available.
     * <br>
     * <br>Call g_async_queue_unlock() to drop the lock again.
     * <br>
     * <br>While holding the lock, you can only call the
     * <br>g_async_queue_*_unlocked() functions on &#64;queue. Otherwise,
     * <br>deadlock may occur.
    */
    public void lock()  {
        JnaAsyncQueue.INST().g_async_queue_lock(asCPointer());
    }

    /**
     * Pops data from the &#64;queue. If &#64;queue is empty, this function
     * <br>blocks until data becomes available.
     * @return data from the queue
    */
    public ch.bailu.gtk.type.Pointer pop()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_pop(asCPointer())));
    }

    /**
     * Pops data from the &#64;queue. If &#64;queue is empty, this function
     * <br>blocks until data becomes available.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @return data from the queue.
    */
    public ch.bailu.gtk.type.Pointer popUnlocked()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_pop_unlocked(asCPointer())));
    }

    /**
     * Pushes the &#64;data into the &#64;queue. &#64;data must not be %NULL.
     * @param data &#64;data to push into the &#64;queue
    */
    public void push(@Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaAsyncQueue.INST().g_async_queue_push(asCPointer(), asCPointer(data));
    }

    /**
     * Pushes the &#64;item into the &#64;queue. &#64;item must not be %NULL.
     * <br>In contrast to g_async_queue_push(), this function
     * <br>pushes the new item ahead of the items already in the queue,
     * <br>so that it will be the next one to be popped off the queue.
     * @param item data to push into the &#64;queue
    */
    public void pushFront(@Nullable ch.bailu.gtk.type.Pointer item)  {
        JnaAsyncQueue.INST().g_async_queue_push_front(asCPointer(), asCPointer(item));
    }

    /**
     * Pushes the &#64;item into the &#64;queue. &#64;item must not be %NULL.
     * <br>In contrast to g_async_queue_push_unlocked(), this function
     * <br>pushes the new item ahead of the items already in the queue,
     * <br>so that it will be the next one to be popped off the queue.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @param item data to push into the &#64;queue
    */
    public void pushFrontUnlocked(@Nullable ch.bailu.gtk.type.Pointer item)  {
        JnaAsyncQueue.INST().g_async_queue_push_front_unlocked(asCPointer(), asCPointer(item));
    }

    /**
     * Inserts &#64;data into &#64;queue using &#64;func to determine the new
     * <br>position.
     * <br>
     * <br>This function requires that the &#64;queue is sorted before pushing on
     * <br>new elements, see g_async_queue_sort().
     * <br>
     * <br>This function will lock &#64;queue before it sorts the queue and unlock
     * <br>it when it is finished.
     * <br>
     * <br>For an example of &#64;func see g_async_queue_sort().
     * @param data the &#64;data to push into the &#64;queue
     * @param func the &#35;GCompareDataFunc is used to sort &#64;queue
     * @param user_data user data passed to &#64;func.
    */
    public void pushSorted(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAsyncQueue.INST().g_async_queue_push_sorted(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "pushSorted", func), asCPointer(user_data));
    }

    /**
     * Inserts &#64;data into &#64;queue using &#64;func to determine the new
     * <br>position.
     * <br>
     * <br>The sort function &#64;func is passed two elements of the &#64;queue.
     * <br>It should return 0 if they are equal, a negative value if the
     * <br>first element should be higher in the &#64;queue or a positive value
     * <br>if the first element should be lower in the &#64;queue than the second
     * <br>element.
     * <br>
     * <br>This function requires that the &#64;queue is sorted before pushing on
     * <br>new elements, see g_async_queue_sort().
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * <br>
     * <br>For an example of &#64;func see g_async_queue_sort().
     * @param data the &#64;data to push into the &#64;queue
     * @param func the &#35;GCompareDataFunc is used to sort &#64;queue
     * @param user_data user data passed to &#64;func.
    */
    public void pushSortedUnlocked(@Nullable ch.bailu.gtk.type.Pointer data, OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAsyncQueue.INST().g_async_queue_push_sorted_unlocked(asCPointer(), asCPointer(data), toOnCompareDataFunc(this, "pushSortedUnlocked", func), asCPointer(user_data));
    }

    /**
     * Pushes the &#64;data into the &#64;queue. &#64;data must not be %NULL.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @param data &#64;data to push into the &#64;queue
    */
    public void pushUnlocked(@Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaAsyncQueue.INST().g_async_queue_push_unlocked(asCPointer(), asCPointer(data));
    }

    /**
     * Increases the reference count of the asynchronous &#64;queue by 1.
     * <br>You do not need to hold the lock to call this function.
     * @return the &#64;queue that was passed in (since 2.6)
    */
    public AsyncQueue ref()  {
        return new AsyncQueue(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_ref(asCPointer())));
    }

    /**
     * Remove an item from the queue.
     * @param item the data to remove from the &#64;queue
     * @return %TRUE if the item was removed
    */
    public boolean remove(@Nullable ch.bailu.gtk.type.Pointer item)  {
        return JnaAsyncQueue.INST().g_async_queue_remove(asCPointer(), asCPointer(item));
    }

    /**
     * Remove an item from the queue.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @param item the data to remove from the &#64;queue
     * @return %TRUE if the item was removed
    */
    public boolean removeUnlocked(@Nullable ch.bailu.gtk.type.Pointer item)  {
        return JnaAsyncQueue.INST().g_async_queue_remove_unlocked(asCPointer(), asCPointer(item));
    }

    /**
     * Sorts &#64;queue using &#64;func.
     * <br>
     * <br>The sort function &#64;func is passed two elements of the &#64;queue.
     * <br>It should return 0 if they are equal, a negative value if the
     * <br>first element should be higher in the &#64;queue or a positive value
     * <br>if the first element should be lower in the &#64;queue than the second
     * <br>element.
     * <br>
     * <br>This function will lock &#64;queue before it sorts the queue and unlock
     * <br>it when it is finished.
     * <br>
     * <br>If you were sorting a list of priority numbers to make sure the
     * <br>lowest priority would be at the top of the queue, you could use:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  gint32 id1;
     *  gint32 id2;
     * 
     *  id1 = GPOINTER_TO_INT (element1);
     *  id2 = GPOINTER_TO_INT (element2);
     * 
     *  return (id1 &gt; id2 ? +1 : id1 == id2 ? 0 : -1);
     * </pre>
     * @param func the &#35;GCompareDataFunc is used to sort &#64;queue
     * @param user_data user data passed to &#64;func
    */
    public void sort(OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAsyncQueue.INST().g_async_queue_sort(asCPointer(), toOnCompareDataFunc(this, "sort", func), asCPointer(user_data));
    }

    /**
     * Sorts &#64;queue using &#64;func.
     * <br>
     * <br>The sort function &#64;func is passed two elements of the &#64;queue.
     * <br>It should return 0 if they are equal, a negative value if the
     * <br>first element should be higher in the &#64;queue or a positive value
     * <br>if the first element should be lower in the &#64;queue than the second
     * <br>element.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @param func the &#35;GCompareDataFunc is used to sort &#64;queue
     * @param user_data user data passed to &#64;func
    */
    public void sortUnlocked(OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAsyncQueue.INST().g_async_queue_sort_unlocked(asCPointer(), toOnCompareDataFunc(this, "sortUnlocked", func), asCPointer(user_data));
    }

    /**
     * Pops data from the &#64;queue. If the queue is empty, blocks for
     * <br>&#64;timeout microseconds, or until data becomes available.
     * <br>
     * <br>If no data is received before the timeout, %NULL is returned.
     * @param timeout the number of microseconds to wait
     * @return data from the queue or %NULL, when no data is     received before the timeout.
    */
    public ch.bailu.gtk.type.Pointer timeoutPop(long timeout)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_timeout_pop(asCPointer(), timeout)));
    }

    /**
     * Pops data from the &#64;queue. If the queue is empty, blocks for
     * <br>&#64;timeout microseconds, or until data becomes available.
     * <br>
     * <br>If no data is received before the timeout, %NULL is returned.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @param timeout the number of microseconds to wait
     * @return data from the queue or %NULL, when no data is     received before the timeout.
    */
    public ch.bailu.gtk.type.Pointer timeoutPopUnlocked(long timeout)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_timeout_pop_unlocked(asCPointer(), timeout)));
    }

    /**
     * Tries to pop data from the &#64;queue. If no data is available,
     * <br>%NULL is returned.
     * @return data from the queue or %NULL, when no data is     available immediately.
    */
    public ch.bailu.gtk.type.Pointer tryPop()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_try_pop(asCPointer())));
    }

    /**
     * Tries to pop data from the &#64;queue. If no data is available,
     * <br>%NULL is returned.
     * <br>
     * <br>This function must be called while holding the &#64;queue's lock.
     * @return data from the queue or %NULL, when no data is     available immediately.
    */
    public ch.bailu.gtk.type.Pointer tryPopUnlocked()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_try_pop_unlocked(asCPointer())));
    }

    /**
     * Releases the queue's lock.
     * <br>
     * <br>Calling this function when you have not acquired
     * <br>the with g_async_queue_lock() leads to undefined
     * <br>behaviour.
    */
    public void unlock()  {
        JnaAsyncQueue.INST().g_async_queue_unlock(asCPointer());
    }

    /**
     * Decreases the reference count of the asynchronous &#64;queue by 1.
     * <br>
     * <br>If the reference count went to 0, the &#64;queue will be destroyed
     * <br>and the memory allocated will be freed. So you are not allowed
     * <br>to use the &#64;queue afterwards, as it might have disappeared.
     * <br>You do not need to hold the lock to call this function.
    */
    public void unref()  {
        JnaAsyncQueue.INST().g_async_queue_unref(asCPointer());
    }

    /**
     * Creates a new asynchronous queue.
     * @return a new &#35;GAsyncQueue. Free with g_async_queue_unref()
    */
    public static AsyncQueue _new()  {
        return new AsyncQueue(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_new()));
    }

    /**
     * Creates a new asynchronous queue and sets up a destroy notify
     * <br>function that is used to free any remaining queue items when
     * <br>the queue is destroyed after the final unref.
     * @param item_free_func function to free queue elements
     * @return a new &#35;GAsyncQueue. Free with g_async_queue_unref()
    */
    public static AsyncQueue newFull(OnDestroyNotify item_free_func)  {
        return new AsyncQueue(new PointerContainer(JnaAsyncQueue.INST().g_async_queue_new_full(toOnDestroyNotify(getClassHandler().getInstance(), "newFull", item_free_func))));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:cb-deprecated:refUnlocked:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:timedPop:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:cb-deprecated:timedPopUnlocked:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:cb-deprecated:unrefAndUnlock:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
