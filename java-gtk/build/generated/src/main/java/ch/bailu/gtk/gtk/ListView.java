/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkListView` presents a large dynamic list of items.
 * <br>
 * <br>`GtkListView` uses its factory to generate one row widget for each visible
 * <br>item and shows them in a linear display, either vertically or horizontally.
 * <br>
 * <br>The [property&#64;Gtk.ListView:show-separators] property offers a simple way to
 * <br>display separators between the rows.
 * <br>
 * <br>`GtkListView` allows the user to select items according to the selection
 * <br>characteristics of the model. For models that allow multiple selected items,
 * <br>it is possible to turn on _rubberband selection_, using
 * <br>[property&#64;Gtk.ListView:enable-rubberband].
 * <br>
 * <br>If you need multiple columns with headers, see [class&#64;Gtk.ColumnView].
 * <br>
 * <br>To learn more about the list widget framework, see the
 * <br>[overview](section-list-widget.html).
 * <br>
 * <br>An example of using `GtkListView`:
 * <br>```c
 * <br>static void
 * <br>setup_listitem_cb (GtkListItemFactory *factory,
 * <br>                   GtkListItem        *list_item)
 * <br>{
 * <br>  GtkWidget *image;
 * <br>
 * <br>  image = gtk_image_new ();
 * <br>  gtk_image_set_icon_size (GTK_IMAGE (image), GTK_ICON_SIZE_LARGE);
 * <br>  gtk_list_item_set_child (list_item, image);
 * <br>}
 * <br>
 * <br>static void
 * <br>bind_listitem_cb (GtkListItemFactory *factory,
 * <br>                  GtkListItem        *list_item)
 * <br>{
 * <br>  GtkWidget *image;
 * <br>  GAppInfo *app_info;
 * <br>
 * <br>  image = gtk_list_item_get_child (list_item);
 * <br>  app_info = gtk_list_item_get_item (list_item);
 * <br>  gtk_image_set_from_gicon (GTK_IMAGE (image), g_app_info_get_icon (app_info));
 * <br>}
 * <br>
 * <br>static void
 * <br>activate_cb (GtkListView  *list,
 * <br>             guint         position,
 * <br>             gpointer      unused)
 * <br>{
 * <br>  GAppInfo *app_info;
 * <br>
 * <br>  app_info = g_list_model_get_item (G_LIST_MODEL (gtk_list_view_get_model (list)), position);
 * <br>  g_app_info_launch (app_info, NULL, NULL, NULL);
 * <br>  g_object_unref (app_info);
 * <br>}
 * <br>
 * <br>...
 * <br>
 * <br>  model = create_application_list ();
 * <br>
 * <br>  factory = gtk_signal_list_item_factory_new ();
 * <br>  g_signal_connect (factory, &quot;setup&quot;, G_CALLBACK (setup_listitem_cb), NULL);
 * <br>  g_signal_connect (factory, &quot;bind&quot;, G_CALLBACK (bind_listitem_cb), NULL);
 * <br>
 * <br>  list = gtk_list_view_new (GTK_SELECTION_MODEL (gtk_single_selection_new (model)), factory);
 * <br>
 * <br>  g_signal_connect (list, &quot;activate&quot;, G_CALLBACK (activate_cb), NULL);
 * <br>
 * <br>  gtk_scrolled_window_set_child (GTK_SCROLLED_WINDOW (sw), list);
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>listview[.separators][.rich-list][.navigation-sidebar][.data-table]
 * <br>├── row[.activatable]
 * <br>│
 * <br>├── row[.activatable]
 * <br>│
 * <br>┊
 * <br>╰── [rubberband]
 * <br>```
 * <br>
 * <br>`GtkListView` uses a single CSS node named `listview`. It may carry the
 * <br>`.separators` style class, when [property&#64;Gtk.ListView:show-separators]
 * <br>property is set. Each child widget uses a single CSS node named `row`.
 * <br>If the [property&#64;Gtk.ListItem:activatable] property is set, the
 * <br>corresponding row will have the `.activatable` style class. For
 * <br>rubberband selection, a node with name `rubberband` is used.
 * <br>
 * <br>The main listview node may also carry style classes to select
 * <br>the style of [list presentation](ListContainers.html&#35;list-styles):
 * <br>.rich-list, .navigation-sidebar or .data-table.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkListView` uses the %GTK_ACCESSIBLE_ROLE_LIST role, and the list
 * <br>items use the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 * <p><a href="https://docs.gtk.org/gtk4/class.ListView.html">https://docs.gtk.org/gtk4/class.ListView.html</a></p>
