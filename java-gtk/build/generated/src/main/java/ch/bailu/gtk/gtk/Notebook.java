/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkNotebook` is a container whose children are pages switched
 * <br>between using tabs.
 * <br>
 * <br>![An example GtkNotebook](notebook.png)
 * <br>
 * <br>There are many configuration options for `GtkNotebook`. Among
 * <br>other things, you can choose on which edge the tabs appear
 * <br>(see [method&#64;Gtk.Notebook.set_tab_pos]), whether, if there are
 * <br>too many tabs to fit the notebook should be made bigger or scrolling
 * <br>arrows added (see [method&#64;Gtk.Notebook.set_scrollable]), and whether
 * <br>there will be a popup menu allowing the users to switch pages.
 * <br>(see [method&#64;Gtk.Notebook.popup_enable]).
 * <br>
 * <br>&#35; GtkNotebook as GtkBuildable
 * <br>
 * <br>The `GtkNotebook` implementation of the `GtkBuildable` interface
 * <br>supports placing children into tabs by specifying “tab” as the
 * <br>“type” attribute of a &lt;child&gt; element. Note that the content
 * <br>of the tab must be created before the tab can be filled.
 * <br>A tab child can be specified without specifying a &lt;child&gt;
 * <br>type attribute.
 * <br>
 * <br>To add a child widget in the notebooks action area, specify
 * <br>&quot;action-start&quot; or “action-end” as the “type” attribute of the
 * <br>&lt;child&gt; element.
 * <br>
 * <br>An example of a UI definition fragment with `GtkNotebook`:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkNotebook&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot; id=&quot;notebook-content&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Content&lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child type=&quot;tab&quot;&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot; id=&quot;notebook-tab&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Tab&lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>notebook
 * <br>├── header.top
 * <br>│   ├── [&lt;action widget&gt;]
 * <br>│   ├── tabs
 * <br>│   │   ├── [arrow]
 * <br>│   │   ├── tab
 * <br>│   │   │   ╰── &lt;tab label&gt;
 * <br>┊   ┊   ┊
 * <br>│   │   ├── tab[.reorderable-page]
 * <br>│   │   │   ╰── &lt;tab label&gt;
 * <br>│   │   ╰── [arrow]
 * <br>│   ╰── [&lt;action widget&gt;]
 * <br>│
 * <br>╰── stack
 * <br>    ├── &lt;child&gt;
 * <br>    ┊
 * <br>    ╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>`GtkNotebook` has a main CSS node with name `notebook`, a subnode
 * <br>with name `header` and below that a subnode with name `tabs` which
 * <br>contains one subnode per tab with name `tab`.
 * <br>
 * <br>If action widgets are present, their CSS nodes are placed next
 * <br>to the `tabs` node. If the notebook is scrollable, CSS nodes with
 * <br>name `arrow` are placed as first and last child of the `tabs` node.
 * <br>
 * <br>The main node gets the `.frame` style class when the notebook
 * <br>has a border (see [method&#64;Gtk.Notebook.set_show_border]).
 * <br>
 * <br>The header node gets one of the style class `.top`, `.bottom`,
 * <br>`.left` or `.right`, depending on where the tabs are placed. For
 * <br>reorderable pages, the tab node gets the `.reorderable-page` class.
 * <br>
 * <br>A `tab` node gets the `.dnd` style class while it is moved with drag-and-drop.
 * <br>
 * <br>The nodes are always arranged from left-to-right, regardless of text direction.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkNotebook` uses the following roles:
 * <br>
 * <br> - %GTK_ACCESSIBLE_ROLE_GROUP for the notebook widget
 * <br> - %GTK_ACCESSIBLE_ROLE_TAB_LIST for the list of tabs
 * <br> - %GTK_ACCESSIBLE_ROLE_TAB role for each tab
 * <br> - %GTK_ACCESSIBLE_ROLE_TAB_PANEL for each page
 * <p><a href="https://docs.gtk.org/gtk4/class.Notebook.html">https://docs.gtk.org/gtk4/class.Notebook.html</a></p>
