/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkComboBox` is a widget that allows the user to choose from a list of
 * <br>valid choices.
 * <br>
 * <br>![An example GtkComboBox](combo-box.png)
 * <br>
 * <br>The `GtkComboBox` displays the selected choice; when activated, the
 * <br>`GtkComboBox` displays a popup which allows the user to make a new choice.
 * <br>
 * <br>The `GtkComboBox` uses the model-view pattern; the list of valid choices
 * <br>is specified in the form of a tree model, and the display of the choices
 * <br>can be adapted to the data in the model by using cell renderers, as you
 * <br>would in a tree view. This is possible since `GtkComboBox` implements the
 * <br>[iface&#64;Gtk.CellLayout] interface. The tree model holding the valid
 * <br>choices is not restricted to a flat list, it can be a real tree, and the
 * <br>popup will reflect the tree structure.
 * <br>
 * <br>To allow the user to enter values not in the model, the
 * <br>[property&#64;Gtk.ComboBox:has-entry] property allows the `GtkComboBox` to
 * <br>contain a [class&#64;Gtk.Entry]. This entry can be accessed by calling
 * <br>[method&#64;Gtk.ComboBox.get_child] on the combo box.
 * <br>
 * <br>For a simple list of textual choices, the model-view API of `GtkComboBox`
 * <br>can be a bit overwhelming. In this case, [class&#64;Gtk.ComboBoxText] offers
 * <br>a simple alternative. Both `GtkComboBox` and `GtkComboBoxText` can contain
 * <br>an entry.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>combobox
 * <br>├── box.linked
 * <br>│   ╰── button.combo
 * <br>│       ╰── box
 * <br>│           ├── cellview
 * <br>│           ╰── arrow
 * <br>╰── window.popup
 * <br>```
 * <br>
 * <br>A normal combobox contains a box with the .linked class, a button
 * <br>with the .combo class and inside those buttons, there are a cellview and
 * <br>an arrow.
 * <br>
 * <br>```
 * <br>combobox
 * <br>├── box.linked
 * <br>│   ├── entry.combo
 * <br>│   ╰── button.combo
 * <br>│       ╰── box
 * <br>│           ╰── arrow
 * <br>╰── window.popup
 * <br>```
 * <br>
 * <br>A `GtkComboBox` with an entry has a single CSS node with name combobox.
 * <br>It contains a box with the .linked class. That box contains an entry and
 * <br>a button, both with the .combo class added. The button also contains another
 * <br>node with name arrow.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkComboBox` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.ComboBox.html">https://docs.gtk.org/gtk4/class.ComboBox.html</a></p>
*/
public class ComboBox extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ComboBox.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeViewRowSeparatorFunc {
        /**
         * Function type for determining whether the row pointed to by &#64;iter should
         * <br>be rendered as a separator. A common way to implement this is to have a
         * <br>boolean column in the model, whose values the `GtkTreeViewRowSeparatorFunc`
         * <br>returns.
         * @param model the `GtkTreeModel`
         * @param iter a `GtkTreeIter` pointing at a row in &#64;model
         * @param data user data
         * @return %TRUE if the row is a separator
        */
        boolean onTreeViewRowSeparatorFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaComboBox.OnTreeViewRowSeparatorFunc toOnTreeViewRowSeparatorFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeViewRowSeparatorFunc in) {
        JnaComboBox.OnTreeViewRowSeparatorFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _iter, _data) -> in.onTreeViewRowSeparatorFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaComboBox.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaComboBox.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the combo box is activated.
         * <br>
         * <br>The `::activate` signal on `GtkComboBox` is an action signal and
         * <br>emitting it causes the combo box to pop up its dropdown.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaComboBox.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the active item is changed.
         * <br>
         * <br>The can be due to the user selecting a different item from the list,
         * <br>or due to a call to [method&#64;Gtk.ComboBox.set_active_iter]. It will
         * <br>also be emitted while typing into the entry of a combo box with an entry.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaComboBox.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnFormatEntryText {
        /**
         * Emitted to allow changing how the text in a combo box's entry is displayed.
         * <br>
         * <br>See [property&#64;Gtk.ComboBox:has-entry].
         * <br>
         * <br>Connect a signal handler which returns an allocated string representing
         * <br>&#64;path. That string will then be used to set the text in the combo box's
         * <br>entry. The default signal handler uses the text from the
         * <br>[property&#64;Gtk.ComboBox:entry-text-column] model column.
         * <br>
         * <br>Here's an example signal handler which fetches data from the model and
         * <br>displays it in the entry.
         * <br>```c
         * <br>static char *
         * <br>format_entry_text_callback (GtkComboBox *combo,
         * <br>                            const char *path,
         * <br>                            gpointer     user_data)
         * <br>{
         * <br>  GtkTreeIter iter;
         * <br>  GtkTreeModel model;
         * <br>  double       value;
         * <br>
         * <br>  model = gtk_combo_box_get_model (combo);
         * <br>
         * <br>  gtk_tree_model_get_iter_from_string (model, &amp;iter, path);
         * <br>  gtk_tree_model_get (model, &amp;iter,
         * <br>                      THE_DOUBLE_VALUE_COLUMN, &amp;value,
         * <br>                      -1);
         * <br>
         * <br>  return g_strdup_printf (&quot;%g&quot;, value);
         * <br>}
         * <br>```
         * @param path the [struct&#64;Gtk.TreePath] string from the combo box's current model   to format text for
         * @return a newly allocated string representing &#64;path   for the current `GtkComboBox` model.
        */
        ch.bailu.gtk.type.Str onFormatEntryText(@Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnFormatEntryText(OnFormatEntryText in) {
        return (in == null) ? null: (JnaComboBox.OnFormatEntryText) (__self, _path, __data) -> in.onFormatEntryText(new ch.bailu.gtk.type.Str(new PointerContainer(_path))).asCPointer();
    }

    @FunctionalInterface
    public interface OnMoveActive {
        /**
         * Emitted to move the active selection.
         * <br>
         * <br>This is an [keybinding signal](class.SignalAction.html).
         * @param scroll_type a `GtkScrollType`
        */
        void onMoveActive(int scroll_type);
    }
    
    private static com.sun.jna.Callback toOnMoveActive(OnMoveActive in) {
        return (in == null) ? null: (JnaComboBox.OnMoveActive) (__self, _scroll_type, __data) -> in.onMoveActive(_scroll_type);
    }

    @FunctionalInterface
    public interface OnPopdown {
        /**
         * Emitted to popdown the combo box list.
         * <br>
         * <br>This is an [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are Alt+Up and Escape.
         * @return 
        */
        boolean onPopdown();
    }
    
    private static com.sun.jna.Callback toOnPopdown(OnPopdown in) {
        return (in == null) ? null: (JnaComboBox.OnPopdown) (__self, __data) -> in.onPopdown();
    }

    @FunctionalInterface
    public interface OnPopup {
        /**
         * Emitted to popup the combo box list.
         * <br>
         * <br>This is an [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is Alt+Down.
        */
        void onPopup();
    }
    
    private static com.sun.jna.Callback toOnPopup(OnPopup in) {
        return (in == null) ? null: (JnaComboBox.OnPopup) (__self, __data) -> in.onPopup();
    }

    public ComboBox(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new empty `GtkComboBox` with an entry.
     * <br>
     * <br>In order to use a combo box with entry, you need to tell it
     * <br>which column of the model contains the text for the entry
     * <br>by calling [method&#64;Gtk.ComboBox.set_entry_text_column].
     * @return A new `GtkComboBox`
    */
    public static ComboBox newWithEntryComboBox()  {
        PointerContainer __self = cast(JnaComboBox.INST().gtk_combo_box_new_with_entry());
        if (__self.isNull()) {
            throw new NullPointerException("ComboBox:newWithEntry");
        }
        return new ComboBox(__self);
    }        
    

    /**
     * Creates a new `GtkComboBox` with a model.
     * @param model a `GtkTreeModel`
     * @return A new `GtkComboBox`
    */
    public static ComboBox newWithModelComboBox(@Nonnull TreeModel model)  {
        PointerContainer __self = cast(JnaComboBox.INST().gtk_combo_box_new_with_model(asCPointerNotNull(model)));
        if (__self.isNull()) {
            throw new NullPointerException("ComboBox:newWithModel");
        }
        return new ComboBox(__self);
    }        
    

    /**
     * Creates a new empty `GtkComboBox` with an entry and a model.
     * <br>
     * <br>See also [ctor&#64;Gtk.ComboBox.new_with_entry].
     * @param model A `GtkTreeModel`
     * @return A new `GtkComboBox`
    */
    public static ComboBox newWithModelAndEntryComboBox(@Nonnull TreeModel model)  {
        PointerContainer __self = cast(JnaComboBox.INST().gtk_combo_box_new_with_model_and_entry(asCPointerNotNull(model)));
        if (__self.isNull()) {
            throw new NullPointerException("ComboBox:newWithModelAndEntry");
        }
        return new ComboBox(__self);
    }        
    

    /**
     * Creates a new empty `GtkComboBox`.
    */
    public ComboBox() {
        super(cast(JnaComboBox.INST().gtk_combo_box_new()));
    }

    /**
     * Returns the index of the currently active item.
     * <br>
     * <br>If the model is a non-flat treemodel, and the active item is not
     * <br>an immediate child of the root of the tree, this function returns
     * <br>`gtk_tree_path_get_indices (path)[0]`, where `path` is the
     * <br>[struct&#64;Gtk.TreePath] of the active item.
     * @return An integer which is the index of the currently active item,   or -1 if there’s no active item
    */
    public int getActive()  {
        return JnaComboBox.INST().gtk_combo_box_get_active(asCPointer());
    }

    /**
     * Returns the ID of the active row of &#64;combo_box.
     * <br>
     * <br>This value is taken from the active row and the column specified
     * <br>by the [property&#64;Gtk.ComboBox:id-column] property of &#64;combo_box
     * <br>(see [method&#64;Gtk.ComboBox.set_id_column]).
     * <br>
     * <br>The returned value is an interned string which means that you can
     * <br>compare the pointer by value to other interned strings and that you
     * <br>must not free it.
     * <br>
     * <br>If the [property&#64;Gtk.ComboBox:id-column] property of &#64;combo_box is
     * <br>not set, or if no row is active, or if the active row has a %NULL
     * <br>ID value, then %NULL is returned.
     * @return the ID of the active row
    */
    public ch.bailu.gtk.type.Str getActiveId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaComboBox.INST().gtk_combo_box_get_active_id(asCPointer())));
    }

    /**
     * Sets &#64;iter to point to the currently active item.
     * <br>
     * <br>If no item is active, &#64;iter is left unchanged.
     * @param iter A `GtkTreeIter`
     * @return %TRUE if &#64;iter was set, %FALSE otherwise
    */
    public boolean getActiveIter(@Nonnull TreeIter iter)  {
        return JnaComboBox.INST().gtk_combo_box_get_active_iter(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Returns whether the combo box sets the dropdown button
     * <br>sensitive or not when there are no items in the model.
     * @return %GTK_SENSITIVITY_ON if the dropdown button   is sensitive when the model is empty, %GTK_SENSITIVITY_OFF   if the button is always insensitive or %GTK_SENSITIVITY_AUTO   if it is only sensitive as long as the model has one item to   be selected.
    */
    public int getButtonSensitivity()  {
        return JnaComboBox.INST().gtk_combo_box_get_button_sensitivity(asCPointer());
    }

    /**
     * Gets the child widget of &#64;combo_box.
     * @return the child widget of &#64;combo_box
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaComboBox.INST().gtk_combo_box_get_child(asCPointer())));
    }

    /**
     * Returns the column which &#64;combo_box is using to get the strings
     * <br>from to display in the internal entry.
     * @return A column in the data source model of &#64;combo_box.
    */
    public int getEntryTextColumn()  {
        return JnaComboBox.INST().gtk_combo_box_get_entry_text_column(asCPointer());
    }

    /**
     * Returns whether the combo box has an entry.
     * @return whether there is an entry in &#64;combo_box.
    */
    public boolean getHasEntry()  {
        return JnaComboBox.INST().gtk_combo_box_get_has_entry(asCPointer());
    }

    /**
     * Returns the column which &#64;combo_box is using to get string IDs
     * <br>for values from.
     * @return A column in the data source model of &#64;combo_box.
    */
    public int getIdColumn()  {
        return JnaComboBox.INST().gtk_combo_box_get_id_column(asCPointer());
    }

    /**
     * Returns the `GtkTreeModel` of &#64;combo_box.
     * @return A `GtkTreeModel` which was passed   during construction.
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaComboBox.INST().gtk_combo_box_get_model(asCPointer())));
    }

    /**
     * Gets whether the popup uses a fixed width.
     * @return %TRUE if the popup uses a fixed width
    */
    public boolean getPopupFixedWidth()  {
        return JnaComboBox.INST().gtk_combo_box_get_popup_fixed_width(asCPointer());
    }

    /**
     * Hides the menu or dropdown list of &#64;combo_box.
     * <br>
     * <br>This function is mostly intended for use by accessibility technologies;
     * <br>applications should have little use for it.
    */
    public void popdown()  {
        JnaComboBox.INST().gtk_combo_box_popdown(asCPointer());
    }

    /**
     * Pops up the menu or dropdown list of &#64;combo_box.
     * <br>
     * <br>This function is mostly intended for use by accessibility technologies;
     * <br>applications should have little use for it.
     * <br>
     * <br>Before calling this, &#64;combo_box must be mapped, or nothing will happen.
    */
    public void popup()  {
        JnaComboBox.INST().gtk_combo_box_popup(asCPointer());
    }

    /**
     * Pops up the menu of &#64;combo_box.
     * <br>
     * <br>Note that currently this does not do anything with the device, as it was
     * <br>previously only used for list-mode combo boxes, and those were removed
     * <br>in GTK 4. However, it is retained in case similar functionality is added
     * <br>back later.
     * @param device a `GdkDevice`
    */
    public void popupForDevice(@Nonnull ch.bailu.gtk.gdk.Device device)  {
        JnaComboBox.INST().gtk_combo_box_popup_for_device(asCPointer(), asCPointerNotNull(device));
    }

    /**
     * Sets the active item of &#64;combo_box to be the item at &#64;index.
     * @param index_ An index in the model passed during construction,   or -1 to have no active item
    */
    public void setActive(int index_)  {
        JnaComboBox.INST().gtk_combo_box_set_active(asCPointer(), index_);
    }

    /**
     * Changes the active row of &#64;combo_box to the one that has an ID equal to
     * <br>&#64;active_id.
     * <br>
     * <br>If &#64;active_id is %NULL, the active row is unset. Rows having
     * <br>a %NULL ID string cannot be made active by this function.
     * <br>
     * <br>If the [property&#64;Gtk.ComboBox:id-column] property of &#64;combo_box is
     * <br>unset or if no row has the given ID then the function does nothing
     * <br>and returns %FALSE.
     * @param active_id the ID of the row to select
     * @return %TRUE if a row with a matching ID was found. If a %NULL   &#64;active_id was given to unset the active row, the function   always returns %TRUE.
    */
    public boolean setActiveId(@Nullable ch.bailu.gtk.type.Str active_id)  {
        return JnaComboBox.INST().gtk_combo_box_set_active_id(asCPointer(), asCPointer(active_id));
    }

    /**
     * Changes the active row of &#64;combo_box to the one that has an ID equal to
     * <br>&#64;active_id.
     * <br>
     * <br>If &#64;active_id is %NULL, the active row is unset. Rows having
     * <br>a %NULL ID string cannot be made active by this function.
     * <br>
     * <br>If the [property&#64;Gtk.ComboBox:id-column] property of &#64;combo_box is
     * <br>unset or if no row has the given ID then the function does nothing
     * <br>and returns %FALSE.
     * @param active_id the ID of the row to select
     * @return %TRUE if a row with a matching ID was found. If a %NULL   &#64;active_id was given to unset the active row, the function   always returns %TRUE.
    */
    public boolean setActiveId(String active_id)  {
        return JnaComboBox.INST().gtk_combo_box_set_active_id(asCPointer(), active_id);
    }

    /**
     * Sets the current active item to be the one referenced by &#64;iter.
     * <br>
     * <br>If &#64;iter is %NULL, the active item is unset.
     * @param iter The `GtkTreeIter`
    */
    public void setActiveIter(@Nullable TreeIter iter)  {
        JnaComboBox.INST().gtk_combo_box_set_active_iter(asCPointer(), asCPointer(iter));
    }

    /**
     * Sets whether the dropdown button of the combo box should update
     * <br>its sensitivity depending on the model contents.
     * @param sensitivity specify the sensitivity of the dropdown button
    */
    public void setButtonSensitivity(int sensitivity)  {
        JnaComboBox.INST().gtk_combo_box_set_button_sensitivity(asCPointer(), sensitivity);
    }

    /**
     * Sets the child widget of &#64;combo_box.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaComboBox.INST().gtk_combo_box_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the model column which &#64;combo_box should use to get strings
     * <br>from to be &#64;text_column.
     * <br>
     * <br>For this column no separate
     * <br>[class&#64;Gtk.CellRenderer] is needed.
     * <br>
     * <br>The column &#64;text_column in the model of &#64;combo_box must be of
     * <br>type %G_TYPE_STRING.
     * <br>
     * <br>This is only relevant if &#64;combo_box has been created with
     * <br>[property&#64;Gtk.ComboBox:has-entry] as %TRUE.
     * @param text_column A column in &#64;model to get the strings from for   the internal entry
    */
    public void setEntryTextColumn(int text_column)  {
        JnaComboBox.INST().gtk_combo_box_set_entry_text_column(asCPointer(), text_column);
    }

    /**
     * Sets the model column which &#64;combo_box should use to get string IDs
     * <br>for values from.
     * <br>
     * <br>The column &#64;id_column in the model of &#64;combo_box must be of type
     * <br>%G_TYPE_STRING.
     * @param id_column A column in &#64;model to get string IDs for values from
    */
    public void setIdColumn(int id_column)  {
        JnaComboBox.INST().gtk_combo_box_set_id_column(asCPointer(), id_column);
    }

    /**
     * Sets the model used by &#64;combo_box to be &#64;model.
     * <br>
     * <br>Will unset a previously set model (if applicable). If model is %NULL,
     * <br>then it will unset the model.
     * <br>
     * <br>Note that this function does not clear the cell renderers, you have to
     * <br>call [method&#64;Gtk.CellLayout.clear] yourself if you need to set up different
     * <br>cell renderers for the new model.
     * @param model A `GtkTreeModel`
    */
    public void setModel(@Nullable TreeModel model)  {
        JnaComboBox.INST().gtk_combo_box_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Specifies whether the popup’s width should be a fixed width.
     * <br>
     * <br>If &#64;fixed is %TRUE, the popup's width is set to match the
     * <br>allocated width of the combo box.
     * @param fixed whether to use a fixed popup width
    */
    public void setPopupFixedWidth(boolean fixed)  {
        JnaComboBox.INST().gtk_combo_box_set_popup_fixed_width(asCPointer(), fixed);
    }

    /**
     * Sets the row separator function, which is used to determine
     * <br>whether a row should be drawn as a separator.
     * <br>
     * <br>If the row separator function is %NULL, no separators are drawn.
     * <br>This is the default value.
     * @param func a `GtkTreeViewRowSeparatorFunc`
     * @param data user data to pass to &#64;func
     * @param destroy destroy notifier for &#64;data
    */
    public void setRowSeparatorFunc(OnTreeViewRowSeparatorFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaComboBox.INST().gtk_combo_box_set_row_separator_func(asCPointer(), toOnTreeViewRowSeparatorFunc(this, "setRowSeparatorFunc", func), asCPointer(data), toOnDestroyNotify(this, "setRowSeparatorFunc", destroy));
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

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_FORMAT_ENTRY_TEXT = "format-entry-text";
    
    /**
     * Connect to signal "format-entry-text".
     * <br>See {@link OnFormatEntryText#onFormatEntryText} for signal description.
     * <br>Field {@link #SIGNAL_ON_FORMAT_ENTRY_TEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFormatEntryText(OnFormatEntryText signal) {
        return connectSignal(SIGNAL_ON_FORMAT_ENTRY_TEXT, toOnFormatEntryText(signal));
    }

    public final static String SIGNAL_ON_MOVE_ACTIVE = "move-active";
    
    /**
     * Connect to signal "move-active".
     * <br>See {@link OnMoveActive#onMoveActive} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_ACTIVE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveActive(OnMoveActive signal) {
        return connectSignal(SIGNAL_ON_MOVE_ACTIVE, toOnMoveActive(signal));
    }

    public final static String SIGNAL_ON_POPDOWN = "popdown";
    
    /**
     * Connect to signal "popdown".
     * <br>See {@link OnPopdown#onPopdown} for signal description.
     * <br>Field {@link #SIGNAL_ON_POPDOWN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPopdown(OnPopdown signal) {
        return connectSignal(SIGNAL_ON_POPDOWN, toOnPopdown(signal));
    }

    public final static String SIGNAL_ON_POPUP = "popup";
    
    /**
     * Connect to signal "popup".
     * <br>See {@link OnPopup#onPopup} for signal description.
     * <br>Field {@link #SIGNAL_ON_POPUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPopup(OnPopup signal) {
        return connectSignal(SIGNAL_ON_POPUP, toOnPopup(signal));
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
     * Implements interface {@link CellEditable}. Call this to get access to interface functions.
     * @return {@link CellEditable}
    */
    public CellEditable asCellEditable() {
        return new CellEditable(cast());
    }

    /**
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaComboBox.INST().gtk_combo_box_get_type(); 
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

[MethodModel:cb-returns-callback:getRowSeparatorFunc:[ParameterModel:Supported:[MethodModel:Supported:TreeViewRowSeparatorFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:TreeModel:{c:GtkTreeModel*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]
*/
