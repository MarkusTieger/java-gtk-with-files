/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBinLayout` is a `GtkLayoutManager` subclass useful for create &quot;bins&quot; of
 * <br>widgets.
 * <br>
 * <br>`GtkBinLayout` will stack each child of a widget on top of each other,
 * <br>using the [property&#64;Gtk.Widget:hexpand], [property&#64;Gtk.Widget:vexpand],
 * <br>[property&#64;Gtk.Widget:halign], and [property&#64;Gtk.Widget:valign] properties
 * <br>of each child to determine where they should be positioned.
 * <p><a href="https://docs.gtk.org/gtk4/class.BinLayout.html">https://docs.gtk.org/gtk4/class.BinLayout.html</a></p>
*/
public class BinLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BinLayout.class.getCanonicalName());
    }

    public BinLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBinLayout` instance.
    */
    public BinLayout() {
        super(cast(JnaBinLayout.INST().gtk_bin_layout_new()));
    }

    public static long getTypeID() { 
        return JnaBinLayout.INST().gtk_bin_layout_get_type(); 
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
