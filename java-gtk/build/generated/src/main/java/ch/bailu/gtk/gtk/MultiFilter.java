/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMultiFilter` is the base class for filters that combine multiple filters.
 * <p><a href="https://docs.gtk.org/gtk4/class.MultiFilter.html">https://docs.gtk.org/gtk4/class.MultiFilter.html</a></p>
*/
public class MultiFilter extends Filter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MultiFilter.class.getCanonicalName());
    }

    public MultiFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a &#64;filter to &#64;self to use for matching.
     * @param filter A new filter to use
    */
    public void append(@Nonnull Filter filter)  {
        JnaMultiFilter.INST().gtk_multi_filter_append(asCPointer(), asCPointerNotNull(filter));
    }

    /**
     * Removes the filter at the given &#64;position from the list of filters used
     * <br>by &#64;self.
     * <br>
     * <br>If &#64;position is larger than the number of filters, nothing happens and
     * <br>the function returns.
     * @param position position of filter to remove
    */
    public void remove(int position)  {
        JnaMultiFilter.INST().gtk_multi_filter_remove(asCPointer(), position);
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
        return JnaMultiFilter.INST().gtk_multi_filter_get_type(); 
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
