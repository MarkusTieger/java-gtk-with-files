/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutAction` that invokes a callback.
 * <p><a href="https://docs.gtk.org/gtk4/class.CallbackAction.html">https://docs.gtk.org/gtk4/class.CallbackAction.html</a></p>
*/
public class CallbackAction extends ShortcutAction {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CallbackAction.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnShortcutFunc {
        /**
         * Prototype for shortcuts based on user callbacks.
         * @param widget The widget passed to the activation
         * @param args The arguments passed to the activation
         * @param user_data The user data provided when activating the action
         * @return %TRUE if the action was successful.
        */
        boolean onShortcutFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nullable ch.bailu.gtk.glib.Variant args, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaCallbackAction.OnShortcutFunc toOnShortcutFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnShortcutFunc in) {
        JnaCallbackAction.OnShortcutFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _args, _user_data) -> in.onShortcutFunc(__callback, new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_args)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaCallbackAction.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCallbackAction.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public CallbackAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a custom action that calls the given &#64;callback when
     * <br>activated.
     * @param callback the callback to call
     * @param data the data to be passed to &#64;callback
     * @param destroy the function to be called when the   callback action is finalized
    */
    public CallbackAction(OnShortcutFunc callback, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy) {
        super(cast(JnaCallbackAction.INST().gtk_callback_action_new(toOnShortcutFunc(getClassHandler().getInstance(), "_new", callback), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy))));
    }

    public static long getTypeID() { 
        return JnaCallbackAction.INST().gtk_callback_action_get_type(); 
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
class-type
*/
