/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkWindowHandle` is a titlebar area widget.
 * <br>
 * <br>When added into a window, it can be dragged to move the window, and handles
 * <br>right click, double click and middle click as expected of a titlebar.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkWindowHandle` has a single CSS node with the name `windowhandle`.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkWindowHandle` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.WindowHandle.html">https://docs.gtk.org/gtk4/class.WindowHandle.html</a></p>
*/
public class WindowHandle extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowHandle.class.getCanonicalName());
    }

    public WindowHandle(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkWindowHandle`.
    */
    public WindowHandle() {
        super(cast(JnaWindowHandle.INST().gtk_window_handle_new()));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaWindowHandle.INST().gtk_window_handle_get_child(asCPointer())));
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaWindowHandle.INST().gtk_window_handle_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaWindowHandle.INST().gtk_window_handle_get_type(); 
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
