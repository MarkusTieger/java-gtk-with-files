/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GHookList struct represents a list of hook functions.
 * <p><a href="https://docs.gtk.org/glib/struct.HookList.html">https://docs.gtk.org/glib/struct.HookList.html</a></p>
*/
public class HookList extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HookList.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHookMarshaller {
        /**
         * Defines the type of function used by g_hook_list_marshal().
         * @param hook a &#35;GHook
         * @param user_data user data
        */
        void onHookMarshaller(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Hook hook, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaHookList.OnHookMarshaller toOnHookMarshaller(ch.bailu.gtk.type.Pointer instance, String methodName, OnHookMarshaller in) {
        JnaHookList.OnHookMarshaller out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_hook, _user_data) -> in.onHookMarshaller(__callback, new Hook(new PointerContainer(_hook)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHookCheckMarshaller {
        /**
         * Defines the type of function used by g_hook_list_marshal_check().
         * @param hook a &#35;GHook
         * @param user_data user data
         * @return %FALSE if &#64;hook should be destroyed
        */
        boolean onHookCheckMarshaller(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Hook hook, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaHookList.OnHookCheckMarshaller toOnHookCheckMarshaller(ch.bailu.gtk.type.Pointer instance, String methodName, OnHookCheckMarshaller in) {
        JnaHookList.OnHookCheckMarshaller out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_hook, _user_data) -> in.onHookCheckMarshaller(__callback, new Hook(new PointerContainer(_hook)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHookFinalizeFunc {
        /**
         * Defines the type of function to be called when a hook in a
         * <br>list of hooks gets finalized.
         * @param hook_list a &#35;GHookList
         * @param hook the hook in &#64;hook_list that gets finalized
        */
        void onHookFinalizeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull HookList hook_list, @Nonnull Hook hook);
    }
    
    private static JnaHookList.OnHookFinalizeFunc toOnHookFinalizeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHookFinalizeFunc in) {
        JnaHookList.OnHookFinalizeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_hook_list, _hook) -> in.onHookFinalizeFunc(__callback, new HookList(new PointerContainer(_hook_list)), new Hook(new PointerContainer(_hook)));
            __callback.register(out);
        }
        return out;
    }

    public HookList(PointerContainer pointer) {
        super(pointer);
    }

    private JnaHookList.Fields _fields;
    
    JnaHookList.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaHookList.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the next free &#35;GHook id
    */
    public static final String SEQ_ID = "seq_id";

    /**
     * the next free &#35;GHook id
    */
    public void setFieldSeqId(long seq_id) {
        toFields().seq_id = seq_id;
        toFields().writeField(SEQ_ID);
    }

    /**
     * the next free &#35;GHook id
    */
    public long getFieldSeqId() {
       toFields().readField(SEQ_ID);
       return toFields().seq_id;
    } 

    /**
     * the size of the &#35;GHookList elements, in bytes
    */
    public static final String HOOK_SIZE = "hook_size";

    /**
     * the size of the &#35;GHookList elements, in bytes
    */
    public void setFieldHookSize(int hook_size) {
        toFields().hook_size = hook_size;
        toFields().writeField(HOOK_SIZE);
    }

    /**
     * the size of the &#35;GHookList elements, in bytes
    */
    public int getFieldHookSize() {
       toFields().readField(HOOK_SIZE);
       return toFields().hook_size;
    } 

    /**
     * 1 if the &#35;GHookList has been initialized
    */
    public static final String IS_SETUP = "is_setup";

    /**
     * 1 if the &#35;GHookList has been initialized
    */
    public void setFieldIsSetup(int is_setup) {
        toFields().is_setup = is_setup;
        toFields().writeField(IS_SETUP);
    }

    /**
     * 1 if the &#35;GHookList has been initialized
    */
    public int getFieldIsSetup() {
       toFields().readField(IS_SETUP);
       return toFields().is_setup;
    } 

    /**
     * the first &#35;GHook element in the list
    */
    public static final String HOOKS = "hooks";

    /**
     * the first &#35;GHook element in the list
    */
    public void setFieldHooks(Hook hooks) {
        toFields().hooks = hooks.asCPointer();
        toFields().writeField(HOOKS);
    }

    /**
     * the first &#35;GHook element in the list
    */
    public Hook getFieldHooks() {
       toFields().readField(HOOKS);
       return new Hook(new PointerContainer(toFields().hooks));
    } 

    /**
     * unused
    */
    public static final String DUMMY3 = "dummy3";

    /**
     * unused
    */
    public void setFieldDummy3(ch.bailu.gtk.type.Pointer dummy3) {
        toFields().dummy3 = dummy3.asCPointer();
        toFields().writeField(DUMMY3);
    }

    /**
     * unused
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy3() {
       toFields().readField(DUMMY3);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy3));
    } 

    /**
     * the function to call to finalize a &#35;GHook element.
     * <br>    The default behaviour is to call the hooks &#64;destroy function
     * <br>See {@link OnHookFinalizeFunc#onHookFinalizeFunc}
    */
    public static final String FINALIZE_HOOK = "finalize_hook";

    /**
     * the function to call to finalize a &#35;GHook element.
     * <br>    The default behaviour is to call the hooks &#64;destroy function
     * <br>See {@link OnHookFinalizeFunc#onHookFinalizeFunc}
    */
    public void setFieldFinalizeHook(OnHookFinalizeFunc finalize_hook) {
        toFields().finalize_hook = toOnHookFinalizeFunc(this, FINALIZE_HOOK, finalize_hook);
        toFields().writeField(FINALIZE_HOOK);
    }

    /**
     * the function to call to finalize a &#35;GHook element.
     * <br>    The default behaviour is to call the hooks &#64;destroy function
     * <br>See {@link OnHookFinalizeFunc#onHookFinalizeFunc}
    */
    public JnaHookList.OnHookFinalizeFunc getFieldFinalizeHook() {
       toFields().readField(FINALIZE_HOOK);
       return toFields().finalize_hook;
    } 

    /**
     * Removes all the &#35;GHook elements from a &#35;GHookList.
    */
    public void clear()  {
        JnaHookList.INST().g_hook_list_clear(asCPointer());
    }

    /**
     * Initializes a &#35;GHookList.
     * <br>This must be called before the &#35;GHookList is used.
     * @param hook_size the size of each element in the &#35;GHookList,     typically `sizeof (GHook)`.
    */
    public void init(int hook_size)  {
        JnaHookList.INST().g_hook_list_init(asCPointer(), hook_size);
    }

    /**
     * Calls all of the &#35;GHook functions in a &#35;GHookList.
     * @param may_recurse %TRUE if functions which are already running     (e.g. in another thread) can be called. If set to %FALSE,     these are skipped
    */
    public void invoke(boolean may_recurse)  {
        JnaHookList.INST().g_hook_list_invoke(asCPointer(), may_recurse);
    }

    /**
     * Calls all of the &#35;GHook functions in a &#35;GHookList.
     * <br>Any function which returns %FALSE is removed from the &#35;GHookList.
     * @param may_recurse %TRUE if functions which are already running     (e.g. in another thread) can be called. If set to %FALSE,     these are skipped
    */
    public void invokeCheck(boolean may_recurse)  {
        JnaHookList.INST().g_hook_list_invoke_check(asCPointer(), may_recurse);
    }

    /**
     * Calls a function on each valid &#35;GHook.
     * @param may_recurse %TRUE if hooks which are currently running     (e.g. in another thread) are considered valid. If set to %FALSE,     these are skipped
     * @param marshaller the function to call for each &#35;GHook
     * @param marshal_data data to pass to &#64;marshaller
    */
    public void marshal(boolean may_recurse, OnHookMarshaller marshaller, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaHookList.INST().g_hook_list_marshal(asCPointer(), may_recurse, toOnHookMarshaller(this, "marshal", marshaller), asCPointer(marshal_data));
    }

    /**
     * Calls a function on each valid &#35;GHook and destroys it if the
     * <br>function returns %FALSE.
     * @param may_recurse %TRUE if hooks which are currently running     (e.g. in another thread) are considered valid. If set to %FALSE,     these are skipped
     * @param marshaller the function to call for each &#35;GHook
     * @param marshal_data data to pass to &#64;marshaller
    */
    public void marshalCheck(boolean may_recurse, OnHookCheckMarshaller marshaller, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaHookList.INST().g_hook_list_marshal_check(asCPointer(), may_recurse, toOnHookCheckMarshaller(this, "marshalCheck", marshaller), asCPointer(marshal_data));
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:dummy:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
