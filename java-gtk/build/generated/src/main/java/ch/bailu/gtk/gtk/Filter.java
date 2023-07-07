/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkFilter` object describes the filtering to be performed by a
 * <br>[class&#64;Gtk.FilterListModel].
 * <br>
 * <br>The model will use the filter to determine if it should include items
 * <br>or not by calling [method&#64;Gtk.Filter.match] for each item and only
 * <br>keeping the ones that the function returns %TRUE for.
 * <br>
 * <br>Filters may change what items they match through their lifetime. In that
 * <br>case, they will emit the [signal&#64;Gtk.Filter::changed] signal to notify
 * <br>that previous filter results are no longer valid and that items should
 * <br>be checked again via [method&#64;Gtk.Filter.match].
 * <br>
 * <br>GTK provides various pre-made filter implementations for common filtering
 * <br>operations. These filters often include properties that can be linked to
 * <br>various widgets to easily allow searches.
 * <br>
 * <br>However, in particular for large lists or complex search methods, it is
 * <br>also possible to subclass `GtkFilter` and provide one's own filter.
 * <p><a href="https://docs.gtk.org/gtk4/class.Filter.html">https://docs.gtk.org/gtk4/class.Filter.html</a></p>
*/
public class Filter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Filter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted whenever the filter changed.
         * <br>
         * <br>Users of the filter should then check items again via
         * <br>[method&#64;Gtk.Filter.match].
         * <br>
         * <br>`GtkFilterListModel` handles this signal automatically.
         * <br>
         * <br>Depending on the &#64;change parameter, not all items need
         * <br>to be checked, but only some. Refer to the [enum&#64;Gtk.FilterChange]
         * <br>documentation for details.
         * @param change how the filter changed
        */
        void onChanged(int change);
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaFilter.OnChanged) (__self, _change, __data) -> in.onChanged(_change);
    }

    public Filter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Notifies all users of the filter that it has changed.
     * <br>
     * <br>This emits the [signal&#64;Gtk.Filter::changed] signal. Users
     * <br>of the filter should then check items again via
     * <br>[method&#64;Gtk.Filter.match].
     * <br>
     * <br>Depending on the &#64;change parameter, not all items need to
     * <br>be changed, but only some. Refer to the [enum&#64;Gtk.FilterChange]
     * <br>documentation for details.
     * <br>
     * <br>This function is intended for implementors of `GtkFilter`
     * <br>subclasses and should not be called from other functions.
     * @param change How the filter changed
    */
    public void changed(int change)  {
        JnaFilter.INST().gtk_filter_changed(asCPointer(), change);
    }

    /**
     * Gets the known strictness of &#64;filters.
     * <br>
     * <br>If the strictness is not known, %GTK_FILTER_MATCH_SOME is returned.
     * <br>
     * <br>This value may change after emission of the [signal&#64;Gtk.Filter::changed]
     * <br>signal.
     * <br>
     * <br>This function is meant purely for optimization purposes, filters can
     * <br>choose to omit implementing it, but `GtkFilterListModel` uses it.
     * @return the strictness of &#64;self
    */
    public int getStrictness()  {
        return JnaFilter.INST().gtk_filter_get_strictness(asCPointer());
    }

    /**
     * Checks if the given &#64;item is matched by the filter or not.
     * @param item The item to check
     * @return %TRUE if the filter matches the item and a filter model should   keep it, %FALSE if not.
    */
    public boolean match(@Nonnull ch.bailu.gtk.type.Pointer item)  {
        return JnaFilter.INST().gtk_filter_match(asCPointer(), asCPointerNotNull(item));
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaFilter.INST().gtk_filter_get_type(); 
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
