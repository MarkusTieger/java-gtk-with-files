/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkColumnViewColumn` represents the columns being added to `GtkColumnView`.
 * <br>
 * <br>The main ingredient for a `GtkColumnViewColumn` is the `GtkListItemFactory`
 * <br>that tells the columnview how to create cells for this column from items in
 * <br>the model.
 * <br>
 * <br>Columns have a title, and can optionally have a header menu set
 * <br>with [method&#64;Gtk.ColumnViewColumn.set_header_menu].
 * <br>
 * <br>A sorter can be associated with a column using
 * <br>[method&#64;Gtk.ColumnViewColumn.set_sorter], to let users influence sorting
 * <br>by clicking on the column header.
 * <p><a href="https://docs.gtk.org/gtk4/class.ColumnViewColumn.html">https://docs.gtk.org/gtk4/class.ColumnViewColumn.html</a></p>
*/
public class ColumnViewColumn extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColumnViewColumn.class.getCanonicalName());
    }

    public ColumnViewColumn(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkColumnViewColumn` that uses the given &#64;factory for
     * <br>mapping items to widgets.
     * <br>
     * <br>You most likely want to call [method&#64;Gtk.ColumnView.append_column] next.
     * <br>
     * <br>The function takes ownership of the argument, so you can write code like:
     * <br>
     * <br>```c
     * <br>column = gtk_column_view_column_new (_(&quot;Name&quot;),
     * <br>  gtk_builder_list_item_factory_new_from_resource (&quot;/name.ui&quot;));
     * <br>```
     * @param title Title to use for this column
     * @param factory The factory to populate items with
    */
    public ColumnViewColumn(@Nullable ch.bailu.gtk.type.Str title, @Nullable ListItemFactory factory) {
        super(cast(JnaColumnViewColumn.INST().gtk_column_view_column_new(asCPointer(title), asCPointer(factory))));
    }

    /**
     * Creates a new `GtkColumnViewColumn` that uses the given &#64;factory for
     * <br>mapping items to widgets.
     * <br>
     * <br>You most likely want to call [method&#64;Gtk.ColumnView.append_column] next.
     * <br>
     * <br>The function takes ownership of the argument, so you can write code like:
     * <br>
     * <br>```c
     * <br>column = gtk_column_view_column_new (_(&quot;Name&quot;),
     * <br>  gtk_builder_list_item_factory_new_from_resource (&quot;/name.ui&quot;));
     * <br>```
     * @param title Title to use for this column
     * @param factory The factory to populate items with
    */
    public ColumnViewColumn(String title, @Nullable ListItemFactory factory) {
        super(cast(JnaColumnViewColumn.INST().gtk_column_view_column_new(title, asCPointer(factory))));
    }

    /**
     * Gets the column view that's currently displaying this column.
     * <br>
     * <br>If &#64;self has not been added to a column view yet, %NULL is returned.
     * @return The column view displaying &#64;self.
    */
    public ColumnView getColumnView()  {
        return new ColumnView(new PointerContainer(JnaColumnViewColumn.INST().gtk_column_view_column_get_column_view(asCPointer())));
    }

    /**
     * Returns whether this column should expand.
     * @return %TRUE if this column expands
    */
    public boolean getExpand()  {
        return JnaColumnViewColumn.INST().gtk_column_view_column_get_expand(asCPointer());
    }

    /**
     * Gets the factory that's currently used to populate list items for
     * <br>this column.
     * @return The factory in use
    */
    public ListItemFactory getFactory()  {
        return new ListItemFactory(new PointerContainer(JnaColumnViewColumn.INST().gtk_column_view_column_get_factory(asCPointer())));
    }

    /**
     * Gets the fixed width of the column.
     * @return the fixed with of the column
    */
    public int getFixedWidth()  {
        return JnaColumnViewColumn.INST().gtk_column_view_column_get_fixed_width(asCPointer());
    }

    /**
     * Gets the menu model that is used to create the context menu
     * <br>for the column header.
     * @return the `GMenuModel`
    */
    public ch.bailu.gtk.gio.MenuModel getHeaderMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaColumnViewColumn.INST().gtk_column_view_column_get_header_menu(asCPointer())));
    }

    /**
     * Returns whether this column is resizable.
     * @return %TRUE if this column is resizable
    */
    public boolean getResizable()  {
        return JnaColumnViewColumn.INST().gtk_column_view_column_get_resizable(asCPointer());
    }

    /**
     * Returns the sorter that is associated with the column.
     * @return the `GtkSorter` of &#64;self
    */
    public Sorter getSorter()  {
        return new Sorter(new PointerContainer(JnaColumnViewColumn.INST().gtk_column_view_column_get_sorter(asCPointer())));
    }

    /**
     * Returns the title set with gtk_column_view_column_set_title().
     * @return The column's title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaColumnViewColumn.INST().gtk_column_view_column_get_title(asCPointer())));
    }

    /**
     * Returns whether this column is visible.
     * @return %TRUE if this column is visible
    */
    public boolean getVisible()  {
        return JnaColumnViewColumn.INST().gtk_column_view_column_get_visible(asCPointer());
    }

    /**
     * Sets the column to take available extra space.
     * <br>
     * <br>The extra space is shared equally amongst all columns that
     * <br>have the expand set to %TRUE.
     * @param expand %TRUE if this column should expand to fill available sace
    */
    public void setExpand(boolean expand)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_expand(asCPointer(), expand);
    }

    /**
     * Sets the `GtkListItemFactory` to use for populating list items for this
     * <br>column.
     * @param factory the factory to use
    */
    public void setFactory(@Nullable ListItemFactory factory)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * If &#64;fixed_width is not -1, sets the fixed width of &#64;column;
     * <br>otherwise unsets it.
     * <br>
     * <br>Setting a fixed width overrides the automatically calculated
     * <br>width. Interactive resizing also sets the “fixed-width” property.
     * @param fixed_width the new fixed width, or -1
    */
    public void setFixedWidth(int fixed_width)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_fixed_width(asCPointer(), fixed_width);
    }

    /**
     * Sets the menu model that is used to create the context menu
     * <br>for the column header.
     * @param menu a `GMenuModel`
    */
    public void setHeaderMenu(@Nullable ch.bailu.gtk.gio.MenuModel menu)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_header_menu(asCPointer(), asCPointer(menu));
    }

    /**
     * Sets whether this column should be resizable by dragging.
     * @param resizable whether this column should be resizable
    */
    public void setResizable(boolean resizable)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_resizable(asCPointer(), resizable);
    }

    /**
     * Associates a sorter with the column.
     * <br>
     * <br>If &#64;sorter is %NULL, the column will not let users change
     * <br>the sorting by clicking on its header.
     * <br>
     * <br>This sorter can be made active by clicking on the column
     * <br>header, or by calling [method&#64;Gtk.ColumnView.sort_by_column].
     * <br>
     * <br>See [method&#64;Gtk.ColumnView.get_sorter] for the necessary steps
     * <br>for setting up customizable sorting for [class&#64;Gtk.ColumnView].
     * @param sorter the `GtkSorter` to associate with &#64;column
    */
    public void setSorter(@Nullable Sorter sorter)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_sorter(asCPointer(), asCPointer(sorter));
    }

    /**
     * Sets the title of this column.
     * <br>
     * <br>The title is displayed in the header of a `GtkColumnView`
     * <br>for this column and is therefore user-facing text that should
     * <br>be translated.
     * @param title Title to use for this column
    */
    public void setTitle(@Nullable ch.bailu.gtk.type.Str title)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_title(asCPointer(), asCPointer(title));
    }

    /**
     * Sets the title of this column.
     * <br>
     * <br>The title is displayed in the header of a `GtkColumnView`
     * <br>for this column and is therefore user-facing text that should
     * <br>be translated.
     * @param title Title to use for this column
    */
    public void setTitle(String title)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_title(asCPointer(), title);
    }

    /**
     * Sets whether this column should be visible in views.
     * @param visible whether this column should be visible
    */
    public void setVisible(boolean visible)  {
        JnaColumnViewColumn.INST().gtk_column_view_column_set_visible(asCPointer(), visible);
    }

    public static long getTypeID() { 
        return JnaColumnViewColumn.INST().gtk_column_view_column_get_type(); 
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