*/
public class ListView extends ListBase {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when a row has been activated by the user,
         * <br>usually via activating the GtkListView|list.activate-item action.
         * <br>
         * <br>This allows for a convenient way to handle activation in a listview.
         * <br>See [method&#64;Gtk.ListItem.set_activatable] for details on how to use
         * <br>this signal.
         * @param position position of item to activate
        */
        void onActivate(int position);
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaListView.OnActivate) (__self, _position, __data) -> in.onActivate(_position);
    }

    public ListView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkListView` that uses the given &#64;factory for
     * <br>mapping items to widgets.
     * <br>
     * <br>The function takes ownership of the
     * <br>arguments, so you can write code like
     * <br>```c
     * <br>list_view = gtk_list_view_new (create_model (),
     * <br>  gtk_builder_list_item_factory_new_from_resource (&quot;/resource.ui&quot;));
     * <br>```
     * @param model the model to use
     * @param factory The factory to populate items with
    */
    public ListView(@Nullable SelectionModel model, @Nullable ListItemFactory factory) {
        super(cast(JnaListView.INST().gtk_list_view_new(asCPointer(model), asCPointer(factory))));
    }

    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return %TRUE if rubberband selection is enabled
    */
    public boolean getEnableRubberband()  {
        return JnaListView.INST().gtk_list_view_get_enable_rubberband(asCPointer());
    }

    /**
     * Gets the factory that's currently used to populate list items.
     * @return The factory in use
    */
    public ListItemFactory getFactory()  {
        return new ListItemFactory(new PointerContainer(JnaListView.INST().gtk_list_view_get_factory(asCPointer())));
    }

    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
    */
    public SelectionModel getModel()  {
        return new SelectionModel(new PointerContainer(JnaListView.INST().gtk_list_view_get_model(asCPointer())));
    }

    /**
     * Returns whether the list box should show separators
     * <br>between rows.
     * @return %TRUE if the list box shows separators
    */
    public boolean getShowSeparators()  {
        return JnaListView.INST().gtk_list_view_get_show_separators(asCPointer());
    }

    /**
     * Returns whether rows will be activated on single click and
     * <br>selected on hover.
     * @return %TRUE if rows are activated on single click
    */
    public boolean getSingleClickActivate()  {
        return JnaListView.INST().gtk_list_view_get_single_click_activate(asCPointer());
    }

    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enable_rubberband %TRUE to enable rubberband selection
    */
    public void setEnableRubberband(boolean enable_rubberband)  {
        JnaListView.INST().gtk_list_view_set_enable_rubberband(asCPointer(), enable_rubberband);
    }

    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     * @param factory the factory to use
    */
    public void setFactory(@Nullable ListItemFactory factory)  {
        JnaListView.INST().gtk_list_view_set_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the model to use.
     * <br>
     * <br>This must be a [iface&#64;Gtk.SelectionModel] to use.
     * @param model the model to use
    */
    public void setModel(@Nullable SelectionModel model)  {
        JnaListView.INST().gtk_list_view_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether the list box should show separators
     * <br>between rows.
     * @param show_separators %TRUE to show separators
    */
    public void setShowSeparators(boolean show_separators)  {
        JnaListView.INST().gtk_list_view_set_show_separators(asCPointer(), show_separators);
    }

    /**
     * Sets whether rows should be activated on single click and
     * <br>selected on hover.
     * @param single_click_activate %TRUE to activate items on single click
    */
    public void setSingleClickActivate(boolean single_click_activate)  {
        JnaListView.INST().gtk_list_view_set_single_click_activate(asCPointer(), single_click_activate);
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

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    /**
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaListView.INST().gtk_list_view_get_type(); 
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
