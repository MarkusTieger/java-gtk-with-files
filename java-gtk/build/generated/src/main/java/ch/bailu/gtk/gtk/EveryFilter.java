/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEveryFilter` matches an item when each of its filters matches.
 * <br>
 * <br>To add filters to a `GtkEveryFilter`, use [method&#64;Gtk.MultiFilter.append].
 * <p><a href="https://docs.gtk.org/gtk4/class.EveryFilter.html">https://docs.gtk.org/gtk4/class.EveryFilter.html</a></p>
*/
public class EveryFilter extends MultiFilter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EveryFilter.class.getCanonicalName());
    }

    public EveryFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new empty &quot;every&quot; filter.
     * <br>
     * <br>Use [method&#64;Gtk.MultiFilter.append] to add filters to it.
     * <br>
     * <br>This filter matches an item if each of the filters added to it
     * <br>matches the item. In particular, this means that if no filter
     * <br>has been added to it, the filter matches every item.
    */
    public EveryFilter() {
        super(cast(JnaEveryFilter.INST().gtk_every_filter_new()));
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
        return JnaEveryFilter.INST().gtk_every_filter_get_type(); 
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
