/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An adaptive container acting like a box or a stack.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;leaflet-wide-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;leaflet-wide.png&quot; alt=&quot;leaflet-wide&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;leaflet-narrow-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;leaflet-narrow.png&quot; alt=&quot;leaflet-narrow&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwLeaflet` widget can display its children like a [class&#64;Gtk.Box] does
 * <br>or like a [class&#64;Gtk.Stack] does, adapting to size changes by switching
 * <br>between the two modes.
 * <br>
 * <br>When there is enough space the children are displayed side by side, otherwise
 * <br>only one is displayed and the leaflet is said to be “folded”.
 * <br>The threshold is dictated by the preferred minimum sizes of the children.
 * <br>When a leaflet is folded, the children can be navigated using swipe gestures.
 * <br>
 * <br>The “over” and “under” transition types stack the children one on top of the
 * <br>other, while the “slide” transition puts the children side by side. While
 * <br>navigating to a child on the side or below can be performed by swiping the
 * <br>current child away, navigating to an upper child requires dragging it from
 * <br>the edge where it resides. This doesn't affect non-dragging swipes.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwLeaflet` has a single CSS node with name `leaflet`. The node will get the
 * <br>style classes `.folded` when it is folded, `.unfolded` when it's not, or none
 * <br>if it hasn't computed its fold yet.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Leaflet.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Leaflet.html</a></p>
