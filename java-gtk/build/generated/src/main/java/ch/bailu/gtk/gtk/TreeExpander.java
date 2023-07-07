/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkTreeExpander` is a widget that provides an expander for a list.
 * <br>
 * <br>It is typically placed as a bottommost child into a `GtkListView`
 * <br>to allow users to expand and collapse children in a list with a
 * <br>[class&#64;Gtk.TreeListModel]. `GtkTreeExpander` provides the common UI
 * <br>elements, gestures and keybindings for this purpose.
 * <br>
 * <br>On top of this, the &quot;listitem.expand&quot;, &quot;listitem.collapse&quot; and
 * <br>&quot;listitem.toggle-expand&quot; actions are provided to allow adding custom
 * <br>UI for managing expanded state.
 * <br>
 * <br>The `GtkTreeListModel` must be set to not be passthrough. Then it
 * <br>will provide [class&#64;Gtk.TreeListRow] items which can be set via
 * <br>[method&#64;Gtk.TreeExpander.set_list_row] on the expander.
 * <br>The expander will then watch that row item automatically.
 * <br>[method&#64;Gtk.TreeExpander.set_child] sets the widget that displays
 * <br>the actual row contents.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>treeexpander
 * <br>├── [indent]*
 * <br>├── [expander]
 * <br>╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>`GtkTreeExpander` has zero or one CSS nodes with the name &quot;expander&quot; that
 * <br>should display the expander icon. The node will be `:checked` when it
 * <br>is expanded. If the node is not expandable, an &quot;indent&quot; node will be
 * <br>displayed instead.
 * <br>
 * <br>For every level of depth, another &quot;indent&quot; node is prepended.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkTreeExpander` uses the %GTK_ACCESSIBLE_ROLE_GROUP role. The expander icon
 * <br>is represented as a %GTK_ACCESSIBLE_ROLE_BUTTON, labelled by the expander's
 * <br>child, and toggling it will change the %GTK_ACCESSIBLE_STATE_EXPANDED state.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeExpander.html">https://docs.gtk.org/gtk4/class.TreeExpander.html</a></p>
*/
public class TreeExpander extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeExpander.class.getCanonicalName());
    }

    public TreeExpander(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreeExpander`
    */
    public TreeExpander() {
        super(cast(JnaTreeExpander.INST().gtk_tree_expander_new()));
    }

    /**
     * Gets the child widget displayed by &#64;self.
     * @return The child displayed by &#64;self
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaTreeExpander.INST().gtk_tree_expander_get_child(asCPointer())));
    }

    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     * @return TRUE if the child should be indented when not expandable. Otherwise FALSE.
    */
    public boolean getIndentForIcon()  {
        return JnaTreeExpander.INST().gtk_tree_expander_get_indent_for_icon(asCPointer());
    }

    /**
     * Forwards the item set on the `GtkTreeListRow` that &#64;self is managing.
     * <br>
     * <br>This call is essentially equivalent to calling:
     * <br>
     * <br>```c
     * <br>gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (&#64;self));
     * <br>```
     * @return The item of the row
    */
    public ch.bailu.gtk.type.Pointer getItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTreeExpander.INST().gtk_tree_expander_get_item(asCPointer())));
    }

    /**
     * Gets the list row managed by &#64;self.
     * @return The list row displayed by &#64;self
    */
    public TreeListRow getListRow()  {
        return new TreeListRow(new PointerContainer(JnaTreeExpander.INST().gtk_tree_expander_get_list_row(asCPointer())));
    }

    /**
     * Sets the content widget to display.
     * @param child a `GtkWidget`
    */
    public void setChild(@Nullable Widget child)  {
        JnaTreeExpander.INST().gtk_tree_expander_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     * @param indent_for_icon TRUE if the child should be indented without expander. Otherwise FALSE.
    */
    public void setIndentForIcon(boolean indent_for_icon)  {
        JnaTreeExpander.INST().gtk_tree_expander_set_indent_for_icon(asCPointer(), indent_for_icon);
    }

    /**
     * Sets the tree list row that this expander should manage.
     * @param list_row a `GtkTreeListRow`
    */
    public void setListRow(@Nullable TreeListRow list_row)  {
        JnaTreeExpander.INST().gtk_tree_expander_set_list_row(asCPointer(), asCPointer(list_row));
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
        return JnaTreeExpander.INST().gtk_tree_expander_get_type(); 
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
