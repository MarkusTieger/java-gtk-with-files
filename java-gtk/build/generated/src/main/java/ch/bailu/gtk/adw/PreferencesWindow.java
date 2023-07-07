/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A window to present an application's preferences.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;preferences-window-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;preferences-window.png&quot; alt=&quot;preferences-window&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwPreferencesWindow` widget presents an application's preferences
 * <br>gathered into pages and groups. The preferences are searchable by the user.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwPreferencesWindow` has a main CSS node with the name `window` and the
 * <br>style class `.preferences`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesWindow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesWindow.html</a></p>
*/
public class PreferencesWindow extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PreferencesWindow.class.getCanonicalName());
    }

    public PreferencesWindow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPreferencesWindow`.
    */
    public PreferencesWindow() {
        super(cast(JnaPreferencesWindow.INST().adw_preferences_window_new()));
    }

    /**
     * Adds a preferences page to &#64;self.
     * @param page the page to add
    */
    public void add(@Nonnull PreferencesPage page)  {
        JnaPreferencesWindow.INST().adw_preferences_window_add(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Displays &#64;toast.
     * <br>
     * <br>See [method&#64;ToastOverlay.add_toast].
     * @param toast a toast
    */
    public void addToast(@Nonnull Toast toast)  {
        JnaPreferencesWindow.INST().adw_preferences_window_add_toast(asCPointer(), asCPointerNotNull(toast));
    }

    /**
     * Closes the current subpage.
     * <br>
     * <br>If there is no presented subpage, this does nothing.
    */
    public void closeSubpage()  {
        JnaPreferencesWindow.INST().adw_preferences_window_close_subpage(asCPointer());
    }

    /**
     * Gets whether gestures and shortcuts for closing subpages are enabled.
     * @return whether gestures and shortcuts are enabled.
    */
    public boolean getCanNavigateBack()  {
        return JnaPreferencesWindow.INST().adw_preferences_window_get_can_navigate_back(asCPointer());
    }

    /**
     * Gets whether search is enabled for &#64;self.
     * @return whether search is enabled for &#64;self.
    */
    public boolean getSearchEnabled()  {
        return JnaPreferencesWindow.INST().adw_preferences_window_get_search_enabled(asCPointer());
    }

    /**
     * Gets the currently visible page of &#64;self.
     * @return the visible page
    */
    public PreferencesPage getVisiblePage()  {
        return new PreferencesPage(new PointerContainer(JnaPreferencesWindow.INST().adw_preferences_window_get_visible_page(asCPointer())));
    }

    /**
     * Gets the name of currently visible page of &#64;self.
     * @return the name of the visible page
    */
    public ch.bailu.gtk.type.Str getVisiblePageName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesWindow.INST().adw_preferences_window_get_visible_page_name(asCPointer())));
    }

    /**
     * Sets &#64;subpage as the window's subpage and opens it.
     * <br>
     * <br>The transition can be cancelled by the user, in which case visible child will
     * <br>change back to the previously visible child.
     * @param subpage the subpage
    */
    public void presentSubpage(@Nonnull ch.bailu.gtk.gtk.Widget subpage)  {
        JnaPreferencesWindow.INST().adw_preferences_window_present_subpage(asCPointer(), asCPointerNotNull(subpage));
    }

    /**
     * Removes a page from &#64;self.
     * @param page the page to remove
    */
    public void remove(@Nonnull PreferencesPage page)  {
        JnaPreferencesWindow.INST().adw_preferences_window_remove(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Sets whether gestures and shortcuts for closing subpages are enabled.
     * <br>
     * <br>The supported gestures are:
     * <br>
     * <br>- One-finger swipe on touchscreens
     * <br>- Horizontal scrolling on touchpads (usually two-finger swipe)
     * <br>- Back mouse button
     * <br>
     * <br>The keyboard back key is also supported, as well as the
     * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;←&lt;/kbd&gt; shortcut.
     * <br>
     * <br>For right-to-left locales, gestures and shortcuts are reversed.
     * @param can_navigate_back the new value
    */
    public void setCanNavigateBack(boolean can_navigate_back)  {
        JnaPreferencesWindow.INST().adw_preferences_window_set_can_navigate_back(asCPointer(), can_navigate_back);
    }

    /**
     * Sets whether search is enabled for &#64;self.
     * @param search_enabled whether search is enabled
    */
    public void setSearchEnabled(boolean search_enabled)  {
        JnaPreferencesWindow.INST().adw_preferences_window_set_search_enabled(asCPointer(), search_enabled);
    }

    /**
     * Makes &#64;page the visible page of &#64;self.
     * @param page a page of &#64;self
    */
    public void setVisiblePage(@Nonnull PreferencesPage page)  {
        JnaPreferencesWindow.INST().adw_preferences_window_set_visible_page(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Makes the page with the given name visible.
     * <br>
     * <br>See [property&#64;ViewStack:visible-child].
     * @param name the name of the page to make visible
    */
    public void setVisiblePageName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaPreferencesWindow.INST().adw_preferences_window_set_visible_page_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Makes the page with the given name visible.
     * <br>
     * <br>See [property&#64;ViewStack:visible-child].
     * @param name the name of the page to make visible
    */
    public void setVisiblePageName(String name)  {
        JnaPreferencesWindow.INST().adw_preferences_window_set_visible_page_name(asCPointer(), name);
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

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Native}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Native}
    */
    public ch.bailu.gtk.gtk.Native asNative() {
        return new ch.bailu.gtk.gtk.Native(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Root}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Root}
    */
    public ch.bailu.gtk.gtk.Root asRoot() {
        return new ch.bailu.gtk.gtk.Root(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ShortcutManager}
    */
    public ch.bailu.gtk.gtk.ShortcutManager asShortcutManager() {
        return new ch.bailu.gtk.gtk.ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaPreferencesWindow.INST().adw_preferences_window_get_type(); 
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
