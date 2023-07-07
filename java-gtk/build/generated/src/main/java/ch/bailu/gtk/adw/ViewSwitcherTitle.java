/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A view switcher title.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;view-switcher-title-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;view-switcher-title.png&quot; alt=&quot;view-switcher-title&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>A widget letting you switch between multiple views contained by a
 * <br>[class&#64;ViewStack] via an [class&#64;ViewSwitcher].
 * <br>
 * <br>It is designed to be used as the title widget of a [class&#64;HeaderBar], and
 * <br>will display the window's title when the window is too narrow to fit the view
 * <br>switcher e.g. on mobile phones, or if there are less than two views.
 * <br>
 * <br>In order to center the title in narrow windows, the header bar should have
 * <br>[property&#64;HeaderBar:centering-policy] set to
 * <br>`ADW_CENTERING_POLICY_STRICT`.
 * <br>
 * <br>`AdwViewSwitcherTitle` is intended to be used together with
 * <br>[class&#64;ViewSwitcherBar].
 * <br>
 * <br>A common use case is to bind the [property&#64;ViewSwitcherBar:reveal] property
 * <br>to [property&#64;ViewSwitcherTitle:title-visible] to automatically reveal the
 * <br>view switcher bar when the title label is displayed in place of the view
 * <br>switcher, as follows:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkWindow&quot;&gt;
 * <br>  &lt;property name=&quot;titlebar&quot;&gt;
 * <br>    &lt;object class=&quot;AdwHeaderBar&quot;&gt;
 * <br>      &lt;property name=&quot;centering-policy&quot;&gt;strict&lt;/property&gt;
 * <br>      &lt;property name=&quot;title-widget&quot;&gt;
 * <br>        &lt;object class=&quot;AdwViewSwitcherTitle&quot; id=&quot;title&quot;&gt;
 * <br>          &lt;property name=&quot;stack&quot;&gt;stack&lt;/property&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>  &lt;property name=&quot;child&quot;&gt;
 * <br>    &lt;object class=&quot;GtkBox&quot;&gt;
 * <br>      &lt;property name=&quot;orientation&quot;&gt;vertical&lt;/property&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;AdwViewStack&quot; id=&quot;stack&quot;/&gt;
 * <br>      &lt;/child&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;AdwViewSwitcherBar&quot;&gt;
 * <br>          &lt;property name=&quot;stack&quot;&gt;stack&lt;/property&gt;
 * <br>          &lt;binding name=&quot;reveal&quot;&gt;
 * <br>            &lt;lookup name=&quot;title-visible&quot;&gt;title&lt;/lookup&gt;
 * <br>          &lt;/binding&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/child&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwViewSwitcherTitle` has a single CSS node with name `viewswitchertitle`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcherTitle.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcherTitle.html</a></p>
*/
public class ViewSwitcherTitle extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewSwitcherTitle.class.getCanonicalName());
    }

    public ViewSwitcherTitle(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwViewSwitcherTitle`.
    */
    public ViewSwitcherTitle() {
        super(cast(JnaViewSwitcherTitle.INST().adw_view_switcher_title_new()));
    }

    /**
     * Gets the stack controlled by &#64;self.
     * @return the stack
    */
    public ViewStack getStack()  {
        return new ViewStack(new PointerContainer(JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_stack(asCPointer())));
    }

    /**
     * Gets the subtitle of &#64;self.
     * @return the subtitle
    */
    public ch.bailu.gtk.type.Str getSubtitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_subtitle(asCPointer())));
    }

    /**
     * Gets the title of &#64;self.
     * @return the title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_title(asCPointer())));
    }

    /**
     * Gets whether the title of &#64;self is currently visible.
     * <br>
     * <br>If the title is visible, it means the view switcher is hidden an it may be
     * <br>wanted to show an alternative switcher, e.g. a [class&#64;ViewSwitcherBar].
     * @return whether the title of &#64;self is currently visible
    */
    public boolean getTitleVisible()  {
        return JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_title_visible(asCPointer());
    }

    /**
     * Gets whether &#64;self's view switcher is enabled.
     * @return whether the view switcher is enabled
    */
    public boolean getViewSwitcherEnabled()  {
        return JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_view_switcher_enabled(asCPointer());
    }

    /**
     * Sets the stack controlled by &#64;self.
     * @param stack a stack
    */
    public void setStack(@Nullable ViewStack stack)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_stack(asCPointer(), asCPointer(stack));
    }

    /**
     * Sets the subtitle of &#64;self.
     * <br>
     * <br>The subtitle should give the user additional details.
     * @param subtitle a subtitle
    */
    public void setSubtitle(@Nonnull ch.bailu.gtk.type.Str subtitle)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_subtitle(asCPointer(), asCPointerNotNull(subtitle));
    }

    /**
     * Sets the subtitle of &#64;self.
     * <br>
     * <br>The subtitle should give the user additional details.
     * @param subtitle a subtitle
    */
    public void setSubtitle(String subtitle)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_subtitle(asCPointer(), subtitle);
    }

    /**
     * Sets the title of &#64;self.
     * <br>
     * <br>The title typically identifies the current view or content item, and
     * <br>generally does not use the application name.
     * @param title a title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of &#64;self.
     * <br>
     * <br>The title typically identifies the current view or content item, and
     * <br>generally does not use the application name.
     * @param title a title
    */
    public void setTitle(String title)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_title(asCPointer(), title);
    }

    /**
     * Sets whether &#64;self's view switcher is enabled.
     * <br>
     * <br>If it is disabled, the title will be displayed instead. This allows to
     * <br>programmatically hide the view switcher even if it fits in the available
     * <br>space.
     * <br>
     * <br>This can be used e.g. to ensure the view switcher is hidden below a certain
     * <br>window width, or any other constraint you find suitable.
     * @param enabled whether the view switcher is enabled
    */
    public void setViewSwitcherEnabled(boolean enabled)  {
        JnaViewSwitcherTitle.INST().adw_view_switcher_title_set_view_switcher_enabled(asCPointer(), enabled);
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
        return JnaViewSwitcherTitle.INST().adw_view_switcher_title_get_type(); 
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
