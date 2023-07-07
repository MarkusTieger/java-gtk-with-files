/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A dynamic tabbed container.
 * <br>
 * <br>`AdwTabView` is a container which shows one child at a time. While it
 * <br>provides keyboard shortcuts for switching between pages, it does not provide
 * <br>a visible tab bar and relies on external widgets for that, such as
 * <br>[class&#64;TabBar].
 * <br>
 * <br>`AdwTabView` maintains a [class&#64;TabPage] object for each page, which holds
 * <br>additional per-page properties. You can obtain the `AdwTabPage` for a page
 * <br>with [method&#64;TabView.get_page], and as the return value for
 * <br>[method&#64;TabView.append] and other functions for adding children.
 * <br>
 * <br>`AdwTabView` only aims to be useful for dynamic tabs in multi-window
 * <br>document-based applications, such as web browsers, file managers, text
 * <br>editors or terminals. It does not aim to replace [class&#64;Gtk.Notebook] for use
 * <br>cases such as tabbed dialogs.
 * <br>
 * <br>As such, it does not support disabling page reordering or detaching.
 * <br>
 * <br>`AdwTabView` adds a number of global page switching and reordering shortcuts.
 * <br>The [property&#64;TabView:shortcuts] property can be used to manage them.
 * <br>
 * <br>See [flags&#64;TabViewShortcuts] for the list of the available shortcuts. All of
 * <br>the shortcuts are enabled by default.
 * <br>
 * <br>[method&#64;TabView.add_shortcuts] and [method&#64;TabView.remove_shortcuts] can be
 * <br>used to manage shortcuts in a convenient way, for example:
 * <br>
 * <br>```c
 * <br>adw_tab_view_remove_shortcuts (view, ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME |
 * <br>                                     ADW_TAB_VIEW_SHORTCUT_CONTROL_END);
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwTabView` has a main CSS node with the name `tabview`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabView.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabView.html</a></p>
*/
public class TabView extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TabView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClosePage {
        /**
         * Emitted after [method&#64;TabView.close_page] has been called for &#64;page.
         * <br>
         * <br>The handler is expected to call [method&#64;TabView.close_page_finish] to
         * <br>confirm or reject the closing.
         * <br>
         * <br>The default handler will immediately confirm closing for non-pinned pages,
         * <br>or reject it for pinned pages, equivalent to the following example:
         * <br>
         * <br>```c
         * <br>static gboolean
         * <br>close_page_cb (AdwTabView *view,
         * <br>               AdwTabPage *page,
         * <br>               gpointer    user_data)
         * <br>{
         * <br>  adw_tab_view_close_page_finish (view, page, !adw_tab_page_get_pinned (page));
         * <br>
         * <br>  return GDK_EVENT_STOP;
         * <br>}
         * <br>```
         * <br>
         * <br>The [method&#64;TabView.close_page_finish] call doesn't have to happen inside
         * <br>the handler, so can be used to do asynchronous checks before confirming the
         * <br>closing.
         * <br>
         * <br>A typical reason to connect to this signal is to show a confirmation dialog
         * <br>for closing a tab.
         * @param page a page of &#64;self
         * @return 
        */
        boolean onClosePage(@Nonnull TabPage page);
    }
    
    private static com.sun.jna.Callback toOnClosePage(OnClosePage in) {
        return (in == null) ? null: (JnaTabView.OnClosePage) (__self, _page, __data) -> in.onClosePage(new TabPage(new PointerContainer(_page)));
    }

    @FunctionalInterface
    public interface OnCreateWindow {
        /**
         * Emitted when a tab should be transferred into a new window.
         * <br>
         * <br>This can happen after a tab has been dropped on desktop.
         * <br>
         * <br>The signal handler is expected to create a new window, position it as
         * <br>needed and return its `AdwTabView` that the page will be transferred into.
         * @return the `AdwTabView` from the new window
        */
        TabView onCreateWindow();
    }
    
    private static com.sun.jna.Callback toOnCreateWindow(OnCreateWindow in) {
        return (in == null) ? null: (JnaTabView.OnCreateWindow) (__self, __data) -> in.onCreateWindow().asCPointer();
    }

    @FunctionalInterface
    public interface OnIndicatorActivated {
        /**
         * Emitted after the indicator icon on &#64;page has been activated.
         * <br>
         * <br>See [property&#64;TabPage:indicator-icon] and
         * <br>[property&#64;TabPage:indicator-activatable].
         * @param page a page of &#64;self
        */
        void onIndicatorActivated(@Nonnull TabPage page);
    }
    
    private static com.sun.jna.Callback toOnIndicatorActivated(OnIndicatorActivated in) {
        return (in == null) ? null: (JnaTabView.OnIndicatorActivated) (__self, _page, __data) -> in.onIndicatorActivated(new TabPage(new PointerContainer(_page)));
    }

    @FunctionalInterface
    public interface OnPageAttached {
        /**
         * Emitted when a page has been created or transferred to &#64;self.
         * <br>
         * <br>A typical reason to connect to this signal would be to connect to page
         * <br>signals for things such as updating window title.
         * @param page a page of &#64;self
         * @param position the position of the page, starting from 0
        */
        void onPageAttached(@Nonnull TabPage page, int position);
    }
    
    private static com.sun.jna.Callback toOnPageAttached(OnPageAttached in) {
        return (in == null) ? null: (JnaTabView.OnPageAttached) (__self, _page, _position, __data) -> in.onPageAttached(new TabPage(new PointerContainer(_page)), _position);
    }

    @FunctionalInterface
    public interface OnPageDetached {
        /**
         * Emitted when a page has been removed or transferred to another view.
         * <br>
         * <br>A typical reason to connect to this signal would be to disconnect signal
         * <br>handlers connected in the [signal&#64;TabView::page-attached] handler.
         * <br>
         * <br>It is important not to try and destroy the page child in the handler of
         * <br>this function as the child might merely be moved to another window; use
         * <br>child dispose handler for that or do it in sync with your
         * <br>[method&#64;TabView.close_page_finish] calls.
         * @param page a page of &#64;self
         * @param position the position of the removed page, starting from 0
        */
        void onPageDetached(@Nonnull TabPage page, int position);
    }
    
    private static com.sun.jna.Callback toOnPageDetached(OnPageDetached in) {
        return (in == null) ? null: (JnaTabView.OnPageDetached) (__self, _page, _position, __data) -> in.onPageDetached(new TabPage(new PointerContainer(_page)), _position);
    }

    @FunctionalInterface
    public interface OnPageReordered {
        /**
         * Emitted after &#64;page has been reordered to &#64;position.
         * @param page a page of &#64;self
         * @param position the position &#64;page was moved to, starting at 0
        */
        void onPageReordered(@Nonnull TabPage page, int position);
    }
    
    private static com.sun.jna.Callback toOnPageReordered(OnPageReordered in) {
        return (in == null) ? null: (JnaTabView.OnPageReordered) (__self, _page, _position, __data) -> in.onPageReordered(new TabPage(new PointerContainer(_page)), _position);
    }

    @FunctionalInterface
    public interface OnSetupMenu {
        /**
         * Emitted when a context menu is opened or closed for &#64;page.
         * <br>
         * <br>If the menu has been closed, &#64;page will be set to `NULL`.
         * <br>
         * <br>It can be used to set up menu actions before showing the menu, for example
         * <br>disable actions not applicable to &#64;page.
         * @param page a page of &#64;self
        */
        void onSetupMenu(@Nullable TabPage page);
    }
    
    private static com.sun.jna.Callback toOnSetupMenu(OnSetupMenu in) {
        return (in == null) ? null: (JnaTabView.OnSetupMenu) (__self, _page, __data) -> in.onSetupMenu(new TabPage(new PointerContainer(_page)));
    }

    public TabView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwTabView`.
    */
    public TabView() {
        super(cast(JnaTabView.INST().adw_tab_view_new()));
    }

    /**
     * Adds &#64;child to &#64;self with &#64;parent as the parent.
     * <br>
     * <br>This function can be used to automatically position new pages, and to select
     * <br>the correct page when this page is closed while being selected (see
     * <br>[method&#64;TabView.close_page]).
     * <br>
     * <br>If &#64;parent is `NULL`, this function is equivalent to [method&#64;TabView.append].
     * @param child a widget to add
     * @param parent a parent page for &#64;child
     * @return the page object representing &#64;child
    */
    public TabPage addPage(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable TabPage parent)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_add_page(asCPointer(), asCPointerNotNull(child), asCPointer(parent))));
    }

    /**
     * Adds &#64;shortcuts for &#64;self.
     * <br>
     * <br>See [property&#64;TabView:shortcuts] for details.
     * @param shortcuts the shortcuts to add
    */
    public void addShortcuts(int shortcuts)  {
        JnaTabView.INST().adw_tab_view_add_shortcuts(asCPointer(), shortcuts);
    }

    /**
     * Inserts &#64;child as the last non-pinned page.
     * @param child a widget to add
     * @return the page object representing &#64;child
    */
    public TabPage append(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_append(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Inserts &#64;child as the last pinned page.
     * @param child a widget to add
     * @return the page object representing &#64;child
    */
    public TabPage appendPinned(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_append_pinned(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Requests to close all pages other than &#64;page.
     * @param page a page of &#64;self
    */
    public void closeOtherPages(@Nonnull TabPage page)  {
        JnaTabView.INST().adw_tab_view_close_other_pages(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Requests to close &#64;page.
     * <br>
     * <br>Calling this function will result in the [signal&#64;TabView::close-page] signal
     * <br>being emitted for &#64;page. Closing the page can then be confirmed or
     * <br>denied via [method&#64;TabView.close_page_finish].
     * <br>
     * <br>If the page is waiting for a [method&#64;TabView.close_page_finish] call, this
     * <br>function will do nothing.
     * <br>
     * <br>The default handler for [signal&#64;TabView::close-page] will immediately confirm
     * <br>closing the page if it's non-pinned, or reject it if it's pinned. This
     * <br>behavior can be changed by registering your own handler for that signal.
     * <br>
     * <br>If &#64;page was selected, another page will be selected instead:
     * <br>
     * <br>If the [property&#64;TabPage:parent] value is `NULL`, the next page will be
     * <br>selected when possible, or if the page was already last, the previous page
     * <br>will be selected instead.
     * <br>
     * <br>If it's not `NULL`, the previous page will be selected if it's a descendant
     * <br>(possibly indirect) of the parent. If both the previous page and the parent
     * <br>are pinned, the parent will be selected instead.
     * @param page a page of &#64;self
    */
    public void closePage(@Nonnull TabPage page)  {
        JnaTabView.INST().adw_tab_view_close_page(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Completes a [method&#64;TabView.close_page] call for &#64;page.
     * <br>
     * <br>If &#64;confirm is `TRUE`, &#64;page will be closed. If it's `FALSE`, it will be
     * <br>reverted to its previous state and [method&#64;TabView.close_page] can be called
     * <br>for it again.
     * <br>
     * <br>This function should not be called unless a custom handler for
     * <br>[signal&#64;TabView::close-page] is used.
     * @param page a page of &#64;self
     * @param confirm whether to confirm or deny closing &#64;page
    */
    public void closePageFinish(@Nonnull TabPage page, boolean confirm)  {
        JnaTabView.INST().adw_tab_view_close_page_finish(asCPointer(), asCPointerNotNull(page), confirm);
    }

    /**
     * Requests to close all pages after &#64;page.
     * @param page a page of &#64;self
    */
    public void closePagesAfter(@Nonnull TabPage page)  {
        JnaTabView.INST().adw_tab_view_close_pages_after(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Requests to close all pages before &#64;page.
     * @param page a page of &#64;self
    */
    public void closePagesBefore(@Nonnull TabPage page)  {
        JnaTabView.INST().adw_tab_view_close_pages_before(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Gets the default icon of &#64;self.
     * @return the default icon of &#64;self.
    */
    public ch.bailu.gtk.gio.Icon getDefaultIcon()  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaTabView.INST().adw_tab_view_get_default_icon(asCPointer())));
    }

    /**
     * Whether a page is being transferred.
     * <br>
     * <br>The corresponding property will be set to `TRUE` when a drag-n-drop tab
     * <br>transfer starts on any `AdwTabView`, and to `FALSE` after it ends.
     * <br>
     * <br>During the transfer, children cannot receive pointer input and a tab can
     * <br>be safely dropped on the tab view.
     * @return whether a page is being transferred
    */
    public boolean getIsTransferringPage()  {
        return JnaTabView.INST().adw_tab_view_get_is_transferring_page(asCPointer());
    }

    /**
     * Gets the tab context menu model for &#64;self.
     * @return the tab context menu model for &#64;self
    */
    public ch.bailu.gtk.gio.MenuModel getMenuModel()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaTabView.INST().adw_tab_view_get_menu_model(asCPointer())));
    }

    /**
     * Gets the number of pages in &#64;self.
     * @return the number of pages in &#64;self
    */
    public int getNPages()  {
        return JnaTabView.INST().adw_tab_view_get_n_pages(asCPointer());
    }

    /**
     * Gets the number of pinned pages in &#64;self.
     * <br>
     * <br>See [method&#64;TabView.set_page_pinned].
     * @return the number of pinned pages in &#64;self
    */
    public int getNPinnedPages()  {
        return JnaTabView.INST().adw_tab_view_get_n_pinned_pages(asCPointer());
    }

    /**
     * Gets the [class&#64;TabPage] representing the child at &#64;position.
     * @param position the index of the page in &#64;self, starting from 0
     * @return the page object at &#64;position
    */
    public TabPage getNthPage(int position)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_get_nth_page(asCPointer(), position)));
    }

    /**
     * Gets the [class&#64;TabPage] object representing &#64;child.
     * @param child a child in &#64;self
     * @return the page object for &#64;child
    */
    public TabPage getPage(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Finds the position of &#64;page in &#64;self, starting from 0.
     * @param page a page of &#64;self
     * @return the position of &#64;page in &#64;self
    */
    public int getPagePosition(@Nonnull TabPage page)  {
        return JnaTabView.INST().adw_tab_view_get_page_position(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Returns a [iface&#64;Gio.ListModel] that contains the pages of &#64;self.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also implements
     * <br>[iface&#64;Gtk.SelectionModel] and can be used to track and change the selected
     * <br>page.
     * @return a `GtkSelectionModel` for the pages of &#64;self
    */
    public ch.bailu.gtk.gtk.SelectionModel getPages()  {
        return new ch.bailu.gtk.gtk.SelectionModel(new PointerContainer(JnaTabView.INST().adw_tab_view_get_pages(asCPointer())));
    }

    /**
     * Gets the currently selected page in &#64;self.
     * @return the selected page
    */
    public TabPage getSelectedPage()  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_get_selected_page(asCPointer())));
    }

    /**
     * Gets the enabled shortcuts for &#64;self.
     * @return the shortcut mask
    */
    public int getShortcuts()  {
        return JnaTabView.INST().adw_tab_view_get_shortcuts(asCPointer());
    }

    /**
     * Inserts a non-pinned page at &#64;position.
     * <br>
     * <br>It's an error to try to insert a page before a pinned page, in that case
     * <br>[method&#64;TabView.insert_pinned] should be used instead.
     * @param child a widget to add
     * @param position the position to add &#64;child at, starting from 0
     * @return the page object representing &#64;child
    */
    public TabPage insert(@Nonnull ch.bailu.gtk.gtk.Widget child, int position)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_insert(asCPointer(), asCPointerNotNull(child), position)));
    }

    /**
     * Inserts a pinned page at &#64;position.
     * <br>
     * <br>It's an error to try to insert a pinned page after a non-pinned page, in
     * <br>that case [method&#64;TabView.insert] should be used instead.
     * @param child a widget to add
     * @param position the position to add &#64;child at, starting from 0
     * @return the page object representing &#64;child
    */
    public TabPage insertPinned(@Nonnull ch.bailu.gtk.gtk.Widget child, int position)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_insert_pinned(asCPointer(), asCPointerNotNull(child), position)));
    }

    /**
     * Inserts &#64;child as the first non-pinned page.
     * @param child a widget to add
     * @return the page object representing &#64;child
    */
    public TabPage prepend(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_prepend(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Inserts &#64;child as the first pinned page.
     * @param child a widget to add
     * @return the page object representing &#64;child
    */
    public TabPage prependPinned(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new TabPage(new PointerContainer(JnaTabView.INST().adw_tab_view_prepend_pinned(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Removes &#64;shortcuts from &#64;self.
     * <br>
     * <br>See [property&#64;TabView:shortcuts] for details.
     * @param shortcuts the shortcuts to reomve
    */
    public void removeShortcuts(int shortcuts)  {
        JnaTabView.INST().adw_tab_view_remove_shortcuts(asCPointer(), shortcuts);
    }

    /**
     * Reorders &#64;page to before its previous page if possible.
     * @param page a page of &#64;self
     * @return whether &#64;page was moved
    */
    public boolean reorderBackward(@Nonnull TabPage page)  {
        return JnaTabView.INST().adw_tab_view_reorder_backward(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Reorders &#64;page to the first possible position.
     * @param page a page of &#64;self
     * @return whether &#64;page was moved
    */
    public boolean reorderFirst(@Nonnull TabPage page)  {
        return JnaTabView.INST().adw_tab_view_reorder_first(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Reorders &#64;page to after its next page if possible.
     * @param page a page of &#64;self
     * @return whether &#64;page was moved
    */
    public boolean reorderForward(@Nonnull TabPage page)  {
        return JnaTabView.INST().adw_tab_view_reorder_forward(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Reorders &#64;page to the last possible position.
     * @param page a page of &#64;self
     * @return whether &#64;page was moved
    */
    public boolean reorderLast(@Nonnull TabPage page)  {
        return JnaTabView.INST().adw_tab_view_reorder_last(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Reorders &#64;page to &#64;position.
     * <br>
     * <br>It's a programmer error to try to reorder a pinned page after a non-pinned
     * <br>one, or a non-pinned page before a pinned one.
     * @param page a page of &#64;self
     * @param position the position to insert the page at, starting at 0
     * @return whether &#64;page was moved
    */
    public boolean reorderPage(@Nonnull TabPage page, int position)  {
        return JnaTabView.INST().adw_tab_view_reorder_page(asCPointer(), asCPointerNotNull(page), position);
    }

    /**
     * Selects the page after the currently selected page.
     * <br>
     * <br>If the last page was already selected, this function does nothing.
     * @return whether the selected page was changed
    */
    public boolean selectNextPage()  {
        return JnaTabView.INST().adw_tab_view_select_next_page(asCPointer());
    }

    /**
     * Selects the page before the currently selected page.
     * <br>
     * <br>If the first page was already selected, this function does nothing.
     * @return whether the selected page was changed
    */
    public boolean selectPreviousPage()  {
        return JnaTabView.INST().adw_tab_view_select_previous_page(asCPointer());
    }

    /**
     * Sets the default page icon for &#64;self.
     * <br>
     * <br>If a page doesn't provide its own icon via [property&#64;TabPage:icon], a default
     * <br>icon may be used instead for contexts where having an icon is necessary.
     * <br>
     * <br>[class&#64;TabBar] will use default icon for pinned tabs in case the page is not
     * <br>loading, doesn't have an icon and an indicator. Default icon is never used
     * <br>for tabs that aren't pinned.
     * <br>
     * <br>By default, the `adw-tab-icon-missing-symbolic` icon is used.
     * @param default_icon the default icon
    */
    public void setDefaultIcon(@Nonnull ch.bailu.gtk.gio.Icon default_icon)  {
        JnaTabView.INST().adw_tab_view_set_default_icon(asCPointer(), asCPointerNotNull(default_icon));
    }

    /**
     * Sets the tab context menu model for &#64;self.
     * <br>
     * <br>When a context menu is shown for a tab, it will be constructed from the
     * <br>provided menu model. Use the [signal&#64;TabView::setup-menu] signal to set up
     * <br>the menu actions for the particular tab.
     * @param menu_model a menu model
    */
    public void setMenuModel(@Nullable ch.bailu.gtk.gio.MenuModel menu_model)  {
        JnaTabView.INST().adw_tab_view_set_menu_model(asCPointer(), asCPointer(menu_model));
    }

    /**
     * Pins or unpins &#64;page.
     * <br>
     * <br>Pinned pages are guaranteed to be placed before all non-pinned pages; at any
     * <br>given moment the first [property&#64;TabView:n-pinned-pages] pages in &#64;self are
     * <br>guaranteed to be pinned.
     * <br>
     * <br>When a page is pinned or unpinned, it's automatically reordered: pinning a
     * <br>page moves it after other pinned pages; unpinning a page moves it before
     * <br>other non-pinned pages.
     * <br>
     * <br>Pinned pages can still be reordered between each other.
     * <br>
     * <br>[class&#64;TabBar] will display pinned pages in a compact form, never showing the
     * <br>title or close button, and only showing a single icon, selected in the
     * <br>following order:
     * <br>
     * <br>1. [property&#64;TabPage:indicator-icon]
     * <br>2. A spinner if [property&#64;TabPage:loading] is `TRUE`
     * <br>3. [property&#64;TabPage:icon]
     * <br>4. [property&#64;TabView:default-icon]
     * <br>
     * <br>Pinned pages cannot be closed by default, see [signal&#64;TabView::close-page]
     * <br>for how to override that behavior.
     * <br>
     * <br>Changes the value of the [property&#64;TabPage:pinned] property.
     * @param page a page of &#64;self
     * @param pinned whether &#64;page should be pinned
    */
    public void setPagePinned(@Nonnull TabPage page, boolean pinned)  {
        JnaTabView.INST().adw_tab_view_set_page_pinned(asCPointer(), asCPointerNotNull(page), pinned);
    }

    /**
     * Sets the currently selected page in &#64;self.
     * @param selected_page a page in &#64;self
    */
    public void setSelectedPage(@Nonnull TabPage selected_page)  {
        JnaTabView.INST().adw_tab_view_set_selected_page(asCPointer(), asCPointerNotNull(selected_page));
    }

    /**
     * Sets the enabled shortcuts for &#64;self.
     * <br>
     * <br>See [flags&#64;TabViewShortcuts] for the list of the available shortcuts. All of
     * <br>the shortcuts are enabled by default.
     * <br>
     * <br>[method&#64;TabView.add_shortcuts] and [method&#64;TabView.remove_shortcuts] provide
     * <br>a convenient way to manage individual shortcuts.
     * @param shortcuts the new shortcuts
    */
    public void setShortcuts(int shortcuts)  {
        JnaTabView.INST().adw_tab_view_set_shortcuts(asCPointer(), shortcuts);
    }

    /**
     * Transfers &#64;page from &#64;self to &#64;other_view.
     * <br>
     * <br>The &#64;page object will be reused.
     * <br>
     * <br>It's a programmer error to try to insert a pinned page after a non-pinned
     * <br>one, or a non-pinned page before a pinned one.
     * @param page a page of &#64;self
     * @param other_view the tab view to transfer the page to
     * @param position the position to insert the page at, starting at 0
    */
    public void transferPage(@Nonnull TabPage page, @Nonnull TabView other_view, int position)  {
        JnaTabView.INST().adw_tab_view_transfer_page(asCPointer(), asCPointerNotNull(page), asCPointerNotNull(other_view), position);
    }

    public final static String SIGNAL_ON_CLOSE_PAGE = "close-page";
    
    /**
     * Connect to signal "close-page".
     * <br>See {@link OnClosePage#onClosePage} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSE_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClosePage(OnClosePage signal) {
        return connectSignal(SIGNAL_ON_CLOSE_PAGE, toOnClosePage(signal));
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

    public final static String SIGNAL_ON_INDICATOR_ACTIVATED = "indicator-activated";
    
    /**
     * Connect to signal "indicator-activated".
     * <br>See {@link OnIndicatorActivated#onIndicatorActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_INDICATOR_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onIndicatorActivated(OnIndicatorActivated signal) {
        return connectSignal(SIGNAL_ON_INDICATOR_ACTIVATED, toOnIndicatorActivated(signal));
    }

    public final static String SIGNAL_ON_PAGE_ATTACHED = "page-attached";
    
    /**
     * Connect to signal "page-attached".
     * <br>See {@link OnPageAttached#onPageAttached} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_ATTACHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageAttached(OnPageAttached signal) {
        return connectSignal(SIGNAL_ON_PAGE_ATTACHED, toOnPageAttached(signal));
    }

    public final static String SIGNAL_ON_PAGE_DETACHED = "page-detached";
    
    /**
     * Connect to signal "page-detached".
     * <br>See {@link OnPageDetached#onPageDetached} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_DETACHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageDetached(OnPageDetached signal) {
        return connectSignal(SIGNAL_ON_PAGE_DETACHED, toOnPageDetached(signal));
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

    public final static String SIGNAL_ON_SETUP_MENU = "setup-menu";
    
    /**
     * Connect to signal "setup-menu".
     * <br>See {@link OnSetupMenu#onSetupMenu} for signal description.
     * <br>Field {@link #SIGNAL_ON_SETUP_MENU} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSetupMenu(OnSetupMenu signal) {
        return connectSignal(SIGNAL_ON_SETUP_MENU, toOnSetupMenu(signal));
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
        return JnaTabView.INST().adw_tab_view_get_type(); 
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
