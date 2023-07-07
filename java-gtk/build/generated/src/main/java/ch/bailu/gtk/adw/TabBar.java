/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A tab bar for [class&#64;TabView].
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;tab-bar-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;tab-bar.png&quot; alt=&quot;tab-bar&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwTabBar` widget is a tab bar that can be used with conjunction with
 * <br>`AdwTabView`.
 * <br>
 * <br>`AdwTabBar` can autohide and can optionally contain action widgets on both
 * <br>sides of the tabs.
 * <br>
 * <br>When there's not enough space to show all the tabs, `AdwTabBar` will scroll
 * <br>them. Pinned tabs always stay visible and aren't a part of the scrollable
 * <br>area.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwTabBar` has a single CSS node with name `tabbar`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabBar.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabBar.html</a></p>
*/
public class TabBar extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TabBar.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnExtraDragDrop {
        /**
         * This signal is emitted when content is dropped onto a tab.
         * <br>
         * <br>The content must be of one of the types set up via
         * <br>[method&#64;TabBar.setup_extra_drop_target].
         * <br>
         * <br>See [signal&#64;Gtk.DropTarget::drop].
         * @param page the page matching the tab the content was dropped onto
         * @param value the `GValue` being dropped
         * @return whether the drop was accepted for &#64;page
        */
        boolean onExtraDragDrop(@Nonnull TabPage page, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static com.sun.jna.Callback toOnExtraDragDrop(OnExtraDragDrop in) {
        return (in == null) ? null: (JnaTabBar.OnExtraDragDrop) (__self, _page, _value, __data) -> in.onExtraDragDrop(new TabPage(new PointerContainer(_page)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
    }

    public TabBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwTabBar`.
    */
    public TabBar() {
        super(cast(JnaTabBar.INST().adw_tab_bar_new()));
    }

    /**
     * Gets whether the tabs automatically hide.
     * @return whether the tabs automatically hide
    */
    public boolean getAutohide()  {
        return JnaTabBar.INST().adw_tab_bar_get_autohide(asCPointer());
    }

    /**
     * Gets the widget shown after the tabs.
     * @return the widget shown after the tabs
    */
    public ch.bailu.gtk.gtk.Widget getEndActionWidget()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaTabBar.INST().adw_tab_bar_get_end_action_widget(asCPointer())));
    }

    /**
     * Gets whether tabs expand to full width.
     * @return whether tabs expand to full width.
    */
    public boolean getExpandTabs()  {
        return JnaTabBar.INST().adw_tab_bar_get_expand_tabs(asCPointer());
    }

    /**
     * Gets whether tabs use inverted layout.
     * @return whether tabs use inverted layout
    */
    public boolean getInverted()  {
        return JnaTabBar.INST().adw_tab_bar_get_inverted(asCPointer());
    }

    /**
     * Gets whether &#64;self is overflowing.
     * <br>
     * <br>If `TRUE`, all tabs cannot be displayed at once and require scrolling.
     * @return whether &#64;self is overflowing
    */
    public boolean getIsOverflowing()  {
        return JnaTabBar.INST().adw_tab_bar_get_is_overflowing(asCPointer());
    }

    /**
     * Gets the widget shown before the tabs.
     * @return the widget shown before the tabs
    */
    public ch.bailu.gtk.gtk.Widget getStartActionWidget()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaTabBar.INST().adw_tab_bar_get_start_action_widget(asCPointer())));
    }

    /**
     * Gets whether the tabs are currently revealed.
     * <br>
     * <br>See [property&#64;TabBar:autohide].
     * @return whether the tabs are currently revealed
    */
    public boolean getTabsRevealed()  {
        return JnaTabBar.INST().adw_tab_bar_get_tabs_revealed(asCPointer());
    }

    /**
     * Gets the tab view &#64;self controls.
     * @return the view &#64;self controls
    */
    public TabView getView()  {
        return new TabView(new PointerContainer(JnaTabBar.INST().adw_tab_bar_get_view(asCPointer())));
    }

    /**
     * Sets whether the tabs automatically hide.
     * <br>
     * <br>If set to `TRUE`, the tab bar disappears when [property&#64;TabBar:view] has 0
     * <br>or 1 tab, no pinned tabs, and no tab is being transferred.
     * <br>
     * <br>See [property&#64;TabBar:tabs-revealed].
     * @param autohide whether the tabs automatically hide
    */
    public void setAutohide(boolean autohide)  {
        JnaTabBar.INST().adw_tab_bar_set_autohide(asCPointer(), autohide);
    }

    /**
     * Sets the widget to show after the tabs.
     * @param widget the widget to show after the tabs
    */
    public void setEndActionWidget(@Nullable ch.bailu.gtk.gtk.Widget widget)  {
        JnaTabBar.INST().adw_tab_bar_set_end_action_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets whether tabs expand to full width.
     * <br>
     * <br>If set to `TRUE`, the tabs will always vary width filling the whole width
     * <br>when possible, otherwise tabs will always have the minimum possible size.
     * @param expand_tabs whether to expand tabs
    */
    public void setExpandTabs(boolean expand_tabs)  {
        JnaTabBar.INST().adw_tab_bar_set_expand_tabs(asCPointer(), expand_tabs);
    }

    /**
     * Sets whether tabs tabs use inverted layout.
     * <br>
     * <br>If set to `TRUE`, non-pinned tabs will have the close button at the beginning
     * <br>and the indicator at the end rather than the opposite.
     * @param inverted whether tabs use inverted layout
    */
    public void setInverted(boolean inverted)  {
        JnaTabBar.INST().adw_tab_bar_set_inverted(asCPointer(), inverted);
    }

    /**
     * Sets the widget to show before the tabs.
     * @param widget the widget to show before the tabs
    */
    public void setStartActionWidget(@Nullable ch.bailu.gtk.gtk.Widget widget)  {
        JnaTabBar.INST().adw_tab_bar_set_start_action_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets the tab view &#64;self controls.
     * @param view a tab view
    */
    public void setView(@Nullable TabView view)  {
        JnaTabBar.INST().adw_tab_bar_set_view(asCPointer(), asCPointer(view));
    }

    /**
     * Sets the supported types for this drop target.
     * <br>
     * <br>Sets up an extra drop target on tabs.
     * <br>
     * <br>This allows to drag arbitrary content onto tabs, for example URLs in a web
     * <br>browser.
     * <br>
     * <br>If a tab is hovered for a certain period of time while dragging the content,
     * <br>it will be automatically selected.
     * <br>
     * <br>The [signal&#64;TabBar::extra-drag-drop] signal can be used to handle the drop.
     * @param actions the supported actions
     * @param types    all supported `GType`s that can be dropped
     * @param n_types number of &#64;types
    */
    public void setupExtraDropTarget(int actions, @Nullable ch.bailu.gtk.type.Int64 types, long n_types)  {
        JnaTabBar.INST().adw_tab_bar_setup_extra_drop_target(asCPointer(), actions, asCPointer(types), n_types);
    }

    public final static String SIGNAL_ON_EXTRA_DRAG_DROP = "extra-drag-drop";
    
    /**
     * Connect to signal "extra-drag-drop".
     * <br>See {@link OnExtraDragDrop#onExtraDragDrop} for signal description.
     * <br>Field {@link #SIGNAL_ON_EXTRA_DRAG_DROP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onExtraDragDrop(OnExtraDragDrop signal) {
        return connectSignal(SIGNAL_ON_EXTRA_DRAG_DROP, toOnExtraDragDrop(signal));
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
        return JnaTabBar.INST().adw_tab_bar_get_type(); 
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
