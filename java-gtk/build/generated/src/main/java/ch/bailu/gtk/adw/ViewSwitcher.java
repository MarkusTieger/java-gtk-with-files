/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An adaptive view switcher.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;view-switcher-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;view-switcher.png&quot; alt=&quot;view-switcher&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>An adaptive view switcher designed to switch between multiple views
 * <br>contained in a [class&#64;ViewStack] in a similar fashion to
 * <br>[class&#64;Gtk.StackSwitcher].
 * <br>
 * <br>`AdwViewSwitcher` buttons always have an icon and a label. They can be
 * <br>displayed side by side, or icon on top of the label. This can be controlled
 * <br>via the [property&#64;ViewSwitcher:policy] property.
 * <br>
 * <br>Most applications should be using [class&#64;ViewSwitcherBar] and
 * <br>[class&#64;ViewSwitcherTitle].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwViewSwitcher` has a single CSS node with name `viewswitcher`. It can have
 * <br>the style classes `.wide` and `.narrow`, matching its policy.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwViewSwitcher` uses the `GTK_ACCESSIBLE_ROLE_TAB_LIST` role and uses the
 * <br>`GTK_ACCESSIBLE_ROLE_TAB` for its buttons.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcher.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewSwitcher.html</a></p>
*/
public class ViewSwitcher extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewSwitcher.class.getCanonicalName());
    }

    public ViewSwitcher(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwViewSwitcher`.
    */
    public ViewSwitcher() {
        super(cast(JnaViewSwitcher.INST().adw_view_switcher_new()));
    }

    /**
     * Gets the policy of &#64;self.
     * @return the policy of &#64;self
    */
    public int getPolicy()  {
        return JnaViewSwitcher.INST().adw_view_switcher_get_policy(asCPointer());
    }

    /**
     * Gets the stack controlled by &#64;self.
     * @return the stack
    */
    public ViewStack getStack()  {
        return new ViewStack(new PointerContainer(JnaViewSwitcher.INST().adw_view_switcher_get_stack(asCPointer())));
    }

    /**
     * Sets the policy of &#64;self.
     * @param policy the new policy
    */
    public void setPolicy(int policy)  {
        JnaViewSwitcher.INST().adw_view_switcher_set_policy(asCPointer(), policy);
    }

    /**
     * Sets the stack controlled by &#64;self.
     * @param stack a stack
    */
    public void setStack(@Nullable ViewStack stack)  {
        JnaViewSwitcher.INST().adw_view_switcher_set_stack(asCPointer(), asCPointer(stack));
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
        return JnaViewSwitcher.INST().adw_view_switcher_get_type(); 
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