*/
public class Notebook extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Notebook.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChangeCurrentPage {
        /**
         * 
         * @param object 
         * @return 
        */
        boolean onChangeCurrentPage(int object);
    }
    
    private static com.sun.jna.Callback toOnChangeCurrentPage(OnChangeCurrentPage in) {
        return (in == null) ? null: (JnaNotebook.OnChangeCurrentPage) (__self, _object, __data) -> in.onChangeCurrentPage(_object);
    }

    @FunctionalInterface
    public interface OnCreateWindow {
        /**
         * The ::create-window signal is emitted when a detachable
         * <br>tab is dropped on the root window.
         * <br>
         * <br>A handler for this signal can create a window containing
         * <br>a notebook where the tab will be attached. It is also
         * <br>responsible for moving/resizing the window and adding the
         * <br>necessary properties to the notebook (e.g. the
         * <br>`GtkNotebook`:group-name ).
         * @param page the tab of &#64;notebook that is being detached
         * @return a `GtkNotebook` that   &#64;page should be added to
        */
        Notebook onCreateWindow(@Nonnull Widget page);
    }
    
    private static com.sun.jna.Callback toOnCreateWindow(OnCreateWindow in) {
        return (in == null) ? null: (JnaNotebook.OnCreateWindow) (__self, _page, __data) -> in.onCreateWindow(new Widget(new PointerContainer(_page))).asCPointer();
    }

    @FunctionalInterface
    public interface OnFocusTab {
        /**
         * 
         * @param object 
         * @return 
        */
        boolean onFocusTab(int object);
    }
    
    private static com.sun.jna.Callback toOnFocusTab(OnFocusTab in) {
        return (in == null) ? null: (JnaNotebook.OnFocusTab) (__self, _object, __data) -> in.onFocusTab(_object);
    }

    @FunctionalInterface
    public interface OnMoveFocusOut {
        /**
         * 
         * @param object 
        */
        void onMoveFocusOut(int object);
    }
    
    private static com.sun.jna.Callback toOnMoveFocusOut(OnMoveFocusOut in) {
        return (in == null) ? null: (JnaNotebook.OnMoveFocusOut) (__self, _object, __data) -> in.onMoveFocusOut(_object);
    }

    @FunctionalInterface
    public interface OnPageAdded {
        /**
         * the ::page-added signal is emitted in the notebook
         * <br>right after a page is added to the notebook.
         * @param child the child `GtkWidget` affected
         * @param page_num the new page number for &#64;child
        */
        void onPageAdded(@Nonnull Widget child, int page_num);
    }
    
    private static com.sun.jna.Callback toOnPageAdded(OnPageAdded in) {
        return (in == null) ? null: (JnaNotebook.OnPageAdded) (__self, _child, _page_num, __data) -> in.onPageAdded(new Widget(new PointerContainer(_child)), _page_num);
    }

    @FunctionalInterface
    public interface OnPageRemoved {
        /**
         * the ::page-removed signal is emitted in the notebook
         * <br>right after a page is removed from the notebook.
         * @param child the child `GtkWidget` affected
         * @param page_num the &#64;child page number
        */
        void onPageRemoved(@Nonnull Widget child, int page_num);
    }
    
    private static com.sun.jna.Callback toOnPageRemoved(OnPageRemoved in) {
        return (in == null) ? null: (JnaNotebook.OnPageRemoved) (__self, _child, _page_num, __data) -> in.onPageRemoved(new Widget(new PointerContainer(_child)), _page_num);
    }

    @FunctionalInterface
    public interface OnPageReordered {
        /**
         * the ::page-reordered signal is emitted in the notebook
         * <br>right after a page has been reordered.
         * @param child the child `GtkWidget` affected
         * @param page_num the new page number for &#64;child
        */
        void onPageReordered(@Nonnull Widget child, int page_num);
    }
    
    private static com.sun.jna.Callback toOnPageReordered(OnPageReordered in) {
        return (in == null) ? null: (JnaNotebook.OnPageReordered) (__self, _child, _page_num, __data) -> in.onPageReordered(new Widget(new PointerContainer(_child)), _page_num);
    }

    @FunctionalInterface
    public interface OnReorderTab {
        /**
         * 
         * @param object 
         * @param p0 
         * @return 
        */
        boolean onReorderTab(int object, boolean p0);
    }
    
    private static com.sun.jna.Callback toOnReorderTab(OnReorderTab in) {
        return (in == null) ? null: (JnaNotebook.OnReorderTab) (__self, _object, _p0, __data) -> in.onReorderTab(_object, _p0);
    }

    @FunctionalInterface
    public interface OnSelectPage {
        /**
         * 
         * @param object 
         * @return 
        */
        boolean onSelectPage(boolean object);
    }
    
    private static com.sun.jna.Callback toOnSelectPage(OnSelectPage in) {
        return (in == null) ? null: (JnaNotebook.OnSelectPage) (__self, _object, __data) -> in.onSelectPage(_object);
    }

    @FunctionalInterface
    public interface OnSwitchPage {
        /**
         * Emitted when the user or a function changes the current page.
         * @param page the new current page
         * @param page_num the index of the page
        */
        void onSwitchPage(@Nonnull Widget page, int page_num);
    }
    
    private static com.sun.jna.Callback toOnSwitchPage(OnSwitchPage in) {
        return (in == null) ? null: (JnaNotebook.OnSwitchPage) (__self, _page, _page_num, __data) -> in.onSwitchPage(new Widget(new PointerContainer(_page)), _page_num);
    }

    public Notebook(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkNotebook` widget with no pages.
    */
    public Notebook() {
        super(cast(JnaNotebook.INST().gtk_notebook_new()));
    }

    /**
     * Appends a page to &#64;notebook.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @return the index (starting from 0) of the appended   page in the notebook, or -1 if function fails
    */
    public int appendPage(@Nonnull Widget child, @Nullable Widget tab_label)  {
        return JnaNotebook.INST().gtk_notebook_append_page(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label));
    }

    /**
     * Appends a page to &#64;notebook, specifying the widget to use as the
     * <br>label in the popup menu.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @param menu_label the widget to use as a label for the   page-switch menu, if that is enabled. If %NULL, and &#64;tab_label   is a `GtkLabel` or %NULL, then the menu label will be a newly   created label with the same text as &#64;tab_label; if &#64;tab_label   is not a `GtkLabel`, &#64;menu_label must be specified if the   page-switch menu is to be used.
     * @return the index (starting from 0) of the appended   page in the notebook, or -1 if function fails
    */
    public int appendPageMenu(@Nonnull Widget child, @Nullable Widget tab_label, @Nullable Widget menu_label)  {
        return JnaNotebook.INST().gtk_notebook_append_page_menu(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label), asCPointer(menu_label));
    }

    /**
     * Removes the child from the notebook.
     * <br>
     * <br>This function is very similar to [method&#64;Gtk.Notebook.remove_page],
     * <br>but additionally informs the notebook that the removal
     * <br>is happening as part of a tab DND operation, which should
     * <br>not be cancelled.
     * @param child a child
    */
    public void detachTab(@Nonnull Widget child)  {
        JnaNotebook.INST().gtk_notebook_detach_tab(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Gets one of the action widgets.
     * <br>
     * <br>See [method&#64;Gtk.Notebook.set_action_widget].
     * @param pack_type pack type of the action widget to receive
     * @return The action widget   with the given &#64;pack_type or %NULL when this action   widget has not been set
    */
    public Widget getActionWidget(int pack_type)  {
        return new Widget(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_action_widget(asCPointer(), pack_type)));
    }

    /**
     * Returns the page number of the current page.
     * @return the index (starting from 0) of the current   page in the notebook. If the notebook has no pages,   then -1 will be returned.
    */
    public int getCurrentPage()  {
        return JnaNotebook.INST().gtk_notebook_get_current_page(asCPointer());
    }

    /**
     * Gets the current group name for &#64;notebook.
     * @return the group name,   or %NULL if none is set
    */
    public ch.bailu.gtk.type.Str getGroupName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_group_name(asCPointer())));
    }

    /**
     * Retrieves the menu label widget of the page containing &#64;child.
     * @param child a widget contained in a page of &#64;notebook
     * @return the menu label, or %NULL   if the notebook page does not have a menu label other than   the default (the tab label).
    */
    public Widget getMenuLabel(@Nonnull Widget child)  {
        return new Widget(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_menu_label(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Retrieves the text of the menu label for the page containing
     * <br>&#64;child.
     * @param child the child widget of a page of the notebook.
     * @return the text of the tab label, or %NULL if   the widget does not have a menu label other than the default   menu label, or the menu label widget is not a `GtkLabel`.   The string is owned by the widget and must not be freed.
    */
    public ch.bailu.gtk.type.Str getMenuLabelText(@Nonnull Widget child)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_menu_label_text(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Gets the number of pages in a notebook.
     * @return the number of pages in the notebook
    */
    public int getNPages()  {
        return JnaNotebook.INST().gtk_notebook_get_n_pages(asCPointer());
    }

    /**
     * Returns the child widget contained in page number &#64;page_num.
     * @param page_num the index of a page in the notebook, or -1   to get the last page
     * @return the child widget, or %NULL if &#64;page_num is out of bounds
    */
    public Widget getNthPage(int page_num)  {
        return new Widget(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_nth_page(asCPointer(), page_num)));
    }

    /**
     * Returns the `GtkNotebookPage` for &#64;child.
     * @param child a child of &#64;notebook
     * @return the `GtkNotebookPage` for &#64;child
    */
    public NotebookPage getPage(@Nonnull Widget child)  {
        return new NotebookPage(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Returns a `GListModel` that contains the pages of the notebook.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also
     * <br>implements [iface&#64;Gtk.SelectionModel] and can be used to track
     * <br>and modify the visible page.
     * @return a   `GListModel` for the notebook's children
    */
    public ch.bailu.gtk.gio.ListModel getPages()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_pages(asCPointer())));
    }

    /**
     * Returns whether the tab label area has arrows for scrolling.
     * @return %TRUE if arrows for scrolling are present
    */
    public boolean getScrollable()  {
        return JnaNotebook.INST().gtk_notebook_get_scrollable(asCPointer());
    }

    /**
     * Returns whether a bevel will be drawn around the notebook pages.
     * @return %TRUE if the bevel is drawn
    */
    public boolean getShowBorder()  {
        return JnaNotebook.INST().gtk_notebook_get_show_border(asCPointer());
    }

    /**
     * Returns whether the tabs of the notebook are shown.
     * @return %TRUE if the tabs are shown
    */
    public boolean getShowTabs()  {
        return JnaNotebook.INST().gtk_notebook_get_show_tabs(asCPointer());
    }

    /**
     * Returns whether the tab contents can be detached from &#64;notebook.
     * @param child a child `GtkWidget`
     * @return %TRUE if the tab is detachable.
    */
    public boolean getTabDetachable(@Nonnull Widget child)  {
        return JnaNotebook.INST().gtk_notebook_get_tab_detachable(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Returns the tab label widget for the page &#64;child.
     * <br>
     * <br>%NULL is returned if &#64;child is not in &#64;notebook or
     * <br>if no tab label has specifically been set for &#64;child.
     * @param child the page
     * @return the tab label
    */
    public Widget getTabLabel(@Nonnull Widget child)  {
        return new Widget(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_tab_label(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Retrieves the text of the tab label for the page containing
     * <br>&#64;child.
     * @param child a widget contained in a page of &#64;notebook
     * @return the text of the tab label, or %NULL if   the tab label idget is not a `GtkLabel`. The string is owned   by the widget and must not be freed.
    */
    public ch.bailu.gtk.type.Str getTabLabelText(@Nonnull Widget child)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNotebook.INST().gtk_notebook_get_tab_label_text(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Gets the edge at which the tabs are drawn.
     * @return the edge at which the tabs are drawn
    */
    public int getTabPos()  {
        return JnaNotebook.INST().gtk_notebook_get_tab_pos(asCPointer());
    }

    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     * @param child a child `GtkWidget`
     * @return %TRUE if the tab is reorderable.
    */
    public boolean getTabReorderable(@Nonnull Widget child)  {
        return JnaNotebook.INST().gtk_notebook_get_tab_reorderable(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Insert a page into &#64;notebook at the given position.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @param position the index (starting at 0) at which to insert the page,   or -1 to append the page after all other pages
     * @return the index (starting from 0) of the inserted   page in the notebook, or -1 if function fails
    */
    public int insertPage(@Nonnull Widget child, @Nullable Widget tab_label, int position)  {
        return JnaNotebook.INST().gtk_notebook_insert_page(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label), position);
    }

    /**
     * Insert a page into &#64;notebook at the given position, specifying
     * <br>the widget to use as the label in the popup menu.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @param menu_label the widget to use as a label for the   page-switch menu, if that is enabled. If %NULL, and &#64;tab_label   is a `GtkLabel` or %NULL, then the menu label will be a newly   created label with the same text as &#64;tab_label; if &#64;tab_label   is not a `GtkLabel`, &#64;menu_label must be specified if the   page-switch menu is to be used.
     * @param position the index (starting at 0) at which to insert the page,   or -1 to append the page after all other pages.
     * @return the index (starting from 0) of the inserted   page in the notebook
    */
    public int insertPageMenu(@Nonnull Widget child, @Nullable Widget tab_label, @Nullable Widget menu_label, int position)  {
        return JnaNotebook.INST().gtk_notebook_insert_page_menu(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label), asCPointer(menu_label), position);
    }

    /**
     * Switches to the next page.
     * <br>
     * <br>Nothing happens if the current page is the last page.
    */
    public void nextPage()  {
        JnaNotebook.INST().gtk_notebook_next_page(asCPointer());
    }

    /**
     * Finds the index of the page which contains the given child
     * <br>widget.
     * @param child a `GtkWidget`
     * @return the index of the page containing &#64;child, or   -1 if &#64;child is not in the notebook
    */
    public int pageNum(@Nonnull Widget child)  {
        return JnaNotebook.INST().gtk_notebook_page_num(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Disables the popup menu.
    */
    public void popupDisable()  {
        JnaNotebook.INST().gtk_notebook_popup_disable(asCPointer());
    }

    /**
     * Enables the popup menu.
     * <br>
     * <br>If the user clicks with the right mouse button on the tab labels,
     * <br>a menu with all the pages will be popped up.
    */
    public void popupEnable()  {
        JnaNotebook.INST().gtk_notebook_popup_enable(asCPointer());
    }

    /**
     * Prepends a page to &#64;notebook.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @return the index (starting from 0) of the prepended   page in the notebook, or -1 if function fails
    */
    public int prependPage(@Nonnull Widget child, @Nullable Widget tab_label)  {
        return JnaNotebook.INST().gtk_notebook_prepend_page(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label));
    }

    /**
     * Prepends a page to &#64;notebook, specifying the widget to use as the
     * <br>label in the popup menu.
     * @param child the `GtkWidget` to use as the contents of the page
     * @param tab_label the `GtkWidget` to be used as the label   for the page, or %NULL to use the default label, “page N”
     * @param menu_label the widget to use as a label for the   page-switch menu, if that is enabled. If %NULL, and &#64;tab_label   is a `GtkLabel` or %NULL, then the menu label will be a newly   created label with the same text as &#64;tab_label; if &#64;tab_label   is not a `GtkLabel`, &#64;menu_label must be specified if the   page-switch menu is to be used.
     * @return the index (starting from 0) of the prepended   page in the notebook, or -1 if function fails
    */
    public int prependPageMenu(@Nonnull Widget child, @Nullable Widget tab_label, @Nullable Widget menu_label)  {
        return JnaNotebook.INST().gtk_notebook_prepend_page_menu(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label), asCPointer(menu_label));
    }

    /**
     * Switches to the previous page.
     * <br>
     * <br>Nothing happens if the current page is the first page.
    */
    public void prevPage()  {
        JnaNotebook.INST().gtk_notebook_prev_page(asCPointer());
    }

    /**
     * Removes a page from the notebook given its index
     * <br>in the notebook.
     * @param page_num the index of a notebook page, starting   from 0. If -1, the last page will be removed.
    */
    public void removePage(int page_num)  {
        JnaNotebook.INST().gtk_notebook_remove_page(asCPointer(), page_num);
    }

    /**
     * Reorders the page containing &#64;child, so that it appears in position
     * <br>&#64;position.
     * <br>
     * <br>If &#64;position is greater than or equal to the number of children in
     * <br>the list or negative, &#64;child will be moved to the end of the list.
     * @param child the child to move
     * @param position the new position, or -1 to move to the end
    */
    public void reorderChild(@Nonnull Widget child, int position)  {
        JnaNotebook.INST().gtk_notebook_reorder_child(asCPointer(), asCPointerNotNull(child), position);
    }

    /**
     * Sets &#64;widget as one of the action widgets.
     * <br>
     * <br>Depending on the pack type the widget will be placed before
     * <br>or after the tabs. You can use a `GtkBox` if you need to pack
     * <br>more than one widget on the same side.
     * @param widget a `GtkWidget`
     * @param pack_type pack type of the action widget
    */
    public void setActionWidget(@Nonnull Widget widget, int pack_type)  {
        JnaNotebook.INST().gtk_notebook_set_action_widget(asCPointer(), asCPointerNotNull(widget), pack_type);
    }

    /**
     * Switches to the page number &#64;page_num.
     * <br>
     * <br>Note that due to historical reasons, GtkNotebook refuses
     * <br>to switch to a page unless the child widget is visible.
     * <br>Therefore, it is recommended to show child widgets before
     * <br>adding them to a notebook.
     * @param page_num index of the page to switch to, starting from 0.   If negative, the last page will be used. If greater   than the number of pages in the notebook, nothing   will be done.
    */
    public void setCurrentPage(int page_num)  {
        JnaNotebook.INST().gtk_notebook_set_current_page(asCPointer(), page_num);
    }

    /**
     * Sets a group name for &#64;notebook.
     * <br>
     * <br>Notebooks with the same name will be able to exchange tabs
     * <br>via drag and drop. A notebook with a %NULL group name will
     * <br>not be able to exchange tabs with any other notebook.
     * @param group_name the name of the notebook group,   or %NULL to unset it
    */
    public void setGroupName(@Nullable ch.bailu.gtk.type.Str group_name)  {
        JnaNotebook.INST().gtk_notebook_set_group_name(asCPointer(), asCPointer(group_name));
    }

    /**
     * Sets a group name for &#64;notebook.
     * <br>
     * <br>Notebooks with the same name will be able to exchange tabs
     * <br>via drag and drop. A notebook with a %NULL group name will
     * <br>not be able to exchange tabs with any other notebook.
     * @param group_name the name of the notebook group,   or %NULL to unset it
    */
    public void setGroupName(String group_name)  {
        JnaNotebook.INST().gtk_notebook_set_group_name(asCPointer(), group_name);
    }

    /**
     * Changes the menu label for the page containing &#64;child.
     * @param child the child widget
     * @param menu_label the menu label, or %NULL for default
    */
    public void setMenuLabel(@Nonnull Widget child, @Nullable Widget menu_label)  {
        JnaNotebook.INST().gtk_notebook_set_menu_label(asCPointer(), asCPointerNotNull(child), asCPointer(menu_label));
    }

    /**
     * Creates a new label and sets it as the menu label of &#64;child.
     * @param child the child widget
     * @param menu_text the label text
    */
    public void setMenuLabelText(@Nonnull Widget child, @Nonnull ch.bailu.gtk.type.Str menu_text)  {
        JnaNotebook.INST().gtk_notebook_set_menu_label_text(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(menu_text));
    }

    /**
     * Creates a new label and sets it as the menu label of &#64;child.
     * @param child the child widget
     * @param menu_text the label text
    */
    public void setMenuLabelText(@Nonnull Widget child, String menu_text)  {
        JnaNotebook.INST().gtk_notebook_set_menu_label_text(asCPointer(), asCPointerNotNull(child), menu_text);
    }

    /**
     * Sets whether the tab label area will have arrows for
     * <br>scrolling if there are too many tabs to fit in the area.
     * @param scrollable %TRUE if scroll arrows should be added
    */
    public void setScrollable(boolean scrollable)  {
        JnaNotebook.INST().gtk_notebook_set_scrollable(asCPointer(), scrollable);
    }

    /**
     * Sets whether a bevel will be drawn around the notebook pages.
     * <br>
     * <br>This only has a visual effect when the tabs are not shown.
     * @param show_border %TRUE if a bevel should be drawn around the notebook
    */
    public void setShowBorder(boolean show_border)  {
        JnaNotebook.INST().gtk_notebook_set_show_border(asCPointer(), show_border);
    }

    /**
     * Sets whether to show the tabs for the notebook or not.
     * @param show_tabs %TRUE if the tabs should be shown
    */
    public void setShowTabs(boolean show_tabs)  {
        JnaNotebook.INST().gtk_notebook_set_show_tabs(asCPointer(), show_tabs);
    }

    /**
     * Sets whether the tab can be detached from &#64;notebook to another
     * <br>notebook or widget.
     * <br>
     * <br>Note that two notebooks must share a common group identificator
     * <br>(see [method&#64;Gtk.Notebook.set_group_name]) to allow automatic tabs
     * <br>interchange between them.
     * <br>
     * <br>If you want a widget to interact with a notebook through DnD
     * <br>(i.e.: accept dragged tabs from it) it must be set as a drop
     * <br>destination and accept the target “GTK_NOTEBOOK_TAB”. The notebook
     * <br>will fill the selection with a GtkWidget** pointing to the child
     * <br>widget that corresponds to the dropped tab.
     * <br>
     * <br>Note that you should use [method&#64;Gtk.Notebook.detach_tab] instead
     * <br>of [method&#64;Gtk.Notebook.remove_page] if you want to remove the tab
     * <br>from the source notebook as part of accepting a drop. Otherwise,
     * <br>the source notebook will think that the dragged tab was removed
     * <br>from underneath the ongoing drag operation, and will initiate a
     * <br>drag cancel animation.
     * <br>
     * <br>```c
     * <br>static void
     * <br>on_drag_data_received (GtkWidget        *widget,
     * <br>                       GdkDrop          *drop,
     * <br>                       GtkSelectionData *data,
     * <br>                       guint             time,
     * <br>                       gpointer          user_data)
     * <br>{
     * <br>  GtkDrag *drag;
     * <br>  GtkWidget *notebook;
     * <br>  GtkWidget **child;
     * <br>
     * <br>  drag = gtk_drop_get_drag (drop);
     * <br>  notebook = g_object_get_data (drag, &quot;gtk-notebook-drag-origin&quot;);
     * <br>  child = (void*) gtk_selection_data_get_data (data);
     * <br>
     * <br>  // process_widget (*child);
     * <br>
     * <br>  gtk_notebook_detach_tab (GTK_NOTEBOOK (notebook), *child);
     * <br>}
     * <br>```
     * <br>
     * <br>If you want a notebook to accept drags from other widgets,
     * <br>you will have to set your own DnD code to do it.
     * @param child a child `GtkWidget`
     * @param detachable whether the tab is detachable or not
    */
    public void setTabDetachable(@Nonnull Widget child, boolean detachable)  {
        JnaNotebook.INST().gtk_notebook_set_tab_detachable(asCPointer(), asCPointerNotNull(child), detachable);
    }

    /**
     * Changes the tab label for &#64;child.
     * <br>
     * <br>If %NULL is specified for &#64;tab_label, then the page will
     * <br>have the label “page N”.
     * @param child the page
     * @param tab_label the tab label widget to use, or %NULL   for default tab label
    */
    public void setTabLabel(@Nonnull Widget child, @Nullable Widget tab_label)  {
        JnaNotebook.INST().gtk_notebook_set_tab_label(asCPointer(), asCPointerNotNull(child), asCPointer(tab_label));
    }

    /**
     * Creates a new label and sets it as the tab label for the page
     * <br>containing &#64;child.
     * @param child the page
     * @param tab_text the label text
    */
    public void setTabLabelText(@Nonnull Widget child, @Nonnull ch.bailu.gtk.type.Str tab_text)  {
        JnaNotebook.INST().gtk_notebook_set_tab_label_text(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(tab_text));
    }

    /**
     * Creates a new label and sets it as the tab label for the page
     * <br>containing &#64;child.
     * @param child the page
     * @param tab_text the label text
    */
    public void setTabLabelText(@Nonnull Widget child, String tab_text)  {
        JnaNotebook.INST().gtk_notebook_set_tab_label_text(asCPointer(), asCPointerNotNull(child), tab_text);
    }

    /**
     * Sets the edge at which the tabs are drawn.
     * @param pos the edge to draw the tabs at
    */
    public void setTabPos(int pos)  {
        JnaNotebook.INST().gtk_notebook_set_tab_pos(asCPointer(), pos);
    }

    /**
     * Sets whether the notebook tab can be reordered
     * <br>via drag and drop or not.
     * @param child a child `GtkWidget`
     * @param reorderable whether the tab is reorderable or not
    */
    public void setTabReorderable(@Nonnull Widget child, boolean reorderable)  {
        JnaNotebook.INST().gtk_notebook_set_tab_reorderable(asCPointer(), asCPointerNotNull(child), reorderable);
    }

    public final static String SIGNAL_ON_CHANGE_CURRENT_PAGE = "change-current-page";
    
    /**
     * Connect to signal "change-current-page".
     * <br>See {@link OnChangeCurrentPage#onChangeCurrentPage} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGE_CURRENT_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChangeCurrentPage(OnChangeCurrentPage signal) {
        return connectSignal(SIGNAL_ON_CHANGE_CURRENT_PAGE, toOnChangeCurrentPage(signal));
    }

    public final static String SIGNAL_ON_CREATE_WINDOW = "create-window";
    
    /**
     * Connect to signal "create-window".
     * <br>See {@link OnCreateWindow#onCreateWindow} for signal description.
     * <br>Field {@link #SIGNAL_ON_CREATE_WINDOW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCreateWindow(OnCreateWindow signal) {
        return connectSignal(SIGNAL_ON_CREATE_WINDOW, toOnCreateWindow(signal));
    }

    public final static String SIGNAL_ON_FOCUS_TAB = "focus-tab";
    
    /**
     * Connect to signal "focus-tab".
     * <br>See {@link OnFocusTab#onFocusTab} for signal description.
     * <br>Field {@link #SIGNAL_ON_FOCUS_TAB} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFocusTab(OnFocusTab signal) {
        return connectSignal(SIGNAL_ON_FOCUS_TAB, toOnFocusTab(signal));
    }

    public final static String SIGNAL_ON_MOVE_FOCUS_OUT = "move-focus-out";
    
    /**
     * Connect to signal "move-focus-out".
     * <br>See {@link OnMoveFocusOut#onMoveFocusOut} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_FOCUS_OUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveFocusOut(OnMoveFocusOut signal) {
        return connectSignal(SIGNAL_ON_MOVE_FOCUS_OUT, toOnMoveFocusOut(signal));
    }

    public final static String SIGNAL_ON_PAGE_ADDED = "page-added";
    
    /**
     * Connect to signal "page-added".
     * <br>See {@link OnPageAdded#onPageAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageAdded(OnPageAdded signal) {
        return connectSignal(SIGNAL_ON_PAGE_ADDED, toOnPageAdded(signal));
    }

    public final static String SIGNAL_ON_PAGE_REMOVED = "page-removed";
    
    /**
     * Connect to signal "page-removed".
     * <br>See {@link OnPageRemoved#onPageRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageRemoved(OnPageRemoved signal) {
        return connectSignal(SIGNAL_ON_PAGE_REMOVED, toOnPageRemoved(signal));
    }

    public final static String SIGNAL_ON_PAGE_REORDERED = "page-reordered";
    
    /**
     * Connect to signal "page-reordered".
     * <br>See {@link OnPageReordered#onPageReordered} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_REORDERED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageReordered(OnPageReordered signal) {
        return connectSignal(SIGNAL_ON_PAGE_REORDERED, toOnPageReordered(signal));
    }

    public final static String SIGNAL_ON_REORDER_TAB = "reorder-tab";
    
    /**
     * Connect to signal "reorder-tab".
     * <br>See {@link OnReorderTab#onReorderTab} for signal description.
     * <br>Field {@link #SIGNAL_ON_REORDER_TAB} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onReorderTab(OnReorderTab signal) {
        return connectSignal(SIGNAL_ON_REORDER_TAB, toOnReorderTab(signal));
    }

    public final static String SIGNAL_ON_SELECT_PAGE = "select-page";
    
    /**
     * Connect to signal "select-page".
     * <br>See {@link OnSelectPage#onSelectPage} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectPage(OnSelectPage signal) {
        return connectSignal(SIGNAL_ON_SELECT_PAGE, toOnSelectPage(signal));
    }

    public final static String SIGNAL_ON_SWITCH_PAGE = "switch-page";
    
    /**
     * Connect to signal "switch-page".
     * <br>See {@link OnSwitchPage#onSwitchPage} for signal description.
     * <br>Field {@link #SIGNAL_ON_SWITCH_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSwitchPage(OnSwitchPage signal) {
        return connectSignal(SIGNAL_ON_SWITCH_PAGE, toOnSwitchPage(signal));
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
        return JnaNotebook.INST().gtk_notebook_get_type(); 
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
