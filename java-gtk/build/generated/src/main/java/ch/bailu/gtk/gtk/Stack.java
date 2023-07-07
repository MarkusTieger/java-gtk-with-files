/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStack` is a container which only shows one of its children
 * <br>at a time.
 * <br>
 * <br>In contrast to `GtkNotebook`, `GtkStack` does not provide a means
 * <br>for users to change the visible child. Instead, a separate widget
 * <br>such as [class&#64;Gtk.StackSwitcher] or [class&#64;Gtk.StackSidebar] can
 * <br>be used with `GtkStack` to provide this functionality.
 * <br>
 * <br>Transitions between pages can be animated as slides or fades. This
 * <br>can be controlled with [method&#64;Gtk.Stack.set_transition_type].
 * <br>These animations respect the [property&#64;Gtk.Settings:gtk-enable-animations]
 * <br>setting.
 * <br>
 * <br>`GtkStack` maintains a [class&#64;Gtk.StackPage] object for each added
 * <br>child, which holds additional per-child properties. You
 * <br>obtain the `GtkStackPage` for a child with [method&#64;Gtk.Stack.get_page]
 * <br>and you can obtain a `GtkSelectionModel` containing all the pages
 * <br>with [method&#64;Gtk.Stack.get_pages].
 * <br>
 * <br>&#35; GtkStack as GtkBuildable
 * <br>
 * <br>To set child-specific properties in a .ui file, create `GtkStackPage`
 * <br>objects explicitly, and set the child widget as a property on it:
 * <br>
 * <br>```xml
 * <br>  &lt;object class=&quot;GtkStack&quot; id=&quot;stack&quot;&gt;
 * <br>    &lt;child&gt;
 * <br>      &lt;object class=&quot;GtkStackPage&quot;&gt;
 * <br>        &lt;property name=&quot;name&quot;&gt;page1&lt;/property&gt;
 * <br>        &lt;property name=&quot;title&quot;&gt;In the beginning…&lt;/property&gt;
 * <br>        &lt;property name=&quot;child&quot;&gt;
 * <br>          &lt;object class=&quot;GtkLabel&quot;&gt;
 * <br>            &lt;property name=&quot;label&quot;&gt;It was dark&lt;/property&gt;
 * <br>          &lt;/object&gt;
 * <br>        &lt;/property&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkStack` has a single CSS node named stack.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkStack` uses the %GTK_ACCESSIBLE_ROLE_TAB_PANEL for the stack
 * <br>pages, which are the accessible parent objects of the child widgets.
 * <p><a href="https://docs.gtk.org/gtk4/class.Stack.html">https://docs.gtk.org/gtk4/class.Stack.html</a></p>
