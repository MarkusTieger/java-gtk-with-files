/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkOverlayLayout` is the layout manager used by `GtkOverlay`.
 * <br>
 * <br>It places widgets as overlays on top of the main child.
 * <br>
 * <br>This is not a reusable layout manager, since it expects its widget
 * <br>to be a `GtkOverlay`. It only listed here so that its layout
 * <br>properties get documented.
 * <p><a href="https://docs.gtk.org/gtk4/class.OverlayLayout.html">https://docs.gtk.org/gtk4/class.OverlayLayout.html</a></p>
*/
public class OverlayLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OverlayLayout.class.getCanonicalName());
    }

    public OverlayLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkOverlayLayout` instance.
    */
    public OverlayLayout() {
        super(cast(JnaOverlayLayout.INST().gtk_overlay_layout_new()));
    }

    public static long getTypeID() { 
        return JnaOverlayLayout.INST().gtk_overlay_layout_get_type(); 
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
