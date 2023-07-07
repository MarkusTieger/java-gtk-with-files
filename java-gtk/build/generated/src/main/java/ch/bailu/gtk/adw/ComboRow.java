/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;Gtk.ListBoxRow] used to choose from a list of items.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;combo-row-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;combo-row.png&quot; alt=&quot;combo-row&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwComboRow` widget allows the user to choose from a list of valid
 * <br>choices. The row displays the selected choice. When activated, the row
 * <br>displays a popover which allows the user to make a new choice.
 * <br>
 * <br>Example of an `AdwComboRow` UI definition:
 * <br>```xml
 * <br>&lt;object class=&quot;AdwComboRow&quot;&gt;
 * <br>  &lt;property name=&quot;title&quot; translatable=&quot;yes&quot;&gt;Combo Row&lt;/property&gt;
 * <br>  &lt;property name=&quot;model&quot;&gt;
 * <br>    &lt;object class=&quot;GtkStringList&quot;&gt;
 * <br>      &lt;items&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Foo&lt;/item&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Bar&lt;/item&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Baz&lt;/item&gt;
 * <br>      &lt;/items&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>The [property&#64;ComboRow:selected] and [property&#64;ComboRow:selected-item]
 * <br>properties can be used to keep track of the selected item and react to their
 * <br>changes.
 * <br>
 * <br>`AdwComboRow` mirrors [class&#64;Gtk.DropDown], see that widget for details.
 * <br>
 * <br>`AdwComboRow` is [property&#64;Gtk.ListBoxRow:activatable] if a model is set.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwComboRow` has a main CSS node with name `row` and the `.combo` style
 * <br>class.
 * <br>
 * <br>Its popover has the node named `popover` with the `.menu` style class, it
 * <br>contains a [class&#64;Gtk.ScrolledWindow], which in turn contains a
 * <br>[class&#64;Gtk.ListView], both are accessible via their regular nodes.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwComboRow` uses the `GTK_ACCESSIBLE_ROLE_COMBO_BOX` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ComboRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ComboRow.html</a></p>
*/
public class ComboRow extends ActionRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ComboRow.class.getCanonicalName());
    }

    public ComboRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwComboRow`.
    */
    public ComboRow() {
        super(cast(JnaComboRow.INST().adw_combo_row_new()));
    }

    /**
     * Gets the expression used to obtain strings from items.
     * @return the expression used to obtain strings from items
    */
    public ch.bailu.gtk.gtk.Expression getExpression()  {
        return new ch.bailu.gtk.gtk.Expression(new PointerContainer(JnaComboRow.INST().adw_combo_row_get_expression(asCPointer())));
    }

    /**
     * Gets the factory for populating list items.
     * @return the factory in use
    */
    public ch.bailu.gtk.gtk.ListItemFactory getFactory()  {
        return new ch.bailu.gtk.gtk.ListItemFactory(new PointerContainer(JnaComboRow.INST().adw_combo_row_get_factory(asCPointer())));
    }

    /**
     * Gets the factory for populating list items in the popup.
     * @return the factory in use
    */
    public ch.bailu.gtk.gtk.ListItemFactory getListFactory()  {
        return new ch.bailu.gtk.gtk.ListItemFactory(new PointerContainer(JnaComboRow.INST().adw_combo_row_get_list_factory(asCPointer())));
    }

    /**
     * Gets the model that provides the displayed items.
     * @return The model in use
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaComboRow.INST().adw_combo_row_get_model(asCPointer())));
    }

    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or   [const&#64;Gtk.INVALID_LIST_POSITION] if no item is selected
    */
    public int getSelected()  {
        return JnaComboRow.INST().adw_combo_row_get_selected(asCPointer());
    }

    /**
     * Gets the selected item.
     * @return the selected item
    */
    public ch.bailu.gtk.type.Pointer getSelectedItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaComboRow.INST().adw_combo_row_get_selected_item(asCPointer())));
    }

    /**
     * Gets whether to use the current value as the subtitle.
     * @return whether to use the current value as the subtitle
    */
    public boolean getUseSubtitle()  {
        return JnaComboRow.INST().adw_combo_row_get_use_subtitle(asCPointer());
    }

    /**
     * Sets the expression used to obtain strings from items.
     * <br>
     * <br>The expression must have a value type of `G_TYPE_STRING`.
     * <br>
     * <br>It's used to bind strings to labels produced by the default factory if
     * <br>[property&#64;ComboRow:factory] is not set, or when
     * <br>[property&#64;ComboRow:use-subtitle] is set to `TRUE`.
     * @param expression an expression
    */
    public void setExpression(@Nullable ch.bailu.gtk.gtk.Expression expression)  {
        JnaComboRow.INST().adw_combo_row_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets the factory for populating list items.
     * <br>
     * <br>This factory is always used for the item in the row. It is also used for
     * <br>items in the popup unless [property&#64;ComboRow:list-factory] is set.
     * @param factory the factory to use
    */
    public void setFactory(@Nullable ch.bailu.gtk.gtk.ListItemFactory factory)  {
        JnaComboRow.INST().adw_combo_row_set_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the factory for populating list items in the popup.
     * <br>
     * <br>If this is not set, [property&#64;ComboRow:factory] is used.
     * @param factory the factory to use
    */
    public void setListFactory(@Nullable ch.bailu.gtk.gtk.ListItemFactory factory)  {
        JnaComboRow.INST().adw_combo_row_set_list_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the model that provides the displayed items.
     * @param model the model to use
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaComboRow.INST().adw_combo_row_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Selects the item at the given position.
     * @param position the position of the item to select, or   [const&#64;Gtk.INVALID_LIST_POSITION]
    */
    public void setSelected(int position)  {
        JnaComboRow.INST().adw_combo_row_set_selected(asCPointer(), position);
    }

    /**
     * Sets whether to use the current value as the subtitle.
     * <br>
     * <br>If you use a custom list item factory, you will need to give the row a
     * <br>name conversion expression with [property&#64;ComboRow:expression].
     * <br>
     * <br>If set to `TRUE`, you should not access [property&#64;ActionRow:subtitle].
     * <br>
     * <br>The subtitle is interpreted as Pango markup if
     * <br>[property&#64;PreferencesRow:use-markup] is set to `TRUE`.
     * @param use_subtitle whether to use the current value as the subtitle
    */
    public void setUseSubtitle(boolean use_subtitle)  {
        JnaComboRow.INST().adw_combo_row_set_use_subtitle(asCPointer(), use_subtitle);
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
        return JnaComboRow.INST().adw_combo_row_get_type(); 
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
