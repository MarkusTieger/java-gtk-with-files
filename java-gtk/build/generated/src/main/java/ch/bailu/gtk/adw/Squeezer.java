/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A best fit container.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;squeezer-wide-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;squeezer-wide.png&quot; alt=&quot;squeezer-wide&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;squeezer-narrow-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;squeezer-narrow.png&quot; alt=&quot;squeezer-narrow&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwSqueezer` widget is a container which only shows the first of its
 * <br>children that fits in the available size. It is convenient to offer different
 * <br>widgets to represent the same data with different levels of detail, making
 * <br>the widget seem to squeeze itself to fit in the available space.
 * <br>
 * <br>Transitions between children can be animated as fades. This can be controlled
 * <br>with [property&#64;Squeezer:transition-type].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwSqueezer` has a single CSS node with name `squeezer`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Squeezer.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Squeezer.html</a></p>
*/
public class Squeezer extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Squeezer.class.getCanonicalName());
    }

    public Squeezer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwSqueezer`.
    */
    public Squeezer() {
        super(cast(JnaSqueezer.INST().adw_squeezer_new()));
    }

    /**
     * Adds a child to &#64;self.
     * @param child the widget to add
     * @return the [class&#64;SqueezerPage] for &#64;child
    */
    public SqueezerPage add(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new SqueezerPage(new PointerContainer(JnaSqueezer.INST().adw_squeezer_add(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Gets whether to allow squeezing beyond the last child's minimum size.
     * @return whether &#64;self allows squeezing beyond the last child
    */
    public boolean getAllowNone()  {
        return JnaSqueezer.INST().adw_squeezer_get_allow_none(asCPointer());
    }

    /**
     * Gets whether all children have the same size for the opposite orientation.
     * @return whether &#64;self is homogeneous
    */
    public boolean getHomogeneous()  {
        return JnaSqueezer.INST().adw_squeezer_get_homogeneous(asCPointer());
    }

    /**
     * Gets whether &#64;self interpolates its size when changing the visible child.
     * @return whether the size is interpolated
    */
    public boolean getInterpolateSize()  {
        return JnaSqueezer.INST().adw_squeezer_get_interpolate_size(asCPointer());
    }

    /**
     * Returns the [class&#64;SqueezerPage] object for &#64;child.
     * @param child a child of &#64;self
     * @return the page object for &#64;child
    */
    public SqueezerPage getPage(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new SqueezerPage(new PointerContainer(JnaSqueezer.INST().adw_squeezer_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Returns a [iface&#64;Gio.ListModel] that contains the pages of &#64;self.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also implements
     * <br>[iface&#64;Gtk.SelectionModel] and can be used to track the visible page.
     * @return a `GtkSelectionModel` for the squeezer's children
    */
    public ch.bailu.gtk.gtk.SelectionModel getPages()  {
        return new ch.bailu.gtk.gtk.SelectionModel(new PointerContainer(JnaSqueezer.INST().adw_squeezer_get_pages(asCPointer())));
    }

    /**
     * Gets the switch threshold policy for &#64;self.
     * @return 
    */
    public int getSwitchThresholdPolicy()  {
        return JnaSqueezer.INST().adw_squeezer_get_switch_threshold_policy(asCPointer());
    }

    /**
     * Gets the transition animation duration for &#64;self.
     * @return the transition duration, in milliseconds
    */
    public int getTransitionDuration()  {
        return JnaSqueezer.INST().adw_squeezer_get_transition_duration(asCPointer());
    }

    /**
     * Gets whether a transition is currently running for &#64;self.
     * <br>
     * <br>If a transition is impossible, the property value will be set to `TRUE` and
     * <br>then immediately to `FALSE`, so it's possible to rely on its notifications
     * <br>to know that a transition has happened.
     * @return whether a transition is currently running
    */
    public boolean getTransitionRunning()  {
        return JnaSqueezer.INST().adw_squeezer_get_transition_running(asCPointer());
    }

    /**
     * Gets the type of animation used for transitions between children in &#64;self.
     * @return the current transition type of &#64;self
    */
    public int getTransitionType()  {
        return JnaSqueezer.INST().adw_squeezer_get_transition_type(asCPointer());
    }

    /**
     * Gets the currently visible child of &#64;self.
     * @return the visible child
    */
    public ch.bailu.gtk.gtk.Widget getVisibleChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaSqueezer.INST().adw_squeezer_get_visible_child(asCPointer())));
    }

    /**
     * Gets the horizontal alignment, from 0 (start) to 1 (end).
     * @return the alignment value
    */
    public float getXalign()  {
        return JnaSqueezer.INST().adw_squeezer_get_xalign(asCPointer());
    }

    /**
     * Gets the vertical alignment, from 0 (top) to 1 (bottom).
     * @return the alignment value
    */
    public float getYalign()  {
        return JnaSqueezer.INST().adw_squeezer_get_yalign(asCPointer());
    }

    /**
     * Removes a child widget from &#64;self.
     * @param child the child to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaSqueezer.INST().adw_squeezer_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets whether to allow squeezing beyond the last child's minimum size.
     * <br>
     * <br>If set to `TRUE`, the squeezer can shrink to the point where no child can be
     * <br>shown. This is functionally equivalent to appending a widget with 0×0 minimum
     * <br>size.
     * @param allow_none whether &#64;self allows squeezing beyond the last child
    */
    public void setAllowNone(boolean allow_none)  {
        JnaSqueezer.INST().adw_squeezer_set_allow_none(asCPointer(), allow_none);
    }

    /**
     * Sets whether all children have the same size for the opposite orientation.
     * <br>
     * <br>For example, if a squeezer is horizontal and is homogeneous, it will request
     * <br>the same height for all its children. If it isn't, the squeezer may change
     * <br>size when a different child becomes visible.
     * @param homogeneous whether &#64;self is homogeneous
    */
    public void setHomogeneous(boolean homogeneous)  {
        JnaSqueezer.INST().adw_squeezer_set_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets whether &#64;self interpolates its size when changing the visible child.
     * <br>
     * <br>If `TRUE`, the squeezer will interpolate its size between the one of the
     * <br>previous visible child and the one of the new visible child, according to the
     * <br>set transition duration and the orientation, e.g. if the squeezer is
     * <br>horizontal, it will interpolate the its height.
     * @param interpolate_size whether to interpolate the size
    */
    public void setInterpolateSize(boolean interpolate_size)  {
        JnaSqueezer.INST().adw_squeezer_set_interpolate_size(asCPointer(), interpolate_size);
    }

    /**
     * Sets the switch threshold policy for &#64;self.
     * <br>
     * <br>Determines when the squeezer will switch children.
     * <br>
     * <br>If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only switch when the
     * <br>visible child cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`,
     * <br>it will switch as soon as the visible child doesn't get their natural size.
     * <br>
     * <br>This can be useful if you have a long ellipsizing label and want to let it
     * <br>ellipsize instead of immediately switching.
     * @param policy the policy to use
    */
    public void setSwitchThresholdPolicy(int policy)  {
        JnaSqueezer.INST().adw_squeezer_set_switch_threshold_policy(asCPointer(), policy);
    }

    /**
     * Sets the transition animation duration for &#64;self.
     * @param duration the new duration, in milliseconds
    */
    public void setTransitionDuration(int duration)  {
        JnaSqueezer.INST().adw_squeezer_set_transition_duration(asCPointer(), duration);
    }

    /**
     * Sets the type of animation used for transitions between children in &#64;self.
     * @param transition the new transition type
    */
    public void setTransitionType(int transition)  {
        JnaSqueezer.INST().adw_squeezer_set_transition_type(asCPointer(), transition);
    }

    /**
     * Sets the horizontal alignment, from 0 (start) to 1 (end).
     * <br>
     * <br>This affects the children allocation during transitions, when they exceed the
     * <br>size of the squeezer.
     * <br>
     * <br>For example, 0.5 means the child will be centered, 0 means it will keep the
     * <br>start side aligned and overflow the end side, and 1 means the opposite.
     * @param xalign the new alignment value
    */
    public void setXalign(float xalign)  {
        JnaSqueezer.INST().adw_squeezer_set_xalign(asCPointer(), xalign);
    }

    /**
     * Sets the vertical alignment, from 0 (top) to 1 (bottom).
     * <br>
     * <br>This affects the children allocation during transitions, when they exceed the
     * <br>size of the squeezer.
     * <br>
     * <br>For example, 0.5 means the child will be centered, 0 means it will keep the
     * <br>top side aligned and overflow the bottom side, and 1 means the opposite.
     * @param yalign the new alignment value
    */
    public void setYalign(float yalign)  {
        JnaSqueezer.INST().adw_squeezer_set_yalign(asCPointer(), yalign);
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
     * Implements interface {@link ch.bailu.gtk.gtk.Orientable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Orientable}
    */
    public ch.bailu.gtk.gtk.Orientable asOrientable() {
        return new ch.bailu.gtk.gtk.Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaSqueezer.INST().adw_squeezer_get_type(); 
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
