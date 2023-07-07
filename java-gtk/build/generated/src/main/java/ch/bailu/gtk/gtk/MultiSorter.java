/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMultiSorter` combines multiple sorters by trying them
 * <br>in turn.
 * <br>
 * <br>If the first sorter compares two items as equal,
 * <br>the second is tried next, and so on.
 * <p><a href="https://docs.gtk.org/gtk4/class.MultiSorter.html">https://docs.gtk.org/gtk4/class.MultiSorter.html</a></p>
*/
public class MultiSorter extends Sorter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MultiSorter.class.getCanonicalName());
    }

    public MultiSorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new multi sorter.
     * <br>
     * <br>This sorter compares items by trying each of the sorters
     * <br>in turn, until one returns non-zero. In particular, if
     * <br>no sorter has been added to it, it will always compare
     * <br>items as equal.
    */
    public MultiSorter() {
        super(cast(JnaMultiSorter.INST().gtk_multi_sorter_new()));
    }

    /**
     * Add &#64;sorter to &#64;self to use for sorting at the end.
     * <br>
     * <br>&#64;self will consult all existing sorters before it will
     * <br>sort with the given &#64;sorter.
     * @param sorter a sorter to add
    */
    public void append(@Nonnull Sorter sorter)  {
        JnaMultiSorter.INST().gtk_multi_sorter_append(asCPointer(), asCPointerNotNull(sorter));
    }

    /**
     * Removes the sorter at the given &#64;position from the list of sorter
     * <br>used by &#64;self.
     * <br>
     * <br>If &#64;position is larger than the number of sorters, nothing happens.
     * @param position position of sorter to remove
    */
    public void remove(int position)  {
        JnaMultiSorter.INST().gtk_multi_sorter_remove(asCPointer(), position);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaMultiSorter.INST().gtk_multi_sorter_get_type(); 
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
