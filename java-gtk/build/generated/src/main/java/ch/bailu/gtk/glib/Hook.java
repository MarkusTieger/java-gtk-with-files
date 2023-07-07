/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GHook struct represents a single hook function in a &#35;GHookList.
 * <p><a href="https://docs.gtk.org/glib/struct.Hook.html">https://docs.gtk.org/glib/struct.Hook.html</a></p>
*/
public class Hook extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Hook.class.getCanonicalName());
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
    
    private static JnaHook.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaHook.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHookFindFunc {
        /**
         * Defines the type of the function passed to g_hook_find().
         * @param hook a &#35;GHook
         * @param user_data user data passed to g_hook_find_func()
         * @return %TRUE if the required &#35;GHook has been found
        */
        boolean onHookFindFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Hook hook, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaHook.OnHookFindFunc toOnHookFindFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHookFindFunc in) {
        JnaHook.OnHookFindFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_hook, _user_data) -> in.onHookFindFunc(__callback, new Hook(new PointerContainer(_hook)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHookCompareFunc {
        /**
         * Defines the type of function used to compare &#35;GHook elements in
         * <br>g_hook_insert_sorted().
         * @param new_hook the &#35;GHook being inserted
         * @param sibling the &#35;GHook to compare with &#64;new_hook
         * @return a value &lt;= 0 if &#64;new_hook should be before &#64;sibling
        */
        int onHookCompareFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Hook new_hook, @Nonnull Hook sibling);
    }
    
    private static JnaHook.OnHookCompareFunc toOnHookCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHookCompareFunc in) {
        JnaHook.OnHookCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_new_hook, _sibling) -> in.onHookCompareFunc(__callback, new Hook(new PointerContainer(_new_hook)), new Hook(new PointerContainer(_sibling)));
            __callback.register(out);
        }
        return out;
    }

    public Hook(PointerContainer pointer) {
        super(pointer);
    }

    public Hook() {
        super(cast(JnaHook.allocateStructure()));
    }

    private JnaHook.Fields _fields;
    
    JnaHook.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaHook.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * data which is passed to func when this hook is invoked
    */
    public static final String DATA = "data";

    /**
     * data which is passed to func when this hook is invoked
    */
    public void setFieldData(ch.bailu.gtk.type.Pointer data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * data which is passed to func when this hook is invoked
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * pointer to the next hook in the list
    */
    public static final String NEXT = "next";

    /**
     * pointer to the next hook in the list
    */
    public void setFieldNext(Hook next) {
        toFields().next = next.asCPointer();
        toFields().writeField(NEXT);
    }

    /**
     * pointer to the next hook in the list
    */
    public Hook getFieldNext() {
       toFields().readField(NEXT);
       return new Hook(new PointerContainer(toFields().next));
    } 

    /**
     * pointer to the previous hook in the list
    */
    public static final String PREV = "prev";

    /**
     * pointer to the previous hook in the list
    */
    public void setFieldPrev(Hook prev) {
        toFields().prev = prev.asCPointer();
        toFields().writeField(PREV);
    }

    /**
     * pointer to the previous hook in the list
    */
    public Hook getFieldPrev() {
       toFields().readField(PREV);
       return new Hook(new PointerContainer(toFields().prev));
    } 

    /**
     * the reference count of this hook
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * the reference count of this hook
    */
    public void setFieldRefCount(int ref_count) {
        toFields().ref_count = ref_count;
        toFields().writeField(REF_COUNT);
    }

    /**
     * the reference count of this hook
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * the id of this hook, which is unique within its list
    */
    public static final String HOOK_ID = "hook_id";

    /**
     * the id of this hook, which is unique within its list
    */
    public void setFieldHookId(long hook_id) {
        toFields().hook_id = hook_id;
        toFields().writeField(HOOK_ID);
    }

    /**
     * the id of this hook, which is unique within its list
    */
    public long getFieldHookId() {
       toFields().readField(HOOK_ID);
       return toFields().hook_id;
    } 

    /**
     * flags which are set for this hook. See &#35;GHookFlagMask for
     * <br>    predefined flags
    */
    public static final String FLAGS = "flags";

    /**
     * flags which are set for this hook. See &#35;GHookFlagMask for
     * <br>    predefined flags
    */
    public void setFieldFlags(int flags) {
        toFields().flags = flags;
        toFields().writeField(FLAGS);
    }

    /**
     * flags which are set for this hook. See &#35;GHookFlagMask for
     * <br>    predefined flags
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

    /**
     * the function to call when this hook is invoked. The possible
     * <br>    signatures for this function are &#35;GHookFunc and &#35;GHookCheckFunc
    */
    public static final String FUNC = "func";

    /**
     * the function to call when this hook is invoked. The possible
     * <br>    signatures for this function are &#35;GHookFunc and &#35;GHookCheckFunc
    */
    public void setFieldFunc(ch.bailu.gtk.type.Pointer func) {
        toFields().func = func.asCPointer();
        toFields().writeField(FUNC);
    }

    /**
     * the function to call when this hook is invoked. The possible
     * <br>    signatures for this function are &#35;GHookFunc and &#35;GHookCheckFunc
    */
    public ch.bailu.gtk.type.Pointer getFieldFunc() {
       toFields().readField(FUNC);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().func));
    } 

    /**
     * the default &#64;finalize_hook function of a &#35;GHookList calls
     * <br>    this member of the hook that is being finalized
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public static final String DESTROY = "destroy";

    /**
     * the default &#64;finalize_hook function of a &#35;GHookList calls
     * <br>    this member of the hook that is being finalized
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public void setFieldDestroy(OnDestroyNotify destroy) {
        toFields().destroy = toOnDestroyNotify(this, DESTROY, destroy);
        toFields().writeField(DESTROY);
    }

    /**
     * the default &#64;finalize_hook function of a &#35;GHookList calls
     * <br>    this member of the hook that is being finalized
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public JnaHook.OnDestroyNotify getFieldDestroy() {
       toFields().readField(DESTROY);
       return toFields().destroy;
    } 

    /**
     * Compares the ids of two &#35;GHook elements, returning a negative value
     * <br>if the second id is greater than the first.
     * @param sibling a &#35;GHook to compare with &#64;new_hook
     * @return a value &lt;= 0 if the id of &#64;sibling is &gt;= the id of &#64;new_hook
    */
    public int compareIds(@Nonnull Hook sibling)  {
        return JnaHook.INST().g_hook_compare_ids(asCPointer(), asCPointerNotNull(sibling));
    }

    /**
     * Allocates space for a &#35;GHook and initializes it.
     * @param hook_list a &#35;GHookList
     * @return a new &#35;GHook
    */
    public static Hook alloc(@Nonnull HookList hook_list)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_alloc(asCPointerNotNull(hook_list))));
    }

    /**
     * Destroys a &#35;GHook, given its ID.
     * @param hook_list a &#35;GHookList
     * @param hook_id a hook ID
     * @return %TRUE if the &#35;GHook was found in the &#35;GHookList and destroyed
    */
    public static boolean destroy(@Nonnull HookList hook_list, long hook_id)  {
        return JnaHook.INST().g_hook_destroy(asCPointerNotNull(hook_list), hook_id);
    }

    /**
     * Removes one &#35;GHook from a &#35;GHookList, marking it
     * <br>inactive and calling g_hook_unref() on it.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to remove
    */
    public static void destroyLink(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaHook.INST().g_hook_destroy_link(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Finds a &#35;GHook in a &#35;GHookList using the given function to
     * <br>test for a match.
     * @param hook_list a &#35;GHookList
     * @param need_valids %TRUE if &#35;GHook elements which have been destroyed     should be skipped
     * @param func the function to call for each &#35;GHook, which should return     %TRUE when the &#35;GHook has been found
     * @param data the data to pass to &#64;func
     * @return the found &#35;GHook or %NULL if no matching &#35;GHook is found
    */
    public static Hook find(@Nonnull HookList hook_list, boolean need_valids, OnHookFindFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_find(asCPointerNotNull(hook_list), need_valids, toOnHookFindFunc(getClassHandler().getInstance(), "find", func), asCPointer(data))));
    }

    /**
     * Finds a &#35;GHook in a &#35;GHookList with the given data.
     * @param hook_list a &#35;GHookList
     * @param need_valids %TRUE if &#35;GHook elements which have been destroyed     should be skipped
     * @param data the data to find
     * @return the &#35;GHook with the given &#64;data or %NULL if no matching     &#35;GHook is found
    */
    public static Hook findData(@Nonnull HookList hook_list, boolean need_valids, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_find_data(asCPointerNotNull(hook_list), need_valids, asCPointer(data))));
    }

    /**
     * Finds a &#35;GHook in a &#35;GHookList with the given function.
     * @param hook_list a &#35;GHookList
     * @param need_valids %TRUE if &#35;GHook elements which have been destroyed     should be skipped
     * @param func the function to find
     * @return the &#35;GHook with the given &#64;func or %NULL if no matching     &#35;GHook is found
    */
    public static Hook findFunc(@Nonnull HookList hook_list, boolean need_valids, @Nullable ch.bailu.gtk.type.Pointer func)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_find_func(asCPointerNotNull(hook_list), need_valids, asCPointer(func))));
    }

    /**
     * Finds a &#35;GHook in a &#35;GHookList with the given function and data.
     * @param hook_list a &#35;GHookList
     * @param need_valids %TRUE if &#35;GHook elements which have been destroyed     should be skipped
     * @param func the function to find
     * @param data the data to find
     * @return the &#35;GHook with the given &#64;func and &#64;data or %NULL if     no matching &#35;GHook is found
    */
    public static Hook findFuncData(@Nonnull HookList hook_list, boolean need_valids, @Nonnull ch.bailu.gtk.type.Pointer func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_find_func_data(asCPointerNotNull(hook_list), need_valids, asCPointerNotNull(func), asCPointer(data))));
    }

    /**
     * Returns the first &#35;GHook in a &#35;GHookList which has not been destroyed.
     * <br>The reference count for the &#35;GHook is incremented, so you must call
     * <br>g_hook_unref() to restore it when no longer needed. (Or call
     * <br>g_hook_next_valid() if you are stepping through the &#35;GHookList.)
     * @param hook_list a &#35;GHookList
     * @param may_be_in_call %TRUE if hooks which are currently running     (e.g. in another thread) are considered valid. If set to %FALSE,     these are skipped
     * @return the first valid &#35;GHook, or %NULL if none are valid
    */
    public static Hook firstValid(@Nonnull HookList hook_list, boolean may_be_in_call)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_first_valid(asCPointerNotNull(hook_list), may_be_in_call)));
    }

    /**
     * Calls the &#35;GHookList &#64;finalize_hook function if it exists,
     * <br>and frees the memory allocated for the &#35;GHook.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to free
    */
    public static void free(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaHook.INST().g_hook_free(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Returns the &#35;GHook with the given id, or %NULL if it is not found.
     * @param hook_list a &#35;GHookList
     * @param hook_id a hook id
     * @return the &#35;GHook with the given id, or %NULL if it is not found
    */
    public static Hook get(@Nonnull HookList hook_list, long hook_id)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_get(asCPointerNotNull(hook_list), hook_id)));
    }

    /**
     * Inserts a &#35;GHook into a &#35;GHookList, before a given &#35;GHook.
     * @param hook_list a &#35;GHookList
     * @param sibling the &#35;GHook to insert the new &#35;GHook before
     * @param hook the &#35;GHook to insert
    */
    public static void insertBefore(@Nonnull HookList hook_list, @Nullable Hook sibling, @Nonnull Hook hook)  {
        JnaHook.INST().g_hook_insert_before(asCPointerNotNull(hook_list), asCPointer(sibling), asCPointerNotNull(hook));
    }

    /**
     * Inserts a &#35;GHook into a &#35;GHookList, sorted by the given function.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to insert
     * @param func the comparison function used to sort the &#35;GHook elements
    */
    public static void insertSorted(@Nonnull HookList hook_list, @Nonnull Hook hook, OnHookCompareFunc func)  {
        JnaHook.INST().g_hook_insert_sorted(asCPointerNotNull(hook_list), asCPointerNotNull(hook), toOnHookCompareFunc(getClassHandler().getInstance(), "insertSorted", func));
    }

    /**
     * Returns the next &#35;GHook in a &#35;GHookList which has not been destroyed.
     * <br>The reference count for the &#35;GHook is incremented, so you must call
     * <br>g_hook_unref() to restore it when no longer needed. (Or continue to call
     * <br>g_hook_next_valid() until %NULL is returned.)
     * @param hook_list a &#35;GHookList
     * @param hook the current &#35;GHook
     * @param may_be_in_call %TRUE if hooks which are currently running     (e.g. in another thread) are considered valid. If set to %FALSE,     these are skipped
     * @return the next valid &#35;GHook, or %NULL if none are valid
    */
    public static Hook nextValid(@Nonnull HookList hook_list, @Nonnull Hook hook, boolean may_be_in_call)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_next_valid(asCPointerNotNull(hook_list), asCPointerNotNull(hook), may_be_in_call)));
    }

    /**
     * Prepends a &#35;GHook on the start of a &#35;GHookList.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to add to the start of &#64;hook_list
    */
    public static void prepend(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaHook.INST().g_hook_prepend(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Increments the reference count for a &#35;GHook.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to increment the reference count of
     * @return the &#64;hook that was passed in (since 2.6)
    */
    public static Hook ref(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        return new Hook(new PointerContainer(JnaHook.INST().g_hook_ref(asCPointerNotNull(hook_list), asCPointerNotNull(hook))));
    }

    /**
     * Decrements the reference count of a &#35;GHook.
     * <br>If the reference count falls to 0, the &#35;GHook is removed
     * <br>from the &#35;GHookList and g_hook_free() is called to free it.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to unref
    */
    public static void unref(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaHook.INST().g_hook_unref(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

}

/*
record-type
all-fields-supported
*/