*/
public class Stack extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Stack.class.getCanonicalName());
    }

    public Stack(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkStack`.
    */
    public Stack() {
        super(cast(JnaStack.INST().gtk_stack_new()));
    }

    /**
     * Adds a child to &#64;stack.
     * @param child the widget to add
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage addChild(@Nonnull Widget child)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_add_child(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Adds a child to &#64;stack.
     * <br>
     * <br>The child is identified by the &#64;name.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage addNamed(@Nonnull Widget child, @Nullable ch.bailu.gtk.type.Str name)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_add_named(asCPointer(), asCPointerNotNull(child), asCPointer(name))));
    }

    /**
     * Adds a child to &#64;stack.
     * <br>
     * <br>The child is identified by the &#64;name.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage addNamed(@Nonnull Widget child, String name)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_add_named(asCPointer(), asCPointerNotNull(child), name)));
    }

    /**
     * Adds a child to &#64;stack.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title
     * <br>will be used by `GtkStackSwitcher` to represent
     * <br>&#64;child in a tab bar, so it should be short.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage addTitled(@Nonnull Widget child, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str title)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_add_titled(asCPointer(), asCPointerNotNull(child), asCPointer(name), asCPointerNotNull(title))));
    }

    /**
     * Adds a child to &#64;stack.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title
     * <br>will be used by `GtkStackSwitcher` to represent
     * <br>&#64;child in a tab bar, so it should be short.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage addTitled(@Nonnull Widget child, String name, String title)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_add_titled(asCPointer(), asCPointerNotNull(child), name, title)));
    }

    /**
     * Finds the child with the name given as the argument.
     * <br>
     * <br>Returns %NULL if there is no child with this name.
     * @param name the name of the child to find
     * @return the requested child   of the `GtkStack`
    */
    public Widget getChildByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new Widget(new PointerContainer(JnaStack.INST().gtk_stack_get_child_by_name(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Finds the child with the name given as the argument.
     * <br>
     * <br>Returns %NULL if there is no child with this name.
     * @param name the name of the child to find
     * @return the requested child   of the `GtkStack`
    */
    public Widget getChildByName(String name)  {
        return new Widget(new PointerContainer(JnaStack.INST().gtk_stack_get_child_by_name(asCPointer(), name)));
    }

    /**
     * Gets whether &#64;stack is horizontally homogeneous.
     * @return whether &#64;stack is horizontally homogeneous.
    */
    public boolean getHhomogeneous()  {
        return JnaStack.INST().gtk_stack_get_hhomogeneous(asCPointer());
    }

    /**
     * Returns whether the `GtkStack` is set up to interpolate between
     * <br>the sizes of children on page switch.
     * @return %TRUE if child sizes are interpolated
    */
    public boolean getInterpolateSize()  {
        return JnaStack.INST().gtk_stack_get_interpolate_size(asCPointer());
    }

    /**
     * Returns the `GtkStackPage` object for &#64;child.
     * @param child a child of &#64;stack
     * @return the `GtkStackPage` for &#64;child
    */
    public StackPage getPage(@Nonnull Widget child)  {
        return new StackPage(new PointerContainer(JnaStack.INST().gtk_stack_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Returns a `GListModel` that contains the pages of the stack.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also
     * <br>implements [iface&#64;Gtk.SelectionModel] and can be used to track
     * <br>and modify the visible page.
     * @return a `GtkSelectionModel` for the stack's children
    */
    public SelectionModel getPages()  {
        return new SelectionModel(new PointerContainer(JnaStack.INST().gtk_stack_get_pages(asCPointer())));
    }

    /**
     * Returns the amount of time (in milliseconds) that
     * <br>transitions between pages in &#64;stack will take.
     * @return the transition duration
    */
    public int getTransitionDuration()  {
        return JnaStack.INST().gtk_stack_get_transition_duration(asCPointer());
    }

    /**
     * Returns whether the &#64;stack is currently in a transition from one page to
     * <br>another.
     * @return %TRUE if the transition is currently running, %FALSE otherwise.
    */
    public boolean getTransitionRunning()  {
        return JnaStack.INST().gtk_stack_get_transition_running(asCPointer());
    }

    /**
     * Gets the type of animation that will be used
     * <br>for transitions between pages in &#64;stack.
     * @return the current transition type of &#64;stack
    */
    public int getTransitionType()  {
        return JnaStack.INST().gtk_stack_get_transition_type(asCPointer());
    }

    /**
     * Gets whether &#64;stack is vertically homogeneous.
     * @return whether &#64;stack is vertically homogeneous.
    */
    public boolean getVhomogeneous()  {
        return JnaStack.INST().gtk_stack_get_vhomogeneous(asCPointer());
    }

    /**
     * Gets the currently visible child of &#64;stack.
     * <br>
     * <br>Returns %NULL if there are no visible children.
     * @return the visible child of the `GtkStack`
    */
    public Widget getVisibleChild()  {
        return new Widget(new PointerContainer(JnaStack.INST().gtk_stack_get_visible_child(asCPointer())));
    }

    /**
     * Returns the name of the currently visible child of &#64;stack.
     * <br>
     * <br>Returns %NULL if there is no visible child.
     * @return the name of the visible child   of the `GtkStack`
    */
    public ch.bailu.gtk.type.Str getVisibleChildName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStack.INST().gtk_stack_get_visible_child_name(asCPointer())));
    }

    /**
     * Removes a child widget from &#64;stack.
     * @param child the child to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaStack.INST().gtk_stack_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets the `GtkStack` to be horizontally homogeneous or not.
     * <br>
     * <br>If it is homogeneous, the `GtkStack` will request the same
     * <br>width for all its children. If it isn't, the stack
     * <br>may change width when a different child becomes visible.
     * @param hhomogeneous %TRUE to make &#64;stack horizontally homogeneous
    */
    public void setHhomogeneous(boolean hhomogeneous)  {
        JnaStack.INST().gtk_stack_set_hhomogeneous(asCPointer(), hhomogeneous);
    }

    /**
     * Sets whether or not &#64;stack will interpolate its size when
     * <br>changing the visible child.
     * <br>
     * <br>If the [property&#64;Gtk.Stack:interpolate-size] property is set
     * <br>to %TRUE, &#64;stack will interpolate its size between the current
     * <br>one and the one it'll take after changing the visible child,
     * <br>according to the set transition duration.
     * @param interpolate_size the new value
    */
    public void setInterpolateSize(boolean interpolate_size)  {
        JnaStack.INST().gtk_stack_set_interpolate_size(asCPointer(), interpolate_size);
    }

    /**
     * Sets the duration that transitions between pages in &#64;stack
     * <br>will take.
     * @param duration the new duration, in milliseconds
    */
    public void setTransitionDuration(int duration)  {
        JnaStack.INST().gtk_stack_set_transition_duration(asCPointer(), duration);
    }

    /**
     * Sets the type of animation that will be used for
     * <br>transitions between pages in &#64;stack.
     * <br>
     * <br>Available types include various kinds of fades and slides.
     * <br>
     * <br>The transition type can be changed without problems
     * <br>at runtime, so it is possible to change the animation
     * <br>based on the page that is about to become current.
     * @param transition the new transition type
    */
    public void setTransitionType(int transition)  {
        JnaStack.INST().gtk_stack_set_transition_type(asCPointer(), transition);
    }

    /**
     * Sets the `GtkStack` to be vertically homogeneous or not.
     * <br>
     * <br>If it is homogeneous, the `GtkStack` will request the same
     * <br>height for all its children. If it isn't, the stack
     * <br>may change height when a different child becomes visible.
     * @param vhomogeneous %TRUE to make &#64;stack vertically homogeneous
    */
    public void setVhomogeneous(boolean vhomogeneous)  {
        JnaStack.INST().gtk_stack_set_vhomogeneous(asCPointer(), vhomogeneous);
    }

    /**
     * Makes &#64;child the visible child of &#64;stack.
     * <br>
     * <br>If &#64;child is different from the currently visible child,
     * <br>the transition between the two will be animated with the
     * <br>current transition type of &#64;stack.
     * <br>
     * <br>Note that the &#64;child widget has to be visible itself
     * <br>(see [method&#64;Gtk.Widget.show]) in order to become the visible
     * <br>child of &#64;stack.
     * @param child a child of &#64;stack
    */
    public void setVisibleChild(@Nonnull Widget child)  {
        JnaStack.INST().gtk_stack_set_visible_child(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Makes the child with the given name visible.
     * <br>
     * <br>Note that the child widget has to be visible itself
     * <br>(see [method&#64;Gtk.Widget.show]) in order to become the visible
     * <br>child of &#64;stack.
     * @param name the name of the child to make visible
     * @param transition the transition type to use
    */
    public void setVisibleChildFull(@Nonnull ch.bailu.gtk.type.Str name, int transition)  {
        JnaStack.INST().gtk_stack_set_visible_child_full(asCPointer(), asCPointerNotNull(name), transition);
    }

    /**
     * Makes the child with the given name visible.
     * <br>
     * <br>Note that the child widget has to be visible itself
     * <br>(see [method&#64;Gtk.Widget.show]) in order to become the visible
     * <br>child of &#64;stack.
     * @param name the name of the child to make visible
     * @param transition the transition type to use
    */
    public void setVisibleChildFull(String name, int transition)  {
        JnaStack.INST().gtk_stack_set_visible_child_full(asCPointer(), name, transition);
    }

    /**
     * Makes the child with the given name visible.
     * <br>
     * <br>If &#64;child is different from the currently visible child,
     * <br>the transition between the two will be animated with the
     * <br>current transition type of &#64;stack.
     * <br>
     * <br>Note that the child widget has to be visible itself
     * <br>(see [method&#64;Gtk.Widget.show]) in order to become the visible
     * <br>child of &#64;stack.
     * @param name the name of the child to make visible
    */
    public void setVisibleChildName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaStack.INST().gtk_stack_set_visible_child_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Makes the child with the given name visible.
     * <br>
     * <br>If &#64;child is different from the currently visible child,
     * <br>the transition between the two will be animated with the
     * <br>current transition type of &#64;stack.
     * <br>
     * <br>Note that the child widget has to be visible itself
     * <br>(see [method&#64;Gtk.Widget.show]) in order to become the visible
     * <br>child of &#64;stack.
     * @param name the name of the child to make visible
    */
    public void setVisibleChildName(String name)  {
        JnaStack.INST().gtk_stack_set_visible_child_name(asCPointer(), name);
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
        return JnaStack.INST().gtk_stack_get_type(); 
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
