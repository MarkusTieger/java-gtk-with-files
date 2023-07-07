/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A view container for [class&#64;ViewSwitcher].
 * <br>
 * <br>`AdwViewStack` is a container which only shows one page at a time.
 * <br>It is typically used to hold an application's main views.
 * <br>
 * <br>It doesn't provide a way to transition between pages.
 * <br>Instead, a separate widget such as [class&#64;ViewSwitcher] can be used with
 * <br>`AdwViewStack` to provide this functionality.
 * <br>
 * <br>`AdwViewStack` pages can have a title, an icon, an attention request, and a
 * <br>numbered badge that [class&#64;ViewSwitcher] will use to let users identify which
 * <br>page is which. Set them using the [property&#64;ViewStackPage:title],
 * <br>[property&#64;ViewStackPage:icon-name],
 * <br>[property&#64;ViewStackPage:needs-attention], and
 * <br>[property&#64;ViewStackPage:badge-number] properties.
 * <br>
 * <br>Unlike [class&#64;Gtk.Stack], transitions between views are not animated.
 * <br>
 * <br>`AdwViewStack` maintains a [class&#64;ViewStackPage] object for each added child,
 * <br>which holds additional per-child properties. You obtain the
 * <br>[class&#64;ViewStackPage] for a child with [method&#64;ViewStack.get_page] and you
 * <br>can obtain a [iface&#64;Gtk.SelectionModel] containing all the pages with
 * <br>[method&#64;ViewStack.get_pages].
 * <br>
 * <br>&#35;&#35; AdwViewStack as GtkBuildable
 * <br>
 * <br>To set child-specific properties in a .ui file, create
 * <br>[class&#64;ViewStackPage] objects explicitly, and set the child widget as a
 * <br>property on it:
 * <br>
 * <br>```xml
 * <br>  &lt;object class=&quot;AdwViewStack&quot; id=&quot;stack&quot;&gt;
 * <br>    &lt;child&gt;
 * <br>      &lt;object class=&quot;AdwViewStackPage&quot;&gt;
 * <br>        &lt;property name=&quot;name&quot;&gt;overview&lt;/property&gt;
 * <br>        &lt;property name=&quot;title&quot;&gt;Overview&lt;/property&gt;
 * <br>        &lt;property name=&quot;child&quot;&gt;
 * <br>          &lt;object class=&quot;AdwStatusPage&quot;&gt;
 * <br>            &lt;property name=&quot;title&quot;&gt;Welcome!&lt;/property&gt;
 * <br>          &lt;/object&gt;
 * <br>        &lt;/property&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>  &lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwViewStack` has a single CSS node named `stack`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewStack.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewStack.html</a></p>
*/
public class ViewStack extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewStack.class.getCanonicalName());
    }

    public ViewStack(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwViewStack`.
    */
    public ViewStack() {
        super(cast(JnaViewStack.INST().adw_view_stack_new()));
    }

    /**
     * Adds a child to &#64;self.
     * @param child the widget to add
     * @return the [class&#64;ViewStackPage] for &#64;child
    */
    public ViewStackPage add(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addNamed(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable ch.bailu.gtk.type.Str name)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_named(asCPointer(), asCPointerNotNull(child), asCPointer(name))));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addNamed(@Nonnull ch.bailu.gtk.gtk.Widget child, String name)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_named(asCPointer(), asCPointerNotNull(child), name)));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title will be used by
     * <br>[class&#64;ViewSwitcher] to represent &#64;child, so it should be short.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addTitled(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str title)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_titled(asCPointer(), asCPointerNotNull(child), asCPointer(name), asCPointerNotNull(title))));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title will be used by
     * <br>[class&#64;ViewSwitcher] to represent &#64;child, so it should be short.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addTitled(@Nonnull ch.bailu.gtk.gtk.Widget child, String name, String title)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_titled(asCPointer(), asCPointerNotNull(child), name, title)));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title and &#64;icon_name will be used
     * <br>by [class&#64;ViewSwitcher] to represent &#64;child.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @param icon_name an icon name for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addTitledWithIcon(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str title, @Nonnull ch.bailu.gtk.type.Str icon_name)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_titled_with_icon(asCPointer(), asCPointerNotNull(child), asCPointer(name), asCPointerNotNull(title), asCPointerNotNull(icon_name))));
    }

    /**
     * Adds a child to &#64;self.
     * <br>
     * <br>The child is identified by the &#64;name. The &#64;title and &#64;icon_name will be used
     * <br>by [class&#64;ViewSwitcher] to represent &#64;child.
     * @param child the widget to add
     * @param name the name for &#64;child
     * @param title a human-readable title for &#64;child
     * @param icon_name an icon name for &#64;child
     * @return the `AdwViewStackPage` for &#64;child
    */
    public ViewStackPage addTitledWithIcon(@Nonnull ch.bailu.gtk.gtk.Widget child, String name, String title, String icon_name)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_add_titled_with_icon(asCPointer(), asCPointerNotNull(child), name, title, icon_name)));
    }

    /**
     * Finds the child with &#64;name in &#64;self.
     * @param name the name of the child to find
     * @return the requested child
    */
    public ch.bailu.gtk.gtk.Widget getChildByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_child_by_name(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Finds the child with &#64;name in &#64;self.
     * @param name the name of the child to find
     * @return the requested child
    */
    public ch.bailu.gtk.gtk.Widget getChildByName(String name)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_child_by_name(asCPointer(), name)));
    }

    /**
     * Gets whether &#64;self is horizontally homogeneous.
     * @return whether &#64;self is horizontally homogeneous
    */
    public boolean getHhomogeneous()  {
        return JnaViewStack.INST().adw_view_stack_get_hhomogeneous(asCPointer());
    }

    /**
     * Gets the [class&#64;ViewStackPage] object for &#64;child.
     * @param child a child of &#64;self
     * @return the page object for &#64;child
    */
    public ViewStackPage getPage(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new ViewStackPage(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Returns a [iface&#64;Gio.ListModel] that contains the pages of the stack.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also implements
     * <br>[iface&#64;Gtk.SelectionModel] and can be used to track and change the visible
     * <br>page.
     * @return a `GtkSelectionModel` for the stack's children
    */
    public ch.bailu.gtk.gtk.SelectionModel getPages()  {
        return new ch.bailu.gtk.gtk.SelectionModel(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_pages(asCPointer())));
    }

    /**
     * Gets whether &#64;self is vertically homogeneous.
     * @return whether &#64;self is vertically homogeneous
    */
    public boolean getVhomogeneous()  {
        return JnaViewStack.INST().adw_view_stack_get_vhomogeneous(asCPointer());
    }

    /**
     * Gets the currently visible child of &#64;self, .
     * @return the visible child
    */
    public ch.bailu.gtk.gtk.Widget getVisibleChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_visible_child(asCPointer())));
    }

    /**
     * Returns the name of the currently visible child of &#64;self.
     * @return the name of the visible child
    */
    public ch.bailu.gtk.type.Str getVisibleChildName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewStack.INST().adw_view_stack_get_visible_child_name(asCPointer())));
    }

    /**
     * Removes a child widget from &#64;self.
     * @param child the child to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaViewStack.INST().adw_view_stack_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets &#64;self to be horizontally homogeneous or not.
     * <br>
     * <br>If the stack is horizontally homogeneous, it allocates the same width for
     * <br>all children.
     * <br>
     * <br>If it's `FALSE`, the stack may change width when a different child becomes
     * <br>visible.
     * @param hhomogeneous whether to make &#64;self horizontally homogeneous
    */
    public void setHhomogeneous(boolean hhomogeneous)  {
        JnaViewStack.INST().adw_view_stack_set_hhomogeneous(asCPointer(), hhomogeneous);
    }

    /**
     * Sets &#64;self to be vertically homogeneous or not.
     * <br>
     * <br>If the stack is vertically homogeneous, it allocates the same height for
     * <br>all children.
     * <br>
     * <br>If it's `FALSE`, the stack may change height when a different child becomes
     * <br>visible.
     * @param vhomogeneous whether to make &#64;self vertically homogeneous
    */
    public void setVhomogeneous(boolean vhomogeneous)  {
        JnaViewStack.INST().adw_view_stack_set_vhomogeneous(asCPointer(), vhomogeneous);
    }

    /**
     * Makes &#64;child the visible child of &#64;self.
     * @param child a child of &#64;self
    */
    public void setVisibleChild(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaViewStack.INST().adw_view_stack_set_visible_child(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Makes the child with &#64;name visible.
     * <br>
     * <br>See [property&#64;ViewStack:visible-child].
     * @param name the name of the child
    */
    public void setVisibleChildName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaViewStack.INST().adw_view_stack_set_visible_child_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Makes the child with &#64;name visible.
     * <br>
     * <br>See [property&#64;ViewStack:visible-child].
     * @param name the name of the child
    */
    public void setVisibleChildName(String name)  {
        JnaViewStack.INST().adw_view_stack_set_visible_child_name(asCPointer(), name);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaViewStack.INST().adw_view_stack_get_type(); 
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
