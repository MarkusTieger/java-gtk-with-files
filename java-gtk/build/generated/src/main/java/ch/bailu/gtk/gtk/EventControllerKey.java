/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEventControllerKey` is an event controller that provides access
 * <br>to key events.
 * <p><a href="https://docs.gtk.org/gtk4/class.EventControllerKey.html">https://docs.gtk.org/gtk4/class.EventControllerKey.html</a></p>
*/
public class EventControllerKey extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EventControllerKey.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnImUpdate {
        /**
         * Emitted whenever the input method context filters away
         * <br>a keypress and prevents the &#64;controller receiving it.
         * <br>
         * <br>See [method&#64;Gtk.EventControllerKey.set_im_context] and
         * <br>[method&#64;Gtk.IMContext.filter_keypress].
        */
        void onImUpdate();
    }
    
    private static com.sun.jna.Callback toOnImUpdate(OnImUpdate in) {
        return (in == null) ? null: (JnaEventControllerKey.OnImUpdate) (__self, __data) -> in.onImUpdate();
    }

    @FunctionalInterface
    public interface OnKeyPressed {
        /**
         * Emitted whenever a key is pressed.
         * @param keyval the pressed key.
         * @param keycode the raw code of the pressed key.
         * @param state the bitmask, representing the state of modifier keys and pointer buttons. See `GdkModifierType`.
         * @return %TRUE if the key press was handled, %FALSE otherwise.
        */
        boolean onKeyPressed(int keyval, int keycode, int state);
    }
    
    private static com.sun.jna.Callback toOnKeyPressed(OnKeyPressed in) {
        return (in == null) ? null: (JnaEventControllerKey.OnKeyPressed) (__self, _keyval, _keycode, _state, __data) -> in.onKeyPressed(_keyval, _keycode, _state);
    }

    @FunctionalInterface
    public interface OnKeyReleased {
        /**
         * Emitted whenever a key is released.
         * @param keyval the released key.
         * @param keycode the raw code of the released key.
         * @param state the bitmask, representing the state of modifier keys and pointer buttons. See `GdkModifierType`.
        */
        void onKeyReleased(int keyval, int keycode, int state);
    }
    
    private static com.sun.jna.Callback toOnKeyReleased(OnKeyReleased in) {
        return (in == null) ? null: (JnaEventControllerKey.OnKeyReleased) (__self, _keyval, _keycode, _state, __data) -> in.onKeyReleased(_keyval, _keycode, _state);
    }

    @FunctionalInterface
    public interface OnModifiers {
        /**
         * Emitted whenever the state of modifier keys and pointer buttons change.
         * @param keyval the released key.
         * @return 
        */
        boolean onModifiers(int keyval);
    }
    
    private static com.sun.jna.Callback toOnModifiers(OnModifiers in) {
        return (in == null) ? null: (JnaEventControllerKey.OnModifiers) (__self, _keyval, __data) -> in.onModifiers(_keyval);
    }

    public EventControllerKey(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new event controller that will handle key events.
    */
    public EventControllerKey() {
        super(cast(JnaEventControllerKey.INST().gtk_event_controller_key_new()));
    }

    /**
     * Forwards the current event of this &#64;controller to a &#64;widget.
     * <br>
     * <br>This function can only be used in handlers for the
     * <br>[signal&#64;Gtk.EventControllerKey::key-pressed],
     * <br>[signal&#64;Gtk.EventControllerKey::key-released]
     * <br>or [signal&#64;Gtk.EventControllerKey::modifiers] signals.
     * @param widget a `GtkWidget`
     * @return whether the &#64;widget handled the event
    */
    public boolean forward(@Nonnull Widget widget)  {
        return JnaEventControllerKey.INST().gtk_event_controller_key_forward(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets the key group of the current event of this &#64;controller.
     * <br>
     * <br>See [method&#64;Gdk.KeyEvent.get_layout].
     * @return the key group
    */
    public int getGroup()  {
        return JnaEventControllerKey.INST().gtk_event_controller_key_get_group(asCPointer());
    }

    /**
     * Gets the input method context of the key &#64;controller.
     * @return the `GtkIMContext`
    */
    public IMContext getImContext()  {
        return new IMContext(new PointerContainer(JnaEventControllerKey.INST().gtk_event_controller_key_get_im_context(asCPointer())));
    }

    /**
     * Sets the input method context of the key &#64;controller.
     * @param im_context a `GtkIMContext`
    */
    public void setImContext(@Nullable IMContext im_context)  {
        JnaEventControllerKey.INST().gtk_event_controller_key_set_im_context(asCPointer(), asCPointer(im_context));
    }

    public final static String SIGNAL_ON_IM_UPDATE = "im-update";
    
    /**
     * Connect to signal "im-update".
     * <br>See {@link OnImUpdate#onImUpdate} for signal description.
     * <br>Field {@link #SIGNAL_ON_IM_UPDATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onImUpdate(OnImUpdate signal) {
        return connectSignal(SIGNAL_ON_IM_UPDATE, toOnImUpdate(signal));
    }

    public final static String SIGNAL_ON_KEY_PRESSED = "key-pressed";
    
    /**
     * Connect to signal "key-pressed".
     * <br>See {@link OnKeyPressed#onKeyPressed} for signal description.
     * <br>Field {@link #SIGNAL_ON_KEY_PRESSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onKeyPressed(OnKeyPressed signal) {
        return connectSignal(SIGNAL_ON_KEY_PRESSED, toOnKeyPressed(signal));
    }

    public final static String SIGNAL_ON_KEY_RELEASED = "key-released";
    
    /**
     * Connect to signal "key-released".
     * <br>See {@link OnKeyReleased#onKeyReleased} for signal description.
     * <br>Field {@link #SIGNAL_ON_KEY_RELEASED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onKeyReleased(OnKeyReleased signal) {
        return connectSignal(SIGNAL_ON_KEY_RELEASED, toOnKeyReleased(signal));
    }

    public final static String SIGNAL_ON_MODIFIERS = "modifiers";
    
    /**
     * Connect to signal "modifiers".
     * <br>See {@link OnModifiers#onModifiers} for signal description.
     * <br>Field {@link #SIGNAL_ON_MODIFIERS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onModifiers(OnModifiers signal) {
        return connectSignal(SIGNAL_ON_MODIFIERS, toOnModifiers(signal));
    }

    public static long getTypeID() { 
        return JnaEventControllerKey.INST().gtk_event_controller_key_get_type(); 
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
