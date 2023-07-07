/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSignalGroup manages to simplify the process of connecting
 * <br>many signals to a &#35;GObject as a group. As such there is no API
 * <br>to disconnect a signal from the group.
 * <br>
 * <br>In particular, this allows you to:
 * <br>
 * <br> - Change the target instance, which automatically causes disconnection
 * <br>   of the signals from the old instance and connecting to the new instance.
 * <br> - Block and unblock signals as a group
 * <br> - Ensuring that blocked state transfers across target instances.
 * <br>
 * <br>One place you might want to use such a structure is with &#35;GtkTextView and
 * <br>&#35;GtkTextBuffer. Often times, you'll need to connect to many signals on
 * <br>&#35;GtkTextBuffer from a &#35;GtkTextView subclass. This allows you to create a
 * <br>signal group during instance construction, simply bind the
 * <br>&#35;GtkTextView:buffer property to &#35;GSignalGroup:target and connect
 * <br>all the signals you need. When the &#35;GtkTextView:buffer property changes
 * <br>all of the signals will be transitioned correctly.
 * <p><a href="https://docs.gtk.org/gobject/class.SignalGroup.html">https://docs.gtk.org/gobject/class.SignalGroup.html</a></p>
*/
public class SignalGroup extends Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SignalGroup.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCallback {
        /**
         * The type used for callback functions in structure definitions and function
         * <br>signatures.
         * <br>
         * <br>This doesn't mean that all callback functions must take no  parameters and
         * <br>return void. The required signature of a callback function is determined by
         * <br>the context in which is used (e.g. the signal to which it is connected).
         * <br>
         * <br>Use G_CALLBACK() to cast the callback function to a &#35;GCallback.
        */
        void onCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSignalGroup.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaSignalGroup.OnCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onCallback(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClosureNotify {
        /**
         * The type used for the various notification callbacks which can be registered
         * <br>on closures.
         * @param data data specified when registering the notification callback
         * @param closure the &#35;GClosure on which the notification is emitted
        */
        void onClosureNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Closure closure);
    }
    
