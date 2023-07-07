/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkViewport` implements scrollability for widgets that lack their
 * <br>own scrolling capabilities.
 * <br>
 * <br>Use `GtkViewport` to scroll child widgets such as `GtkGrid`,
 * <br>`GtkBox`, and so on.
 * <br>
 * <br>The `GtkViewport` will start scrolling content only if allocated
 * <br>less than the child widget’s minimum size in a given orientation.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkViewport` has a single CSS node with name `viewport`.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkViewport` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Viewport.html">https://docs.gtk.org/gtk4/class.Viewport.html</a></p>
*/
public class Viewport extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Viewport.class.getCanonicalName());
    }

    public Viewport(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkViewport`.
     * <br>
     * <br>The new viewport uses the given adjustments, or default
     * <br>adjustments if none are given.
     * @param hadjustment horizontal adjustment
     * @param vadjustment vertical adjustment
    */
    public Viewport(@Nullable Adjustment hadjustment, @Nullable Adjustment vadjustment) {
        super(cast(JnaViewport.INST().gtk_viewport_new(asCPointer(hadjustment), asCPointer(vadjustment))));
    }

    /**
     * Gets the child widget of &#64;viewport.
     * @return the child widget of &#64;viewport
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaViewport.INST().gtk_viewport_get_child(asCPointer())));
    }

    /**
     * Gets whether the viewport is scrolling to keep the focused
     * <br>child in view.
     * @return %TRUE if the viewport keeps the focus child scrolled to view
    */
    public boolean getScrollToFocus()  {
        return JnaViewport.INST().gtk_viewport_get_scroll_to_focus(asCPointer());
    }

    /**
     * Sets the child widget of &#64;viewport.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaViewport.INST().gtk_viewport_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether the viewport should automatically scroll
     * <br>to keep the focused child in view.
     * @param scroll_to_focus whether to keep the focus widget scrolled to view
    */
    public void setScrollToFocus(boolean scroll_to_focus)  {
        JnaViewport.INST().gtk_viewport_set_scroll_to_focus(asCPointer(), scroll_to_focus);
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

    /**
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaViewport.INST().gtk_viewport_get_type(); 
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