*/
public class Leaflet extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Leaflet.class.getCanonicalName());
    }

    public Leaflet(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwLeaflet`.
    */
    public Leaflet() {
        super(cast(JnaLeaflet.INST().adw_leaflet_new()));
    }

    /**
     * Adds a child to &#64;self.
     * @param child the widget to add
     * @return the [class&#64;LeafletPage] for &#64;child
    */
    public LeafletPage append(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new LeafletPage(new PointerContainer(JnaLeaflet.INST().adw_leaflet_append(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Finds the previous or next navigatable child.
     * <br>
     * <br>This will be the same child [method&#64;Leaflet.navigate] or swipe gestures will
     * <br>navigate to.
     * <br>
     * <br>If there's no child to navigate to, `NULL` will be returned instead.
     * <br>
     * <br>See [property&#64;LeafletPage:navigatable].
     * @param direction the direction
     * @return the previous or next child
    */
    public ch.bailu.gtk.gtk.Widget getAdjacentChild(int direction)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_adjacent_child(asCPointer(), direction)));
    }

    /**
     * Gets whether gestures and shortcuts for navigating backward are enabled.
     * @return Whether gestures and shortcuts are enabled.
    */
    public boolean getCanNavigateBack()  {
        return JnaLeaflet.INST().adw_leaflet_get_can_navigate_back(asCPointer());
    }

    /**
     * Gets whether gestures and shortcuts for navigating forward are enabled.
     * @return Whether gestures and shortcuts are enabled.
    */
    public boolean getCanNavigateForward()  {
        return JnaLeaflet.INST().adw_leaflet_get_can_navigate_forward(asCPointer());
    }

    /**
     * Gets whether &#64;self can unfold.
     * @return whether &#64;self can unfold
    */
    public boolean getCanUnfold()  {
        return JnaLeaflet.INST().adw_leaflet_get_can_unfold(asCPointer());
    }

    /**
     * Finds the child of &#64;self with &#64;name.
     * <br>
     * <br>Returns `NULL` if there is no child with this name.
     * <br>
     * <br>See [property&#64;LeafletPage:name].
     * @param name the name of the child to find
     * @return the requested child of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChildByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_child_by_name(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Finds the child of &#64;self with &#64;name.
     * <br>
     * <br>Returns `NULL` if there is no child with this name.
     * <br>
     * <br>See [property&#64;LeafletPage:name].
     * @param name the name of the child to find
     * @return the requested child of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChildByName(String name)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_child_by_name(asCPointer(), name)));
    }

    /**
     * Gets the child transition spring parameters for &#64;self.
     * @return the child transition parameters
    */
    public SpringParams getChildTransitionParams()  {
        return new SpringParams(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_child_transition_params(asCPointer())));
    }

    /**
     * Gets whether a child transition is currently running for &#64;self.
     * @return whether a transition is currently running
    */
    public boolean getChildTransitionRunning()  {
        return JnaLeaflet.INST().adw_leaflet_get_child_transition_running(asCPointer());
    }

    /**
     * Gets the fold threshold policy for &#64;self.
     * @return 
    */
    public int getFoldThresholdPolicy()  {
        return JnaLeaflet.INST().adw_leaflet_get_fold_threshold_policy(asCPointer());
    }

    /**
     * Gets whether &#64;self is folded.
     * <br>
     * <br>The leaflet will be folded if the size allocated to it is smaller than the
     * <br>sum of the minimum or natural sizes of the children (see
     * <br>[property&#64;Leaflet:fold-threshold-policy]), it will be unfolded otherwise.
     * @return whether &#64;self is folded.
    */
    public boolean getFolded()  {
        return JnaLeaflet.INST().adw_leaflet_get_folded(asCPointer());
    }

    /**
     * Gets whether &#64;self is homogeneous.
     * @return whether &#64;self is homogeneous
    */
    public boolean getHomogeneous()  {
        return JnaLeaflet.INST().adw_leaflet_get_homogeneous(asCPointer());
    }

    /**
     * Gets the mode transition animation duration for &#64;self.
     * @return the mode transition duration, in milliseconds.
    */
    public int getModeTransitionDuration()  {
        return JnaLeaflet.INST().adw_leaflet_get_mode_transition_duration(asCPointer());
    }

    /**
     * Returns the [class&#64;LeafletPage] object for &#64;child.
     * @param child a child of &#64;self
     * @return the page object for &#64;child
    */
    public LeafletPage getPage(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new LeafletPage(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Returns a [iface&#64;Gio.ListModel] that contains the pages of the leaflet.
     * <br>
     * <br>This can be used to keep an up-to-date view. The model also implements
     * <br>[iface&#64;Gtk.SelectionModel] and can be used to track and change the visible
     * <br>page.
     * @return a `GtkSelectionModel` for the leaflet's children
    */
    public ch.bailu.gtk.gtk.SelectionModel getPages()  {
        return new ch.bailu.gtk.gtk.SelectionModel(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_pages(asCPointer())));
    }

    /**
     * Gets the type of animation used for transitions between modes and children.
     * @return the current transition type of &#64;self
    */
    public int getTransitionType()  {
        return JnaLeaflet.INST().adw_leaflet_get_transition_type(asCPointer());
    }

    /**
     * Gets the widget currently visible when the leaflet is folded.
     * @return the visible child
    */
    public ch.bailu.gtk.gtk.Widget getVisibleChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_visible_child(asCPointer())));
    }

    /**
     * Gets the name of the currently visible child widget.
     * @return the name of the visible child
    */
    public ch.bailu.gtk.type.Str getVisibleChildName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLeaflet.INST().adw_leaflet_get_visible_child_name(asCPointer())));
    }

    /**
     * Inserts &#64;child in the position after &#64;sibling in the list of children.
     * <br>
     * <br>If &#64;sibling is `NULL`, inserts &#64;child at the first position.
     * @param child the widget to insert
     * @param sibling the sibling after which to insert &#64;child
     * @return the [class&#64;LeafletPage] for &#64;child
    */
    public LeafletPage insertChildAfter(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable ch.bailu.gtk.gtk.Widget sibling)  {
        return new LeafletPage(new PointerContainer(JnaLeaflet.INST().adw_leaflet_insert_child_after(asCPointer(), asCPointerNotNull(child), asCPointer(sibling))));
    }

    /**
     * Navigates to the previous or next child.
     * <br>
     * <br>The child must have the [property&#64;LeafletPage:navigatable] property set to
     * <br>`TRUE`, otherwise it will be skipped.
     * <br>
     * <br>This will be the same child as returned by
     * <br>[method&#64;Leaflet.get_adjacent_child] or navigated to via swipe gestures.
     * @param direction the direction
     * @return whether the visible child was changed
    */
    public boolean navigate(int direction)  {
        return JnaLeaflet.INST().adw_leaflet_navigate(asCPointer(), direction);
    }

    /**
     * Inserts &#64;child at the first position in &#64;self.
     * @param child the widget to prepend
     * @return the [class&#64;LeafletPage] for &#64;child
    */
    public LeafletPage prepend(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        return new LeafletPage(new PointerContainer(JnaLeaflet.INST().adw_leaflet_prepend(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Removes a child widget from &#64;self.
     * @param child the child to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaLeaflet.INST().adw_leaflet_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Moves &#64;child to the position after &#64;sibling in the list of children.
     * <br>
     * <br>If &#64;sibling is `NULL`, moves &#64;child to the first position.
     * @param child the widget to move, must be a child of &#64;self
     * @param sibling the sibling to move &#64;child after
    */
    public void reorderChildAfter(@Nonnull ch.bailu.gtk.gtk.Widget child, @Nullable ch.bailu.gtk.gtk.Widget sibling)  {
        JnaLeaflet.INST().adw_leaflet_reorder_child_after(asCPointer(), asCPointerNotNull(child), asCPointer(sibling));
    }

    /**
     * Sets whether gestures and shortcuts for navigating backward are enabled.
     * <br>
     * <br>The supported gestures are:
     * <br>
     * <br>- One-finger swipe on touchscreens
     * <br>- Horizontal scrolling on touchpads (usually two-finger swipe)
     * <br>- Back/forward mouse buttons
     * <br>
     * <br>The keyboard back/forward keys are also supported, as well as the
     * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;←&lt;/kbd&gt; shortcut for horizontal orientation, or
     * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;↑&lt;/kbd&gt; for vertical orientation.
     * <br>
     * <br>If the orientation is horizontal, for right-to-left locales, gestures and
     * <br>shortcuts are reversed.
     * <br>
     * <br>Only children that have [property&#64;LeafletPage:navigatable] set to `TRUE` can
     * <br>be navigated to.
     * @param can_navigate_back the new value
    */
    public void setCanNavigateBack(boolean can_navigate_back)  {
        JnaLeaflet.INST().adw_leaflet_set_can_navigate_back(asCPointer(), can_navigate_back);
    }

    /**
     * Sets whether gestures and shortcuts for navigating forward are enabled.
     * <br>
     * <br>The supported gestures are:
     * <br>
     * <br>- One-finger swipe on touchscreens
     * <br>- Horizontal scrolling on touchpads (usually two-finger swipe)
     * <br>- Back/forward mouse buttons
     * <br>
     * <br>The keyboard back/forward keys are also supported, as well as the
     * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;→&lt;/kbd&gt; shortcut for horizontal orientation, or
     * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;↓&lt;/kbd&gt; for vertical orientation.
     * <br>
     * <br>If the orientation is horizontal, for right-to-left locales, gestures and
     * <br>shortcuts are reversed.
     * <br>
     * <br>Only children that have [property&#64;LeafletPage:navigatable] set to `TRUE` can
     * <br>be navigated to.
     * @param can_navigate_forward the new value
    */
    public void setCanNavigateForward(boolean can_navigate_forward)  {
        JnaLeaflet.INST().adw_leaflet_set_can_navigate_forward(asCPointer(), can_navigate_forward);
    }

    /**
     * Sets whether &#64;self can unfold.
     * @param can_unfold whether &#64;self can unfold
    */
    public void setCanUnfold(boolean can_unfold)  {
        JnaLeaflet.INST().adw_leaflet_set_can_unfold(asCPointer(), can_unfold);
    }

    /**
     * Sets the child transition spring parameters for &#64;self.
     * <br>
     * <br>The default value is equivalent to:
     * <br>
     * <br>```c
     * <br>adw_spring_params_new (1, 0.5, 500)
     * <br>```
     * @param params the new parameters
    */
    public void setChildTransitionParams(@Nonnull SpringParams params)  {
        JnaLeaflet.INST().adw_leaflet_set_child_transition_params(asCPointer(), asCPointerNotNull(params));
    }

    /**
     * Sets the fold threshold policy for &#64;self.
     * <br>
     * <br>If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only fold when the
     * <br>children cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`, it
     * <br>will fold as soon as children don't get their natural size.
     * <br>
     * <br>This can be useful if you have a long ellipsizing label and want to let it
     * <br>ellipsize instead of immediately folding.
     * @param policy the policy to use
    */
    public void setFoldThresholdPolicy(int policy)  {
        JnaLeaflet.INST().adw_leaflet_set_fold_threshold_policy(asCPointer(), policy);
    }

    /**
     * Sets &#64;self to be homogeneous or not.
     * <br>
     * <br>If set to `FALSE`, different children can have different size along the
     * <br>opposite orientation.
     * @param homogeneous whether to make &#64;self homogeneous
    */
    public void setHomogeneous(boolean homogeneous)  {
        JnaLeaflet.INST().adw_leaflet_set_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the mode transition animation duration for &#64;self.
     * @param duration the new duration, in milliseconds
    */
    public void setModeTransitionDuration(int duration)  {
        JnaLeaflet.INST().adw_leaflet_set_mode_transition_duration(asCPointer(), duration);
    }

    /**
     * Sets the type of animation used for transitions between modes and children.
     * <br>
     * <br>The transition type can be changed without problems at runtime, so it is
     * <br>possible to change the animation based on the mode or child that is about to
     * <br>become current.
     * @param transition the new transition type
    */
    public void setTransitionType(int transition)  {
        JnaLeaflet.INST().adw_leaflet_set_transition_type(asCPointer(), transition);
    }

    /**
     * Sets the widget currently visible when the leaflet is folded.
     * <br>
     * <br>The transition is determined by [property&#64;Leaflet:transition-type] and
     * <br>[property&#64;Leaflet:child-transition-params]. The transition can be cancelled
     * <br>by the user, in which case visible child will change back to the previously
     * <br>visible child.
     * @param visible_child the new child
    */
    public void setVisibleChild(@Nonnull ch.bailu.gtk.gtk.Widget visible_child)  {
        JnaLeaflet.INST().adw_leaflet_set_visible_child(asCPointer(), asCPointerNotNull(visible_child));
    }

    /**
     * Makes the child with the name &#64;name visible.
     * <br>
     * <br>See [property&#64;Leaflet:visible-child].
     * @param name the name of a child
    */
    public void setVisibleChildName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaLeaflet.INST().adw_leaflet_set_visible_child_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Makes the child with the name &#64;name visible.
     * <br>
     * <br>See [property&#64;Leaflet:visible-child].
     * @param name the name of a child
    */
    public void setVisibleChildName(String name)  {
        JnaLeaflet.INST().adw_leaflet_set_visible_child_name(asCPointer(), name);
    }

    /**
     * Implements interface {@link Swipeable}. Call this to get access to interface functions.
     * @return {@link Swipeable}
    */
    public Swipeable asSwipeable() {
        return new Swipeable(cast());
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
        return JnaLeaflet.INST().adw_leaflet_get_type(); 
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
