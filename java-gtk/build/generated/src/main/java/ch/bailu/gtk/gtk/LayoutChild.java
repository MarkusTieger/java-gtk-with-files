/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLayoutChild` is the base class for objects that are meant to hold
 * <br>layout properties.
 * <br>
 * <br>If a `GtkLayoutManager` has per-child properties, like their packing type,
 * <br>or the horizontal and vertical span, or the icon name, then the layout
 * <br>manager should use a `GtkLayoutChild` implementation to store those properties.
 * <br>
 * <br>A `GtkLayoutChild` instance is only ever valid while a widget is part
 * <br>of a layout.
 * <p><a href="https://docs.gtk.org/gtk4/class.LayoutChild.html">https://docs.gtk.org/gtk4/class.LayoutChild.html</a></p>
*/
public class LayoutChild extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LayoutChild.class.getCanonicalName());
    }

    public LayoutChild(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the `GtkWidget` associated to the given &#64;layout_child.
     * @return a `GtkWidget`
    */
    public Widget getChildWidget()  {
        return new Widget(new PointerContainer(JnaLayoutChild.INST().gtk_layout_child_get_child_widget(asCPointer())));
    }

    /**
     * Retrieves the `GtkLayoutManager` instance that created the
     * <br>given &#64;layout_child.
     * @return a `GtkLayoutManager`
    */
    public LayoutManager getLayoutManager()  {
        return new LayoutManager(new PointerContainer(JnaLayoutChild.INST().gtk_layout_child_get_layout_manager(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaLayoutChild.INST().gtk_layout_child_get_type(); 
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
