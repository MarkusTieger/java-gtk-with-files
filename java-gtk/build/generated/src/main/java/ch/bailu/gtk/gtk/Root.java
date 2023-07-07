/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkRoot` is the interface implemented by all widgets that can act as a toplevel
 * <br>widget.
 * <br>
 * <br>The root widget takes care of providing the connection to the windowing system
 * <br>and manages layout, drawing and event delivery for its widget hierarchy.
 * <br>
 * <br>The obvious example of a `GtkRoot` is `GtkWindow`.
 * <br>
 * <br>To get the display to which a `GtkRoot` belongs, use
 * <br>[method&#64;Gtk.Root.get_display].
 * <br>
 * <br>`GtkRoot` also maintains the location of keyboard focus inside its widget
 * <br>hierarchy, with [method&#64;Gtk.Root.set_focus] and [method&#64;Gtk.Root.get_focus].
 * <p><a href="https://docs.gtk.org/gtk4/iface.Root.html">https://docs.gtk.org/gtk4/iface.Root.html</a></p>
*/
public class Root extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Root.class.getCanonicalName());
    }

    public Root(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the display that this `GtkRoot` is on.
     * @return the display of &#64;root
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaRoot.INST().gtk_root_get_display(asCPointer())));
    }

    /**
     * Retrieves the current focused widget within the root.
     * <br>
     * <br>Note that this is the widget that would have the focus
     * <br>if the root is active; if the root is not focused then
     * <br>`gtk_widget_has_focus (widget)` will be %FALSE for the
     * <br>widget.
     * @return the currently focused widget
    */
    public Widget getFocus()  {
        return new Widget(new PointerContainer(JnaRoot.INST().gtk_root_get_focus(asCPointer())));
    }

    /**
     * If &#64;focus is not the current focus widget, and is focusable, sets
     * <br>it as the focus widget for the root.
     * <br>
     * <br>If &#64;focus is %NULL, unsets the focus widget for the root.
     * <br>
     * <br>To set the focus to a particular widget in the root, it is usually
     * <br>more convenient to use [method&#64;Gtk.Widget.grab_focus] instead of
     * <br>this function.
     * @param focus widget to be the new focus widget, or %NULL    to unset the focus widget
    */
    public void setFocus(@Nullable Widget focus)  {
        JnaRoot.INST().gtk_root_set_focus(asCPointer(), asCPointer(focus));
    }

    public static long getTypeID() { 
        return JnaRoot.INST().gtk_root_get_type(); 
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
interface-type
*/
