/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkStackSwitcher` shows a row of buttons to switch between `GtkStack`
 * <br>pages.
 * <br>
 * <br>![An example GtkStackSwitcher](stackswitcher.png)
 * <br>
 * <br>It acts as a controller for the associated `GtkStack`.
 * <br>
 * <br>All the content for the buttons comes from the properties of the stacks
 * <br>[class&#64;Gtk.StackPage] objects; the button visibility in a `GtkStackSwitcher`
 * <br>widget is controlled by the visibility of the child in the `GtkStack`.
 * <br>
 * <br>It is possible to associate multiple `GtkStackSwitcher` widgets
 * <br>with the same `GtkStack` widget.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkStackSwitcher` has a single CSS node named stackswitcher and
 * <br>style class .stack-switcher.
 * <br>
 * <br>When circumstances require it, `GtkStackSwitcher` adds the
 * <br>.needs-attention style class to the widgets representing the
 * <br>stack pages.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkStackSwitcher` uses the %GTK_ACCESSIBLE_ROLE_TAB_LIST role
 * <br>and uses the %GTK_ACCESSIBLE_ROLE_TAB for its buttons.
 * <br>
 * <br>&#35; Orientable
 * <br>
 * <br>Since GTK 4.4, `GtkStackSwitcher` implements `GtkOrientable` allowing
 * <br>the stack switcher to be made vertical with
 * <br>`gtk_orientable_set_orientation()`.
 * <p><a href="https://docs.gtk.org/gtk4/class.StackSwitcher.html">https://docs.gtk.org/gtk4/class.StackSwitcher.html</a></p>
*/
public class StackSwitcher extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StackSwitcher.class.getCanonicalName());
    }

    public StackSwitcher(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `GtkStackSwitcher`.
    */
    public StackSwitcher() {
        super(cast(JnaStackSwitcher.INST().gtk_stack_switcher_new()));
    }

    /**
     * Retrieves the stack.
     * @return the stack
    */
    public Stack getStack()  {
        return new Stack(new PointerContainer(JnaStackSwitcher.INST().gtk_stack_switcher_get_stack(asCPointer())));
    }

    /**
     * Sets the stack to control.
     * @param stack a `GtkStack`
    */
    public void setStack(@Nullable Stack stack)  {
        JnaStackSwitcher.INST().gtk_stack_switcher_set_stack(asCPointer(), asCPointer(stack));
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
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaStackSwitcher.INST().gtk_stack_switcher_get_type(); 
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
