/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDropDown` is a widget that allows the user to choose an item
 * <br>from a list of options.
 * <br>
 * <br>![An example GtkDropDown](drop-down.png)
 * <br>
 * <br>The `GtkDropDown` displays the selected choice.
 * <br>
 * <br>The options are given to `GtkDropDown` in the form of `GListModel`
 * <br>and how the individual options are represented is determined by
 * <br>a [class&#64;Gtk.ListItemFactory]. The default factory displays simple strings.
 * <br>
 * <br>`GtkDropDown` knows how to obtain strings from the items in a
 * <br>[class&#64;Gtk.StringList]; for other models, you have to provide an expression
 * <br>to find the strings via [method&#64;Gtk.DropDown.set_expression].
 * <br>
 * <br>`GtkDropDown` can optionally allow search in the popup, which is
 * <br>useful if the list of options is long. To enable the search entry,
 * <br>use [method&#64;Gtk.DropDown.set_enable_search].
 * <br>
 * <br>Here is a UI definition example for `GtkDropDown` with a simple model:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkDropDown&quot;&gt;
 * <br>  &lt;property name=&quot;model&quot;&gt;
 * <br>    &lt;object class=&quot;GtkStringList&quot;&gt;
 * <br>      &lt;items&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Factory&lt;/item&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Home&lt;/item&gt;
 * <br>        &lt;item translatable=&quot;yes&quot;&gt;Subway&lt;/item&gt;
 * <br>      &lt;/items&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkDropDown` has a single CSS node with name dropdown,
 * <br>with the button and popover nodes as children.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkDropDown` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.DropDown.html">https://docs.gtk.org/gtk4/class.DropDown.html</a></p>
*/
public class DropDown extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DropDown.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the drop down is activated.
         * <br>
         * <br>The `::activate` signal on `GtkDropDown` is an action signal and
         * <br>emitting it causes the drop down to pop up its dropdown.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaDropDown.OnActivate) (__self, __data) -> in.onActivate();
    }

    public DropDown(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDropDown` that is populated with
     * <br>the strings.
     * @param strings The strings to put in the dropdown
     * @return a new `GtkDropDown`
    */
    public static DropDown newFromStringsDropDown(@Nonnull ch.bailu.gtk.type.Strs strings)  {
        PointerContainer __self = cast(JnaDropDown.INST().gtk_drop_down_new_from_strings(asCPointerNotNull(strings)));
        if (__self.isNull()) {
            throw new NullPointerException("DropDown:newFromStrings");
        }
        return new DropDown(__self);
    }        
    

    /**
     * Creates a new `GtkDropDown`.
     * <br>
     * <br>You may want to call [method&#64;Gtk.DropDown.set_factory]
     * <br>to set up a way to map its items to widgets.
     * @param model the model to use
     * @param expression the expression to use
    */
    public DropDown(@Nullable ch.bailu.gtk.gio.ListModel model, @Nullable Expression expression) {
        super(cast(JnaDropDown.INST().gtk_drop_down_new(asCPointer(model), asCPointer(expression))));
    }

    /**
     * Returns whether search is enabled.
     * @return %TRUE if the popup includes a search entry
    */
    public boolean getEnableSearch()  {
        return JnaDropDown.INST().gtk_drop_down_get_enable_search(asCPointer());
    }

    /**
     * Gets the expression set that is used to obtain strings from items.
     * <br>
     * <br>See [method&#64;Gtk.DropDown.set_expression].
     * @return a `GtkExpression`
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaDropDown.INST().gtk_drop_down_get_expression(asCPointer())));
    }

    /**
     * Gets the factory that's currently used to populate list items.
     * <br>
     * <br>The factory returned by this function is always used for the
     * <br>item in the button. It is also used for items in the popup
     * <br>if [property&#64;Gtk.DropDown:list-factory] is not set.
     * @return The factory in use
    */
    public ListItemFactory getFactory()  {
        return new ListItemFactory(new PointerContainer(JnaDropDown.INST().gtk_drop_down_get_factory(asCPointer())));
    }

    /**
     * Gets the factory that's currently used to populate list items in the popup.
     * @return The factory in use
    */
    public ListItemFactory getListFactory()  {
        return new ListItemFactory(new PointerContainer(JnaDropDown.INST().gtk_drop_down_get_list_factory(asCPointer())));
    }

    /**
     * Gets the model that provides the displayed items.
     * @return The model in use
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaDropDown.INST().gtk_drop_down_get_model(asCPointer())));
    }

    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or %GTK_INVALID_LIST_POSITION   if not item is selected
    */
    public int getSelected()  {
        return JnaDropDown.INST().gtk_drop_down_get_selected(asCPointer());
    }

    /**
     * Gets the selected item. If no item is selected, %NULL is returned.
     * @return The selected item
    */
    public ch.bailu.gtk.type.Pointer getSelectedItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaDropDown.INST().gtk_drop_down_get_selected_item(asCPointer())));
    }

    /**
     * Returns whether to show an arrow within the widget.
     * @return %TRUE if an arrow will be shown.
    */
    public boolean getShowArrow()  {
        return JnaDropDown.INST().gtk_drop_down_get_show_arrow(asCPointer());
    }

    /**
     * Sets whether a search entry will be shown in the popup that
     * <br>allows to search for items in the list.
     * <br>
     * <br>Note that [property&#64;Gtk.DropDown:expression] must be set for
     * <br>search to work.
     * @param enable_search whether to enable search
    */
    public void setEnableSearch(boolean enable_search)  {
        JnaDropDown.INST().gtk_drop_down_set_enable_search(asCPointer(), enable_search);
    }

    /**
     * Sets the expression that gets evaluated to obtain strings from items.
     * <br>
     * <br>This is used for search in the popup. The expression must have
     * <br>a value type of %G_TYPE_STRING.
     * @param expression a `GtkExpression`
    */
    public void setExpression(@Nullable Expression expression)  {
        JnaDropDown.INST().gtk_drop_down_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     * @param factory the factory to use
    */
    public void setFactory(@Nullable ListItemFactory factory)  {
        JnaDropDown.INST().gtk_drop_down_set_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the `GtkListItemFactory` to use for populating list items in the popup.
     * @param factory the factory to use
    */
    public void setListFactory(@Nullable ListItemFactory factory)  {
        JnaDropDown.INST().gtk_drop_down_set_list_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the `GListModel` to use.
     * @param model the model to use
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaDropDown.INST().gtk_drop_down_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Selects the item at the given position.
     * @param position the position of the item to select, or %GTK_INVALID_LIST_POSITION
    */
    public void setSelected(int position)  {
        JnaDropDown.INST().gtk_drop_down_set_selected(asCPointer(), position);
    }

    /**
     * Sets whether an arrow will be displayed within the widget.
     * @param show_arrow whether to show an arrow within the widget
    */
    public void setShowArrow(boolean show_arrow)  {
        JnaDropDown.INST().gtk_drop_down_set_show_arrow(asCPointer(), show_arrow);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
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
        return JnaDropDown.INST().gtk_drop_down_get_type(); 
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
