/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A view switcher action bar.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;view-switcher-bar-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;view-switcher-bar.png&quot; alt=&quot;view-switcher-bar&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>An action bar letting you switch between multiple views contained in a
 * <br>[class&#64;ViewStack], via an [class&#64;ViewSwitcher]. It is designed to be put at
 * <br>the bottom of a window and to be revealed only on really narrow windows, e.g.
 * <br>on mobile phones. It can't be revealed if there are less than two pages.
 * <br>
 * <br>`AdwViewSwitcherBar` is intended to be used together with
 * <br>[class&#64;ViewSwitcherTitle].
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
 * <br>`AdwViewSwitcherBar` has a single CSS node with name` viewswitcherbar`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcherBar.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcherBar.html</a></p>
*/
public class ViewSwitcherBar extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewSwitcherBar.class.getCanonicalName());
    }

    public ViewSwitcherBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwViewSwitcherBar`.
    */
    public ViewSwitcherBar() {
        super(cast(JnaViewSwitcherBar.INST().adw_view_switcher_bar_new()));
    }

    /**
     * Gets whether &#64;self should be revealed or hidden.
     * @return whether &#64;self is revealed
    */
    public boolean getReveal()  {
        return JnaViewSwitcherBar.INST().adw_view_switcher_bar_get_reveal(asCPointer());
    }

    /**
     * Gets the stack controlled by &#64;self.
     * @return the stack
    */
    public ViewStack getStack()  {
        return new ViewStack(new PointerContainer(JnaViewSwitcherBar.INST().adw_view_switcher_bar_get_stack(asCPointer())));
    }

    /**
     * Sets whether &#64;self should be revealed or hidden.
     * @param reveal whether to reveal &#64;self
    */
    public void setReveal(boolean reveal)  {
        JnaViewSwitcherBar.INST().adw_view_switcher_bar_set_reveal(asCPointer(), reveal);
    }

    /**
     * Sets the stack controlled by &#64;self.
     * @param stack a stack
    */
    public void setStack(@Nullable ViewStack stack)  {
        JnaViewSwitcherBar.INST().adw_view_switcher_bar_set_stack(asCPointer(), asCPointer(stack));
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
        return JnaViewSwitcherBar.INST().adw_view_switcher_bar_get_type(); 
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
