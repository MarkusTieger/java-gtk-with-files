/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkATContext` is an abstract class provided by GTK to communicate to
 * <br>platform-specific assistive technologies API.
 * <br>
 * <br>Each platform supported by GTK implements a `GtkATContext` subclass, and
 * <br>is responsible for updating the accessible state in response to state
 * <br>changes in `GtkAccessible`.
 * <p><a href="https://docs.gtk.org/gtk4/class.ATContext.html">https://docs.gtk.org/gtk4/class.ATContext.html</a></p>
*/
public class ATContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ATContext.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnStateChange {
        /**
         * Emitted when the attributes of the accessible for the
         * <br>`GtkATContext` instance change.
        */
        void onStateChange();
    }
    
    private static com.sun.jna.Callback toOnStateChange(OnStateChange in) {
        return (in == null) ? null: (JnaATContext.OnStateChange) (__self, __data) -> in.onStateChange();
    }

    public ATContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkATContext` instance for the given accessible role,
     * <br>accessible instance, and display connection.
     * <br>
     * <br>The `GtkATContext` implementation being instantiated will depend on the
     * <br>platform.
     * @param accessible_role the accessible role used by the `GtkATContext`
     * @param accessible the `GtkAccessible` implementation using the `GtkATContext`
     * @param display the `GdkDisplay` used by the `GtkATContext`
     * @return the `GtkATContext`
    */
    public static ATContext createATContext(int accessible_role, @Nonnull Accessible accessible, @Nonnull ch.bailu.gtk.gdk.Display display)  {
        PointerContainer __self = cast(JnaATContext.INST().gtk_at_context_create(accessible_role, asCPointerNotNull(accessible), asCPointerNotNull(display)));
        if (__self.isNull()) {
            throw new NullPointerException("ATContext:create");
        }
        return new ATContext(__self);
    }        
    

    /**
     * Retrieves the `GtkAccessible` using this context.
     * @return a `GtkAccessible`
    */
    public Accessible getAccessible()  {
        return new Accessible(new PointerContainer(JnaATContext.INST().gtk_at_context_get_accessible(asCPointer())));
    }

    /**
     * Retrieves the accessible role of this context.
     * @return a `GtkAccessibleRole`
    */
    public int getAccessibleRole()  {
        return JnaATContext.INST().gtk_at_context_get_accessible_role(asCPointer());
    }

    public final static String SIGNAL_ON_STATE_CHANGE = "state-change";
    
    /**
     * Connect to signal "state-change".
     * <br>See {@link OnStateChange#onStateChange} for signal description.
     * <br>Field {@link #SIGNAL_ON_STATE_CHANGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStateChange(OnStateChange signal) {
        return connectSignal(SIGNAL_ON_STATE_CHANGE, toOnStateChange(signal));
    }

    public static long getTypeID() { 
        return JnaATContext.INST().gtk_at_context_get_type(); 
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