    private static JnaSignalGroup.OnClosureNotify toOnClosureNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosureNotify in) {
        JnaSignalGroup.OnClosureNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _closure) -> in.onClosureNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Closure(new PointerContainer(_closure)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBind {
        /**
         * This signal is emitted when &#35;GSignalGroup:target is set to a new value
         * <br>other than %NULL. It is similar to &#35;GObject::notify on `target` except it
         * <br>will not emit when &#35;GSignalGroup:target is %NULL and also allows for
         * <br>receiving the &#35;GObject without a data-race.
         * @param instance a &#35;GObject containing the new value for &#35;GSignalGroup:target
        */
        void onBind(@Nonnull Object instance);
    }
    
    private static com.sun.jna.Callback toOnBind(OnBind in) {
        return (in == null) ? null: (JnaSignalGroup.OnBind) (__self, _instance, __data) -> in.onBind(new Object(new PointerContainer(_instance)));
    }

    @FunctionalInterface
    public interface OnUnbind {
        /**
         * This signal is emitted when the target instance of &#64;self is set to a
         * <br>new &#35;GObject.
         * <br>
         * <br>This signal will only be emitted if the previous target of &#64;self is
         * <br>non-%NULL.
        */
        void onUnbind();
    }
    
    private static com.sun.jna.Callback toOnUnbind(OnUnbind in) {
        return (in == null) ? null: (JnaSignalGroup.OnUnbind) (__self, __data) -> in.onUnbind();
    }

    public SignalGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSignalGroup for target instances of &#64;target_type.
     * @param target_type the &#35;GType of the target instance.
    */
    public SignalGroup(long target_type) {
        super(cast(JnaSignalGroup.INST().g_signal_group_new(target_type)));
    }

    /**
     * Blocks all signal handlers managed by &#64;self so they will not
     * <br>be called during any signal emissions. Must be unblocked exactly
     * <br>the same number of times it has been blocked to become active again.
     * <br>
     * <br>This blocked state will be kept across changes of the target instance.
    */
    public void block()  {
        JnaSignalGroup.INST().g_signal_group_block(asCPointer());
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connect(@Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect(asCPointer(), asCPointerNotNull(detailed_signal), toOnCallback(this, "connect", c_handler), asCPointer(data));
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connect(String detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect(asCPointer(), detailed_signal, toOnCallback(this, "connect", c_handler), asCPointer(data));
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>The &#64;c_handler will be called after the default handler of the signal.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connectAfter(@Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect_after(asCPointer(), asCPointerNotNull(detailed_signal), toOnCallback(this, "connectAfter", c_handler), asCPointer(data));
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>The &#64;c_handler will be called after the default handler of the signal.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connectAfter(String detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect_after(asCPointer(), detailed_signal, toOnCallback(this, "connectAfter", c_handler), asCPointer(data));
    }

    /**
     * Connects &#64;closure to the signal &#64;detailed_signal on &#35;GSignalGroup:target.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form `signal-name` with optional `::signal-detail`
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the  default handler of the signal.
    */
    public void connectClosure(@Nonnull ch.bailu.gtk.type.Str detailed_signal, @Nonnull Closure closure, boolean after)  {
        JnaSignalGroup.INST().g_signal_group_connect_closure(asCPointer(), asCPointerNotNull(detailed_signal), asCPointerNotNull(closure), after);
    }

    /**
     * Connects &#64;closure to the signal &#64;detailed_signal on &#35;GSignalGroup:target.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form `signal-name` with optional `::signal-detail`
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the  default handler of the signal.
    */
    public void connectClosure(String detailed_signal, @Nonnull Closure closure, boolean after)  {
        JnaSignalGroup.INST().g_signal_group_connect_closure(asCPointer(), detailed_signal, asCPointerNotNull(closure), after);
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
     * @param notify function to be called when disposing of &#64;self
     * @param flags the flags used to create the signal connection
    */
    public void connectData(@Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data, OnClosureNotify notify, int flags)  {
        JnaSignalGroup.INST().g_signal_group_connect_data(asCPointer(), asCPointerNotNull(detailed_signal), toOnCallback(this, "connectData", c_handler), asCPointer(data), toOnClosureNotify(this, "connectData", notify), flags);
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
     * @param notify function to be called when disposing of &#64;self
     * @param flags the flags used to create the signal connection
    */
    public void connectData(String detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data, OnClosureNotify notify, int flags)  {
        JnaSignalGroup.INST().g_signal_group_connect_data(asCPointer(), detailed_signal, toOnCallback(this, "connectData", c_handler), asCPointer(data), toOnClosureNotify(this, "connectData", notify), flags);
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal on &#35;GSignalGroup:target.
     * <br>
     * <br>Ensures that the &#64;object stays alive during the call to &#64;c_handler
     * <br>by temporarily adding a reference count. When the &#64;object is destroyed
     * <br>the signal handler will automatically be removed.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form `signal-name` with optional `::signal-detail`
     * @param c_handler the &#35;GCallback to connect
     * @param object the &#35;GObject to pass as data to &#64;c_handler calls
     * @param flags &#35;GConnectFlags for the signal connection
    */
    public void connectObject(@Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nonnull ch.bailu.gtk.type.Pointer object, int flags)  {
        JnaSignalGroup.INST().g_signal_group_connect_object(asCPointer(), asCPointerNotNull(detailed_signal), toOnCallback(this, "connectObject", c_handler), asCPointerNotNull(object), flags);
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal on &#35;GSignalGroup:target.
     * <br>
     * <br>Ensures that the &#64;object stays alive during the call to &#64;c_handler
     * <br>by temporarily adding a reference count. When the &#64;object is destroyed
     * <br>the signal handler will automatically be removed.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form `signal-name` with optional `::signal-detail`
     * @param c_handler the &#35;GCallback to connect
     * @param object the &#35;GObject to pass as data to &#64;c_handler calls
     * @param flags &#35;GConnectFlags for the signal connection
    */
    public void connectObject(String detailed_signal, OnCallback c_handler, @Nonnull ch.bailu.gtk.type.Pointer object, int flags)  {
        JnaSignalGroup.INST().g_signal_group_connect_object(asCPointer(), detailed_signal, toOnCallback(this, "connectObject", c_handler), asCPointerNotNull(object), flags);
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>The instance on which the signal is emitted and &#64;data
     * <br>will be swapped when calling &#64;c_handler.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connectSwapped(@Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect_swapped(asCPointer(), asCPointerNotNull(detailed_signal), toOnCallback(this, "connectSwapped", c_handler), asCPointer(data));
    }

    /**
     * Connects &#64;c_handler to the signal &#64;detailed_signal
     * <br>on the target instance of &#64;self.
     * <br>
     * <br>The instance on which the signal is emitted and &#64;data
     * <br>will be swapped when calling &#64;c_handler.
     * <br>
     * <br>You cannot connect a signal handler after &#35;GSignalGroup:target has been set.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;
     * @param c_handler the &#35;GCallback to connect
     * @param data the data to pass to &#64;c_handler calls
    */
    public void connectSwapped(String detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaSignalGroup.INST().g_signal_group_connect_swapped(asCPointer(), detailed_signal, toOnCallback(this, "connectSwapped", c_handler), asCPointer(data));
    }

    /**
     * Gets the target instance used when connecting signals.
     * @return The target instance
    */
    public ch.bailu.gtk.type.Pointer dupTarget()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaSignalGroup.INST().g_signal_group_dup_target(asCPointer())));
    }

    /**
     * Sets the target instance used when connecting signals. Any signal
     * <br>that has been registered with g_signal_group_connect_object() or
     * <br>similar functions will be connected to this object.
     * <br>
     * <br>If the target instance was previously set, signals will be
     * <br>disconnected from that object prior to connecting to &#64;target.
     * @param target The target instance used     when connecting signals.
    */
    public void setTarget(@Nullable ch.bailu.gtk.type.Pointer target)  {
        JnaSignalGroup.INST().g_signal_group_set_target(asCPointer(), asCPointer(target));
    }

    /**
     * Unblocks all signal handlers managed by &#64;self so they will be
     * <br>called again during any signal emissions unless it is blocked
     * <br>again. Must be unblocked exactly the same number of times it
     * <br>has been blocked to become active again.
    */
    public void unblock()  {
        JnaSignalGroup.INST().g_signal_group_unblock(asCPointer());
    }

    public final static String SIGNAL_ON_BIND = "bind";
    
    /**
     * Connect to signal "bind".
     * <br>See {@link OnBind#onBind} for signal description.
     * <br>Field {@link #SIGNAL_ON_BIND} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBind(OnBind signal) {
        return connectSignal(SIGNAL_ON_BIND, toOnBind(signal));
    }

    public final static String SIGNAL_ON_UNBIND = "unbind";
    
    /**
     * Connect to signal "unbind".
     * <br>See {@link OnUnbind#onUnbind} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNBIND} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnbind(OnUnbind signal) {
        return connectSignal(SIGNAL_ON_UNBIND, toOnUnbind(signal));
    }

    public static long getTypeID() { 
        return JnaSignalGroup.INST().g_signal_group_get_type(); 
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
