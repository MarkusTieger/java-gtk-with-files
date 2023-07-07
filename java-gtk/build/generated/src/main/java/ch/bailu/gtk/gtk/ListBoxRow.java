/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkListBoxRow` is the kind of widget that can be added to a `GtkListBox`.
 * <p><a href="https://docs.gtk.org/gtk4/class.ListBoxRow.html">https://docs.gtk.org/gtk4/class.ListBoxRow.html</a></p>
*/
public class ListBoxRow extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListBoxRow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * This is a keybinding signal, which will cause this row to be activated.
         * <br>
         * <br>If you want to be notified when the user activates a row (by key or not),
         * <br>use the [signal&#64;Gtk.ListBox::row-activated] signal on the row’s parent
         * <br>`GtkListBox`.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaListBoxRow.OnActivate) (__self, __data) -> in.onActivate();
    }

    public ListBoxRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkListBoxRow`.
    */
    public ListBoxRow() {
        super(cast(JnaListBoxRow.INST().gtk_list_box_row_new()));
    }

    /**
     * Marks &#64;row as changed, causing any state that depends on this
     * <br>to be updated.
     * <br>
     * <br>This affects sorting, filtering and headers.
     * <br>
     * <br>Note that calls to this method must be in sync with the data
     * <br>used for the row functions. For instance, if the list is
     * <br>mirroring some external data set, and *two* rows changed in the
     * <br>external data set then when you call gtk_list_box_row_changed()
     * <br>on the first row the sort function must only read the new data
     * <br>for the first of the two changed rows, otherwise the resorting
     * <br>of the rows will be wrong.
     * <br>
     * <br>This generally means that if you don’t fully control the data
     * <br>model you have to duplicate the data that affects the listbox
     * <br>row functions into the row widgets themselves. Another alternative
     * <br>is to call [method&#64;Gtk.ListBox.invalidate_sort] on any model change,
     * <br>but that is more expensive.
    */
    public void changed()  {
        JnaListBoxRow.INST().gtk_list_box_row_changed(asCPointer());
    }

    /**
     * Gets whether the row is activatable.
     * @return %TRUE if the row is activatable
    */
    public boolean getActivatable()  {
        return JnaListBoxRow.INST().gtk_list_box_row_get_activatable(asCPointer());
    }

    /**
     * Gets the child widget of &#64;row.
     * @return the child widget of &#64;row
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaListBoxRow.INST().gtk_list_box_row_get_child(asCPointer())));
    }

    /**
     * Returns the current header of the &#64;row.
     * <br>
     * <br>This can be used
     * <br>in a [callback&#64;Gtk.ListBoxUpdateHeaderFunc] to see if
     * <br>there is a header set already, and if so to update
     * <br>the state of it.
     * @return the current header
    */
    public Widget getHeader()  {
        return new Widget(new PointerContainer(JnaListBoxRow.INST().gtk_list_box_row_get_header(asCPointer())));
    }

    /**
     * Gets the current index of the &#64;row in its `GtkListBox` container.
     * @return the index of the &#64;row, or -1 if the &#64;row is not in a listbox
    */
    public int getIndex()  {
        return JnaListBoxRow.INST().gtk_list_box_row_get_index(asCPointer());
    }

    /**
     * Gets whether the row can be selected.
     * @return %TRUE if the row is selectable
    */
    public boolean getSelectable()  {
        return JnaListBoxRow.INST().gtk_list_box_row_get_selectable(asCPointer());
    }

    /**
     * Returns whether the child is currently selected in its
     * <br>`GtkListBox` container.
     * @return %TRUE if &#64;row is selected
    */
    public boolean isSelected()  {
        return JnaListBoxRow.INST().gtk_list_box_row_is_selected(asCPointer());
    }

    /**
     * Set whether the row is activatable.
     * @param activatable %TRUE to mark the row as activatable
    */
    public void setActivatable(boolean activatable)  {
        JnaListBoxRow.INST().gtk_list_box_row_set_activatable(asCPointer(), activatable);
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaListBoxRow.INST().gtk_list_box_row_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the current header of the &#64;row.
     * <br>
     * <br>This is only allowed to be called
     * <br>from a [callback&#64;Gtk.ListBoxUpdateHeaderFunc].
     * <br>It will replace any existing header in the row,
     * <br>and be shown in front of the row in the listbox.
     * @param header the header
    */
    public void setHeader(@Nullable Widget header)  {
        JnaListBoxRow.INST().gtk_list_box_row_set_header(asCPointer(), asCPointer(header));
    }

    /**
     * Set whether the row can be selected.
     * @param selectable %TRUE to mark the row as selectable
    */
    public void setSelectable(boolean selectable)  {
        JnaListBoxRow.INST().gtk_list_box_row_set_selectable(asCPointer(), selectable);
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
     * Implements interface {@link Actionable}. Call this to get access to interface functions.
     * @return {@link Actionable}
    */
    public Actionable asActionable() {
        return new Actionable(cast());
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
        return JnaListBoxRow.INST().gtk_list_box_row_get_type(); 
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
