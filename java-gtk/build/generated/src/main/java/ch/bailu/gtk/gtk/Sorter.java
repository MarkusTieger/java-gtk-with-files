/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSorter` is an object to describe sorting criteria.
 * <br>
 * <br>Its primary user is [class&#64;Gtk.SortListModel]
 * <br>
 * <br>The model will use a sorter to determine the order in which
 * <br>its items should appear by calling [method&#64;Gtk.Sorter.compare]
 * <br>for pairs of items.
 * <br>
 * <br>Sorters may change their sorting behavior through their lifetime.
 * <br>In that case, they will emit the [signal&#64;Gtk.Sorter::changed] signal
 * <br>to notify that the sort order is no longer valid and should be updated
 * <br>by calling gtk_sorter_compare() again.
 * <br>
 * <br>GTK provides various pre-made sorter implementations for common sorting
 * <br>operations. [class&#64;Gtk.ColumnView] has built-in support for sorting lists
 * <br>via the [property&#64;Gtk.ColumnViewColumn:sorter] property, where the user can
 * <br>change the sorting by clicking on list headers.
 * <br>
 * <br>Of course, in particular for large lists, it is also possible to subclass
 * <br>`GtkSorter` and provide one's own sorter.
 * <p><a href="https://docs.gtk.org/gtk4/class.Sorter.html">https://docs.gtk.org/gtk4/class.Sorter.html</a></p>
*/
public class Sorter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Sorter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted whenever the sorter changed.
         * <br>
         * <br>Users of the sorter should then update the sort order
         * <br>again via gtk_sorter_compare().
         * <br>
         * <br>[class&#64;Gtk.SortListModel] handles this signal automatically.
         * <br>
         * <br>Depending on the &#64;change parameter, it may be possible to update
         * <br>the sort order without a full resorting. Refer to the
         * <br>[enum&#64;Gtk.SorterChange] documentation for details.
         * @param change how the sorter changed
        */
        void onChanged(int change);
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaSorter.OnChanged) (__self, _change, __data) -> in.onChanged(_change);
    }

    public Sorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Notifies all users of the sorter that it has changed.
     * <br>
     * <br>This emits the [signal&#64;Gtk.Sorter::changed] signal. Users
     * <br>of the sorter should then update the sort order via
     * <br>[method&#64;Gtk.Sorter.compare].
     * <br>
     * <br>Depending on the &#64;change parameter, it may be possible to
     * <br>update the sort order without a full resorting. Refer to
     * <br>the [enum&#64;Gtk.SorterChange] documentation for details.
     * <br>
     * <br>This function is intended for implementors of `GtkSorter`
     * <br>subclasses and should not be called from other functions.
     * @param change How the sorter changed
    */
    public void changed(int change)  {
        JnaSorter.INST().gtk_sorter_changed(asCPointer(), change);
    }

    /**
     * Compares two given items according to the sort order implemented
     * <br>by the sorter.
     * <br>
     * <br>Sorters implement a partial order:
     * <br>
     * <br>* It is reflexive, ie a = a
     * <br>* It is antisymmetric, ie if a &lt; b and b &lt; a, then a = b
     * <br>* It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
     * <br>  then a ≤ c
     * <br>
     * <br>The sorter may signal it conforms to additional constraints
     * <br>via the return value of [method&#64;Gtk.Sorter.get_order].
     * @param item1 first item to compare
     * @param item2 second item to compare
     * @return %GTK_ORDERING_EQUAL if &#64;item1 == &#64;item2,   %GTK_ORDERING_SMALLER if &#64;item1 &lt; &#64;item2,   %GTK_ORDERING_LARGER if &#64;item1 &gt; &#64;item2
    */
    public int compare(@Nonnull ch.bailu.gtk.type.Pointer item1, @Nonnull ch.bailu.gtk.type.Pointer item2)  {
        return JnaSorter.INST().gtk_sorter_compare(asCPointer(), asCPointerNotNull(item1), asCPointerNotNull(item2));
    }

    /**
     * Gets the order that &#64;self conforms to.
     * <br>
     * <br>See [enum&#64;Gtk.SorterOrder] for details
     * <br>of the possible return values.
     * <br>
     * <br>This function is intended to allow optimizations.
     * @return The order
    */
    public int getOrder()  {
        return JnaSorter.INST().gtk_sorter_get_order(asCPointer());
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
        return JnaSorter.INST().gtk_sorter_get_type(); 
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
