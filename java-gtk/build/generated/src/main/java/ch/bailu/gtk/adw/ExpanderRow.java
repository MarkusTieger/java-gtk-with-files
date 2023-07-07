/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;Gtk.ListBoxRow] used to reveal widgets.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;expander-row-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;expander-row.png&quot; alt=&quot;expander-row&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwExpanderRow` widget allows the user to reveal or hide widgets below
 * <br>it. It also allows the user to enable the expansion of the row, allowing to
 * <br>disable all that the row contains.
 * <br>
 * <br>&#35;&#35; AdwExpanderRow as GtkBuildable
 * <br>
 * <br>The `AdwExpanderRow` implementation of the [iface&#64;Gtk.Buildable] interface
 * <br>supports adding a child as an action widget by specifying “action” as the
 * <br>“type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>It also supports adding it as a prefix widget by specifying “prefix” as the
 * <br>“type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwExpanderRow` has a main CSS node with name `row` and the `.expander`
 * <br>style class. It has the `.empty` style class when it contains no children.
 * <br>
 * <br>It contains the subnodes `row.header` for its main embedded row,
 * <br>`list.nested` for the list it can expand, and `image.expander-row-arrow` for
 * <br>its arrow.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ExpanderRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ExpanderRow.html</a></p>
*/
public class ExpanderRow extends PreferencesRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ExpanderRow.class.getCanonicalName());
    }

    public ExpanderRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwExpanderRow`.
    */
    public ExpanderRow() {
        super(cast(JnaExpanderRow.INST().adw_expander_row_new()));
    }

    /**
     * Adds an action widget to &#64;self.
     * @param widget a widget
    */
    public void addAction(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaExpanderRow.INST().adw_expander_row_add_action(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Adds a prefix widget to &#64;self.
     * @param widget a widget
    */
    public void addPrefix(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaExpanderRow.INST().adw_expander_row_add_prefix(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Adds a widget to &#64;self.
     * <br>
     * <br>The widget will appear in the expanding list below &#64;self.
     * @param child a widget
    */
    public void addRow(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaExpanderRow.INST().adw_expander_row_add_row(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Gets whether the expansion of &#64;self is enabled.
     * @return whether the expansion of &#64;self is enabled.
    */
    public boolean getEnableExpansion()  {
        return JnaExpanderRow.INST().adw_expander_row_get_enable_expansion(asCPointer());
    }

    /**
     * Gets whether &#64;self is expanded.
     * @return whether &#64;self is expanded
    */
    public boolean getExpanded()  {
        return JnaExpanderRow.INST().adw_expander_row_get_expanded(asCPointer());
    }

    /**
     * Gets the icon name for &#64;self.
     * @return the icon name for &#64;self
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaExpanderRow.INST().adw_expander_row_get_icon_name(asCPointer())));
    }

    /**
     * Gets whether the switch enabling the expansion of &#64;self is visible.
     * @return whether the switch enabling the expansion is visible
    */
    public boolean getShowEnableSwitch()  {
        return JnaExpanderRow.INST().adw_expander_row_get_show_enable_switch(asCPointer());
    }

    /**
     * Gets the subtitle for &#64;self.
     * @return the subtitle for &#64;self
    */
    public ch.bailu.gtk.type.Str getSubtitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaExpanderRow.INST().adw_expander_row_get_subtitle(asCPointer())));
    }

    /**
     * 
     * @param child 
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaExpanderRow.INST().adw_expander_row_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets whether the expansion of &#64;self is enabled.
     * @param enable_expansion whether to enable the expansion
    */
    public void setEnableExpansion(boolean enable_expansion)  {
        JnaExpanderRow.INST().adw_expander_row_set_enable_expansion(asCPointer(), enable_expansion);
    }

    /**
     * Sets whether &#64;self is expanded.
     * @param expanded whether to expand the row
    */
    public void setExpanded(boolean expanded)  {
        JnaExpanderRow.INST().adw_expander_row_set_expanded(asCPointer(), expanded);
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaExpanderRow.INST().adw_expander_row_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaExpanderRow.INST().adw_expander_row_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets whether the switch enabling the expansion of &#64;self is visible.
     * @param show_enable_switch whether to show the switch enabling the expansion
    */
    public void setShowEnableSwitch(boolean show_enable_switch)  {
        JnaExpanderRow.INST().adw_expander_row_set_show_enable_switch(asCPointer(), show_enable_switch);
    }

    /**
     * Sets the subtitle for &#64;self.
     * <br>
     * <br>The subtitle is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param subtitle the subtitle
    */
    public void setSubtitle(@Nonnull ch.bailu.gtk.type.Str subtitle)  {
        JnaExpanderRow.INST().adw_expander_row_set_subtitle(asCPointer(), asCPointerNotNull(subtitle));
    }

    /**
     * Sets the subtitle for &#64;self.
     * <br>
     * <br>The subtitle is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param subtitle the subtitle
    */
    public void setSubtitle(String subtitle)  {
        JnaExpanderRow.INST().adw_expander_row_set_subtitle(asCPointer(), subtitle);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Actionable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Actionable}
    */
    public ch.bailu.gtk.gtk.Actionable asActionable() {
        return new ch.bailu.gtk.gtk.Actionable(cast());
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
        return JnaExpanderRow.INST().adw_expander_row_get_type(); 
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
