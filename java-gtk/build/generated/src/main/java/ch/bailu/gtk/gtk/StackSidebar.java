/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkStackSidebar` uses a sidebar to switch between `GtkStack` pages.
 * <br>
 * <br>In order to use a `GtkStackSidebar`, you simply use a `GtkStack` to
 * <br>organize your UI flow, and add the sidebar to your sidebar area. You
 * <br>can use [method&#64;Gtk.StackSidebar.set_stack] to connect the `GtkStackSidebar`
 * <br>to the `GtkStack`.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkStackSidebar` has a single CSS node with name stacksidebar and
 * <br>style class .sidebar.
 * <br>
 * <br>When circumstances require it, `GtkStackSidebar` adds the
 * <br>.needs-attention style class to the widgets representing the stack
 * <br>pages.
 * <p><a href="https://docs.gtk.org/gtk4/class.StackSidebar.html">https://docs.gtk.org/gtk4/class.StackSidebar.html</a></p>
*/
public class StackSidebar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StackSidebar.class.getCanonicalName());
    }

    public StackSidebar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkStackSidebar`.
    */
    public StackSidebar() {
        super(cast(JnaStackSidebar.INST().gtk_stack_sidebar_new()));
    }

    /**
     * Retrieves the stack.
     * @return the associated `GtkStack` or   %NULL if none has been set explicitly
    */
    public Stack getStack()  {
        return new Stack(new PointerContainer(JnaStackSidebar.INST().gtk_stack_sidebar_get_stack(asCPointer())));
    }

    /**
     * Set the `GtkStack` associated with this `GtkStackSidebar`.
     * <br>
     * <br>The sidebar widget will automatically update according to
     * <br>the order and items within the given `GtkStack`.
     * @param stack a `GtkStack`
    */
    public void setStack(@Nonnull Stack stack)  {
        JnaStackSidebar.INST().gtk_stack_sidebar_set_stack(asCPointer(), asCPointerNotNull(stack));
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
        return JnaStackSidebar.INST().gtk_stack_sidebar_get_type(); 
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
