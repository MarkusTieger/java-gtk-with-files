/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An auxiliary class used by [class&#64;TabView].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TabPage.html</a></p>
*/
public class TabPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TabPage.class.getCanonicalName());
    }

    public TabPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the child of &#64;self.
     * @return the child of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_child(asCPointer())));
    }

    /**
     * Gets the icon of &#64;self.
     * @return the icon of &#64;self
    */
    public ch.bailu.gtk.gio.Icon getIcon()  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_icon(asCPointer())));
    }

    /**
     * Gets whether the indicator of &#64;self is activatable.
     * @return whether the indicator is activatable
    */
    public boolean getIndicatorActivatable()  {
        return JnaTabPage.INST().adw_tab_page_get_indicator_activatable(asCPointer());
    }

    /**
     * Gets the indicator icon of &#64;self.
     * @return the indicator icon of &#64;self
    */
    public ch.bailu.gtk.gio.Icon getIndicatorIcon()  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_indicator_icon(asCPointer())));
    }

    /**
     * Gets the tooltip of the indicator icon of &#64;self.
     * @return the indicator tooltip of &#64;self
    */
    public ch.bailu.gtk.type.Str getIndicatorTooltip()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_indicator_tooltip(asCPointer())));
    }

    /**
     * Gets whether &#64;self is loading.
     * @return whether &#64;self is loading
    */
    public boolean getLoading()  {
        return JnaTabPage.INST().adw_tab_page_get_loading(asCPointer());
    }

    /**
     * Gets whether &#64;self needs attention.
     * @return whether &#64;self needs attention
    */
    public boolean getNeedsAttention()  {
        return JnaTabPage.INST().adw_tab_page_get_needs_attention(asCPointer());
    }

    /**
     * Gets the parent page of &#64;self.
     * <br>
     * <br>See [method&#64;TabView.add_page] and [method&#64;TabView.close_page].
     * @return the parent page
    */
    public TabPage getParent()  {
        return new TabPage(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_parent(asCPointer())));
    }

    /**
     * Gets whether &#64;self is pinned.
     * <br>
     * <br>See [method&#64;TabView.set_page_pinned].
     * @return whether &#64;self is pinned
    */
    public boolean getPinned()  {
        return JnaTabPage.INST().adw_tab_page_get_pinned(asCPointer());
    }

    /**
     * Gets whether &#64;self is selected.
     * @return whether &#64;self is selected
    */
    public boolean getSelected()  {
        return JnaTabPage.INST().adw_tab_page_get_selected(asCPointer());
    }

    /**
     * Gets the title of &#64;self.
     * @return the title of &#64;self
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_title(asCPointer())));
    }

    /**
     * Gets the tooltip of &#64;self.
     * @return the tooltip of &#64;self
    */
    public ch.bailu.gtk.type.Str getTooltip()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTabPage.INST().adw_tab_page_get_tooltip(asCPointer())));
    }

    /**
     * Sets the icon of &#64;self.
     * <br>
     * <br>[class&#64;TabBar] displays the icon next to the title.
     * <br>
     * <br>It will not show the icon if [property&#64;TabPage:loading] is set to `TRUE`,
     * <br>or if the page is pinned and [propertyTabPage:indicator-icon] is set.
     * @param icon the icon of &#64;self
    */
    public void setIcon(@Nullable ch.bailu.gtk.gio.Icon icon)  {
        JnaTabPage.INST().adw_tab_page_set_icon(asCPointer(), asCPointer(icon));
    }

    /**
     * Sets whether the indicator of &#64;self is activatable.
     * <br>
     * <br>If set to `TRUE`, [signal&#64;TabView::indicator-activated] will be emitted
     * <br>when the indicator icon is clicked.
     * <br>
     * <br>If [property&#64;TabPage:indicator-icon] is not set, does nothing.
     * @param activatable whether the indicator is activatable
    */
    public void setIndicatorActivatable(boolean activatable)  {
        JnaTabPage.INST().adw_tab_page_set_indicator_activatable(asCPointer(), activatable);
    }

    /**
     * Sets the indicator icon of &#64;self.
     * <br>
     * <br>A common use case is an audio or camera indicator in a web browser.
     * <br>
     * <br>[class&#64;TabBar] will show it at the beginning of the tab, alongside icon
     * <br>representing [property&#64;TabPage:icon] or loading spinner.
     * <br>
     * <br>If the page is pinned, the indicator will be shown instead of icon or
     * <br>spinner.
     * <br>
     * <br>[property&#64;TabPage:indicator-tooltip] can be used to set the tooltip on the
     * <br>indicator icon.
     * <br>
     * <br>If [property&#64;TabPage:indicator-activatable] is set to `TRUE`, the
     * <br>indicator icon can act as a button.
     * @param indicator_icon the indicator icon of &#64;self
    */
    public void setIndicatorIcon(@Nullable ch.bailu.gtk.gio.Icon indicator_icon)  {
        JnaTabPage.INST().adw_tab_page_set_indicator_icon(asCPointer(), asCPointer(indicator_icon));
    }

    /**
     * Sets the tooltip of the indicator icon of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * <br>
     * <br>See [property&#64;TabPage:indicator-icon].
     * @param tooltip the indicator tooltip of &#64;self
    */
    public void setIndicatorTooltip(@Nonnull ch.bailu.gtk.type.Str tooltip)  {
        JnaTabPage.INST().adw_tab_page_set_indicator_tooltip(asCPointer(), asCPointerNotNull(tooltip));
    }

    /**
     * Sets the tooltip of the indicator icon of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * <br>
     * <br>See [property&#64;TabPage:indicator-icon].
     * @param tooltip the indicator tooltip of &#64;self
    */
    public void setIndicatorTooltip(String tooltip)  {
        JnaTabPage.INST().adw_tab_page_set_indicator_tooltip(asCPointer(), tooltip);
    }

    /**
     * Sets whether &#64;self is loading.
     * <br>
     * <br>If set to `TRUE`, [class&#64;TabBar] will display a spinner in place of icon.
     * <br>
     * <br>If the page is pinned and [property&#64;TabPage:indicator-icon] is set, the
     * <br>loading status will not be visible.
     * @param loading whether &#64;self is loading
    */
    public void setLoading(boolean loading)  {
        JnaTabPage.INST().adw_tab_page_set_loading(asCPointer(), loading);
    }

    /**
     * Sets whether &#64;self needs attention.
     * <br>
     * <br>[class&#64;TabBar] will display a line under the tab representing the page if
     * <br>set to `TRUE`. If the tab is not visible, the corresponding edge of the tab
     * <br>bar will be highlighted.
     * @param needs_attention whether &#64;self needs attention
    */
    public void setNeedsAttention(boolean needs_attention)  {
        JnaTabPage.INST().adw_tab_page_set_needs_attention(asCPointer(), needs_attention);
    }

    /**
     * [class&#64;TabBar] will display it in the center of the tab unless it's pinned,
     * <br>and will use it as a tooltip unless [property&#64;TabPage:tooltip] is set.
     * <br>
     * <br>Sets the title of &#64;self.
     * @param title the title of &#64;self
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaTabPage.INST().adw_tab_page_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * [class&#64;TabBar] will display it in the center of the tab unless it's pinned,
     * <br>and will use it as a tooltip unless [property&#64;TabPage:tooltip] is set.
     * <br>
     * <br>Sets the title of &#64;self.
     * @param title the title of &#64;self
    */
    public void setTitle(String title)  {
        JnaTabPage.INST().adw_tab_page_set_title(asCPointer(), title);
    }

    /**
     * Sets the tooltip of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * <br>
     * <br>If not set, [class&#64;TabBar] will use [property&#64;TabPage:title] as a tooltip
     * <br>instead.
     * @param tooltip the tooltip of &#64;self
    */
    public void setTooltip(@Nonnull ch.bailu.gtk.type.Str tooltip)  {
        JnaTabPage.INST().adw_tab_page_set_tooltip(asCPointer(), asCPointerNotNull(tooltip));
    }

    /**
     * Sets the tooltip of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * <br>
     * <br>If not set, [class&#64;TabBar] will use [property&#64;TabPage:title] as a tooltip
     * <br>instead.
     * @param tooltip the tooltip of &#64;self
    */
    public void setTooltip(String tooltip)  {
        JnaTabPage.INST().adw_tab_page_set_tooltip(asCPointer(), tooltip);
    }

    public static long getTypeID() { 
        return JnaTabPage.INST().adw_tab_page_get_type(); 
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
