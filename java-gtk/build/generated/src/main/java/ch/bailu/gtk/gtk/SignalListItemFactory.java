/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSignalListItemFactory` is a `GtkListItemFactory` that emits signals
 * <br>to to manage listitems.
 * <br>
 * <br>Signals are emitted for every listitem in the same order:
 * <br>
 * <br> 1. [signal&#64;Gtk.SignalListItemFactory::setup] is emitted to set up permanent
 * <br> things on the listitem. This usually means constructing the widgets used in
 * <br> the row and adding them to the listitem.
 * <br>
 * <br> 2. [signal&#64;Gtk.SignalListItemFactory::bind] is emitted to bind the item passed
 * <br> via [property&#64;Gtk.ListItem:item] to the widgets that have been created in
 * <br> step 1 or to add item-specific widgets. Signals are connected to listen to
 * <br> changes - both to changes in the item to update the widgets or to changes
 * <br> in the widgets to update the item. After this signal has been called, the
 * <br> listitem may be shown in a list widget.
 * <br>
 * <br> 3. [signal&#64;Gtk.SignalListItemFactory::unbind] is emitted to undo everything
 * <br> done in step 2. Usually this means disconnecting signal handlers. Once this
 * <br> signal has been called, the listitem will no longer be used in a list
 * <br> widget.
 * <br>
 * <br> 4. [signal&#64;Gtk.SignalListItemFactory::bind] and
 * <br> [signal&#64;Gtk.SignalListItemFactory::unbind] may be emitted multiple times
 * <br> again to bind the listitem for use with new items. By reusing listitems,
 * <br> potentially costly setup can be avoided. However, it means code needs to
 * <br> make sure to properly clean up the listitem in step 3 so that no information
 * <br> from the previous use leaks into the next use.
 * <br>
 * <br>5. [signal&#64;Gtk.SignalListItemFactory::teardown] is emitted to allow undoing
 * <br>the effects of [signal&#64;Gtk.SignalListItemFactory::setup]. After this signal
 * <br>was emitted on a listitem, the listitem will be destroyed and not be used again.
 * <br>
 * <br>Note that during the signal emissions, changing properties on the
 * <br>`GtkListItem`s passed will not trigger notify signals as the listitem's
 * <br>notifications are frozen. See g_object_freeze_notify() for details.
 * <br>
 * <br>For tracking changes in other properties in the `GtkListItem`, the
 * <br>::notify signal is recommended. The signal can be connected in the
 * <br>[signal&#64;Gtk.SignalListItemFactory::setup] signal and removed again during
 * <br>[signal&#64;Gtk.SignalListItemFactory::teardown].
 * <p><a href="https://docs.gtk.org/gtk4/class.SignalListItemFactory.html">https://docs.gtk.org/gtk4/class.SignalListItemFactory.html</a></p>
*/
public class SignalListItemFactory extends ListItemFactory {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SignalListItemFactory.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBind {
        /**
         * Emitted when an object has been bound, for example when a
         * <br>new [property&#64;Gtk.ListItem:item] has been set on a
         * <br>`GtkListItem` and should be bound for use.
         * <br>
         * <br>After this signal was emitted, the object might be shown in
         * <br>a [class&#64;Gtk.ListView] or other widget.
         * <br>
         * <br>The [signal&#64;Gtk.SignalListItemFactory::unbind] signal is the
         * <br>opposite of this signal and can be used to undo everything done
         * <br>in this signal.
         * @param object The `GObject` to bind
        */
        void onBind(@Nonnull ch.bailu.gtk.gobject.Object object);
    }
    
    private static com.sun.jna.Callback toOnBind(OnBind in) {
        return (in == null) ? null: (JnaSignalListItemFactory.OnBind) (__self, _object, __data) -> in.onBind(new ch.bailu.gtk.gobject.Object(new PointerContainer(_object)));
    }

    @FunctionalInterface
    public interface OnSetup {
        /**
         * Emitted when a new listitem has been created and needs to be setup for use.
         * <br>
         * <br>It is the first signal emitted for every listitem.
         * <br>
         * <br>The [signal&#64;Gtk.SignalListItemFactory::teardown] signal is the opposite
         * <br>of this signal and can be used to undo everything done in this signal.
         * @param object The `GObject` to set up
        */
        void onSetup(@Nonnull ch.bailu.gtk.gobject.Object object);
    }
    
    private static com.sun.jna.Callback toOnSetup(OnSetup in) {
        return (in == null) ? null: (JnaSignalListItemFactory.OnSetup) (__self, _object, __data) -> in.onSetup(new ch.bailu.gtk.gobject.Object(new PointerContainer(_object)));
    }

    @FunctionalInterface
    public interface OnTeardown {
        /**
         * Emitted when an object is about to be destroyed.
         * <br>
         * <br>It is the last signal ever emitted for this &#64;object.
         * <br>
         * <br>This signal is the opposite of the [signal&#64;Gtk.SignalListItemFactory::setup]
         * <br>signal and should be used to undo everything done in that signal.
         * @param object The `GObject` to tear down
        */
        void onTeardown(@Nonnull ch.bailu.gtk.gobject.Object object);
    }
    
    private static com.sun.jna.Callback toOnTeardown(OnTeardown in) {
        return (in == null) ? null: (JnaSignalListItemFactory.OnTeardown) (__self, _object, __data) -> in.onTeardown(new ch.bailu.gtk.gobject.Object(new PointerContainer(_object)));
    }

    @FunctionalInterface
    public interface OnUnbind {
        /**
         * Emitted when a object has been unbound from its item, for example when
         * <br>a listitem was removed from use in a list widget
         * <br>and its new [property&#64;Gtk.ListItem:item] is about to be unset.
         * <br>
         * <br>This signal is the opposite of the [signal&#64;Gtk.SignalListItemFactory::bind]
         * <br>signal and should be used to undo everything done in that signal.
         * @param object The `GObject` to unbind
        */
        void onUnbind(@Nonnull ch.bailu.gtk.gobject.Object object);
    }
    
    private static com.sun.jna.Callback toOnUnbind(OnUnbind in) {
        return (in == null) ? null: (JnaSignalListItemFactory.OnUnbind) (__self, _object, __data) -> in.onUnbind(new ch.bailu.gtk.gobject.Object(new PointerContainer(_object)));
    }

    public SignalListItemFactory(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSignalListItemFactory`.
     * <br>
     * <br>You need to connect signal handlers before you use it.
    */
    public SignalListItemFactory() {
        super(cast(JnaSignalListItemFactory.INST().gtk_signal_list_item_factory_new()));
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

    public final static String SIGNAL_ON_SETUP = "setup";
    
    /**
     * Connect to signal "setup".
     * <br>See {@link OnSetup#onSetup} for signal description.
     * <br>Field {@link #SIGNAL_ON_SETUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSetup(OnSetup signal) {
        return connectSignal(SIGNAL_ON_SETUP, toOnSetup(signal));
    }

    public final static String SIGNAL_ON_TEARDOWN = "teardown";
    
    /**
     * Connect to signal "teardown".
     * <br>See {@link OnTeardown#onTeardown} for signal description.
     * <br>Field {@link #SIGNAL_ON_TEARDOWN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTeardown(OnTeardown signal) {
        return connectSignal(SIGNAL_ON_TEARDOWN, toOnTeardown(signal));
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
        return JnaSignalListItemFactory.INST().gtk_signal_list_item_factory_get_type(); 
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
