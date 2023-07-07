/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An [class&#64;AnimationTarget] that calls a given callback during the
 * <br>animation.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CallbackAnimationTarget.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CallbackAnimationTarget.html</a></p>
*/
public class CallbackAnimationTarget extends AnimationTarget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CallbackAnimationTarget.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAnimationTargetFunc {
        /**
         * Prototype for animation targets based on user callbacks.
         * @param value The animation value
         * @param user_data The user data provided when creating the target
        */
        void onAnimationTargetFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, double value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaCallbackAnimationTarget.OnAnimationTargetFunc toOnAnimationTargetFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnAnimationTargetFunc in) {
        JnaCallbackAnimationTarget.OnAnimationTargetFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value, _user_data) -> in.onAnimationTargetFunc(__callback, _value, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaCallbackAnimationTarget.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCallbackAnimationTarget.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public CallbackAnimationTarget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwAnimationTarget` that calls the given &#64;callback during
     * <br>the animation.
     * @param callback the callback to call
     * @param user_data the data to be passed to &#64;callback
     * @param destroy the function to be called when the   callback action is finalized
    */
    public CallbackAnimationTarget(OnAnimationTargetFunc callback, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy) {
        super(cast(JnaCallbackAnimationTarget.INST().adw_callback_animation_target_new(toOnAnimationTargetFunc(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy))));
    }

    public static long getTypeID() { 
        return JnaCallbackAnimationTarget.INST().adw_callback_animation_target_get_type(); 
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
